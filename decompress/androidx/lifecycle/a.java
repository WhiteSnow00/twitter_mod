// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public final class a
{
    public static a c;
    public final Map<Class<?>, a> a;
    public final Map<Class<?>, Boolean> b;
    
    static {
        a.c = new a();
    }
    
    public a() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public final a a(final Class<?> clazz, Method[] declaredMethods) {
        final Class superclass = clazz.getSuperclass();
        final HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(this.b(superclass).b);
        }
        final Class[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            for (final Map.Entry entry : this.b(interfaces[i]).b.entrySet()) {
                this.c(hashMap, (b)entry.getKey(), (d$b)entry.getValue(), clazz);
            }
        }
        Label_0143: {
            if (declaredMethods != null) {
                break Label_0143;
            }
            try {
                declaredMethods = clazz.getDeclaredMethods();
                final int length2 = declaredMethods.length;
                int j = 0;
                boolean b = false;
                while (j < length2) {
                    final Method method = declaredMethods[j];
                    final g g = method.getAnnotation(g.class);
                    if (g != null) {
                        final Class<?>[] parameterTypes = method.getParameterTypes();
                        int n;
                        if (parameterTypes.length > 0) {
                            if (!parameterTypes[0].isAssignableFrom(lbf.class)) {
                                throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                            }
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        final d$b value = g.value();
                        if (parameterTypes.length > 1) {
                            if (!parameterTypes[1].isAssignableFrom(d$b.class)) {
                                throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                            }
                            if (value != d$b.ON_ANY) {
                                throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                            }
                            n = 2;
                        }
                        if (parameterTypes.length > 2) {
                            throw new IllegalArgumentException("cannot have more than 2 params");
                        }
                        this.c(hashMap, new b(n, method), value, clazz);
                        b = true;
                    }
                    ++j;
                }
                final a a = new a(hashMap);
                this.a.put(clazz, a);
                this.b.put(clazz, b);
                return a;
            }
            catch (final NoClassDefFoundError noClassDefFoundError) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
            }
        }
    }
    
    public final a b(final Class<?> clazz) {
        final a a = this.a.get(clazz);
        if (a != null) {
            return a;
        }
        return this.a(clazz, null);
    }
    
    public final void c(final Map<b, d$b> map, final b b, final d$b d$b, final Class<?> clazz) {
        final d$b d$b2 = map.get(b);
        if (d$b2 != null && d$b != d$b2) {
            final Method b2 = b.b;
            final StringBuilder g = w48.g("Method ");
            g.append(b2.getName());
            g.append(" in ");
            g.append(clazz.getName());
            g.append(" already declared with different @OnLifecycleEvent value: previous value ");
            g.append(d$b2);
            g.append(", new value ");
            g.append(d$b);
            throw new IllegalArgumentException(g.toString());
        }
        if (d$b2 == null) {
            map.put(b, d$b);
        }
    }
    
    @Deprecated
    public static final class a
    {
        public final Map<d$b, List<b>> a;
        public final Map<b, d$b> b;
        
        public a(final Map<b, d$b> b) {
            this.b = b;
            this.a = new HashMap();
            for (final Map.Entry<K, d$b> entry : b.entrySet()) {
                final d$b d$b = entry.getValue();
                List list;
                if ((list = this.a.get(d$b)) == null) {
                    list = new ArrayList();
                    this.a.put(d$b, list);
                }
                list.add(entry.getKey());
            }
        }
        
        public static void a(final List<b> list, final lbf lbf, final d$b d$b, final Object o) {
            if (list != null) {
                int i = list.size() - 1;
                while (i >= 0) {
                    final b b = list.get(i);
                    Objects.requireNonNull(b);
                    try {
                        final int a = b.a;
                        if (a != 0) {
                            if (a != 1) {
                                if (a == 2) {
                                    b.b.invoke(o, lbf, d$b);
                                }
                            }
                            else {
                                b.b.invoke(o, lbf);
                            }
                        }
                        else {
                            b.b.invoke(o, new Object[0]);
                        }
                        --i;
                        continue;
                    }
                    catch (final IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }
                    catch (final InvocationTargetException ex2) {
                        throw new RuntimeException("Failed to call observer method", ex2.getCause());
                    }
                    break;
                }
            }
        }
    }
    
    @Deprecated
    public static final class b
    {
        public final int a;
        public final Method b;
        
        public b(final int a, final Method b) {
            this.a = a;
            (this.b = b).setAccessible(true);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b2 = (b)o;
            if (this.a != b2.a || !this.b.getName().equals(b2.b.getName())) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.getName().hashCode() + this.a * 31;
        }
    }
}
