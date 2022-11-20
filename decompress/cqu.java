import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqu implements xq<zpu>
{
    public static final cqu a;
    public static final List<String> b;
    
    static {
        a = new cqu();
        b = s9i.r("result");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (zpu)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final zpu c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        zpu$b zpu$b = null;
        while (ohe.j3((List)cqu.b) == 0) {
            zpu$b = (zpu$b)ar.b((xq)ar.c((xq)bqu.a, true)).b(ohe, fa7);
        }
        return new zpu(zpu$b);
    }
    
    public final void d(final ale ale, final fa7 fa7, final zpu zpu) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)zpu, "value");
        ale.z1("result");
        ar.b((xq)ar.c((xq)bqu.a, true)).a(ale, fa7, (Object)zpu.a);
    }
}
