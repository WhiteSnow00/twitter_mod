// 
// Decompiled by Procyon v0.6.0
// 

public final class y5 implements Runnable
{
    public final a6 D0;
    public final long E0;
    
    public y5(final a6 d0, final long e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        final a6 d0 = this.D0;
        final long e0 = this.E0;
        d0.B = true;
        final r2 n = d0.n;
        n.H0 = e0;
        n.R0((r2$b)new moo(e0));
    }
}
