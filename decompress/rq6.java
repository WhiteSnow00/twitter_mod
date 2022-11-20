import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rq6 implements xq<hq6$d>
{
    public static final rq6 a;
    public static final List<String> b;
    
    static {
        a = new rq6();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final hq6$d hq6$d = (hq6$d)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)hq6$d, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)hq6$d.a);
        final hq6$c b = hq6$d.b;
        if (b != null) {
            qq6.a.d(ale, fa7, b);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        hq6$c c = null;
        String s = null;
        while (ohe.j3((List)rq6.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "User" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = qq6.a.c(ohe, fa7);
            }
            return new hq6$d(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
