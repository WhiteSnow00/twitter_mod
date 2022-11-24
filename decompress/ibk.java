import java.util.ListIterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibk<E> extends id<E>
{
    public final Object[] F0;
    public final Object[] G0;
    public final int H0;
    public final int I0;
    
    public ibk(final Object[] f0, final Object[] g0, int h0, final int i0) {
        e0e.f((Object)f0, "root");
        e0e.f((Object)g0, "tail");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        if (this.getSize() > 32) {
            h0 = 1;
        }
        else {
            h0 = 0;
        }
        if (h0 != 0) {
            return;
        }
        final StringBuilder f2 = ehk.f("Trie-based persistent vector should have at least 33 elements, got ");
        f2.append(this.getSize());
        throw new IllegalArgumentException(f2.toString().toString());
    }
    
    public final v9k<E> B0(final int n) {
        ix.i(n, this.getSize());
        final int p = this.p();
        if (n >= p) {
            return this.o(this.F0, p, this.I0, n - p);
        }
        return this.o(this.n(this.F0, this.I0, n, new h5j(this.G0[0], 0)), p, this.I0, 0);
    }
    
    public final v9k<E> add(final int n, final E e) {
        ix.j(n, this.getSize());
        if (n == this.getSize()) {
            return this.add(e);
        }
        final int p2 = this.p();
        if (n >= p2) {
            return (v9k<E>)this.g(this.F0, n - p2, e);
        }
        final h5j h5j = new h5j((Object)null, 0);
        return (v9k<E>)this.g(this.e(this.F0, this.I0, n, e, h5j), 0, h5j.a());
    }
    
    public final v9k<E> add(final E e) {
        final int n = this.getSize() - this.p();
        if (n < 32) {
            final Object[] copy = Arrays.copyOf(this.G0, 32);
            e0e.e((Object)copy, "copyOf(this, newSize)");
            copy[n] = e;
            return (v9k<E>)new ibk(this.F0, copy, this.getSize() + 1, this.I0);
        }
        return (v9k<E>)this.j(this.F0, this.G0, zzz.f0((Object)e));
    }
    
    public final Object[] e(final Object[] array, int n, final int n2, final Object o, final h5j h5j) {
        final int n3 = n2 >> n & 0x1F;
        if (n == 0) {
            Object[] copy;
            if (n3 == 0) {
                copy = new Object[32];
            }
            else {
                copy = Arrays.copyOf(array, 32);
                e0e.e((Object)copy, "copyOf(this, newSize)");
            }
            et0.H0(array, copy, n3 + 1, n3, 31);
            h5j.b(array[31]);
            copy[n3] = o;
            return copy;
        }
        final Object[] copy2 = Arrays.copyOf(array, 32);
        e0e.e((Object)copy2, "copyOf(this, newSize)");
        final int n4 = n - 5;
        final Object o2 = array[n3];
        final String s = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        e0e.d(o2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copy2[n3] = this.e((Object[])o2, n4, n2, o, h5j);
        n = n3 + 1;
        final String s2 = s;
        while (n < 32 && copy2[n] != null) {
            final Object o3 = array[n];
            e0e.d(o3, s2);
            copy2[n] = this.e((Object[])o3, n4, 0, h5j.a(), h5j);
            ++n;
        }
        return copy2;
    }
    
    public final v9k<E> f3(final stb<? super E, Boolean> stb) {
        final kbk kbk = new kbk((v9k)this, this.F0, this.G0, this.I0);
        kbk.E((stb)stb);
        return (v9k<E>)kbk.b();
    }
    
    public final ibk<E> g(final Object[] array, final int n, final Object o) {
        final int n2 = this.getSize() - this.p();
        final Object[] copy = Arrays.copyOf(this.G0, 32);
        e0e.e((Object)copy, "copyOf(this, newSize)");
        if (n2 < 32) {
            et0.H0(this.G0, copy, n + 1, n, n2);
            copy[n] = o;
            return new ibk<E>(array, copy, this.getSize() + 1, this.I0);
        }
        final Object[] g0 = this.G0;
        final Object o2 = g0[31];
        et0.H0(g0, copy, n + 1, n, n2 - 1);
        copy[n] = o;
        return this.j(array, copy, zzz.f0(o2));
    }
    
    public final E get(final int n) {
        ix.i(n, this.getSize());
        Object[] g0;
        if (this.p() <= n) {
            g0 = this.G0;
        }
        else {
            Object[] f0 = this.F0;
            int i0 = this.I0;
            while (true) {
                g0 = f0;
                if (i0 <= 0) {
                    break;
                }
                final Object o = f0[n >> i0 & 0x1F];
                e0e.d(o, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                f0 = (Object[])o;
                i0 -= 5;
            }
        }
        return (E)g0[n & 0x1F];
    }
    
    public final int getSize() {
        return this.H0;
    }
    
    public final Object[] i(Object[] copy, final int n, final int n2, final h5j h5j) {
        final int n3 = n2 >> n & 0x1F;
        Object i;
        if (n == 5) {
            h5j.b(copy[n3]);
            i = null;
        }
        else {
            final Object o = copy[n3];
            e0e.d(o, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            i = this.i((Object[])o, n - 5, n2, h5j);
        }
        if (i == null && n3 == 0) {
            return null;
        }
        copy = Arrays.copyOf(copy, 32);
        e0e.e((Object)copy, "copyOf(this, newSize)");
        copy[n3] = i;
        return copy;
    }
    
    public final ibk<E> j(Object[] f0, final Object[] array, final Object[] array2) {
        final int h0 = this.H0;
        final int i0 = this.I0;
        if (h0 >> 5 > 1 << i0) {
            f0 = zzz.f0((Object)f0);
            final int n = this.I0 + 5;
            return new ibk<E>(this.k(f0, n, array), array2, this.H0 + 1, n);
        }
        return new ibk<E>(this.k(f0, i0, array), array2, this.H0 + 1, this.I0);
    }
    
    public final Object[] k(Object[] copy, final int n, final Object[] array) {
        final int n2 = this.H0 - 1 >> n & 0x1F;
        if (copy != null) {
            copy = Arrays.copyOf(copy, 32);
            e0e.e((Object)copy, "copyOf(this, newSize)");
        }
        else {
            copy = new Object[32];
        }
        if (n == 5) {
            copy[n2] = array;
        }
        else {
            copy[n2] = this.k((Object[])copy[n2], n - 5, array);
        }
        return copy;
    }
    
    public final v9k$a l() {
        return (v9k$a)new kbk((v9k)this, this.F0, this.G0, this.I0);
    }
    
    public final ListIterator<E> listIterator(final int n) {
        ix.j(n, this.getSize());
        final Object[] f0 = this.F0;
        final Object[] g0 = this.G0;
        e0e.d((Object)g0, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector>");
        return new mbk<E>(f0, g0, n, this.getSize(), this.I0 / 5 + 1);
    }
    
    public final Object[] n(Object[] copy, int n, final int n2, final h5j h5j) {
        int n3 = 31;
        final int n4 = n2 >> n & 0x1F;
        if (n == 0) {
            Object[] copy2;
            if (n4 == 0) {
                copy2 = new Object[32];
            }
            else {
                copy2 = Arrays.copyOf(copy, 32);
                e0e.e((Object)copy2, "copyOf(this, newSize)");
            }
            et0.H0(copy, copy2, n4, n4 + 1, 32);
            copy2[31] = h5j.a();
            h5j.b(copy[n4]);
            return copy2;
        }
        if (copy[31] == null) {
            n3 = (0x1F & this.p() - 1 >> n);
        }
        copy = Arrays.copyOf(copy, 32);
        e0e.e((Object)copy, "copyOf(this, newSize)");
        n -= 5;
        final int n5 = n4 + 1;
        if (n5 <= n3) {
            while (true) {
                final Object o = copy[n3];
                e0e.d(o, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copy[n3] = this.n((Object[])o, n, 0, h5j);
                if (n3 == n5) {
                    break;
                }
                --n3;
            }
        }
        final Object o2 = copy[n4];
        e0e.d(o2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copy[n4] = this.n((Object[])o2, n, n2, h5j);
        return copy;
    }
    
    public final v9k<E> o(Object[] i, final int n, final int n2, final int n3) {
        final int n4 = this.getSize() - n;
        if (n4 == 1) {
            Object o;
            if (n2 == 0) {
                Object[] copy = i;
                if (i.length == 33) {
                    copy = Arrays.copyOf(i, 32);
                    e0e.e((Object)copy, "copyOf(this, newSize)");
                }
                o = new rgq(copy);
            }
            else {
                final h5j h5j = new h5j((Object)null, 0);
                i = this.i(i, n2, n - 1, h5j);
                e0e.c((Object)i);
                final Object a = h5j.a();
                e0e.d(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                final Object[] array = (Object[])a;
                if (i[1] == null) {
                    final Object o2 = i[0];
                    e0e.d(o2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    o = new ibk((Object[])o2, array, n, n2 - 5);
                }
                else {
                    o = new ibk(i, array, n, n2);
                }
            }
            return (v9k<E>)o;
        }
        final Object[] copy2 = Arrays.copyOf(this.G0, 32);
        e0e.e((Object)copy2, "copyOf(this, newSize)");
        final int n5 = n4 - 1;
        if (n3 < n5) {
            et0.H0(this.G0, copy2, n3, n3 + 1, n4);
        }
        copy2[n5] = null;
        return (v9k<E>)new ibk(i, copy2, n + n4 - 1, n2);
    }
    
    public final int p() {
        return this.getSize() - 1 & 0xFFFFFFE0;
    }
    
    public final Object[] q(Object[] copy, final int n, final int n2, final Object o) {
        final int n3 = n2 >> n & 0x1F;
        copy = Arrays.copyOf(copy, 32);
        e0e.e((Object)copy, "copyOf(this, newSize)");
        if (n == 0) {
            copy[n3] = o;
        }
        else {
            final Object o2 = copy[n3];
            e0e.d(o2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copy[n3] = this.q((Object[])o2, n - 5, n2, o);
        }
        return copy;
    }
    
    public final v9k<E> set(final int n, final E e) {
        ix.i(n, this.getSize());
        if (this.p() <= n) {
            final Object[] copy = Arrays.copyOf(this.G0, 32);
            e0e.e((Object)copy, "copyOf(this, newSize)");
            copy[n & 0x1F] = e;
            return (v9k<E>)new ibk(this.F0, copy, this.getSize(), this.I0);
        }
        return (v9k<E>)new ibk(this.q(this.F0, this.I0, n, e), this.G0, this.getSize(), this.I0);
    }
}
