import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fb7 implements Runnable
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ Bundle D0;
    public final /* synthetic */ kb7 E0;
    
    public fb7(final kb7 e0, final int c0, final Bundle d0) {
        this.E0 = e0;
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final void run() {
        this.E0.b.M(this.C0);
    }
}
