// 
// Decompiled by Procyon v0.6.0
// 

public final class y01
{
    public static lev a(final String s) {
        return b(s, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null);
    }
    
    public static lev b(final String s, final String b, final String c, final String d, final String e, final String f, final Integer g, final String h, final Boolean i, final String j, final boolean k, final String l, final Boolean m, final Boolean w0, final String n, final String o) {
        lev lev2;
        if (s != null) {
            final lev lev = new lev();
            final iof$a iof$a = new iof$a();
            iof$a.a = s;
            lev.i0 = (iof)((h4j)iof$a).e();
            nyf.a(lev, s);
            lev.w0 = w0;
            lev2 = lev;
        }
        else {
            lev2 = null;
        }
        if (s == null && b == null && c == null && !pjr.g((CharSequence)h) && i == null && j == null && n == null && o == null) {
            final lev lev3 = lev2;
            if (e == null) {
                return lev3;
            }
        }
        lev lev3;
        if ((lev3 = lev2) == null) {
            lev3 = new lev();
        }
        final z21.b b2 = new z21.b();
        b2.a = s;
        b2.d = d;
        b2.b = b;
        b2.c = c;
        b2.e = e;
        b2.f = f;
        b2.g = g;
        b2.h = h;
        b2.i = i;
        b2.j = j;
        b2.k = k;
        b2.l = l;
        b2.m = m;
        b2.n = n;
        b2.o = o;
        lev3.z0 = (z21)b2.e();
        return lev3;
    }
    
    public static lev c(final String s, final boolean b) {
        return b(s, null, null, null, null, null, null, null, null, null, b, null, null, null, null, null);
    }
    
    public static lev d(final String s, final String s2, final boolean b, final String s3) {
        return b(s, null, null, null, s2, null, null, null, null, null, b, s3, null, null, null, null);
    }
}
