import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rj9 implements xq<lj9.g>
{
    public static final rj9 a;
    public static final List<String> b;
    
    static {
        a = new rj9();
        b = s9i.r("communityMembershipsSlice");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (lj9.g)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final lj9.g c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        while (ohe.j3((List)rj9.b) == 0) {
            o = ar.c((xq)mj9.a, false).b(ohe, fa7);
        }
        czd.c(o);
        return new lj9.g((lj9.a)o);
    }
    
    public final void d(final ale ale, final fa7 fa7, final lj9.g g) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)g, "value");
        ale.z1("communityMembershipsSlice");
        ar.c((xq)mj9.a, false).a(ale, fa7, (Object)g.a);
    }
}
