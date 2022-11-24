import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wh0 implements zq<rh0$b>
{
    public static final wh0 a;
    public static final List<String> b;
    
    static {
        a = new wh0();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final rh0$b rh0$b = (rh0$b)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)rh0$b, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, rh0$b.a);
        cf0.a.d(yle, lb7, rh0$b.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)wh0.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final bf0 c = cf0.a.c(kie, lb7);
        e0e.c(o);
        return new rh0$b((String)o, c);
    }
}
