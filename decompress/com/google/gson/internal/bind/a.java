// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Field;

public final class a extends ReflectiveTypeAdapterFactory$a
{
    public final Field d;
    public final boolean e;
    public final TypeAdapter f;
    public final Gson g;
    public final blv h;
    public final boolean i;
    
    public a(final String s, final boolean b, final boolean b2, final Field d, final boolean e, final TypeAdapter f, final Gson g, final blv h, final boolean i) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        super(s, b, b2);
    }
    
    public final void a(final phe phe, final Object o) throws IOException, IllegalAccessException {
        final Object read = this.f.read(phe);
        if (read != null || !this.i) {
            this.d.set(o, read);
        }
    }
    
    public final void b(final zke zke, final Object o) throws IOException, IllegalAccessException {
        final Object value = this.d.get(o);
        TypeAdapter f;
        if (this.e) {
            f = this.f;
        }
        else {
            f = new TypeAdapterRuntimeTypeWrapper<Object>(this.g, (com.google.gson.TypeAdapter<?>)this.f, this.h.type);
        }
        f.write(zke, value);
    }
    
    public final boolean c(final Object o) throws IOException, IllegalAccessException {
        final boolean b = super.b;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this.d.get(o) != o) {
            b2 = true;
        }
        return b2;
    }
}
