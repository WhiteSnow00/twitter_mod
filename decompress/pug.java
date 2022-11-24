import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pug implements zq<lug>
{
    public static final pug a;
    public static final List<String> b;
    
    static {
        a = new pug();
        b = shw.y0((Object[])new String[] { "all", "large" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (lug)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final lug c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        lug$a lug$a = null;
        lug$c lug$c = null;
        while (true) {
            final int k3 = kie.k3((List)pug.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                lug$c = (lug$c)cr.b((zq)cr.c((zq)oug.a, false)).b(kie, lb7);
            }
            else {
                lug$a = (lug$a)cr.b((zq)cr.c((zq)mug.a, false)).b(kie, lb7);
            }
        }
        return new lug(lug$a, lug$c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final lug lug) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)lug, "value");
        yle.A1("all");
        cr.b((zq)cr.c((zq)mug.a, false)).a(yle, lb7, (Object)lug.a);
        yle.A1("large");
        cr.b((zq)cr.c((zq)oug.a, false)).a(yle, lb7, (Object)lug.b);
    }
}
