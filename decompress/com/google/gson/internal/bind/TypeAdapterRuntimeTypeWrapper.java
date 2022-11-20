// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.lang.reflect.TypeVariable;
import java.io.IOException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T>
{
    public final Gson a;
    public final TypeAdapter<T> b;
    public final Type c;
    
    public TypeAdapterRuntimeTypeWrapper(final Gson a, final TypeAdapter<T> b, final Type c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final T read(final phe phe) throws IOException {
        return (T)this.b.read(phe);
    }
    
    public final void write(final zke zke, final T t) throws IOException {
        TypeAdapter typeAdapter = this.b;
        Type type2;
        final Type type = type2 = this.c;
        Label_0052: {
            if (t != null) {
                if (type != Object.class && !(type instanceof TypeVariable)) {
                    type2 = type;
                    if (!(type instanceof Class)) {
                        break Label_0052;
                    }
                }
                type2 = t.getClass();
            }
        }
        if (type2 != this.c) {
            typeAdapter = this.a.e(new blv(type2));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                final TypeAdapter<T> b = this.b;
                if (!(b instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = b;
                }
            }
        }
        typeAdapter.write(zke, (Object)t);
    }
}
