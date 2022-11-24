import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a7f implements zq<r6f$h>
{
    public static final a7f a;
    public static final List<String> b;
    
    static {
        a = new a7f();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final r6f$h r6f$h = (r6f$h)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)r6f$h, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, r6f$h.a);
        bvg.a.d(yle, lb7, r6f$h.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)a7f.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final vtg c = bvg.a.c(kie, lb7);
        e0e.c(o);
        return new r6f$h((String)o, c);
    }
}
