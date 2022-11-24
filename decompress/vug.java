import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vug implements zq<vtg$e>
{
    public static final vug a;
    public static final List<String> b;
    
    static {
        a = new vug();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vtg$e vtg$e = (vtg$e)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vtg$e, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, vtg$e.a);
        xf0.a.d(yle, lb7, vtg$e.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)vug.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final wf0 c = xf0.a.c(kie, lb7);
        e0e.c(o);
        return new vtg$e((String)o, c);
    }
}
