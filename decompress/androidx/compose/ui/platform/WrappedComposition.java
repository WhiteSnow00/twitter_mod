// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import androidx.lifecycle.d$b;
import androidx.lifecycle.d;
import kotlin.Metadata;
import androidx.lifecycle.e;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003" }, d2 = { "Landroidx/compose/ui/platform/WrappedComposition;", "Lpd6;", "Landroidx/lifecycle/e;", "ui_release" }, k = 1, mv = { 1, 7, 1 })
final class WrappedComposition implements pd6, e
{
    public final AndroidComposeView D0;
    public final pd6 E0;
    public boolean F0;
    public d G0;
    public ftb<? super x66, ? super Integer, fzv> H0;
    
    public WrappedComposition(final AndroidComposeView d0, final pd6 e0) {
        this.D0 = d0;
        this.E0 = e0;
        final b66 a = b66.a;
        this.H0 = (ftb<? super x66, ? super Integer, fzv>)b66.b;
    }
    
    public final void dispose() {
        if (!this.F0) {
            this.F0 = true;
            this.D0.getView().setTag(2131432670, (Object)null);
            final d g0 = this.G0;
            if (g0 != null) {
                g0.c((waf)this);
            }
        }
        this.E0.dispose();
    }
    
    public final void f(final xaf xaf, final d$b d$b) {
        if (d$b == d$b.ON_DESTROY) {
            this.dispose();
        }
        else if (d$b == d$b.ON_CREATE && !this.F0) {
            this.g(this.H0);
        }
    }
    
    public final void g(final ftb<? super x66, ? super Integer, fzv> ftb) {
        czd.f((Object)ftb, "content");
        this.D0.setOnViewTreeOwnersAvailable((qsb<? super AndroidComposeView.b, fzv>)new WrappedComposition$a(this, (ftb)ftb));
    }
    
    public final boolean isDisposed() {
        return this.E0.isDisposed();
    }
    
    public final boolean u() {
        return this.E0.u();
    }
}
