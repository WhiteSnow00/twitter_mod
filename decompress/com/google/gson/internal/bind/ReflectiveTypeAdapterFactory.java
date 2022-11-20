// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.lang.reflect.AccessibleObject;
import java.io.IOException;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.Map;
import com.google.gson.JsonIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Field;
import com.google.gson.internal.Excluder;

public final class ReflectiveTypeAdapterFactory implements div
{
    public final xi6 D0;
    public final mwa E0;
    public final Excluder F0;
    public final JsonAdapterAnnotationTypeAdapterFactory G0;
    
    public ReflectiveTypeAdapterFactory(final xi6 d0, final mwa e0, final Excluder f0, final JsonAdapterAnnotationTypeAdapterFactory g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final boolean a(final Field field, final boolean b) {
        final Excluder f0 = this.F0;
        final Class<?> type = field.getType();
        final boolean a = f0.a(type);
        final boolean b2 = false;
        final boolean b3 = a || f0.c(type, b);
        boolean b4 = b2;
        if (!b3) {
            boolean b5 = false;
            Label_0244: {
                Label_0237: {
                    if ((f0.E0 & field.getModifiers()) == 0x0) {
                        if (f0.D0 == -1.0 || f0.f(field.getAnnotation(daq.class), field.getAnnotation(v1w.class))) {
                            if (!field.isSynthetic()) {
                                if (f0.F0 || !f0.e(field.getType())) {
                                    if (!f0.d(field.getType())) {
                                        List<nea> list;
                                        if (b) {
                                            list = f0.G0;
                                        }
                                        else {
                                            list = f0.H0;
                                        }
                                        if (!list.isEmpty()) {
                                            new dg3(field);
                                            final Iterator iterator = list.iterator();
                                            while (iterator.hasNext()) {
                                                if (((nea)iterator.next()).b()) {
                                                    break Label_0237;
                                                }
                                            }
                                        }
                                        b5 = false;
                                        break Label_0244;
                                    }
                                }
                            }
                        }
                    }
                }
                b5 = true;
            }
            b4 = b2;
            if (!b5) {
                b4 = true;
            }
        }
        return b4;
    }
    
    @Override
    public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
        Class<Object> clazz = Object.class;
        Class clazz2 = blv.rawType;
        if (!Object.class.isAssignableFrom(clazz2)) {
            return null;
        }
        final o4j a = this.D0.a((blv)blv);
        Object o = new(com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter.class)();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object o2;
        o4j o4j;
        if (clazz2.isInterface()) {
            o2 = o;
            o4j = a;
        }
        else {
            final Type type = blv.type;
            blv blv2 = blv;
            final o4j o4j2 = a;
            Type type2 = type;
            while (true) {
                o4j = o4j2;
                o2 = o;
                if (clazz2 == clazz) {
                    break;
                }
                Field[] declaredFields = clazz2.getDeclaredFields();
                final int length = declaredFields.length;
                int i = 0;
                while (i < length) {
                    Object o3 = declaredFields[i];
                    boolean a2 = this.a((Field)o3, true);
                    final boolean a3 = this.a((Field)o3, false);
                    Label_0608: {
                        if (!a2 && !a3) {
                            final Field[] array = declaredFields;
                            final Class<Object> clazz3 = clazz;
                            final blv<T> blv3 = (blv<T>)blv2;
                            final Type type3 = type2;
                            final Object o4 = o;
                            final Class<Object> clazz4 = clazz3;
                            final Field[] array2 = array;
                            break Label_0608;
                        }
                        try {
                            ((AccessibleObject)o3).setAccessible(true);
                            final Type h = a.h(blv2.type, clazz2, ((Field)o3).getGenericType());
                            final llp llp = ((Field)o3).getAnnotation(llp.class);
                            List<String> list2 = null;
                            Label_0332: {
                                List<String> list;
                                if (llp == null) {
                                    list = Collections.singletonList(this.E0.b((Field)o3));
                                }
                                else {
                                    final String value = llp.value();
                                    final String[] alternate = llp.alternate();
                                    if (alternate.length != 0) {
                                        list2 = new ArrayList<String>(alternate.length + 1);
                                        ((ArrayList<String>)list2).add(value);
                                        for (int length2 = alternate.length, j = 0; j < length2; ++j) {
                                            ((ArrayList<String>)list2).add(alternate[j]);
                                        }
                                        break Label_0332;
                                    }
                                    list = Collections.singletonList(value);
                                }
                                list2 = list;
                            }
                            final int size = list2.size();
                            final ReflectiveTypeAdapterFactory$a reflectiveTypeAdapterFactory$a = null;
                            int k = 0;
                            final Class clazz5 = clazz2;
                            final Field[] array3 = declaredFields;
                            final ArrayList<String> list3 = (ArrayList<String>)list2;
                            ReflectiveTypeAdapterFactory$a reflectiveTypeAdapterFactory$a2 = reflectiveTypeAdapterFactory$a;
                            while (k < size) {
                                final String s = list3.get(k);
                                if (k != 0) {
                                    a2 = false;
                                }
                                final blv blv4 = new blv(h);
                                final Class rawType = blv4.rawType;
                                final boolean b = rawType instanceof Class && rawType.isPrimitive();
                                final ece ece = ((Field)o3).getAnnotation(ece.class);
                                TypeAdapter a4;
                                if (ece != null) {
                                    a4 = this.G0.a(this.D0, gson, (blv<?>)blv4, ece);
                                }
                                else {
                                    a4 = null;
                                }
                                final boolean b2 = a4 != null;
                                TypeAdapter e = a4;
                                if (a4 == null) {
                                    e = gson.e(blv4);
                                }
                                final ReflectiveTypeAdapterFactory$a reflectiveTypeAdapterFactory$a3 = (ReflectiveTypeAdapterFactory$a)linkedHashMap.put(s, new com.google.gson.internal.bind.a(s, a2, a3, (Field)o3, b2, e, gson, blv4, b));
                                if (reflectiveTypeAdapterFactory$a2 == null) {
                                    reflectiveTypeAdapterFactory$a2 = reflectiveTypeAdapterFactory$a3;
                                }
                                ++k;
                            }
                            final Field[] array4 = array3;
                            clazz2 = clazz5;
                            o3 = o;
                            final blv<T> blv5 = (blv<T>)blv2;
                            final Type type4 = type2;
                            if (reflectiveTypeAdapterFactory$a2 == null) {
                                final Field[] array2 = array4;
                                final Class<Object> clazz4 = clazz;
                                final Object o4 = o3;
                                final Type type3 = type4;
                                final blv<T> blv3 = blv5;
                                ++i;
                                final blv<T> blv6 = blv3;
                                final Object o5 = o4;
                                final Class<Object> clazz6 = clazz4;
                                declaredFields = array2;
                                blv2 = blv6;
                                type2 = type3;
                                clazz = clazz6;
                                o = o5;
                                continue;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append(type4);
                            sb.append(" declares multiple JSON fields named ");
                            sb.append(reflectiveTypeAdapterFactory$a2.a);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        catch (final Exception ex) {
                            final StringBuilder l = fu8.j("Failed making field '");
                            l.append(((Field)o3).getDeclaringClass().getName());
                            l.append("#");
                            l.append(((Field)o3).getName());
                            l.append("' accessible; either change its visibility or write a custom TypeAdapter for its declaring type");
                            throw new JsonIOException(l.toString(), ex);
                        }
                    }
                    break;
                }
                blv2 = new blv(a.h(blv2.type, clazz2, clazz2.getGenericSuperclass()));
                clazz2 = blv2.rawType;
            }
        }
        new Adapter(o4j, linkedHashMap);
        return (TypeAdapter<T>)o2;
    }
    
    public static final class Adapter<T> extends TypeAdapter<T>
    {
        public final o4j<T> a;
        public final Map<String, ReflectiveTypeAdapterFactory$a> b;
        
        public Adapter(final o4j<T> a, final Map<String, ReflectiveTypeAdapterFactory$a> b) {
            this.a = a;
            this.b = b;
        }
        
        public final T read(final phe phe) throws IOException {
            if (phe.U2() == 9) {
                phe.J2();
                return null;
            }
            final T g = this.a.g();
            try {
                phe.b();
                while (phe.hasNext()) {
                    final ReflectiveTypeAdapterFactory$a reflectiveTypeAdapterFactory$a = this.b.get(phe.M0());
                    if (reflectiveTypeAdapterFactory$a != null && reflectiveTypeAdapterFactory$a.c) {
                        reflectiveTypeAdapterFactory$a.a(phe, (Object)g);
                    }
                    else {
                        phe.g0();
                    }
                }
                phe.f();
                return g;
            }
            catch (final IllegalAccessException ex) {
                throw new AssertionError((Object)ex);
            }
            catch (final IllegalStateException ex2) {
                throw new JsonSyntaxException(ex2);
            }
        }
        
        public final void write(final zke zke, final T t) throws IOException {
            if (t == null) {
                zke.j();
                return;
            }
            zke.c();
            try {
                for (final ReflectiveTypeAdapterFactory$a reflectiveTypeAdapterFactory$a : this.b.values()) {
                    if (reflectiveTypeAdapterFactory$a.c((Object)t)) {
                        zke.h(reflectiveTypeAdapterFactory$a.a);
                        reflectiveTypeAdapterFactory$a.b(zke, (Object)t);
                    }
                }
                zke.f();
            }
            catch (final IllegalAccessException ex) {
                throw new AssertionError((Object)ex);
            }
        }
    }
}
