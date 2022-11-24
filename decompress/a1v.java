import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a1v implements zq<z0v$a>
{
    public static final a1v a;
    public static final List<String> b;
    
    static {
        a = new a1v();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (z0v$a)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final z0v$a c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)a1v.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final vku c = ylu.a.c(kie, lb7);
        e0e.c(o);
        return new z0v$a((String)o, c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final z0v$a z0v$a) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)z0v$a, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, z0v$a.a);
        ylu.a.d(yle, lb7, z0v$a.b);
    }
}
