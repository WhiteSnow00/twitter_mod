// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/e;", "lifecycle-viewmodel-savedstate_release" }, k = 1, mv = { 1, 6, 0 })
public final class SavedStateHandleAttacher implements e
{
    public final kto D0;
    
    public SavedStateHandleAttacher(final kto d0) {
        this.D0 = d0;
    }
    
    public final void f(final xaf xaf, final d$b d$b) {
        if (d$b == d$b.ON_CREATE) {
            xaf.b().c((waf)this);
            final kto d0 = this.D0;
            if (!d0.b) {
                d0.c = d0.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                d0.b = true;
                final lto lto = (lto)d0.d.getValue();
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Next event must be ON_CREATE, it was ");
        sb.append(d$b);
        throw new IllegalStateException(sb.toString().toString());
    }
}
