import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wlu implements zq<vku$a0>
{
    public static final wlu a;
    public static final List<String> b;
    
    static {
        a = new wlu();
        b = shw.x0((Object)"result");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vku$a0 vku$a0 = (vku$a0)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vku$a0, "value");
        yle.A1("result");
        cr.b((zq)cr.c((zq)vlu.a, true)).a(yle, lb7, (Object)vku$a0.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        vku$z vku$z = null;
        while (kie.k3((List)wlu.b) == 0) {
            vku$z = (vku$z)cr.b((zq)cr.c((zq)vlu.a, true)).b(kie, lb7);
        }
        return new vku$a0(vku$z);
    }
}
