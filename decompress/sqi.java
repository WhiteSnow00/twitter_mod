import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sqi implements ptb
{
    public final List F0;
    public final List G0;
    public final qgv H0;
    
    public sqi(final List f0, final List g0, final qgv h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final Object invoke() {
        final List f0 = this.F0;
        final List g0 = this.G0;
        final qgv h0 = this.H0;
        final rq3$a companion = rq3.Companion;
        final List a = companion.a(f0);
        final List a2 = companion.a(g0);
        zvj zvj;
        if (g0.isEmpty()) {
            tqi.b(h0.f(), "empty");
            final ged$b g2 = ged.G0;
            final int a3 = o5j.a;
            zvj = new zvj((Object)f0, (Object)g2);
        }
        else if (a2.equals(a)) {
            tqi.b(h0.f(), "no_change");
            final ged$b g3 = ged.G0;
            final int a4 = o5j.a;
            zvj = new zvj((Object)g3, (Object)g3);
        }
        else {
            tqi.b(h0.f(), "change");
            zvj = new zvj((Object)f0, (Object)g0);
        }
        return zvj;
    }
}
