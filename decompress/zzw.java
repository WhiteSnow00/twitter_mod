import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver$OnScrollChangedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public class zzw extends uxa implements ViewTreeObserver$OnScrollChangedListener
{
    public final sjj G0;
    public w4 H0;
    
    public zzw(final Context context, final AttributeSet set) {
        final sjj g0 = new sjj();
        super(context, set);
        this.G0 = g0;
    }
    
    private i5x getVisibilityPercentage() {
        return this.G0.b((View)this, this.getCropRect());
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((View)this).getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((View)this).getViewTreeObserver().removeOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this);
    }
    
    public final void onScrollChanged() {
        final w4 h0 = this.H0;
        if (h0 != null) {
            h0.o(this.getVisibilityPercentage());
        }
    }
}
