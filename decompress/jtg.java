import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtg implements xq<ftg$c>
{
    public static final jtg a;
    public static final List<String> b;
    
    static {
        a = new jtg();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final ftg$c ftg$c = (ftg$c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)ftg$c, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)ftg$c.a);
        final hbh b = ftg$c.b;
        if (b != null) {
            jbh.a.d(ale, fa7, b);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        hbh c = null;
        String s = null;
        while (ohe.j3((List)jtg.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "User" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = jbh.a.c(ohe, fa7);
            }
            return new ftg$c(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
