// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.view.animation.Animation;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation$AnimationListener;

public final class f implements Animation$AnimationListener
{
    public final /* synthetic */ v.b C0;
    public final /* synthetic */ ViewGroup D0;
    public final /* synthetic */ View E0;
    public final /* synthetic */ c.b F0;
    
    public f(final v.b c0, final ViewGroup d0, final View e0, final c.b f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        ((View)this.D0).post((Runnable)new Runnable() {
            @Override
            public final void run() {
                final f c0 = f.this;
                c0.D0.endViewTransition(c0.E0);
                ((c.c)f.this.F0).a();
            }
        });
        if (p.P(2)) {
            final StringBuilder g = w48.g("Animation from operation ");
            g.append(this.C0);
            g.append(" has ended.");
            Log.v("FragmentManager", g.toString());
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        if (p.P(2)) {
            final StringBuilder g = w48.g("Animation from operation ");
            g.append(this.C0);
            g.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", g.toString());
        }
    }
}
