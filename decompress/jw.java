import androidx.appcompat.app.AlertController;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jw implements Runnable
{
    public final /* synthetic */ View C0;
    public final /* synthetic */ View D0;
    public final /* synthetic */ AlertController E0;
    
    public jw(final AlertController e0, final View c0, final View d0) {
        this.E0 = e0;
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final void run() {
        AlertController.c((View)this.E0.w, this.C0, this.D0);
    }
}
