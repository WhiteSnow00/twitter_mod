// 
// Decompiled by Procyon v0.6.0
// 

public final class kjz implements Runnable
{
    public final twz D0;
    public final boolean E0;
    public final wgy F0;
    public final glz G0;
    
    public kjz(final glz g0, final twz d0, final boolean e0, final wgy f0) {
        this.G0 = g0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        final glz g0 = this.G0;
        final i0z g2 = g0.G0;
        if (g2 == null) {
            ((pbz)g0).D0.b().I0.a("Discarding data. Failed to send event to service");
            return;
        }
        eli.q(this.D0);
        final glz g3 = this.G0;
        rd f0;
        if (this.E0) {
            f0 = null;
        }
        else {
            f0 = this.F0;
        }
        g3.k(g2, f0, this.D0);
        this.G0.s();
    }
}
