import android.view.View;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import android.view.animation.AccelerateInterpolator;
import com.twitter.common.ui.isTalkingView.IsTalkingView$a;
import java.util.List;
import android.graphics.RectF;
import com.twitter.common.ui.isTalkingView.IsTalkingView;
import tv.periscope.android.hydra.broadcaster.AvatarTimerView;
import tv.periscope.android.view.ActionSheet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v3e implements ValueAnimator$AnimatorUpdateListener
{
    public final int F0;
    public final Object G0;
    
    public v3e(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.F0) {
            default: {
                final ActionSheet actionSheet = (ActionSheet)this.G0;
                actionSheet.K0.b = (int)valueAnimator.getAnimatedValue();
                ((RecyclerView)actionSheet.G0).requestLayout();
                return;
            }
            case 3: {
                final n04 n04 = (n04)this.G0;
                e0e.f((Object)n04, "this$0");
                e0e.f((Object)valueAnimator, "it");
                n04.a();
                return;
            }
            case 2: {
                final vzp vzp = (vzp)this.G0;
                final int g = vzp.g;
                ((Drawable)vzp).invalidateSelf();
                return;
            }
            case 1: {
                final AvatarTimerView avatarTimerView = (AvatarTimerView)this.G0;
                final int y0 = AvatarTimerView.Y0;
                e0e.f((Object)avatarTimerView, "this$0");
                e0e.f((Object)valueAnimator, "it");
                final Object animatedValue = valueAnimator.getAnimatedValue();
                e0e.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                avatarTimerView.Q0 = (float)animatedValue;
                ((View)avatarTimerView).invalidate();
                return;
            }
            case 0: {
                final IsTalkingView isTalkingView = (IsTalkingView)this.G0;
                final IsTalkingView$a companion = IsTalkingView.Companion;
                e0e.f((Object)isTalkingView, "this$0");
                e0e.f((Object)valueAnimator, "it");
                final Object animatedValue2 = valueAnimator.getAnimatedValue();
                e0e.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                final float floatValue = (float)animatedValue2;
                final int n5 = ((View)isTalkingView).getHeight() - ((View)isTalkingView).getPaddingBottom() - ((View)isTalkingView).getPaddingTop();
                final int n6 = (int)floatValue;
                final int n7 = n6 % isTalkingView.J0.size();
                int n8 = 0;
                int n9 = n7;
                if (n7 < 0) {
                    n9 = 0;
                }
                int n10;
                if ((n10 = (n6 + 1) % isTalkingView.J0.size()) < 0) {
                    n10 = 0;
                }
                final AccelerateInterpolator q0 = isTalkingView.Q0;
                final float n11 = 1;
                final float interpolation = q0.getInterpolation(floatValue % n11);
                for (final Object next : isTalkingView.G0) {
                    if (n8 < 0) {
                        shw.U0();
                        throw null;
                    }
                    final RectF rectF = (RectF)next;
                    float top;
                    if (isTalkingView.S0) {
                        top = (n5 - isTalkingView.N0) / 2 + ((View)isTalkingView).getPaddingTop();
                    }
                    else {
                        top = ((View)isTalkingView).getPaddingTop() + (n11 - cn1.Companion.d(isTalkingView.J0.get(n9).get(n8).floatValue(), isTalkingView.J0.get(n10).get(n8).floatValue(), interpolation, true)) * n5 / 2;
                    }
                    float top2;
                    float n12;
                    if (isTalkingView.S0) {
                        top2 = rectF.top;
                        n12 = isTalkingView.N0;
                    }
                    else {
                        final float d = cn1.Companion.d(isTalkingView.J0.get(n9).get(n8).floatValue(), isTalkingView.J0.get(n10).get(n8).floatValue(), interpolation, true);
                        n12 = rectF.top;
                        top2 = d * n5;
                    }
                    rectF.top = top;
                    rectF.bottom = top2 + n12;
                    ++n8;
                }
                ((View)isTalkingView).invalidate();
            }
        }
    }
}
