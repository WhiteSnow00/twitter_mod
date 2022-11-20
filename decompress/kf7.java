import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kf7 implements xq<jf7>
{
    public static final kf7 a;
    public static final List<String> b;
    
    static {
        a = new kf7();
        b = s9i.r("__typename");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (jf7)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final jf7 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        jf7$c c = null;
        String s = null;
        while (ohe.j3((List)kf7.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            jf7$a c2;
            if (npe.G(npe.f0(new String[] { "DMCardAttachment" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c2 = lf7.a.c(ohe, fa7);
            }
            else {
                c2 = null;
            }
            jf7$b c3;
            if (npe.G(npe.f0(new String[] { "DMMediaAttachment" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c3 = mf7.a.c(ohe, fa7);
            }
            else {
                c3 = null;
            }
            if (npe.G(npe.f0(new String[] { "DMTweetAttachment" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = nf7.a.c(ohe, fa7);
            }
            return new jf7(s, c2, c3, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
    
    public final void d(final ale ale, final fa7 fa7, final jf7 jf7) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jf7, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)jf7.a);
        final jf7$a b = jf7.b;
        if (b != null) {
            lf7.a.d(ale, fa7, b);
        }
        final jf7$b c = jf7.c;
        if (c != null) {
            mf7.a.d(ale, fa7, c);
        }
        final jf7$c d = jf7.d;
        if (d != null) {
            nf7.a.d(ale, fa7, d);
        }
    }
}
