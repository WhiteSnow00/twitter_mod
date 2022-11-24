import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alu implements zq<vku$e>
{
    public static final alu a;
    public static final List<String> b;
    
    static {
        a = new alu();
        b = shw.x0((Object)"creator_results");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vku$e vku$e = (vku$e)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vku$e, "value");
        yle.A1("creator_results");
        cr.c((zq)yku.a, false).a(yle, lb7, (Object)vku$e.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)alu.b) == 0) {
            o = cr.c((zq)yku.a, false).b(kie, lb7);
        }
        e0e.c(o);
        return new vku$e((vku$c)o);
    }
}
