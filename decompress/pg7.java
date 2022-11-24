import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pg7 implements zq<mg7$b>
{
    public static final pg7 a;
    public static final List<String> b;
    
    static {
        a = new pg7();
        b = shw.x0((Object)"__typename");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (mg7$b)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final mg7$b c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)pg7.b) == 0) {
            o = cr.a.b(kie, lb7);
        }
        kie.H();
        final sr7 c = ur7.a.c(kie, lb7);
        e0e.c(o);
        return new mg7$b((String)o, c);
    }
    
    public final void d(final yle yle, final lb7 lb7, final mg7$b mg7$b) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)mg7$b, "value");
        yle.A1("__typename");
        cr.a.a(yle, lb7, mg7$b.a);
        ur7.a.d(yle, lb7, mg7$b.b);
    }
}
