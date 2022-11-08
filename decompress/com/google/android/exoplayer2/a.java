// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Objects;
import android.util.Pair;

public abstract class a extends e0
{
    public final int D0;
    public final k5q E0;
    public final boolean F0;
    
    public a(final k5q e0) {
        this.F0 = false;
        this.E0 = e0;
        this.D0 = e0.getLength();
    }
    
    public final int b(boolean b) {
        if (this.D0 == 0) {
            return -1;
        }
        final boolean f0 = this.F0;
        int n = 0;
        if (f0) {
            b = false;
        }
        if (b) {
            n = this.E0.f();
        }
        do {
            final dok dok = (dok)this;
            if (dok.K0[n].r()) {
                continue;
            }
            return dok.K0[n].b(b) + dok.J0[n];
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
        final dok dok = (dok)this;
        final Integer n2 = dok.M0.get(first);
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
        final int c = dok.K0[intValue].c(second);
        int n3;
        if (c == -1) {
            n3 = n;
        }
        else {
            n3 = dok.I0[intValue] + c;
        }
        return n3;
    }
    
    public final int d(boolean b) {
        int n = this.D0;
        if (n == 0) {
            return -1;
        }
        if (this.F0) {
            b = false;
        }
        if (b) {
            n = this.E0.d();
        }
        else {
            --n;
        }
        do {
            final dok dok = (dok)this;
            if (dok.K0[n].r()) {
                continue;
            }
            return dok.K0[n].d(b) + dok.J0[n];
        } while ((n = this.v(n, b)) != -1);
        return -1;
    }
    
    public final int f(int n, int n2, boolean b) {
        final boolean f0 = this.F0;
        final int n3 = 0;
        int n4 = n2;
        if (f0) {
            if ((n4 = n2) == 1) {
                n4 = 2;
            }
            b = false;
        }
        final int t = this.t(n);
        final dok dok = (dok)this;
        final int n5 = dok.J0[t];
        final e0 e0 = dok.K0[t];
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
        for (n = this.u(t, b); n != -1 && dok.K0[n].r(); n = this.u(n, b)) {}
        if (n != -1) {
            n2 = dok.J0[n];
            return dok.K0[n].b(b) + n2;
        }
        if (n4 == 2) {
            return this.b(b);
        }
        return -1;
    }
    
    public final e0$b h(final int n, final e0$b e0$b, final boolean b) {
        final dok dok = (dok)this;
        final int e = imw.e(dok.I0, n + 1);
        final int n2 = dok.J0[e];
        dok.K0[e].h(n - dok.I0[e], e0$b, b);
        e0$b.E0 += n2;
        if (b) {
            final Object o = dok.L0[e];
            final Object d0 = e0$b.D0;
            Objects.requireNonNull(d0);
            e0$b.D0 = Pair.create(o, d0);
        }
        return e0$b;
    }
    
    public final e0$b i(final Object d0, final e0$b e0$b) {
        final Pair pair = (Pair)d0;
        final Object first = pair.first;
        final Object second = pair.second;
        final dok dok = (dok)this;
        final Integer n = dok.M0.get(first);
        int intValue;
        if (n == null) {
            intValue = -1;
        }
        else {
            intValue = n;
        }
        final int n2 = dok.J0[intValue];
        dok.K0[intValue].i(second, e0$b);
        e0$b.E0 += n2;
        e0$b.D0 = d0;
        return e0$b;
    }
    
    public final int m(int n, int n2, boolean b) {
        final boolean f0 = this.F0;
        final int n3 = 0;
        int n4 = n2;
        if (f0) {
            if ((n4 = n2) == 1) {
                n4 = 2;
            }
            b = false;
        }
        final int t = this.t(n);
        final dok dok = (dok)this;
        final int n5 = dok.J0[t];
        final e0 e0 = dok.K0[t];
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
        for (n = this.v(t, b); n != -1 && dok.K0[n].r(); n = this.v(n, b)) {}
        if (n != -1) {
            n2 = dok.J0[n];
            return dok.K0[n].d(b) + n2;
        }
        if (n4 == 2) {
            return this.d(b);
        }
        return -1;
    }
    
    public final Object n(final int n) {
        final dok dok = (dok)this;
        final int e = imw.e(dok.I0, n + 1);
        return Pair.create(dok.L0[e], dok.K0[e].n(n - dok.I0[e]));
    }
    
    public final e0$d p(final int n, final e0$d e0$d, final long n2) {
        final int t = this.t(n);
        final dok dok = (dok)this;
        final int n3 = dok.J0[t];
        final int n4 = dok.I0[t];
        dok.K0[t].p(n - n3, e0$d, n2);
        Object create = dok.L0[t];
        if (!e0$d.T0.equals(e0$d.C0)) {
            create = Pair.create(create, e0$d.C0);
        }
        e0$d.C0 = create;
        e0$d.Q0 += n4;
        e0$d.R0 += n4;
        return e0$d;
    }
    
    public abstract int t(final int p0);
    
    public final int u(int c, final boolean b) {
        if (b) {
            c = this.E0.c(c);
        }
        else if (c < this.D0 - 1) {
            ++c;
        }
        else {
            c = -1;
        }
        return c;
    }
    
    public final int v(int b, final boolean b2) {
        if (b2) {
            b = this.E0.b(b);
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
