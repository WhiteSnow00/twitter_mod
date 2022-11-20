import android.animation.Animator;
import com.twitter.camera.view.capture.live.AnimatingStopBroadcastButton;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bb0 extends AnimatorListenerAdapter
{
    public final AnimatingStopBroadcastButton D0;
    
    public bb0(final AnimatingStopBroadcastButton d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.D0.D0.setVisibility(8);
    }
}
