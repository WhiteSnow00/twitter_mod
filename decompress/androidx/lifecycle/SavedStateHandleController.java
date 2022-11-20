// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

final class SavedStateHandleController implements e
{
    public boolean D0;
    
    public final void f(final xaf xaf, final d$b d$b) {
        if (d$b == d$b.ON_DESTROY) {
            this.D0 = false;
            xaf.b().c((waf)this);
        }
    }
}
