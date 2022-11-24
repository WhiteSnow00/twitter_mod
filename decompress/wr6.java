import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wr6 implements zq<or6.c>
{
    public static final wr6 a;
    public static final List<String> b;
    
    static {
        a = new wr6();
        b = shw.x0((Object)"legacy");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (or6.c)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final or6.c c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        or6.b b = null;
        while (kie.k3((List)wr6.b) == 0) {
            b = (or6.b)cr.b((zq)cr.c((zq)vr6.a, false)).b(kie, lb7);
        }
        return new or6.c(b);
    }
    
    public final void d(final yle yle, final lb7 lb7, final or6.c c) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)c, "value");
        yle.A1("legacy");
        cr.b((zq)cr.c((zq)vr6.a, false)).a(yle, lb7, (Object)c.a);
    }
}
