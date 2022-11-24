import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plu implements zq<vku$t>
{
    public static final plu a;
    public static final List<String> b;
    
    static {
        a = new plu();
        b = shw.x0((Object)"reaction_type_map");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vku$t vku$t = (vku$t)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vku$t, "value");
        yle.A1("reaction_type_map");
        cr.b((zq)cr.a((zq)cr.c((zq)rlu.a, false))).a(yle, lb7, (Object)vku$t.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        List list = null;
        while (kie.k3((List)plu.b) == 0) {
            list = (List)cr.b((zq)cr.a((zq)cr.c((zq)rlu.a, false))).b(kie, lb7);
        }
        return new vku$t(list);
    }
}
