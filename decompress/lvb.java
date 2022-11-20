import android.view.View;
import com.twitter.ui.view.TouchEventInterceptingViewPager;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvb extends ste implements qsb<h6m, fzv>
{
    public final fvb D0;
    
    public lvb(final fvb d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final int d = ((h6m)o).d;
        final fvb d2 = this.D0;
        if (d2.w1 != null) {
            float n;
            if (d > ((u9)d2).M0.getDimensionPixelSize(2131167569)) {
                n = (float)(-d / 2);
            }
            else {
                n = 0.0f;
            }
            final TouchEventInterceptingViewPager w1 = this.D0.w1;
            czd.c((Object)w1);
            ((View)w1).animate().translationX(0.0f).translationY(n).setDuration((long)((u9)this.D0).M0.getInteger(17694720)).setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator()).start();
        }
        return fzv.a;
    }
}
