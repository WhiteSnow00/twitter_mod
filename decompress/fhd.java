import android.view.ViewGroup$LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import com.twitter.profiles.scrollingheader.c;
import android.graphics.PorterDuff$Mode;
import com.twitter.profiles.scrollingheader.a;
import tv.periscope.android.ui.chat.AvatarImageView;
import java.util.Objects;
import tv.periscope.android.view.OverflowSheetView;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhd implements ValueAnimator$AnimatorUpdateListener
{
    public final int D0;
    public final Object E0;
    
    public fhd(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.D0) {
            default: {
                final OverflowSheetView overflowSheetView = (OverflowSheetView)this.E0;
                final int e0 = OverflowSheetView.E0;
                Objects.requireNonNull(overflowSheetView);
                ((View)overflowSheetView).setBackgroundColor((int)valueAnimator.getAnimatedValue());
                return;
            }
            case 2: {
                final AvatarImageView avatarImageView = (AvatarImageView)this.E0;
                final DecelerateInterpolator c1 = AvatarImageView.c1;
                Objects.requireNonNull(avatarImageView);
                avatarImageView.T0 = (float)valueAnimator.getAnimatedValue();
                ((View)avatarImageView).invalidate();
                return;
            }
            case 1: {
                final a a = (a)this.E0;
                final k4p b = a.b;
                final int intValue = (int)valueAnimator.getAnimatedValue();
                b.e = intValue;
                b.b.setColorFilter(intValue, PorterDuff$Mode.SRC_OVER);
                b.b.invalidateSelf();
                final c c2 = (c)a.a;
                if (((u9)c2).K4() != null) {
                    ((View)((u9)c2).K4()).invalidate();
                }
                return;
            }
            case 0: {
                final View view = (View)this.E0;
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                final Object animatedValue = valueAnimator.getAnimatedValue();
                final int a2 = c5j.a;
                layoutParams.height = (int)animatedValue;
                view.requestLayout();
                if (view.getVisibility() == 8) {
                    view.setVisibility(0);
                }
            }
        }
    }
}
