import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class at8 implements zq<ks8$n>
{
    public static final at8 a;
    public static final List<String> b;
    
    static {
        a = new at8();
        b = shw.y0((Object[])new String[] { "app_store_data", "button_destination", "url_data_opt" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (ks8$n)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final ks8$n c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        List c = null;
        ks8$f ks8$f = null;
        ks8.s s = null;
        while (true) {
            final int k3 = kie.k3((List)at8.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        break;
                    }
                    s = (ks8.s)cr.b((zq)cr.c((zq)ft8.a, true)).b(kie, lb7);
                }
                else {
                    ks8$f = (ks8$f)cr.b((zq)cr.c((zq)rs8.a, true)).b(kie, lb7);
                }
            }
            else {
                c = cr.a((zq)cr.c((zq)os8.a, true)).c(kie, lb7);
            }
        }
        e0e.c((Object)c);
        return new ks8$n(c, ks8$f, s);
    }
    
    public final void d(final yle yle, final lb7 lb7, final ks8$n ks8$n) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)ks8$n, "value");
        yle.A1("app_store_data");
        cr.a((zq)cr.c((zq)os8.a, true)).d(yle, lb7, ks8$n.a);
        yle.A1("button_destination");
        cr.b((zq)cr.c((zq)rs8.a, true)).a(yle, lb7, (Object)ks8$n.b);
        yle.A1("url_data_opt");
        cr.b((zq)cr.c((zq)ft8.a, true)).a(yle, lb7, (Object)ks8$n.c);
    }
}
