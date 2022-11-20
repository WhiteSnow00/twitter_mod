// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.lang.reflect.Type;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;

public final class JsonAdapterAnnotationTypeAdapterFactory implements div
{
    public final xi6 D0;
    
    public JsonAdapterAnnotationTypeAdapterFactory(final xi6 d0) {
        this.D0 = d0;
    }
    
    public final TypeAdapter<?> a(final xi6 xi6, final Gson gson, final blv<?> blv, final ece ece) {
        final cee<?> g = xi6.a(new blv((Type)ece.value())).g();
        TypeAdapter create;
        if (g instanceof TypeAdapter) {
            create = (TypeAdapter)g;
        }
        else if (g instanceof div) {
            create = ((div)g).create(gson, blv);
        }
        else {
            final boolean b = g instanceof xhe;
            if (!b && !(g instanceof cee)) {
                final StringBuilder j = fu8.j("Invalid attempt to bind an instance of ");
                j.append(g.getClass().getName());
                j.append(" as a @JsonAdapter for ");
                j.append(blv.toString());
                j.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(j.toString());
            }
            cee<?> cee = null;
            xhe xhe;
            if (b) {
                xhe = (xhe)g;
            }
            else {
                xhe = null;
            }
            if (g instanceof cee) {
                cee = g;
            }
            create = new TreeTypeAdapter<Object>((xhe<Object>)xhe, (cee<Object>)cee, gson, (blv<Object>)blv, null);
        }
        TypeAdapter nullSafe = create;
        if (create != null) {
            nullSafe = create;
            if (ece.nullSafe()) {
                nullSafe = create.nullSafe();
            }
        }
        return (TypeAdapter<?>)nullSafe;
    }
    
    @Override
    public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
        final ece ece = blv.rawType.getAnnotation(ece.class);
        if (ece == null) {
            return null;
        }
        return (TypeAdapter<T>)this.a(this.D0, gson, blv, ece);
    }
}
