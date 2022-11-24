import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vxv implements zq<twv>
{
    public static final vxv a;
    public static final List<String> b;
    
    static {
        a = new vxv();
        b = shw.y0((Object[])new String[] { "card_fetch_state", "card_type", "display_options", "layout", "experiment_signals" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (twv)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final twv c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        tj3 tj3 = null;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        while (true) {
            final int k3 = kie.k3((List)vxv.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        if (k3 != 3) {
                            if (k3 != 4) {
                                break;
                            }
                            o4 = cr.b((zq)cr.c((zq)nxv.a, false)).b(kie, lb7);
                        }
                        else {
                            o3 = cr.b((zq)cr.c((zq)sxv.a, true)).b(kie, lb7);
                        }
                    }
                    else {
                        o2 = cr.b((zq)cr.c((zq)mxv.a, false)).b(kie, lb7);
                    }
                }
                else {
                    o = cr.b((zq)kl3.a).b(kie, lb7);
                }
            }
            else {
                tj3 = (tj3)cr.b((zq)vj3.a).b(kie, lb7);
            }
        }
        return new twv(tj3, (jl3)o, (twv.a)o2, (twv.g)o3, (twv.b)o4);
    }
    
    public final void d(final yle yle, final lb7 lb7, final twv twv) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)twv, "value");
        yle.A1("card_fetch_state");
        cr.b((zq)vj3.a).a(yle, lb7, (Object)twv.a);
        yle.A1("card_type");
        cr.b((zq)kl3.a).a(yle, lb7, (Object)twv.b);
        yle.A1("display_options");
        cr.b((zq)cr.c((zq)mxv.a, false)).a(yle, lb7, (Object)twv.c);
        yle.A1("layout");
        cr.b((zq)cr.c((zq)sxv.a, true)).a(yle, lb7, (Object)twv.d);
        yle.A1("experiment_signals");
        cr.b((zq)cr.c((zq)nxv.a, false)).a(yle, lb7, (Object)twv.e);
    }
}
