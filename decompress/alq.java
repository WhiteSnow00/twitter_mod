import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alq implements zq<zkq>
{
    public static final alq a;
    public static final List<String> b;
    
    static {
        a = new alq();
        b = shw.y0((Object[])new String[] { "text", "url", "engagement_nudge", "soft_intervention_display_type" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (zkq)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final zkq c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        zkq$b zkq$b = null;
        vkq vkq;
        Object o2 = vkq = null;
        while (true) {
            final int k3 = kie.k3((List)alq.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        if (k3 != 3) {
                            break;
                        }
                        vkq = (vkq)cr.b((zq)xkq.a).b(kie, lb7);
                    }
                    else {
                        o2 = cr.l.b(kie, lb7);
                    }
                }
                else {
                    zkq$b = (zkq$b)cr.c((zq)clq.a, true).b(kie, lb7);
                }
            }
            else {
                o = cr.c((zq)blq.a, false).b(kie, lb7);
            }
        }
        e0e.c(o);
        e0e.c((Object)zkq$b);
        return new zkq((zkq$a)o, zkq$b, (Boolean)o2, vkq);
    }
    
    public final void d(final yle yle, final lb7 lb7, final zkq zkq) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)zkq, "value");
        yle.A1("text");
        cr.c((zq)blq.a, false).a(yle, lb7, (Object)zkq.a);
        yle.A1("url");
        cr.c((zq)clq.a, true).a(yle, lb7, (Object)zkq.b);
        yle.A1("engagement_nudge");
        cr.l.a(yle, lb7, (Object)zkq.c);
        yle.A1("soft_intervention_display_type");
        cr.b((zq)xkq.a).a(yle, lb7, (Object)zkq.d);
    }
}
