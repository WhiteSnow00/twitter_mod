// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.adapter;

import androidx.lifecycle.d$b;
import android.os.Handler;
import androidx.lifecycle.e;

class FragmentStateAdapter$5 implements e
{
    public final Handler D0;
    public final Runnable E0;
    
    public FragmentStateAdapter$5(final Handler d0, final Runnable e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void f(final xaf xaf, final d$b d$b) {
        if (d$b == d$b.ON_DESTROY) {
            this.D0.removeCallbacks(this.E0);
            xaf.b().c((waf)this);
        }
    }
}
