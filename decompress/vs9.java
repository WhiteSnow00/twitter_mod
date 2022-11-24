import android.animation.Animator;
import com.twitter.android.media.imageeditor.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vs9 extends ej1
{
    public final b F0;
    
    public vs9(final b f0) {
        this.F0 = f0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.F0.h2.setTranslationY(0.0f);
        this.F0.h2.setAlpha(1.0f);
    }
}
