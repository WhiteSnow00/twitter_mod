// 
// Decompiled by Procyon v0.6.0
// 

public final class aej extends rj8<xyo, pmi>
{
    public aej() {
        super(pmi.class, "ocf_open_link_callback_path");
    }
    
    public final int g() {
        return 1;
    }
    
    @Override
    public final void i(final qrc.a a, final Object o) {
        final xyo xyo = (xyo)o;
        final StringBuilder g = w48.g("/1.1/onboarding/");
        g.append(xyo.a);
        a.b.append(g.toString());
        final int a2 = w4j.a;
        a.e = xrc$b.F0;
        final Long b = xyo.b;
        if (b != null) {
            a.c("timestampMs", b);
        }
    }
}
