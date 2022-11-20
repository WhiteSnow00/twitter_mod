import androidx.appcompat.app.AlertController;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jw implements Runnable
{
    public final View D0;
    public final View E0;
    public final AlertController F0;
    
    public jw(final AlertController f0, final View d0, final View e0) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        AlertController.c((View)this.F0.w, this.D0, this.E0);
    }
}
