import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ygz implements Runnable
{
    public final sgz D0;
    public final sgz E0;
    public final long F0;
    public final boolean G0;
    public final whz H0;
    
    public ygz(final whz h0, final sgz d0, final sgz e0, final long f0, final boolean g0) {
        this.H0 = h0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        this.H0.l(this.D0, this.E0, this.F0, this.G0, (Bundle)null);
    }
}
