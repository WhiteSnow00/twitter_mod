import android.view.View;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.widget.FrameLayout;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpb implements View$OnLayoutChangeListener
{
    public final FrameLayout F0;
    public final ypb G0;
    public final FragmentStateAdapter H0;
    
    public jpb(final FragmentStateAdapter h0, final FrameLayout f0, final ypb g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (((View)this.F0).getParent() != null) {
            ((View)this.F0).removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
            this.H0.H(this.G0);
        }
    }
}
