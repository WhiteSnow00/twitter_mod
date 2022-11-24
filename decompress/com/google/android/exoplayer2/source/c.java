// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import java.util.Objects;
import com.google.android.exoplayer2.e0;
import java.util.Iterator;
import android.os.Handler;
import java.util.HashMap;

public abstract class c<T> extends a
{
    public final HashMap<T, c.c$b<T>> h;
    public Handler i;
    public hzt j;
    
    public c() {
        this.h = new HashMap<T, c.c$b<T>>();
    }
    
    public final void q() {
        for (final c.c$b c$b : this.h.values()) {
            c$b.a.i(c$b.b);
        }
    }
    
    public final void r() {
        for (final c.c$b c$b : this.h.values()) {
            c$b.a.h(c$b.b);
        }
    }
    
    public void u() {
        for (final c.c$b c$b : this.h.values()) {
            c$b.a.b(c$b.b);
            c$b.a.d((j)c$b.c);
            c$b.a.k((com.google.android.exoplayer2.drm.c)c$b.c);
        }
        this.h.clear();
    }
    
    public i$b v(final T t, final i$b i$b) {
        return i$b;
    }
    
    public abstract void w(final T p0, final i p1, final e0 p2);
    
    public final void x(final T t, final i i) {
        omi.m(this.h.containsKey(null) ^ true);
        final ke6 ke6 = new ke6(this);
        final c.c$a c$a = new c.c$a(this);
        this.h.put(null, (c.c$b<T>)new c.c$b((i)t, (i$c)ke6, c$a));
        final Handler j = this.i;
        Objects.requireNonNull(j);
        ((i)t).c(j, (j)c$a);
        final Handler k = this.i;
        Objects.requireNonNull(k);
        ((i)t).j(k, (com.google.android.exoplayer2.drm.c)c$a);
        final hzt l = this.j;
        final cok g = super.g;
        omi.r((Object)g);
        ((i)t).n((i$c)ke6, l, g);
        if (!(super.b.isEmpty() ^ true)) {
            ((i)t).i((i$c)ke6);
        }
    }
}
