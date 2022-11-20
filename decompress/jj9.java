import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jj9 implements xq<ej9.c>
{
    public static final jj9 a;
    public static final List<String> b;
    
    static {
        a = new jj9();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final ej9.c c = (ej9.c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)c, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)c.a);
        final bu6 b = c.b;
        if (b != null) {
            du6.a.d(ale, fa7, b);
        }
        final tt6 c2 = c.c;
        if (c2 != null) {
            ut6.a.d(ale, fa7, c2);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        tt6 c = null;
        String s = null;
        while (ohe.j3((List)jj9.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            bu6 c2;
            if (npe.G(npe.f0(new String[] { "DMConversationWithVisibilityResults" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c2 = du6.a.c(ohe, fa7);
            }
            else {
                c2 = null;
            }
            if (npe.G(npe.f0(new String[] { "DMConversationUnavailable" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = ut6.a.c(ohe, fa7);
            }
            return new ej9.c(s, c2, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
