import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wug implements zq<vtg$f>
{
    public static final wug a;
    public static final List<String> b;
    
    static {
        a = new wug();
        b = shw.x0((Object)"isDmca");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final vtg$f vtg$f = (vtg$f)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)vtg$f, "value");
        yle.A1("isDmca");
        cr.f.a(yle, lb7, vtg$f.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)wug.b) == 0) {
            o = cr.f.b(kie, lb7);
        }
        e0e.c(o);
        return new vtg$f((boolean)o);
    }
}
