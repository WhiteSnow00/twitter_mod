import tv.periscope.android.hydra.HydraAudioIndicatingProfileImage$a;
import android.animation.ValueAnimator;
import android.view.View;
import tv.periscope.android.hydra.HydraAudioIndicatingProfileImage;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qtc implements ValueAnimator$AnimatorUpdateListener
{
    public final HydraAudioIndicatingProfileImage D0;
    public final float E0;
    public final float F0;
    public final View G0;
    public final float H0;
    public final float I0;
    public final float J0;
    public final float K0;
    
    public qtc(final HydraAudioIndicatingProfileImage d0, final float e0, final float f0, final View g0, final float h0, final float i0, final float j0, final float k0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final HydraAudioIndicatingProfileImage d0 = this.D0;
        final float e0 = this.E0;
        final float f0 = this.F0;
        final View g0 = this.G0;
        final float h0 = this.H0;
        final float i0 = this.I0;
        final float j0 = this.J0;
        final float k0 = this.K0;
        final HydraAudioIndicatingProfileImage$a companion = HydraAudioIndicatingProfileImage.Companion;
        czd.f((Object)d0, "this$0");
        czd.f((Object)g0, "$circle");
        czd.f((Object)valueAnimator, "it");
        final Object animatedValue = valueAnimator.getAnimatedValue();
        czd.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        final float floatValue = (float)animatedValue;
        final float n = (f0 - e0) * floatValue + e0;
        g0.setScaleX(n);
        g0.setScaleY(n);
        g0.setTranslationX((i0 - h0) * floatValue + h0);
        g0.setTranslationY((k0 - j0) * floatValue + j0);
    }
}
