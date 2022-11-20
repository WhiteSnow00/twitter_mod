import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jv5 implements xq<fv5$e>
{
    public static final jv5 a;
    public static final List<String> b;
    
    static {
        a = new jv5();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final fv5$e fv5$e = (fv5$e)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)fv5$e, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)fv5$e.a);
        final zu5 b = fv5$e.b;
        if (b != null) {
            av5.a.d(ale, fa7, b);
        }
        final bv5 c = fv5$e.c;
        if (c != null) {
            cv5.a.d(ale, fa7, c);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        bv5 c = null;
        String s = null;
        while (ohe.j3((List)jv5.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            zu5 c2;
            if (npe.G(npe.f0(new String[] { "CommunitySpaceCreateAction" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c2 = av5.a.c(ohe, fa7);
            }
            else {
                c2 = null;
            }
            if (npe.G(npe.f0(new String[] { "CommunitySpaceCreateActionUnavailable" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = cv5.a.c(ohe, fa7);
            }
            return new fv5$e(s, c2, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
