import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cu6 implements xq<bu6$a>
{
    public static final cu6 a;
    public static final List<String> b;
    
    static {
        a = new cu6();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final bu6$a bu6$a = (bu6$a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)bu6$a, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)bu6$a.a);
        es6.a.d(ale, fa7, bu6$a.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)cu6.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final mp6 c = es6.a.c(ohe, fa7);
        czd.c(o);
        return new bu6$a((String)o, c);
    }
}
