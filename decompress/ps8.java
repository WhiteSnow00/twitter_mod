import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ps8 implements zq<ks8$d>
{
    public static final ps8 a;
    public static final List<String> b;
    
    static {
        a = new ps8();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final ks8$d ks8$d = (ks8$d)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)ks8$d, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, ks8$d.a);
        lo0.a.d(yle, lb7, ks8$d.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)ps8.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final jo0 c = lo0.a.c(kie, lb7);
        e0e.c(o);
        return new ks8$d((String)o, c);
    }
}
