import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atg implements zq<vsg$c>
{
    public static final atg a;
    public static final List<String> b;
    
    static {
        a = new atg();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vsg$c vsg$c = (vsg$c)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vsg$c, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, vsg$c.a);
        tg0.a.d(yle, lb7, vsg$c.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)atg.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final sg0 c = tg0.a.c(kie, lb7);
        e0e.c(o);
        return new vsg$c((String)o, c);
    }
}
