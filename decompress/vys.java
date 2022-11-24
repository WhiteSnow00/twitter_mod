import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vys implements zq<uys>
{
    public static final vys a;
    public static final List<String> b;
    
    static {
        a = new vys();
        b = shw.x0((Object)"id");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (uys)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final uys c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)vys.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        e0e.c(o);
        return new uys((String)o);
    }
    
    public final void d(final yle yle, final lb7 lb7, final uys uys) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)uys, "value");
        yle.A1("id");
        cr.a.a(yle, lb7, uys.a);
    }
}
