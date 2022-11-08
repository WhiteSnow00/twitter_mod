import android.os.Bundle;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jb7 implements Runnable
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ Uri D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ Bundle F0;
    public final /* synthetic */ kb7 G0;
    
    public jb7(final kb7 g0, final int c0, final Uri d0, final boolean e0, final Bundle f0) {
        this.G0 = g0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        this.G0.b.N(this.C0, this.E0);
    }
}
