import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wr7 implements zq<sr7$b>
{
    public static final wr7 a;
    public static final List<String> b;
    
    static {
        a = new wr7();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final sr7$b sr7$b = (sr7$b)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)sr7$b, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, sr7$b.a);
        c7w.a.d(yle, lb7, sr7$b.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)wr7.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final b7w c = c7w.a.c(kie, lb7);
        e0e.c(o);
        return new sr7$b((String)o, c);
    }
}
