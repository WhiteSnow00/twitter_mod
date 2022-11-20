// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Properties;
import java.util.Map;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;

public final class MapTypeAdapterFactory implements div
{
    public final xi6 D0;
    public final boolean E0;
    
    public MapTypeAdapterFactory(final xi6 d0) {
        this.D0 = d0;
        this.E0 = false;
    }
    
    @Override
    public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
        final Type type = blv.type;
        if (!Map.class.isAssignableFrom(blv.rawType)) {
            return null;
        }
        final Class f = a.f(type);
        Type[] actualTypeArguments;
        if (type == Properties.class) {
            actualTypeArguments = new Type[] { String.class, String.class };
        }
        else {
            final Type g = a.g(type, f, (Class)Map.class);
            if (g instanceof ParameterizedType) {
                actualTypeArguments = ((ParameterizedType)g).getActualTypeArguments();
            }
            else {
                actualTypeArguments = new Type[] { Object.class, Object.class };
            }
        }
        final Type type2 = actualTypeArguments[0];
        TypeAdapter typeAdapter;
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            typeAdapter = gson.e(new blv(type2));
        }
        else {
            typeAdapter = TypeAdapters.c;
        }
        return (TypeAdapter<T>)new Adapter(gson, actualTypeArguments[0], (com.google.gson.TypeAdapter<Object>)typeAdapter, actualTypeArguments[1], (com.google.gson.TypeAdapter<Object>)gson.e(new blv(actualTypeArguments[1])), this.D0.a((blv)blv));
    }
    
    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>>
    {
        public final TypeAdapter<K> a;
        public final TypeAdapter<V> b;
        public final o4j<? extends Map<K, V>> c;
        public final MapTypeAdapterFactory d;
        
        public Adapter(final MapTypeAdapterFactory d, final Gson gson, final Type type, final TypeAdapter<K> typeAdapter, final Type type2, final TypeAdapter<V> typeAdapter2, final o4j<? extends Map<K, V>> c) {
            this.d = d;
            this.a = new TypeAdapterRuntimeTypeWrapper<K>(gson, typeAdapter, type);
            this.b = new TypeAdapterRuntimeTypeWrapper<V>(gson, typeAdapter2, type2);
            this.c = c;
        }
        
        public final Object read(final phe phe) throws IOException {
            final int u2 = phe.U2();
            Object o;
            if (u2 == 9) {
                phe.J2();
                o = null;
            }
            else {
                final Map map = (Map)this.c.g();
                if (u2 == 1) {
                    phe.a();
                    while (phe.hasNext()) {
                        phe.a();
                        final Object read = this.a.read(phe);
                        if (map.put(read, this.b.read(phe)) != null) {
                            throw new JsonSyntaxException(ed.A("duplicate key: ", read));
                        }
                        phe.e();
                    }
                    phe.e();
                }
                else {
                    phe.b();
                    while (phe.hasNext()) {
                        Objects.requireNonNull(db.D0);
                        if (phe instanceof gje) {
                            final gje gje = (gje)phe;
                            gje.V(5);
                            final Map.Entry<K, Object> entry = ((Iterator)gje.Y()).next();
                            gje.l0(entry.getValue());
                            gje.l0((Object)new bhe((String)entry.getKey()));
                        }
                        else {
                            int n;
                            if ((n = phe.K0) == 0) {
                                n = phe.d();
                            }
                            if (n == 13) {
                                phe.K0 = 9;
                            }
                            else if (n == 12) {
                                phe.K0 = 8;
                            }
                            else {
                                if (n != 14) {
                                    final StringBuilder j = fu8.j("Expected a name but was ");
                                    j.append(x1b.i(phe.U2()));
                                    j.append(phe.m());
                                    throw new IllegalStateException(j.toString());
                                }
                                phe.K0 = 10;
                            }
                        }
                        final Object read2 = this.a.read(phe);
                        if (map.put(read2, this.b.read(phe)) == null) {
                            continue;
                        }
                        throw new JsonSyntaxException(ed.A("duplicate key: ", read2));
                    }
                    phe.f();
                }
                o = map;
            }
            return o;
        }
        
        public final void write(final zke zke, final Object o) throws IOException {
            final Map map = (Map)o;
            if (map == null) {
                zke.j();
            }
            else if (!this.d.E0) {
                zke.c();
                for (final Map.Entry<Object, V> entry : map.entrySet()) {
                    zke.h(String.valueOf(entry.getKey()));
                    this.b.write(zke, (Object)entry.getValue());
                }
                zke.f();
            }
            else {
                final ArrayList list = new ArrayList<iee>(map.size());
                final ArrayList list2 = new ArrayList<Object>(map.size());
                final Iterator iterator2 = map.entrySet().iterator();
                final int n = 0;
                final int n2 = 0;
                boolean b = false;
                while (iterator2.hasNext()) {
                    final Map.Entry<Object, V> entry2 = (Map.Entry<Object, V>)iterator2.next();
                    final iee jsonTree = this.a.toJsonTree(entry2.getKey());
                    list.add(jsonTree);
                    list2.add(entry2.getValue());
                    Objects.requireNonNull(jsonTree);
                    b |= (jsonTree instanceof mce || jsonTree instanceof lge);
                }
                if (b) {
                    zke.b();
                    for (int size = list.size(), i = n2; i < size; ++i) {
                        zke.b();
                        nza.X1((iee)list.get(i), zke);
                        this.b.write(zke, list2.get(i));
                        zke.e();
                    }
                    zke.e();
                }
                else {
                    zke.c();
                    for (int size2 = list.size(), j = n; j < size2; ++j) {
                        final iee iee = list.get(j);
                        Objects.requireNonNull(iee);
                        String s;
                        if (iee instanceof bhe) {
                            final bhe e = iee.e();
                            final Serializable a = e.a;
                            if (a instanceof Number) {
                                s = String.valueOf(e.i());
                            }
                            else if (a instanceof Boolean) {
                                s = Boolean.toString(e.g());
                            }
                            else {
                                if (!(a instanceof String)) {
                                    throw new AssertionError();
                                }
                                s = e.j();
                            }
                        }
                        else {
                            if (!(iee instanceof jge)) {
                                throw new AssertionError();
                            }
                            s = "null";
                        }
                        zke.h(s);
                        this.b.write(zke, list2.get(j));
                    }
                    zke.f();
                }
            }
        }
    }
}
