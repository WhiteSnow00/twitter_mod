import android.content.Context;
import android.content.res.Resources;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.Animation;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.fragment.app.Fragment;
import android.view.animation.TranslateAnimation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eel extends c7t
{
    public TranslateAnimation B;
    public final long C;
    
    public eel(final gob gob, final rnd rnd, final jev jev, final nca nca, final rcu rcu, final long c, final w7t w7t, final dsb dsb, final qvd qvd, final xr3 xr3, final crt crt, final mbi<?> mbi, final juu juu, final xuu xuu, final mtv mtv, final rsv rsv, final ty8 ty8, final uiu$a uiu$a) {
        super(gob, rnd, jev, nca, rcu, w7t, dsb, qvd, xr3, crt, (mbi)mbi, juu, xuu, mtv, rsv, ty8, uiu$a);
        this.C = c;
    }
    
    public final void B(final cyu cyu) {
        if (cyu.c != this.C) {
            super.B(cyu);
        }
        else {
            this.N();
        }
    }
    
    public final void N() {
        final Fragment fragment = (Fragment)((br1)this).d.get();
        if (fragment != null) {
            final View j1 = fragment.j1;
            TranslateAnimation b;
            if ((b = this.B) == null) {
                final Resources resources = ((Context)((br1)this).c).getResources();
                final int integer = resources.getInteger(2131492873);
                final float n = -resources.getDimension(2131165355);
                final TranslateAnimation translateAnimation = new TranslateAnimation(n, 0.0f, 0.0f, 0.0f);
                final long n2 = integer;
                ((Animation)translateAnimation).setDuration(n2);
                ((Animation)translateAnimation).setInterpolator((Interpolator)new OvershootInterpolator());
                final gj1 animationListener = new gj1() {
                    public final void onAnimationEnd(final Animation animation) {
                        final View c0 = j1;
                        if (c0 != null) {
                            c0.startAnimation((Animation)translateAnimation);
                        }
                    }
                };
                b = new TranslateAnimation(0.0f, n, 0.0f, 0.0f);
                ((Animation)b).setDuration(n2);
                ((Animation)b).setInterpolator((Interpolator)new LinearInterpolator());
                ((Animation)b).setAnimationListener((Animation$AnimationListener)animationListener);
                this.B = b;
            }
            if (j1 != null) {
                j1.startAnimation((Animation)b);
            }
        }
    }
    
    public final void y(final vo6 vo6, final h4h h4h) {
        if (h4h.H0 != this.C) {
            super.y(vo6, h4h);
        }
        else {
            this.N();
        }
    }
}
