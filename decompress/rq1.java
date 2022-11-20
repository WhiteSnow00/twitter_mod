import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.animation.Animator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rq1 extends AnimatorListenerAdapter
{
    public final BaseTransientBottomBar D0;
    
    public rq1(final BaseTransientBottomBar d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.D0.f();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)this.D0.d;
        ((View)snackbarContentLayout.D0).setAlpha(0.0f);
        final ViewPropertyAnimator alpha = ((View)snackbarContentLayout.D0).animate().alpha(1.0f);
        final long n = 180;
        final ViewPropertyAnimator setDuration = alpha.setDuration(n);
        final long n2 = 70;
        setDuration.setStartDelay(n2).start();
        if (((View)snackbarContentLayout.E0).getVisibility() == 0) {
            ((View)snackbarContentLayout.E0).setAlpha(0.0f);
            ((View)snackbarContentLayout.E0).animate().alpha(1.0f).setDuration(n).setStartDelay(n2).start();
        }
    }
}
