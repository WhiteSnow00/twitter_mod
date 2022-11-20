import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqu implements xq<iqu$e>
{
    public static final nqu a;
    public static final List<String> b;
    
    static {
        a = new nqu();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final iqu$e iqu$e = (iqu$e)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)iqu$e, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)iqu$e.a);
        final iqu$a b = iqu$e.b;
        if (b != null) {
            jqu.a.d(ale, fa7, b);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        iqu$a c = null;
        String s = null;
        while (ohe.j3((List)nqu.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "TextTombstone" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = jqu.a.c(ohe, fa7);
            }
            return new iqu$e(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
