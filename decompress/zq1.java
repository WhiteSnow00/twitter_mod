import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.animation.Animator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zq1 extends AnimatorListenerAdapter
{
    public final int F0;
    public final BaseTransientBottomBar G0;
    
    public zq1(final BaseTransientBottomBar g0, final int f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.G0.e();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)this.G0.d;
        ((View)snackbarContentLayout.F0).setAlpha(1.0f);
        final ViewPropertyAnimator alpha = ((View)snackbarContentLayout.F0).animate().alpha(0.0f);
        final long n = 180;
        final ViewPropertyAnimator setDuration = alpha.setDuration(n);
        final long n2 = 0;
        setDuration.setStartDelay(n2).start();
        if (((View)snackbarContentLayout.G0).getVisibility() == 0) {
            ((View)snackbarContentLayout.G0).setAlpha(1.0f);
            ((View)snackbarContentLayout.G0).animate().alpha(0.0f).setDuration(n).setStartDelay(n2).start();
        }
    }
}
