import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amu implements zq<vku$d0>
{
    public static final amu a;
    public static final List<String> b;
    
    static {
        a = new amu();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vku$d0 vku$d0 = (vku$d0)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vku$d0, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, vku$d0.a);
        vxv.a.d(yle, lb7, vku$d0.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)amu.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final twv c = vxv.a.c(kie, lb7);
        e0e.c(o);
        return new vku$d0((String)o, c);
    }
}
