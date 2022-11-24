import android.os.Bundle;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tb7 implements Runnable
{
    public final int F0;
    public final Uri G0;
    public final boolean H0;
    public final Bundle I0;
    public final ub7 J0;
    
    public tb7(final ub7 j0, final int f0, final Uri g0, final boolean h0, final Bundle i0) {
        this.J0 = j0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final void run() {
        this.J0.b.V(this.F0, this.H0);
    }
}
