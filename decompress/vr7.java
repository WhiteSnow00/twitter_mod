import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vr7 implements zq<sr7$a>
{
    public static final vr7 a;
    public static final List<String> b;
    
    static {
        a = new vr7();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final sr7$a sr7$a = (sr7$a)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)sr7$a, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, sr7$a.a);
        tg0.a.d(yle, lb7, sr7$a.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)vr7.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final sg0 c = tg0.a.c(kie, lb7);
        e0e.c(o);
        return new sr7$a((String)o, c);
    }
}
