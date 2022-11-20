import java.util.Objects;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eqz implements Runnable
{
    public final qih D0;
    public final giy E0;
    public final mcg F0;
    public final Callable G0;
    public final zbs H0;
    
    public eqz(final qih d0, final giy e0, final mcg f0, final Callable g0, final zbs h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        final qih d0 = this.D0;
        final giy e0 = this.E0;
        final mcg f0 = this.F0;
        final Callable g0 = this.G0;
        final zbs h0 = this.H0;
        Objects.requireNonNull(d0);
        if (e0.a()) {
            f0.C();
        }
        else {
            try {
                try {
                    if (!d0.c.get()) {
                        final ljs ljs = (ljs)d0;
                        synchronized (ljs) {
                            ljs.d.c();
                            monitorexit(ljs);
                            d0.c.set(true);
                        }
                    }
                    if (e0.a()) {
                        f0.C();
                        return;
                    }
                    final Object call = g0.call();
                    if (e0.a()) {
                        f0.C();
                        return;
                    }
                    h0.b(call);
                }
                catch (final Exception ex) {
                    if (e0.a()) {
                        f0.C();
                        return;
                    }
                    h0.a(ex);
                }
            }
            catch (final RuntimeException ex2) {}
        }
    }
}
