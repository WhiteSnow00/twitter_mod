// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;

public final class k implements Runnable
{
    public final /* synthetic */ c.d C0;
    public final /* synthetic */ v.b D0;
    
    public k(final c.d c0, final v.b d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final void run() {
        ((c.c)this.C0).a();
        if (p.P(2)) {
            final StringBuilder g = w48.g("Transition for operation ");
            g.append(this.D0);
            g.append("has completed");
            Log.v("FragmentManager", g.toString());
        }
    }
}
