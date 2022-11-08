import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.animation.Animator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xq1 extends AnimatorListenerAdapter
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ BaseTransientBottomBar D0;
    
    public xq1(final BaseTransientBottomBar d0, final int c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.D0.e();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)this.D0.d;
        ((View)snackbarContentLayout.C0).setAlpha(1.0f);
        final ViewPropertyAnimator alpha = ((View)snackbarContentLayout.C0).animate().alpha(0.0f);
        final long n = 180;
        final ViewPropertyAnimator setDuration = alpha.setDuration(n);
        final long n2 = 0;
        setDuration.setStartDelay(n2).start();
        if (((View)snackbarContentLayout.D0).getVisibility() == 0) {
            ((View)snackbarContentLayout.D0).setAlpha(1.0f);
            ((View)snackbarContentLayout.D0).animate().alpha(0.0f).setDuration(n).setStartDelay(n2).start();
        }
    }
}
