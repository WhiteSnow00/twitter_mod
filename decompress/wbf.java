import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import androidx.lifecycle.g;
import androidx.lifecycle.a;
import java.util.Collections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import androidx.lifecycle.b;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wbf
{
    public static Map<Class<?>, Integer> a;
    public static Map<Class<?>, List<Constructor<? extends b>>> b;
    
    static {
        wbf.a = new HashMap();
        wbf.b = new HashMap();
    }
    
    public static b a(final Constructor<? extends b> constructor, final Object o) {
        try {
            return (b)constructor.newInstance(o);
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }
        catch (final InstantiationException ex2) {
            throw new RuntimeException(ex2);
        }
        catch (final IllegalAccessException ex3) {
            throw new RuntimeException(ex3);
        }
    }
    
    public static String b(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
    
    public static int c(final Class<?> clazz) {
        final Integer n = wbf.a.get(clazz);
        if (n != null) {
            return n;
        }
        final String canonicalName = clazz.getCanonicalName();
        final int n2 = 1;
        Label_0563: {
            if (canonicalName == null) {
                final int n3 = n2;
                break Label_0563;
            }
            final List list = null;
            Constructor<?> declaredConstructor;
            try {
                final Package package1 = clazz.getPackage();
                String s = clazz.getCanonicalName();
                String name;
                if (package1 != null) {
                    name = package1.getName();
                }
                else {
                    name = "";
                }
                if (!name.isEmpty()) {
                    s = s.substring(name.length() + 1);
                }
                final String b = b(s);
                String string;
                if (name.isEmpty()) {
                    string = b;
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(name);
                    sb.append(".");
                    sb.append(b);
                    string = sb.toString();
                }
                final Constructor<?> constructor = declaredConstructor = Class.forName(string).getDeclaredConstructor(clazz);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                    declaredConstructor = constructor;
                }
            }
            catch (final NoSuchMethodException ex) {
                throw new RuntimeException(ex);
            }
            catch (final ClassNotFoundException ex2) {
                declaredConstructor = null;
            }
            Label_0561: {
                if (declaredConstructor != null) {
                    wbf.b.put(clazz, Collections.singletonList(declaredConstructor));
                    break Label_0561;
                }
                final a c = androidx.lifecycle.a.c;
                final Boolean b2 = c.b.get(clazz);
                while (true) {
                    if (b2 != null) {
                        final boolean booleanValue = b2;
                        break Label_0345;
                    }
                    try {
                        final Method[] declaredMethods = clazz.getDeclaredMethods();
                        for (int length = declaredMethods.length, i = 0; i < length; ++i) {
                            if (declaredMethods[i].getAnnotation(g.class) != null) {
                                c.a((Class)clazz, declaredMethods);
                                final boolean booleanValue = true;
                                int n3;
                                if (booleanValue) {
                                    n3 = n2;
                                }
                                else {
                                    final Class superclass = clazz.getSuperclass();
                                    final boolean b3 = superclass != null && sbf.class.isAssignableFrom(superclass);
                                    List list2 = list;
                                    if (b3) {
                                        if (c(superclass) == 1) {
                                            n3 = n2;
                                            break Label_0563;
                                        }
                                        list2 = new ArrayList(wbf.b.get(superclass));
                                    }
                                    final Class[] interfaces = clazz.getInterfaces();
                                    List list3;
                                    for (int length2 = interfaces.length, j = 0; j < length2; ++j, list2 = list3) {
                                        final Class clazz2 = interfaces[j];
                                        if (clazz2 == null || !sbf.class.isAssignableFrom(clazz2)) {
                                            list3 = list2;
                                        }
                                        else {
                                            if (c(clazz2) == 1) {
                                                n3 = n2;
                                                break Label_0563;
                                            }
                                            if ((list3 = list2) == null) {
                                                list3 = new ArrayList();
                                            }
                                            list3.addAll(wbf.b.get(clazz2));
                                        }
                                    }
                                    n3 = n2;
                                    if (list2 != null) {
                                        wbf.b.put(clazz, list2);
                                        n3 = 2;
                                    }
                                }
                                wbf.a.put(clazz, n3);
                                return n3;
                            }
                        }
                        c.b.put(clazz, Boolean.FALSE);
                        final boolean booleanValue = false;
                        continue;
                    }
                    catch (final NoClassDefFoundError noClassDefFoundError) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
                    }
                    break;
                }
            }
        }
    }
}
