import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.webkit.WebView;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public class na0 extends dhv
{
    public final ProgressBar c;
    
    public na0(final ProgressBar c, final axa axa, final obi<?> obi) {
        super(axa, (obi)obi);
        this.c = c;
    }
    
    public final void onProgressChanged(final WebView webView, final int n) {
        final ObjectAnimator setDuration = ObjectAnimator.ofInt((Object)this.c, "progress", new int[] { this.c.getProgress() % 100, n }).setDuration(250L);
        ((Animator)setDuration).setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        setDuration.start();
    }
}
