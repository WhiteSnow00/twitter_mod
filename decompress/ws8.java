import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ws8 implements zq<ks8$j>
{
    public static final ws8 a;
    public static final List<String> b;
    
    static {
        a = new ws8();
        b = shw.x0((Object)"app_store_data");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (ks8$j)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final ks8$j c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        List c = null;
        while (kie.k3((List)ws8.b) == 0) {
            c = cr.a((zq)cr.c((zq)qs8.a, true)).c(kie, lb7);
        }
        e0e.c((Object)c);
        return new ks8$j(c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final ks8$j ks8$j) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)ks8$j, "value");
        yle.A1("app_store_data");
        cr.a((zq)cr.c((zq)qs8.a, true)).d(yle, lb7, ks8$j.a);
    }
}
