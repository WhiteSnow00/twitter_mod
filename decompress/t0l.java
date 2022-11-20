import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t0l implements Callable
{
    public final u0l D0;
    public final ArrayList E0;
    public final String F0;
    
    public t0l(final u0l d0, final ArrayList e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() {
        final u0l d0 = this.D0;
        final ArrayList e0 = this.E0;
        final String f0 = this.F0;
        e0.addAll(d0.H0.z().a(f0));
        return d0.H0.y().h(f0);
    }
}
