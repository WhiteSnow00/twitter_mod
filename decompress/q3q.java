// 
// Decompiled by Procyon v0.6.0
// 

public final class q3q implements Runnable
{
    public final qqm D0;
    public final Runnable E0;
    
    public q3q(final qqm d0, final Runnable e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        if (((qd)this.D0).D0 instanceof qd.b) {
            return;
        }
        try {
            this.E0.run();
            this.D0.n((Object)null);
        }
        catch (final Exception ex) {
            this.D0.o((Throwable)ex);
        }
    }
}
