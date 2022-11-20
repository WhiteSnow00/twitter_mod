import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xku implements xq<jku$n>
{
    public static final xku a;
    public static final List<String> b;
    
    static {
        a = new xku();
        b = s9i.r("legacy");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (jku$n)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final jku$n c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        jku$i jku$i = null;
        while (ohe.j3((List)xku.b) == 0) {
            jku$i = (jku$i)ar.b((xq)ar.c((xq)sku.a, false)).b(ohe, fa7);
        }
        return new jku$n(jku$i);
    }
    
    public final void d(final ale ale, final fa7 fa7, final jku$n jku$n) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jku$n, "value");
        ale.z1("legacy");
        ar.b((xq)ar.c((xq)sku.a, false)).a(ale, fa7, (Object)jku$n.a);
    }
}
