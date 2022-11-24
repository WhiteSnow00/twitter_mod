import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqc implements zq<nqc>
{
    public static final pqc a;
    public static final List<String> b;
    
    static {
        a = new pqc();
        b = shw.x0((Object)"components");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (nqc)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final nqc c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        List c = null;
        while (kie.k3((List)pqc.b) == 0) {
            c = cr.a((zq)cr.c((zq)oqc.a, true)).c(kie, lb7);
        }
        e0e.c((Object)c);
        return new nqc(c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final nqc nqc) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)nqc, "value");
        yle.A1("components");
        cr.a((zq)cr.c((zq)oqc.a, true)).d(yle, lb7, nqc.a);
    }
}
