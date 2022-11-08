// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls.playlist;

import java.util.Collection;
import android.net.Uri;
import java.util.Map;
import java.util.List;
import com.google.android.exoplayer2.drm.b;

public final class c extends cmc
{
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final b q;
    public final List<c.c$c> r;
    public final List<c.c$a> s;
    public final Map<Uri, c.c$b> t;
    public final long u;
    public final c.c$e v;
    
    public c(final int d, final String s, final List<String> list, final long n, final boolean g, long n2, final boolean i, final int j, final long k, final int l, final long m, final long n3, final boolean b, final boolean o, final boolean p20, final b q, final List<c.c$c> list2, final List<c.c$a> list3, final c.c$e v, final Map<Uri, c.c$b> map) {
        super(s, list, b);
        this.d = d;
        this.h = n2;
        this.g = g;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n3;
        this.o = o;
        this.p = p20;
        this.q = q;
        this.r = aed.q((Collection)list2);
        this.s = aed.q((Collection)list3);
        this.t = fed.c((Map<?, ?>)map);
        if (!list3.isEmpty()) {
            final c.c$a c$a = (c.c$a)fk7.H(list3);
            this.u = ((c.c$d)c$a).G0 + ((c.c$d)c$a).E0;
        }
        else if (!list2.isEmpty()) {
            final c.c$c c$c = (c.c$c)fk7.H(list2);
            this.u = ((c.c$d)c$c).G0 + ((c.c$d)c$c).E0;
        }
        else {
            this.u = 0L;
        }
        n2 = -9223372036854775807L;
        if (n != -9223372036854775807L) {
            if (n >= 0L) {
                n2 = Math.min(this.u, n);
            }
            else {
                n2 = Math.max(0L, this.u + n);
            }
        }
        this.e = n2;
        this.f = (n >= 0L);
        this.v = v;
    }
    
    @Override
    public final Object a(final List list) {
        return this;
    }
}
