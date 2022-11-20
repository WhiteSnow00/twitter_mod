// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.HashMap;

class CompositeGeneratedAdaptersObserver implements e
{
    public final b[] D0;
    
    public CompositeGeneratedAdaptersObserver(final b[] d0) {
        this.D0 = d0;
    }
    
    public final void f(final xaf xaf, final d$b d$b) {
        new HashMap();
        final b[] d0 = this.D0;
        final int length = d0.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            d0[i].a();
        }
        final b[] d2 = this.D0;
        for (int length2 = d2.length, j = n; j < length2; ++j) {
            d2[j].a();
        }
    }
}
