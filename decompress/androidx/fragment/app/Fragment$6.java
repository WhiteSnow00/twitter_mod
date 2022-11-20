// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.d$b;
import androidx.lifecycle.e;

class Fragment$6 implements e
{
    public final Fragment D0;
    
    public Fragment$6(final Fragment d0) {
        this.D0 = d0;
    }
    
    public final void f(final xaf xaf, final d$b d$b) {
        if (d$b == d$b.ON_STOP) {
            final View k1 = this.D0.k1;
            if (k1 != null) {
                k1.cancelPendingInputEvents();
            }
        }
    }
}
