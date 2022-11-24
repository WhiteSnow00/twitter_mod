// 
// Decompiled by Procyon v0.6.0
// 

public final class n4q implements Runnable
{
    public final erm F0;
    public final Runnable G0;
    
    public n4q(final erm f0, final Runnable g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        if (this.F0.F0 instanceof rd.b) {
            return;
        }
        try {
            this.G0.run();
            this.F0.n(null);
        }
        catch (final Exception ex) {
            this.F0.o(ex);
        }
    }
}
