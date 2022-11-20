import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c7a implements xq<a7a.a>
{
    public static final c7a a;
    public static final List<String> b;
    
    static {
        a = new c7a();
        b = s9i.r("__typename");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final a7a.a a = (a7a.a)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)a, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)a.a);
        mh0.a.d(ale, fa7, a.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)c7a.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final lh0 c = mh0.a.c(ohe, fa7);
        czd.c(o);
        return new a7a.a((String)o, c);
    }
}
