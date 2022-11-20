import java.util.Objects;
import com.twitter.ui.widget.timeline.InlineDismissView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vod implements lj6
{
    public final apd D0;
    public final InlineDismissView E0;
    public final cxs F0;
    public final long G0;
    
    public vod(final apd d0, final InlineDismissView e0, final cxs f0, final long g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        final apd d0 = this.D0;
        final InlineDismissView e0 = this.E0;
        final cxs f0 = this.F0;
        final long g0 = this.G0;
        final Throwable t = (Throwable)o;
        Objects.requireNonNull(d0);
        m8a.d(t);
        d0.g(e0, f0);
        d0.f(g0);
    }
}
