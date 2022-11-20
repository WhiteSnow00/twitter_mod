import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mx8 implements xq<gx8$e>
{
    public static final mx8 a;
    public static final List<String> b;
    
    static {
        a = new mx8();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final gx8$e gx8$e = (gx8$e)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)gx8$e, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)gx8$e.a);
        b7a.a.d(ale, fa7, gx8$e.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)mx8.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final a7a c = b7a.a.c(ohe, fa7);
        czd.c(o);
        return new gx8$e((String)o, c);
    }
}
