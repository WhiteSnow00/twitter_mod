import java.util.List;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyg implements Callable
{
    public final gyg D0;
    public final List E0;
    public final boolean F0;
    public final zl9 G0;
    
    public fyg(final gyg d0, final List e0, final zl9 g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = false;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() {
        final gyg d0 = this.D0;
        final List e0 = this.E0;
        final boolean f0 = this.F0;
        final zl9 g0 = this.G0;
        final List g2 = d0.g(e0);
        if (!g2.isEmpty()) {
            final wc6 p0 = d0.P0;
            final h5j observeOn = d0.J0.n2((Iterable)g2).observeOn(d0.G0);
            final kdd$b d2 = kdd.D0;
            final int a = c5j.a;
            p0.a(observeOn.first((Object)d2).G((lj6)new dyg(d0, f0, g0), (lj6)jub.e));
        }
        return tmi.a;
    }
}
