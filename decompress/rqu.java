import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rqu implements xq<pqu.b>
{
    public static final rqu a;
    public static final List<String> b;
    
    static {
        a = new rqu();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final pqu.b b = (pqu.b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)b, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)b.a);
        final pqu.a b2 = b.b;
        if (b2 != null) {
            qqu.a.d(ale, fa7, b2);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        pqu.a c = null;
        String s = null;
        while (ohe.j3((List)rqu.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "TweetUnavailable" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = qqu.a.c(ohe, fa7);
            }
            return new pqu.b(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
