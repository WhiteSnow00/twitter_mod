import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p5f implements zq<i5f$c>
{
    public static final p5f a;
    public static final List<String> b;
    
    static {
        a = new p5f();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final i5f$c i5f$c = (i5f$c)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)i5f$c, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, i5f$c.a);
        ijw.a.d(yle, lb7, i5f$c.b);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)p5f.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final ejw c = ijw.a.c(kie, lb7);
        e0e.c(o);
        return new i5f$c((String)o, c);
    }
}
