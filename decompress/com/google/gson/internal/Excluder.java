// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

public final class Excluder implements div, Cloneable
{
    public static final Excluder I0;
    public double D0;
    public int E0;
    public boolean F0;
    public List<nea> G0;
    public List<nea> H0;
    
    static {
        I0 = new Excluder();
    }
    
    public Excluder() {
        this.D0 = -1.0;
        this.E0 = 136;
        this.F0 = true;
        this.G0 = Collections.emptyList();
        this.H0 = Collections.emptyList();
    }
    
    public final boolean a(final Class<?> clazz) {
        return (this.D0 != -1.0 && !this.f(clazz.getAnnotation(daq.class), clazz.getAnnotation(v1w.class))) || (!this.F0 && this.e(clazz)) || this.d(clazz);
    }
    
    public final boolean c(final Class<?> clazz, final boolean b) {
        List<nea> list;
        if (b) {
            list = this.G0;
        }
        else {
            list = this.H0;
        }
        final Iterator<nea> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a()) {
                return true;
            }
        }
        return false;
    }
    
    public final Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
        final Class rawType = blv.rawType;
        final boolean a = this.a(rawType);
        final boolean b = a || this.c(rawType, true);
        final boolean b2 = a || this.c(rawType, false);
        if (!b && !b2) {
            return null;
        }
        return new TypeAdapter<T>(this, b2, b, gson, blv) {
            public TypeAdapter<T> a;
            public final boolean b;
            public final boolean c;
            public final Gson d;
            public final blv e;
            public final Excluder f;
            
            public final T read(final phe phe) throws IOException {
                if (this.b) {
                    phe.g0();
                    return null;
                }
                TypeAdapter a = this.a;
                if (a == null) {
                    a = this.d.f((div)this.f, this.e);
                    this.a = (TypeAdapter<T>)a;
                }
                return (T)a.read(phe);
            }
            
            public final void write(final zke zke, final T t) throws IOException {
                if (this.c) {
                    zke.j();
                    return;
                }
                TypeAdapter a = this.a;
                if (a == null) {
                    a = this.d.f((div)this.f, this.e);
                    this.a = (TypeAdapter<T>)a;
                }
                a.write(zke, (Object)t);
            }
        };
    }
    
    public final boolean d(final Class<?> clazz) {
        final boolean assignable = Enum.class.isAssignableFrom(clazz);
        final boolean b = true;
        if (!assignable && (clazz.getModifiers() & 0x8) == 0x0) {
            boolean b2 = b;
            if (clazz.isAnonymousClass()) {
                return b2;
            }
            if (clazz.isLocalClass()) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    public final boolean e(final Class<?> clazz) {
        final boolean memberClass = clazz.isMemberClass();
        boolean b = true;
        if (!memberClass || (clazz.getModifiers() & 0x8) != 0x0) {
            b = false;
        }
        return b;
    }
    
    public final boolean f(final daq daq, final v1w v1w) {
        final boolean b = false;
        final boolean b2 = daq == null || daq.value() <= this.D0;
        boolean b3 = b;
        if (b2) {
            final boolean b4 = v1w == null || v1w.value() > this.D0;
            b3 = b;
            if (b4) {
                b3 = true;
            }
        }
        return b3;
    }
}
