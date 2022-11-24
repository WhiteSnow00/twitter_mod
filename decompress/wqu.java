import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqu implements zq<uqu$b>
{
    public static final wqu a;
    public static final List<String> b;
    
    static {
        a = new wqu();
        b = shw.y0((Object[])new String[] { "__typename", "tombstone" });
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (uqu$b)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final uqu$b c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        uqu$e uqu$e = null;
        while (true) {
            final int k3 = kie.k3((List)wqu.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                final zqu a = zqu.a;
                final zq<String> a2 = cr.a;
                uqu$e = (uqu$e)new y4j((zq)a, true).b(kie, lb7);
            }
            else {
                o = cr.a.b(kie, lb7);
            }
        }
        e0e.c(o);
        e0e.c((Object)uqu$e);
        return new uqu$b((String)o, uqu$e);
    }
    
    public final void d(final yle yle, final lb7 lb7, final uqu$b uqu$b) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)uqu$b, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, uqu$b.a);
        yle.A1("tombstone");
        final zqu a = zqu.a;
        final uqu$e b = uqu$b.b;
        if (!(yle instanceof ukg)) {
            final ukg ukg = new ukg();
            ukg.G();
            ((zq<uqu$e>)a).a((yle)ukg, lb7, b);
            ukg.Q();
            if (!ukg.G0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            final Object f0 = ukg.F0;
            e0e.c(f0);
            iuk.S0(yle, f0);
        }
        else {
            yle.G();
            ((zq<uqu$e>)a).a(yle, lb7, b);
            yle.Q();
        }
    }
}
