import androidx.appcompat.app.AlertController;
import android.view.View;
import androidx.core.widget.NestedScrollView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iw implements c
{
    public final /* synthetic */ View C0;
    public final /* synthetic */ View D0;
    
    public iw(final View c0, final View d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final void b(final NestedScrollView nestedScrollView, final int n, final int n2, final int n3, final int n4) {
        AlertController.c((View)nestedScrollView, this.C0, this.D0);
    }
}
