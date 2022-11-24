import android.view.View;
import tv.periscope.android.hydra.HydraAudioIndicatingProfileImage$a;
import android.animation.ValueAnimator;
import tv.periscope.android.hydra.HydraAudioIndicatingProfileImage;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class quc implements ValueAnimator$AnimatorUpdateListener
{
    public final HydraAudioIndicatingProfileImage F0;
    public final float G0;
    
    public quc(final HydraAudioIndicatingProfileImage f0, final float g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final HydraAudioIndicatingProfileImage f0 = this.F0;
        final float g0 = this.G0;
        final HydraAudioIndicatingProfileImage$a companion = HydraAudioIndicatingProfileImage.Companion;
        e0e.f((Object)f0, "this$0");
        e0e.f((Object)valueAnimator, "it");
        final Object animatedValue = valueAnimator.getAnimatedValue();
        e0e.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        final float d = va.d(g0, 1.0f, (float)animatedValue, 1.0f);
        ((View)f0.F0).setScaleX(d);
        ((View)f0.F0).setScaleY(d);
    }
}
