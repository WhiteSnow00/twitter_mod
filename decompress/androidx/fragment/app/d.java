// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.animation.AnimatorListenerAdapter;

public final class d extends AnimatorListenerAdapter
{
    public final /* synthetic */ ViewGroup C0;
    public final /* synthetic */ View D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ v.b F0;
    public final /* synthetic */ c.b G0;
    
    public d(final ViewGroup c0, final View d0, final boolean e0, final v.b f0, final c.b g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.C0.endViewTransition(this.D0);
        if (this.E0) {
            mag.a(this.F0.a, this.D0);
        }
        ((c.c)this.G0).a();
        if (p.P(2)) {
            final StringBuilder g = w48.g("Animator from operation ");
            g.append(this.F0);
            g.append(" has ended.");
            Log.v("FragmentManager", g.toString());
        }
    }
}
