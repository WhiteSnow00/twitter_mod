import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wcf implements zq<ucf>
{
    public static final wcf a;
    public static final List<String> b;
    
    static {
        a = new wcf();
        b = shw.x0((Object)"limited_actions");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (ucf)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final ucf c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        List c = null;
        while (kie.k3((List)wcf.b) == 0) {
            c = cr.a((zq)cr.c((zq)xcf.a, true)).c(kie, lb7);
        }
        e0e.c((Object)c);
        return new ucf(c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final ucf ucf) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)ucf, "value");
        yle.A1("limited_actions");
        cr.a((zq)cr.c((zq)xcf.a, true)).d(yle, lb7, ucf.a);
    }
}
