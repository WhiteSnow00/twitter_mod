import android.view.View;
import com.twitter.ui.view.TouchEventInterceptingViewPager;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwb extends pue implements stb<u6m, vzv>
{
    public final gwb F0;
    
    public mwb(final gwb f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(Object interpolator) {
        final int d = ((u6m)interpolator).d;
        final gwb f0 = this.F0;
        if (f0.y1 != null) {
            float n;
            if (d > ((u9)f0).O0.getDimensionPixelSize(2131167569)) {
                n = (float)(-d / 2);
            }
            else {
                n = 0.0f;
            }
            final TouchEventInterceptingViewPager y1 = this.F0.y1;
            e0e.c((Object)y1);
            final int integer = ((u9)this.F0).O0.getInteger(17694720);
            interpolator = new AccelerateDecelerateInterpolator();
            ((View)y1).animate().translationX(0.0f).translationY(n).setDuration((long)integer).setInterpolator((TimeInterpolator)interpolator).start();
        }
        return vzv.a;
    }
}
