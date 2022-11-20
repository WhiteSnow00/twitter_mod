import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odz implements Runnable
{
    public final String D0;
    public final String E0;
    public final long F0;
    public final Bundle G0;
    public final boolean H0;
    public final boolean I0;
    public final boolean J0;
    public final String K0;
    public final bgz L0;
    
    public odz(final bgz l0, final String d0, final String e0, final long f0, final Bundle g0, final boolean h0, final boolean i0, final boolean j0) {
        this.L0 = l0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = null;
    }
    
    @Override
    public final void run() {
        this.L0.q(this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0);
    }
}
