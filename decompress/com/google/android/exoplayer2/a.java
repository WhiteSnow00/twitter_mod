// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Objects;
import android.util.Pair;

public abstract class a extends e0
{
    public final int G0;
    public final y6q H0;
    public final boolean I0;
    
    public a(final y6q h0) {
        this.I0 = false;
        this.H0 = h0;
        this.G0 = h0.getLength();
    }
    
    public final int b(boolean b) {
        if (this.G0 == 0) {
            return -1;
        }
        final boolean i0 = this.I0;
        int n = 0;
        if (i0) {
            b = false;
        }
        if (b) {
            n = this.H0.f();
        }
        do {
            final zok zok = (zok)this;
            if (zok.N0[n].r()) {
                continue;
            }
            return zok.N0[n].b(b) + zok.M0[n];
        } while ((n = this.u(n, b)) != -1);
        return -1;
    }
    
    public final int c(final Object o) {
        final boolean b = o instanceof Pair;
        final int n = -1;
        if (!b) {
            return -1;
        }
        final Pair pair = (Pair)o;
        final Object first = pair.first;
        final Object second = pair.second;
        final zok zok = (zok)this;
        final Integer n2 = zok.P0.get(first);
        int intValue;
        if (n2 == null) {
            intValue = -1;
        }
        else {
            intValue = n2;
        }
        if (intValue == -1) {
            return -1;
        }
        final int c = zok.N0[intValue].c(second);
        int n3;
        if (c == -1) {
            n3 = n;
        }
        else {
            n3 = zok.L0[intValue] + c;
        }
        return n3;
    }
    
    public final int d(boolean b) {
        int n = this.G0;
        if (n == 0) {
            return -1;
        }
        if (this.I0) {
            b = false;
        }
        if (b) {
            n = this.H0.d();
        }
        else {
            --n;
        }
        do {
            final zok zok = (zok)this;
            if (zok.N0[n].r()) {
                continue;
            }
            return zok.N0[n].d(b) + zok.M0[n];
        } while ((n = this.v(n, b)) != -1);
        return -1;
    }
    
    public final int f(int n, int n2, boolean b) {
        final boolean i0 = this.I0;
        final int n3 = 0;
        int n4 = n2;
        if (i0) {
            if ((n4 = n2) == 1) {
                n4 = 2;
            }
            b = false;
        }
        final int t = this.t(n);
        final zok zok = (zok)this;
        final int n5 = zok.M0[t];
        final e0 e0 = zok.N0[t];
        if (n4 == 2) {
            n2 = n3;
        }
        else {
            n2 = n4;
        }
        n = e0.f(n - n5, n2, b);
        if (n != -1) {
            return n5 + n;
        }
        for (n = this.u(t, b); n != -1 && zok.N0[n].r(); n = this.u(n, b)) {}
        if (n != -1) {
            n2 = zok.M0[n];
            return zok.N0[n].b(b) + n2;
        }
        if (n4 == 2) {
            return this.b(b);
        }
        return -1;
    }
    
    public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
        final zok zok = (zok)this;
        final int e = rnw.e(zok.L0, n + 1);
        final int n2 = zok.M0[e];
        zok.N0[e].h(n - zok.L0[e], e0$b, b);
        e0$b.H0 += n2;
        if (b) {
            final Object o = zok.O0[e];
            final Object g0 = e0$b.G0;
            Objects.requireNonNull(g0);
            e0$b.G0 = Pair.create(o, g0);
        }
        return e0$b;
    }
    
    public final e0$b i(final Object g0, final e0$b e0$b) {
        final Pair pair = (Pair)g0;
        final Object first = pair.first;
        final Object second = pair.second;
        final zok zok = (zok)this;
        final Integer n = zok.P0.get(first);
        int intValue;
        if (n == null) {
            intValue = -1;
        }
        else {
            intValue = n;
        }
        final int n2 = zok.M0[intValue];
        zok.N0[intValue].i(second, e0$b);
        e0$b.H0 += n2;
        e0$b.G0 = g0;
        return e0$b;
    }
    
    public final int m(int n, int n2, boolean b) {
        final boolean i0 = this.I0;
        final int n3 = 0;
        int n4 = n2;
        if (i0) {
            if ((n4 = n2) == 1) {
                n4 = 2;
            }
            b = false;
        }
        final int t = this.t(n);
        final zok zok = (zok)this;
        final int n5 = zok.M0[t];
        final e0 e0 = zok.N0[t];
        if (n4 == 2) {
            n2 = n3;
        }
        else {
            n2 = n4;
        }
        n = e0.m(n - n5, n2, b);
        if (n != -1) {
            return n5 + n;
        }
        for (n = this.v(t, b); n != -1 && zok.N0[n].r(); n = this.v(n, b)) {}
        if (n != -1) {
            n2 = zok.M0[n];
            return zok.N0[n].d(b) + n2;
        }
        if (n4 == 2) {
            return this.d(b);
        }
        return -1;
    }
    
    public final Object n(final int n) {
        final zok zok = (zok)this;
        final int e = rnw.e(zok.L0, n + 1);
        return Pair.create(zok.O0[e], zok.N0[e].n(n - zok.L0[e]));
    }
    
    public final e0$d p(final int n, final e0$d e0$d, final long n2) {
        final int t = this.t(n);
        final zok zok = (zok)this;
        final int n3 = zok.M0[t];
        final int n4 = zok.L0[t];
        zok.N0[t].p(n - n3, e0$d, n2);
        Object create = zok.O0[t];
        if (!e0$d.W0.equals(e0$d.F0)) {
            create = Pair.create(create, e0$d.F0);
        }
        e0$d.F0 = create;
        e0$d.T0 += n4;
        e0$d.U0 += n4;
        return e0$d;
    }
    
    public abstract int t(final int p0);
    
    public final int u(int c, final boolean b) {
        if (b) {
            c = this.H0.c(c);
        }
        else if (c < this.G0 - 1) {
            ++c;
        }
        else {
            c = -1;
        }
        return c;
    }
    
    public final int v(int b, final boolean b2) {
        if (b2) {
            b = this.H0.b(b);
        }
        else if (b > 0) {
            --b;
        }
        else {
            b = -1;
        }
        return b;
    }
}
