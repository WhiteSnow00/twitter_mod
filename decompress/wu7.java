import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wu7 implements zq<su7>
{
    public static final wu7 a;
    public static final List<String> b;
    
    static {
        a = new wu7();
        b = shw.y0((Object[])new String[] { "items", "slice_info" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (su7)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final su7 c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        List c = null;
        su7$b su7$b = null;
        while (true) {
            final int k3 = kie.k3((List)wu7.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                su7$b = (su7$b)cr.c((zq)yu7.a, true).b(kie, lb7);
            }
            else {
                c = cr.a((zq)cr.b((zq)cr.c((zq)xu7.a, true))).c(kie, lb7);
            }
        }
        e0e.c((Object)c);
        e0e.c((Object)su7$b);
        return new su7(c, su7$b);
    }
    
    public final void d(final yle yle, final lb7 lb7, final su7 su7) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)su7, "value");
        yle.A1("items");
        cr.a((zq)cr.b((zq)cr.c((zq)xu7.a, true))).d(yle, lb7, su7.a);
        yle.A1("slice_info");
        cr.c((zq)yu7.a, true).a(yle, lb7, (Object)su7.b);
    }
}
