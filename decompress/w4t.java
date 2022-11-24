import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w4t implements zq<p4t.g>
{
    public static final w4t a;
    public static final List<String> b;
    
    static {
        a = new w4t();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (p4t.g)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final p4t.g c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)w4t.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final b9t c = g9t.a.c(kie, lb7);
        e0e.c(o);
        return new p4t.g((String)o, c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final p4t.g g) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)g, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, g.a);
        g9t.a.d(yle, lb7, g.b);
    }
}
