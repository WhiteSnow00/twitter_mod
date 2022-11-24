import android.view.View;
import java.util.Objects;
import android.animation.ValueAnimator;
import android.animation.IntEvaluator;
import com.twitter.media.legacy.widget.MediaAttachmentsLayout;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class urg implements ValueAnimator$AnimatorUpdateListener
{
    public final MediaAttachmentsLayout F0;
    public final IntEvaluator G0;
    public final int H0;
    public final int I0;
    
    public urg(final MediaAttachmentsLayout f0, final IntEvaluator g0, final int h0, final int i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final MediaAttachmentsLayout f0 = this.F0;
        final IntEvaluator g0 = this.G0;
        final int h0 = this.H0;
        final int i0 = this.I0;
        final int i2 = MediaAttachmentsLayout.i1;
        Objects.requireNonNull(f0);
        ((View)f0).scrollTo((int)g0.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(h0), Integer.valueOf(i0)), ((View)f0.F0).getScrollY());
    }
}
