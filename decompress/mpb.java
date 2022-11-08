import android.view.View;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.widget.FrameLayout;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpb implements View$OnLayoutChangeListener
{
    public final /* synthetic */ FrameLayout C0;
    public final /* synthetic */ bqb D0;
    public final /* synthetic */ FragmentStateAdapter E0;
    
    public mpb(final FragmentStateAdapter e0, final FrameLayout c0, final bqb d0) {
        this.E0 = e0;
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (((View)this.C0).getParent() != null) {
            ((View)this.C0).removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
            this.E0.H(this.D0);
        }
    }
}
