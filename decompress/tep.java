import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tep
{
    public static final long a(final lep lep, final long n, final tdp.a a, final boolean b) {
        final jdp f = lep.f(a);
        if (f == null) {
            Objects.requireNonNull(qfj.Companion);
            return qfj.d;
        }
        final sve j = lep.j;
        if (j == null) {
            Objects.requireNonNull(qfj.Companion);
            return qfj.d;
        }
        final sve c = f.c();
        if (c == null) {
            Objects.requireNonNull(qfj.Companion);
            return qfj.d;
        }
        int b2;
        if (b) {
            b2 = a.b;
        }
        else {
            b2 = a.b - 1;
        }
        final qfj qfj = (qfj)((nhq)lep.p).getValue();
        zzd.c((Object)qfj);
        final float d = qfj.d(c.v(j, qfj.a));
        final long h = f.h(b2);
        final n5m a2 = f.a(mis.g(h));
        final int n2 = mis.f(h) - 1;
        final int g = mis.g(h);
        int n3 = n2;
        if (n2 < g) {
            n3 = g;
        }
        final n5m a3 = f.a(n3);
        final float u = pf8.u(d, Math.min(a2.a, a3.a), Math.max(a2.c, a3.c));
        if (Math.abs(d - u) > (int)(n >> 32) / 2) {
            Objects.requireNonNull(qfj.Companion);
            return qfj.d;
        }
        return j.v(c, ukg.m(u, qfj.e(f.a(b2).b())));
    }
    
    public static final boolean b(final n5m n5m, final long n) {
        final float a = n5m.a;
        final float c = n5m.c;
        final float d = qfj.d(n);
        final boolean b = false;
        final boolean b2 = a <= d && d <= c;
        boolean b3 = b;
        if (b2) {
            final float b4 = n5m.b;
            final float d2 = n5m.d;
            final float e = qfj.e(n);
            final boolean b5 = b4 <= e && e <= d2;
            b3 = b;
            if (b5) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public static final tdp c(tdp tdp, final tdp tdp2) {
        tdp tdp3 = tdp2;
        if (tdp != null) {
            if (tdp2 != null) {
                if (tdp.c) {
                    tdp = tdp.a(tdp, tdp2.a, null, 6);
                }
                else {
                    tdp = tdp.a(tdp, null, tdp2.b, 5);
                }
            }
            tdp3 = tdp;
        }
        return tdp3;
    }
    
    public static final n5m d(final sve sve) {
        final n5m f = m8y.f(sve);
        final long k = sve.k(f.d());
        final long i = sve.k(ukg.m(f.c, f.d));
        return new n5m(qfj.d(k), qfj.e(k), qfj.d(i), qfj.e(i));
    }
}
