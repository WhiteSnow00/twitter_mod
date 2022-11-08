import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dq4 implements xq<aq4>
{
    public static final dq4 a;
    public static final List<String> b;
    
    static {
        a = new dq4();
        b = tdy.u0((Object)"__typename");
    }
    
    public final aq4 c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        aq4$d c = null;
        String s = null;
        while (eie.k3((List)dq4.b) == 0) {
            s = (String)ar.a.b(eie, bb7);
        }
        if (s != null) {
            aq4$e c2;
            if (kq9.I0(kq9.a1(new String[] { "CollabTweet" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c2 = gq4.a.c(eie, bb7);
            }
            else {
                c2 = null;
            }
            if (kq9.I0(kq9.a1(new String[] { "CollabInvitation" }), bb7.C0.a(), s, bb7.C0)) {
                eie.H();
                c = fq4.a.c(eie, bb7);
            }
            return new aq4(s, c2, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
    
    public final void d(final qle qle, final bb7 bb7, final aq4 aq4) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)aq4, "value");
        qle.A1("__typename");
        ar.a.a(qle, bb7, (Object)aq4.a);
        final aq4$e b = aq4.b;
        if (b != null) {
            gq4.a.d(qle, bb7, b);
        }
        final aq4$d c = aq4.c;
        if (c != null) {
            fq4.a.d(qle, bb7, c);
        }
    }
}
