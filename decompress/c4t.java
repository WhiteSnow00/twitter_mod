import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c4t implements xq<v3t$g>
{
    public static final c4t a;
    public static final List<String> b;
    
    static {
        a = new c4t();
        b = s9i.r("__typename");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (v3t$g)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final v3t$g c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)c4t.b) == 0) {
            o = ar.a.b(ohe, fa7);
        }
        ohe.G();
        final h8t c = m8t.a.c(ohe, fa7);
        czd.c(o);
        return new v3t$g((String)o, c);
    }
    
    public final void d(final ale ale, final fa7 fa7, final v3t$g v3t$g) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)v3t$g, "value");
        ale.z1("__typename");
        ar.a.a(ale, fa7, (Object)v3t$g.a);
        m8t.a.d(ale, fa7, v3t$g.b);
    }
}
