import androidx.appcompat.app.AlertController;
import android.widget.AbsListView;
import android.view.View;
import android.widget.AbsListView$OnScrollListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kw implements AbsListView$OnScrollListener
{
    public final View D0;
    public final View E0;
    
    public kw(final View d0, final View e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        AlertController.c((View)absListView, this.D0, this.E0);
    }
    
    public final void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
}
