// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.animation.Animator;

public final class e implements b
{
    public final /* synthetic */ Animator a;
    public final /* synthetic */ v.b b;
    
    public e(final Animator a, final v.b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void onCancel() {
        this.a.end();
        if (p.P(2)) {
            final StringBuilder g = w48.g("Animator from operation ");
            g.append(this.b);
            g.append(" has been canceled.");
            Log.v("FragmentManager", g.toString());
        }
    }
}
