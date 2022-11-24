import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aru implements zq<uqu>
{
    public static final aru a;
    public static final List<String> b;
    
    static {
        a = new aru();
        b = shw.x0((Object)"result");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (uqu)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final uqu c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        uqu$c uqu$c = null;
        while (kie.k3((List)aru.b) == 0) {
            uqu$c = (uqu$c)cr.b((zq)cr.c((zq)xqu.a, true)).b(kie, lb7);
        }
        return new uqu(uqu$c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final uqu uqu) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)uqu, "value");
        yle.A1("result");
        cr.b((zq)cr.c((zq)xqu.a, true)).a(yle, lb7, (Object)uqu.a);
    }
}
