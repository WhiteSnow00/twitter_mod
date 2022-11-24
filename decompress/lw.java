import androidx.appcompat.app.AlertController;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lw implements Runnable
{
    public final View F0;
    public final View G0;
    public final AlertController H0;
    
    public lw(final AlertController h0, final View f0, final View g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        AlertController.c((View)this.H0.g, this.F0, this.G0);
    }
}
