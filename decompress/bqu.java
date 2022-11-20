import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqu implements xq<zpu$b>
{
    public static final bqu a;
    public static final List<String> b;
    
    static {
        a = new bqu();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final zpu$b zpu$b = (zpu$b)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)zpu$b, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)zpu$b.a);
        final zpu$a b = zpu$b.b;
        if (b != null) {
            aqu.a.d(ale, fa7, b);
        }
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        zpu$a c = null;
        String s = null;
        while (ohe.j3((List)bqu.b) == 0) {
            s = (String)ar.a.b(ohe, fa7);
        }
        if (s != null) {
            if (npe.G(npe.f0(new String[] { "Tweet" }), fa7.D0.a(), s, fa7.D0)) {
                ohe.G();
                c = aqu.a.c(ohe, fa7);
            }
            return new zpu$b(s, c);
        }
        throw new IllegalStateException("__typename was not found".toString());
    }
}
