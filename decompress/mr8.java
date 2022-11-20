import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mr8 implements xq<er8>
{
    public static final mr8 a;
    public static final List<String> b;
    
    static {
        a = new mr8();
        b = s9i.r("__typename");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (er8)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final er8 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        er8.o c = null;
        String s = null;
        while (ohe.j3((List)mr8.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            er8.l c2;
            if (npe.G(npe.f0(new String[] { "CardBrowserDestination" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c2 = sr8.a.c(ohe, fa7);
            }
            else {
                c2 = null;
            }
            er8.m c3;
            if (npe.G(npe.f0(new String[] { "CardBrowserWithDockedMediaDestination" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c3 = tr8.a.c(ohe, fa7);
            }
            else {
                c3 = null;
            }
            er8.j c4;
            if (npe.G(npe.f0(new String[] { "CardAppStoreDestination" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c4 = qr8.a.c(ohe, fa7);
            }
            else {
                c4 = null;
            }
            er8.k c5;
            if (npe.G(npe.f0(new String[] { "CardAppStoreWithDockedMediaDestination" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c5 = rr8.a.c(ohe, fa7);
            }
            else {
                c5 = null;
            }
            er8.n c6;
            if (npe.G(npe.f0(new String[] { "CardPlayableDestination" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c6 = ur8.a.c(ohe, fa7);
            }
            else {
                c6 = null;
            }
            er8.p c7;
            if (npe.G(npe.f0(new String[] { "CardTweetComposerDestination" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c7 = wr8.a.c(ohe, fa7);
            }
            else {
                c7 = null;
            }
            if (npe.G(npe.f0(new String[] { "CardProfileDestination" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = vr8.a.c(ohe, fa7);
            }
            return new er8(s, c2, c3, c4, c5, c6, c7, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
    
    public final void d(final ale ale, final fa7 fa7, final er8 er8) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)er8, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)er8.a);
        final er8.l b = er8.b;
        if (b != null) {
            sr8.a.d(ale, fa7, b);
        }
        final er8.m c = er8.c;
        if (c != null) {
            tr8.a.d(ale, fa7, c);
        }
        final er8.j d = er8.d;
        if (d != null) {
            qr8.a.d(ale, fa7, d);
        }
        final er8.k e = er8.e;
        if (e != null) {
            rr8.a.d(ale, fa7, e);
        }
        final er8.n f = er8.f;
        if (f != null) {
            ur8.a.d(ale, fa7, f);
        }
        final er8.p g = er8.g;
        if (g != null) {
            wr8.a.d(ale, fa7, g);
        }
        final er8.o h = er8.h;
        if (h != null) {
            vr8.a.d(ale, fa7, h);
        }
    }
}
