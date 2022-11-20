// 
// Decompiled by Procyon v0.6.0
// 

public final class rqv
{
    public static gfv a(final h0p r0) {
        final gfv gfv = new gfv();
        if (r0 == null) {
            return gfv;
        }
        gfv.z = r0.a;
        gfv.k = r0.j;
        final String b = r0.b;
        if (b != null) {
            gfv.f = Integer.parseInt(b);
        }
        final String k = r0.k;
        if (k != null) {
            gfv.b = k;
        }
        final long l = r0.l;
        if (l != 0L) {
            final lph$a lph$a = new lph$a();
            lph$a.a = l;
            lph$a.i = r0.m;
            lph$a.c = r0.n;
            lph$a.m = r0.p;
            lph$a.n = r0.o;
            gfv.f0 = (lph)((n4j)lph$a).e();
        }
        final String r2 = r0.r;
        if (r2 != null) {
            gfv.b = r2;
        }
        final String s = r0.s;
        if (s != null) {
            final jt6.a a = new jt6.a();
            a.a = s;
            gfv.m0 = (jt6)a.e();
        }
        final y9c u = r0.u;
        if (u != null) {
            gfv.n0 = u;
        }
        final String q = r0.q;
        if (q != null) {
            gfv.a = Long.valueOf(q);
            gfv.c = 28;
            final exf$a exf$a = new exf$a();
            exf$a.c = r0.q;
            gfv.h0 = (exf)((n4j)exf$a).e();
        }
        gfv.R0 = r0;
        return gfv;
    }
    
    public static String b(final h0p h0p) {
        String f;
        final String s = f = "";
        if (h0p != null) {
            f = h0p.f;
            if (f == null) {
                f = s;
            }
        }
        return f;
    }
    
    public static String c(final h0p h0p) {
        String g;
        final String s = g = "";
        if (h0p != null) {
            g = h0p.g;
            if (g == null) {
                g = s;
            }
        }
        return g;
    }
}
