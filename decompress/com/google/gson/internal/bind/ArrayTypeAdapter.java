// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

public final class ArrayTypeAdapter<E> extends TypeAdapter<Object>
{
    public static final div c;
    public final Class<E> a;
    public final TypeAdapter<E> b;
    
    static {
        c = new div() {
            @Override
            public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
                final Type type = blv.type;
                final boolean b = type instanceof GenericArrayType;
                if (!b && (!(type instanceof Class) || !((Class)type).isArray())) {
                    return null;
                }
                Type type2;
                if (b) {
                    type2 = ((GenericArrayType)type).getGenericComponentType();
                }
                else {
                    type2 = ((Class)type).getComponentType();
                }
                return (TypeAdapter<T>)new ArrayTypeAdapter(gson, (com.google.gson.TypeAdapter<Object>)gson.e(new blv(type2)), a.f(type2));
            }
        };
    }
    
    public ArrayTypeAdapter(final Gson gson, final TypeAdapter<E> typeAdapter, final Class<E> a) {
        this.b = new TypeAdapterRuntimeTypeWrapper<E>(gson, typeAdapter, a);
        this.a = a;
    }
    
    public final Object read(final phe phe) throws IOException {
        if (phe.U2() == 9) {
            phe.J2();
            return null;
        }
        final ArrayList list = new ArrayList();
        phe.a();
        while (phe.hasNext()) {
            list.add(this.b.read(phe));
        }
        phe.e();
        final int size = list.size();
        final Object instance = Array.newInstance(this.a, size);
        for (int i = 0; i < size; ++i) {
            Array.set(instance, i, list.get(i));
        }
        return instance;
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        if (o == null) {
            zke.j();
            return;
        }
        zke.b();
        for (int i = 0; i < Array.getLength(o); ++i) {
            this.b.write(zke, Array.get(o, i));
        }
        zke.e();
    }
}
