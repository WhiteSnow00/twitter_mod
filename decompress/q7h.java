import android.view.View;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.dm.ui.MessageReactionsView$a;
import com.twitter.dm.ui.MessageReactionsView;
import tv.periscope.android.hydra.broadcaster.AvatarTimerView;
import tv.periscope.android.view.ActionSheet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q7h implements ValueAnimator$AnimatorUpdateListener
{
    public final int D0;
    public final Object E0;
    
    public q7h(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.D0) {
            default: {
                final ActionSheet actionSheet = (ActionSheet)this.E0;
                actionSheet.I0.b = (int)valueAnimator.getAnimatedValue();
                ((RecyclerView)actionSheet.E0).requestLayout();
                return;
            }
            case 3: {
                final mz3 mz3 = (mz3)this.E0;
                czd.f((Object)mz3, "this$0");
                czd.f((Object)valueAnimator, "it");
                mz3.a();
                return;
            }
            case 2: {
                final wyp wyp = (wyp)this.E0;
                final int g = wyp.g;
                ((Drawable)wyp).invalidateSelf();
                return;
            }
            case 1: {
                final AvatarTimerView avatarTimerView = (AvatarTimerView)this.E0;
                final int w0 = AvatarTimerView.W0;
                czd.f((Object)avatarTimerView, "this$0");
                czd.f((Object)valueAnimator, "it");
                final Object animatedValue = valueAnimator.getAnimatedValue();
                czd.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                avatarTimerView.O0 = (float)animatedValue;
                ((View)avatarTimerView).invalidate();
                return;
            }
            case 0: {
                final MessageReactionsView messageReactionsView = (MessageReactionsView)this.E0;
                final MessageReactionsView$a companion = MessageReactionsView.Companion;
                czd.f((Object)messageReactionsView, "this$0");
                czd.f((Object)valueAnimator, "it");
                ((View)messageReactionsView).invalidate();
            }
        }
    }
}
