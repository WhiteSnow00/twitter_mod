import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwm implements zq<nwm$c>
{
    public static final pwm a;
    public static final List<String> b;
    
    static {
        a = new pwm();
        b = shw.x0((Object)"revue_card_context");
    }
    
    @Override
    public final void a(final yle yle, final lb7 lb7, final Object o) {
        final nwm$c nwm$c = (nwm$c)o;
        e0e.f((Object)yle, "writer");
        e0e.f((Object)lb7, "customScalarAdapters");
        e0e.f((Object)nwm$c, "value");
        yle.A1("revue_card_context");
        cr.b((zq)cr.c((zq)qwm.a, false)).a(yle, lb7, (Object)nwm$c.a);
    }
    
    @Override
    public final Object b(final kie kie, final lb7 lb7) {
        e0e.f((Object)kie, "reader");
        e0e.f((Object)lb7, "customScalarAdapters");
        nwm$d nwm$d = null;
        while (kie.k3((List)pwm.b) == 0) {
            nwm$d = (nwm$d)cr.b((zq)cr.c((zq)qwm.a, false)).b(kie, lb7);
        }
        return new nwm$c(nwm$d);
    }
}
