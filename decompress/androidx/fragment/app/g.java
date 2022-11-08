// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.View;

public final class g implements b
{
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ c.b c;
    public final /* synthetic */ v.b d;
    
    public g(final View a, final ViewGroup b, final c.b c, final v.b d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void onCancel() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        ((c.c)this.c).a();
        if (p.P(2)) {
            final StringBuilder g = w48.g("Animation from operation ");
            g.append(this.d);
            g.append(" has been cancelled.");
            Log.v("FragmentManager", g.toString());
        }
    }
}
