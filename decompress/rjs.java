import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rjs
{
    public final qjs a;
    public bwe b;
    public bwe c;
    
    public rjs(final qjs a) {
        this.a = a;
    }
    
    public final long a(final long n) {
        final bwe b = this.b;
        p6m e = null;
        Label_0087: {
            if (b != null) {
                final boolean j = b.j();
                p6m p6m = null;
                if (j) {
                    final bwe c = this.c;
                    if (c != null) {
                        p6m = j98.g(c, b, false, 2, (Object)null);
                    }
                }
                else {
                    Objects.requireNonNull(p6m.Companion);
                    p6m = p6m.e;
                }
                if ((e = p6m) != null) {
                    break Label_0087;
                }
            }
            Objects.requireNonNull(p6m.Companion);
            e = p6m.e;
        }
        final float d = kgj.d(n);
        float n2 = e.a;
        if (d >= n2) {
            final float d2 = kgj.d(n);
            n2 = e.c;
            if (d2 <= n2) {
                n2 = kgj.d(n);
            }
        }
        final float e2 = kgj.e(n);
        float n3 = e.b;
        if (e2 >= n3) {
            final float e3 = kgj.e(n);
            n3 = e.d;
            if (e3 <= n3) {
                n3 = kgj.e(n);
            }
        }
        return kqe.e(n2, n3);
    }
    
    public final int b(long c, final boolean b) {
        long a = c;
        if (b) {
            a = this.a(c);
        }
        c = this.c(a);
        return this.a.l(c);
    }
    
    public final long c(final long n) {
        final bwe b = this.b;
        long a = n;
        if (b != null) {
            final bwe c = this.c;
            kgj kgj;
            if (c != null) {
                long v;
                if (b.j() && c.j()) {
                    v = b.v(c, n);
                }
                else {
                    v = n;
                }
                kgj = new kgj(v);
            }
            else {
                kgj = null;
            }
            a = n;
            if (kgj != null) {
                a = kgj.a;
            }
        }
        return a;
    }
}
