import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w0v implements zq<u0v.a>
{
    public static final w0v a;
    public static final List<String> b;
    
    static {
        a = new w0v();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final u0v.a a = (u0v.a)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)a, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, a.a);
        s0v.a.d(yle, lb7, a.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)w0v.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final o0v c = s0v.a.c(kie, lb7);
        e0e.c(o);
        return new u0v.a((String)o, c);
    }
}
