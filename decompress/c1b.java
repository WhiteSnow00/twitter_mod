import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c1b implements Callable<Void>
{
    public final boolean F0;
    public final h17 G0;
    public final zop H0;
    
    public c1b(final boolean f0, final h17 g0, final zop h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final Object call() throws Exception {
        if (this.F0) {
            final h17 g0 = this.G0;
            final zop h0 = this.H0;
            final ExecutorService m = g0.m;
            final g17 g2 = new g17(g0, (tpp)h0);
            final ExecutorService a = ynw.a;
            m.execute((Runnable)new vnw((Callable)g2, new rcs()));
        }
        return null;
    }
}
