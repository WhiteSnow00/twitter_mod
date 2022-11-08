import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v2q implements Runnable
{
    public final /* synthetic */ List C0;
    public final /* synthetic */ zpm D0;
    public final /* synthetic */ u2q E0;
    
    public v2q(final u2q e0, final List c0, final zpm d0) {
        this.E0 = e0;
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final void run() {
        for (final String s : this.C0) {
            ((l7q)this.E0.b).remove((Object)s);
            final hnf hnf = (hnf)((l7q)this.E0.c).remove((Object)s);
            if (hnf != null) {
                ((Future)hnf).cancel(false);
            }
        }
        this.E0.h(this.D0);
    }
}
