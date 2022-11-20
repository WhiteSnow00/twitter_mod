import android.view.View;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.widget.FrameLayout;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iob implements View$OnLayoutChangeListener
{
    public final FrameLayout D0;
    public final xob E0;
    public final FragmentStateAdapter F0;
    
    public iob(final FragmentStateAdapter f0, final FrameLayout d0, final xob e0) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (((View)this.D0).getParent() != null) {
            ((View)this.D0).removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
            this.F0.H(this.E0);
        }
    }
}
