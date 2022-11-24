import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ak3 implements zq<qi3>
{
    public static final ak3 a;
    public static final List<String> b;
    
    static {
        a = new ak3();
        b = shw.y0((Object[])new String[] { "legacy", "rest_id" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (qi3)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final qi3 c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        qi3$a qi3$a = null;
        while (true) {
            final int k3 = kie.k3((List)ak3.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                o = cr.a.b(kie, lb7);
            }
            else {
                final bk3 a = bk3.a;
                final zq<String> a2 = cr.a;
                qi3$a = (qi3$a)cr.b((zq)new y4j((zq)a, true)).b(kie, lb7);
            }
        }
        e0e.c(o);
        return new qi3(qi3$a, (String)o);
    }
    
    public final void d(final yle yle, final lb7 lb7, final qi3 qi3) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)qi3, "value");
        yle.A1("legacy");
        final bk3 a = bk3.a;
        final zq<String> a2 = cr.a;
        cr.b((zq)new y4j((zq)a, true)).a(yle, lb7, (Object)qi3.a);
        yle.A1("rest_id");
        cr.a.a(yle, lb7, qi3.b);
    }
}
