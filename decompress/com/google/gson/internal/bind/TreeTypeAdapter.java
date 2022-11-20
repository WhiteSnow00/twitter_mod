// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.lang.reflect.Type;
import java.util.Objects;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.EOFException;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

public final class TreeTypeAdapter<T> extends TypeAdapter<T>
{
    public final xhe<T> a;
    public final cee<T> b;
    public final Gson c;
    public final blv<T> d;
    public final div e;
    public final TreeTypeAdapter.TreeTypeAdapter$a f;
    public volatile TypeAdapter<T> g;
    
    public TreeTypeAdapter(final xhe<T> a, final cee<T> b, final Gson c, final blv<T> d, final div e) {
        this.f = new TreeTypeAdapter.TreeTypeAdapter$a();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static div a(final blv<?> blv, final Object o) {
        return new SingleTypeFactory(o, (blv)blv, blv.type == blv.rawType);
    }
    
    public final T read(final phe phe) throws IOException {
        if (this.b == null) {
            TypeAdapter g = this.g;
            if (g == null) {
                g = this.c.f(this.e, (blv)this.d);
                this.g = (TypeAdapter<T>)g;
            }
            return (T)g.read(phe);
        }
        boolean b;
        try {
            try {
                phe.U2();
                b = false;
                try {
                    final Object o = ((TypeAdapters.TypeAdapters$28)TypeAdapters.B).a(phe);
                }
                catch (final EOFException ex) {}
            }
            catch (final NumberFormatException ex2) {
                throw new JsonSyntaxException(ex2);
            }
            catch (final IOException ex3) {
                throw new JsonIOException(ex3);
            }
            catch (final MalformedJsonException ex4) {
                throw new JsonSyntaxException((Throwable)ex4);
            }
        }
        catch (final EOFException ex) {
            b = true;
        }
        if (!b) {
            final EOFException ex;
            throw new JsonSyntaxException(ex);
        }
        final Object o = jge.a;
        Objects.requireNonNull(o);
        if (o instanceof jge) {
            return null;
        }
        final cee<T> b2 = this.b;
        final Type type = this.d.type;
        return (T)b2.a();
    }
    
    public final void write(final zke zke, final T t) throws IOException {
        final xhe<T> a = this.a;
        if (a == null) {
            TypeAdapter g = this.g;
            if (g == null) {
                g = this.c.f(this.e, (blv)this.d);
                this.g = (TypeAdapter<T>)g;
            }
            g.write(zke, (Object)t);
            return;
        }
        if (t == null) {
            zke.j();
            return;
        }
        final Type type = this.d.type;
        nza.X1(a.a(), zke);
    }
    
    public static final class SingleTypeFactory implements div
    {
        public final blv<?> D0;
        public final boolean E0;
        public final Class<?> F0;
        public final xhe<?> G0;
        public final cee<?> H0;
        
        public SingleTypeFactory(final Object o, final blv<?> d0, final boolean e0, final Class<?> clazz) {
            xhe g0;
            if (o instanceof xhe) {
                g0 = (xhe)o;
            }
            else {
                g0 = null;
            }
            this.G0 = (xhe<?>)g0;
            cee h0;
            if (o instanceof cee) {
                h0 = (cee)o;
            }
            else {
                h0 = null;
            }
            this.H0 = h0;
            chw.x(g0 != null || h0 != null);
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = null;
        }
        
        @Override
        public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
            final blv<?> d0 = this.D0;
            boolean assignable;
            if (d0 != null) {
                assignable = (d0.equals((Object)blv) || (this.E0 && this.D0.type == blv.rawType));
            }
            else {
                assignable = this.F0.isAssignableFrom(blv.rawType);
            }
            TypeAdapter<T> typeAdapter;
            if (assignable) {
                typeAdapter = new TreeTypeAdapter<T>((xhe<T>)this.G0, (cee<T>)this.H0, gson, blv, this);
            }
            else {
                typeAdapter = null;
            }
            return typeAdapter;
        }
    }
}
