import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vdz implements Runnable
{
    public final ahz F0;
    public final Bundle G0;
    public final long H0;
    
    public vdz(final ahz f0, final Bundle g0, final long h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        this.F0.E(this.G0, this.H0);
    }
}
