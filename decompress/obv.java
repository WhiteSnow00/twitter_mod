// 
// Decompiled by Procyon v0.6.0
// 

public final class obv implements a3j, mac
{
    public final String a(final y2j y2j) {
        final bac bac = new bac(y2j);
        final tsc r = ((ksc)bac).R();
        final boolean b = r.b;
        String a = null;
        if (b) {
            final lac w0 = bac.W0;
            if (w0 != null) {
                a = w0.a;
            }
            return a;
        }
        final int c = r.c;
        if (c != 401 && c != 403) {
            return null;
        }
        throw new IllegalArgumentException();
    }
    
    public final y2j b() {
        final x9c x9c = new x9c();
        final tsc tsc = (tsc)xir.a((loo)new nbv((Object)x9c, 0));
        y2j y2j2;
        final y2j y2j = y2j2 = null;
        if (tsc != null) {
            y2j2 = y2j;
            if (tsc.b) {
                final of v0 = x9c.V0;
                y2j2 = y2j;
                if (v0 != null) {
                    y2j2 = new y2j(v0.a);
                }
            }
        }
        return y2j2;
    }
}
