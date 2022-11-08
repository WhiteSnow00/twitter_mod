import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class veq
{
    public final weq a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    
    public veq(final weq a) {
        zzd.f((Object)a, "table");
        this.a = a;
        this.b = a.C0;
        final int d0 = a.D0;
        this.c = d0;
        this.d = a.E0;
        this.e = a.F0;
        this.h = d0;
        this.i = -1;
    }
    
    public final i10 a(final int n) {
        final ArrayList<i10> j0 = this.a.J0;
        final int k0 = tdy.K0((ArrayList)j0, n, this.c);
        i10 i10;
        if (k0 < 0) {
            i10 = new i10(n);
            j0.add(-(k0 + 1), i10);
        }
        else {
            final i10 value = j0.get(k0);
            zzd.e((Object)value, "get(location)");
            i10 = value;
        }
        return i10;
    }
    
    public final Object b(final int[] array, int length) {
        Object b;
        if (tdy.i(array, length)) {
            final Object[] d = this.d;
            length *= 5;
            if (length >= array.length) {
                length = array.length;
            }
            else {
                length = tdy.C(array[length + 1] >> 29) + array[length + 4];
            }
            b = d[length];
        }
        else {
            Objects.requireNonNull(m76.Companion);
            b = m76$a.b;
        }
        return b;
    }
    
    public final void c() {
        boolean b = true;
        this.f = true;
        final weq a = this.a;
        Objects.requireNonNull(a);
        if (this.a != a || a.G0 <= 0) {
            b = false;
        }
        if (b) {
            --a.G0;
            return;
        }
        ea6.d("Unexpected reader close()".toString());
        throw null;
    }
    
    public final void d() {
        if (this.j == 0) {
            if (this.g != this.h) {
                ea6.d("endGroup() not called at the end of a group".toString());
                throw null;
            }
            final int n = tdy.n(this.b, this.i);
            int c;
            if ((this.i = n) < 0) {
                c = this.c;
            }
            else {
                c = n + tdy.h(this.b, n);
            }
            this.h = c;
        }
    }
    
    public final Object e() {
        final int g = this.g;
        Object o;
        if (g < this.h) {
            o = this.b(this.b, g);
        }
        else {
            o = 0;
        }
        return o;
    }
    
    public final int f() {
        final int g = this.g;
        int n;
        if (g < this.h) {
            n = this.b[g * 5];
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public final Object g(final int n) {
        return this.b(this.b, n);
    }
    
    public final Object h(int n, int n2) {
        final int o = tdy.o(this.b, n);
        if (++n < this.c) {
            n = tdy.g(this.b, n);
        }
        else {
            n = this.e;
        }
        n2 += o;
        Object b;
        if (n2 < n) {
            b = this.d[n2];
        }
        else {
            Objects.requireNonNull(m76.Companion);
            b = m76$a.b;
        }
        return b;
    }
    
    public final int i(final int n) {
        return this.b[n * 5];
    }
    
    public final Object j(final int n) {
        return this.p(this.b, n);
    }
    
    public final int k(final int n) {
        return tdy.h(this.b, n);
    }
    
    public final boolean l(final int n) {
        return tdy.k(this.b, n);
    }
    
    public final Object m() {
        if (this.j <= 0) {
            final int k = this.k;
            if (k < this.l) {
                final Object[] d = this.d;
                this.k = k + 1;
                return d[k];
            }
        }
        Objects.requireNonNull(m76.Companion);
        return m76$a.b;
    }
    
    public final Object n(final int n) {
        Object b2;
        if (tdy.k(this.b, n)) {
            final int[] b = this.b;
            if (tdy.k(b, n)) {
                b2 = this.d[b[n * 5 + 4]];
            }
            else {
                Objects.requireNonNull(m76.Companion);
                b2 = m76$a.b;
            }
        }
        else {
            b2 = null;
        }
        return b2;
    }
    
    public final int o(final int n) {
        return tdy.m(this.b, n);
    }
    
    public final Object p(final int[] array, int n) {
        Object o;
        if (tdy.j(array, n)) {
            final Object[] d = this.d;
            n *= 5;
            o = d[tdy.C(array[n + 1] >> 30) + array[n + 4]];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final int q(final int n) {
        return tdy.n(this.b, n);
    }
    
    public final void r(int n) {
        if (this.j == 0) {
            if ((this.g = n) < this.c) {
                n = tdy.n(this.b, n);
            }
            else {
                n = -1;
            }
            this.i = n;
            if (n < 0) {
                this.h = this.c;
            }
            else {
                this.h = tdy.h(this.b, n) + n;
            }
            this.k = 0;
            this.l = 0;
            return;
        }
        ea6.d("Cannot reposition while in an empty region".toString());
        throw null;
    }
    
    public final int s() {
        final int j = this.j;
        final int n = 1;
        if (j == 0) {
            int m;
            if (tdy.k(this.b, this.g)) {
                m = n;
            }
            else {
                m = tdy.m(this.b, this.g);
            }
            final int g = this.g;
            this.g = tdy.h(this.b, g) + g;
            return m;
        }
        ea6.d("Cannot skip while in an empty region".toString());
        throw null;
    }
    
    public final void t() {
        if (this.j == 0) {
            this.g = this.h;
            return;
        }
        ea6.d("Cannot skip the enclosing group while in an empty region".toString());
        throw null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("SlotReader(current=");
        g.append(this.g);
        g.append(", key=");
        g.append(this.f());
        g.append(", parent=");
        g.append(this.i);
        g.append(", end=");
        return y70.y(g, this.h, ')');
    }
    
    public final void u() {
        if (this.j <= 0) {
            if (tdy.n(this.b, this.g) != this.i) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            final int g = this.g;
            this.i = g;
            this.h = tdy.h(this.b, g) + g;
            final int g2 = this.g;
            final int g3 = g2 + 1;
            this.g = g3;
            this.k = tdy.o(this.b, g2);
            int l;
            if (g2 >= this.c - 1) {
                l = this.e;
            }
            else {
                l = tdy.g(this.b, g3);
            }
            this.l = l;
        }
    }
}
