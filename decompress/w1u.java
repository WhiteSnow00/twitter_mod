import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.Transformation;
import android.view.animation.Animation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w1u extends Animation
{
    public final int D0;
    public final z1u E0;
    
    public w1u(final z1u e0, final int d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void applyTransformation(final float n, final Transformation transformation) {
        final ViewGroup$LayoutParams layoutParams = ((View)this.E0.E0).getLayoutParams();
        int height;
        if (n == 1.0f) {
            height = -2;
        }
        else {
            height = (int)(this.D0 * n);
        }
        layoutParams.height = height;
        this.E0.E0.requestLayout();
    }
    
    public final boolean willChangeBounds() {
        return true;
    }
}
