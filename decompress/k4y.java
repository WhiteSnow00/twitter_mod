import android.app.Activity;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k4y extends z4y
{
    public final Intent F0;
    public final Activity G0;
    public final int H0;
    
    public k4y(final Intent f0, final Activity g0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = 2;
    }
    
    public final void a() {
        final Intent f0 = this.F0;
        if (f0 != null) {
            this.G0.startActivityForResult(f0, this.H0);
        }
    }
}
