import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyo implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final ViewTreeObserver D0;
    public final jyo E0;
    
    public hyo(final jyo e0, final ViewTreeObserver d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void onGlobalLayout() {
        this.D0.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        final int height = this.E0.D0.b().getHeight();
        final ViewGroup$LayoutParams layoutParams = this.E0.D0.b().getLayoutParams();
        int n;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            n = viewGroup$MarginLayoutParams.bottomMargin + viewGroup$MarginLayoutParams.topMargin;
        }
        else {
            n = 0;
        }
        final zkd d0 = this.E0.D0;
        final int n2 = d0.n;
        final TypedArray obtainStyledAttributes = d0.k.getContext().obtainStyledAttributes(new int[] { 2130970956 });
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        d0.k.setMinimumHeight(dimensionPixelSize + (height - n + n2));
    }
}
