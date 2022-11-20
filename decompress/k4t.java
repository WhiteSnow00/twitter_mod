import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k4t implements xq<v3t$n>
{
    public static final k4t a;
    public static final List<String> b;
    
    static {
        a = new k4t();
        b = s9i.r("result");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final v3t$n v3t$n = (v3t$n)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)v3t$n, "value");
        ale.z1("result");
        ar.b((xq)ar.c((xq)h4t.a, true)).a(ale, fa7, (Object)v3t$n.a);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        v3t$l v3t$l = null;
        while (ohe.j3((List)k4t.b) == 0) {
            v3t$l = (v3t$l)ar.b((xq)ar.c((xq)h4t.a, true)).b(ohe, fa7);
        }
        return new v3t$n(v3t$l);
    }
}
