import android.animation.Animator;
import com.twitter.android.media.imageeditor.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rr9 extends bj1
{
    public final b D0;
    
    public rr9(final b d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.D0.f2.setTranslationY(0.0f);
        this.D0.f2.setAlpha(1.0f);
        this.D0.f2.setVisibility(8);
    }
}
