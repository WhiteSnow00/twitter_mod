import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w26 implements zq<u16.k>
{
    public static final w26 a;
    public static final List<String> b;
    
    static {
        a = new w26();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final u16.k k = (u16.k)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)k, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, k.a);
        tg0.a.d(yle, lb7, k.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)w26.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final sg0 c = tg0.a.c(kie, lb7);
        e0e.c(o);
        return new u16.k((String)o, c);
    }
}
