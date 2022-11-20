import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wku implements xq<jku$m>
{
    public static final wku a;
    public static final List<String> b;
    
    static {
        a = new wku();
        b = s9i.r("legacy");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (jku$m)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final jku$m c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        jku$h jku$h = null;
        while (ohe.j3((List)wku.b) == 0) {
            jku$h = (jku$h)ar.b((xq)ar.c((xq)rku.a, false)).b(ohe, fa7);
        }
        return new jku$m(jku$h);
    }
    
    public final void d(final ale ale, final fa7 fa7, final jku$m jku$m) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)jku$m, "value");
        ale.z1("legacy");
        ar.b((xq)ar.c((xq)rku.a, false)).a(ale, fa7, (Object)jku$m.a);
    }
}
