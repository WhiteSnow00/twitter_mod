import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wn7 implements zq<sn7$c>
{
    public static final wn7 a;
    public static final List<String> b;
    
    static {
        a = new wn7();
        b = shw.x0((Object)"dm_event_results");
    }
    
    @Override
    public final /* bridge */ void a(final yle yle, final lb7 lb7, final Object o) {
        this.d(yle, lb7, (sn7$c)o);
    }
    
    @Override
    public final /* bridge */ Object b(final kie kie, final lb7 lb7) {
        return this.c(kie, lb7);
    }
    
    public final sn7$c c(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        Object o = null;
        while (kie.k3((List)wn7.b) == 0) {
            o = cr.c((zq)un7.a, false).b(kie, lb7);
        }
        e0e.c(o);
        return new sn7$c((sn7$a)o);
    }
    
    public final void d(final yle yle, final lb7 lb7, final sn7$c sn7$c) {
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)sn7$c, "value");
        yle.A1("dm_event_results");
        cr.c((zq)un7.a, false).a(yle, lb7, (Object)sn7$c.a);
    }
}
