import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnz<TResult> implements hwz<TResult>
{
    public final Executor D0;
    public final Object E0;
    public kij F0;
    
    public bnz(final Executor d0, final kij f0) {
        this.E0 = new Object();
        this.D0 = d0;
        this.F0 = f0;
    }
    
    public final void d() {
        synchronized (this.E0) {
            this.F0 = null;
        }
    }
    
    public final void e(final ubs<TResult> ubs) {
        if (!ubs.s() && !ubs.q()) {
            synchronized (this.E0) {
                if (this.F0 == null) {
                    return;
                }
                monitorexit(this.E0);
                this.D0.execute(new f3y(this, ubs, 4, null));
            }
        }
    }
}
