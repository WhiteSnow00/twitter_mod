import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmt implements zq<lmt>
{
    public static final pmt a;
    public static final List<String> b;
    
    static {
        a = new pmt();
        b = shw.y0((Object[])new String[] { "subtitle", "title" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (lmt)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final lmt c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        Object o2 = null;
        while (true) {
            final int k3 = kie.k3((List)pmt.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                o2 = cr.c((zq)omt.a, true).b(kie, lb7);
            }
            else {
                o = cr.b((zq)cr.c((zq)nmt.a, true)).b(kie, lb7);
            }
        }
        e0e.c(o2);
        return new lmt((lmt.a)o, (lmt.b)o2);
    }
    
    public final void d(final yle yle, final lb7 lb7, final lmt lmt) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)lmt, "value");
        yle.A1("subtitle");
        cr.b((zq)cr.c((zq)nmt.a, true)).a(yle, lb7, (Object)lmt.a);
        yle.A1("title");
        cr.c((zq)omt.a, true).a(yle, lb7, (Object)lmt.b);
    }
}
