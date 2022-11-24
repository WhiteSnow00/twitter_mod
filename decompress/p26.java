import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p26 implements zq<u16.d>
{
    public static final p26 a;
    public static final List<String> b;
    
    static {
        a = new p26();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final u16.d d = (u16.d)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)d, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, d.a);
        ss8.a.d(yle, lb7, d.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)p26.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final ks8 c = ss8.a.c(kie, lb7);
        e0e.c(o);
        return new u16.d((String)o, c);
    }
}
