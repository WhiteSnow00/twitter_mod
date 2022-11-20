import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rg7 implements xq<pg7.a>
{
    public static final rg7 a;
    public static final List<String> b;
    
    static {
        a = new rg7();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final pg7.a a = (pg7.a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)a, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)a.a);
        ug7.a.d(ale, fa7, a.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)rg7.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final tg7 c = ug7.a.c(ohe, fa7);
        czd.c(o);
        return new pg7.a((String)o, c);
    }
}
