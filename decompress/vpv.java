// 
// Decompiled by Procyon v0.6.0
// 

public final class vpv
{
    public static lev a(final qzo r0) {
        final lev lev = new lev();
        if (r0 == null) {
            return lev;
        }
        lev.z = r0.a;
        lev.k = r0.j;
        final String b = r0.b;
        if (b != null) {
            lev.f = Integer.parseInt(b);
        }
        final String k = r0.k;
        if (k != null) {
            lev.b = k;
        }
        final long l = r0.l;
        if (l != 0L) {
            final gph$a gph$a = new gph$a();
            gph$a.a = l;
            gph$a.i = r0.m;
            gph$a.c = r0.n;
            gph$a.m = r0.p;
            gph$a.n = r0.o;
            lev.f0 = (gph)((h4j)gph$a).e();
        }
        final String r2 = r0.r;
        if (r2 != null) {
            lev.b = r2;
        }
        final String s = r0.s;
        if (s != null) {
            final eu6$a eu6$a = new eu6$a();
            eu6$a.a = s;
            lev.m0 = (eu6)((h4j)eu6$a).e();
        }
        final yac u = r0.u;
        if (u != null) {
            lev.n0 = u;
        }
        final String q = r0.q;
        if (q != null) {
            lev.a = Long.valueOf(q);
            lev.c = 28;
            final sxf$a sxf$a = new sxf$a();
            sxf$a.c = r0.q;
            lev.h0 = (sxf)((h4j)sxf$a).e();
        }
        lev.R0 = r0;
        return lev;
    }
    
    public static String b(final qzo qzo) {
        String f;
        final String s = f = "";
        if (qzo != null) {
            f = qzo.f;
            if (f == null) {
                f = s;
            }
        }
        return f;
    }
    
    public static String c(final qzo qzo) {
        String g;
        final String s = g = "";
        if (qzo != null) {
            g = qzo.g;
            if (g == null) {
                g = s;
            }
        }
        return g;
    }
}
