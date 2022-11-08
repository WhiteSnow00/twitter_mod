import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eg7 implements xq<dg7>
{
    public static final eg7 a;
    public static final List<String> b;
    
    static {
        a = new eg7();
        b = tdy.u0((Object)"__typename");
    }
    
    public final dg7 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        dg7$c c = null;
        String s = null;
        while (eie.k3((List)eg7.b) == 0) {
            s = (String)ar.a.b(eie, bb7);
        }
        if (s != null) {
            dg7$a c2;
            if (kq9.I0(kq9.a1(new String[] { "DMCardAttachment" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c2 = fg7.a.c(eie, bb7);
            }
            else {
                c2 = null;
            }
            dg7$b c3;
            if (kq9.I0(kq9.a1(new String[] { "DMMediaAttachment" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c3 = gg7.a.c(eie, bb7);
            }
            else {
                c3 = null;
            }
            if (kq9.I0(kq9.a1(new String[] { "DMTweetAttachment" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c = hg7.a.c(eie, bb7);
            }
            return new dg7(s, c2, c3, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
    
    public final void d(final qle qle, final bb7 bb7, final dg7 dg7) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)dg7, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)dg7.a);
        final dg7$a b = dg7.b;
        if (b != null) {
            fg7.a.d(qle, bb7, b);
        }
        final dg7$b c = dg7.c;
        if (c != null) {
            gg7.a.d(qle, bb7, c);
        }
        final dg7$c d = dg7.d;
        if (d != null) {
            hg7.a.d(qle, bb7, d);
        }
    }
}
