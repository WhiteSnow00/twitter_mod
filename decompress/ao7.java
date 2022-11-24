import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ao7 implements zq<sn7$g>
{
    public static final ao7 a;
    public static final List<String> b;
    
    static {
        a = new ao7();
        b = shw.y0((Object[])new String[] { "parameter_name", "parameter_value" });
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final sn7$g sn7$g = (sn7$g)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)sn7$g, "value");
        yle.A1("parameter_name");
        final zq<String> a = cr.a;
        a.a(yle, lb7, sn7$g.a);
        yle.A1("parameter_value");
        a.a(yle, lb7, sn7$g.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        String s = null;
        while (true) {
            final int k3 = kie.k3((List)ao7.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                s = (String)cr.a.b(kie, lb7);
            }
            else {
                o = cr.a.b(kie, lb7);
            }
        }
        e0e.c(o);
        e0e.c((Object)s);
        return new sn7$g((String)o, s);
    }
}
