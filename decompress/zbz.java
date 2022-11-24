import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zbz<TResult> implements gxz<TResult>
{
    public final Executor F0;
    public final Object G0;
    public nhj H0;
    
    public zbz(final Executor f0, final nhj h0) {
        this.G0 = new Object();
        this.F0 = f0;
        this.H0 = h0;
    }
    
    public final void d() {
        synchronized (this.G0) {
            this.H0 = null;
        }
    }
    
    public final void e(final mcs<TResult> mcs) {
        if (mcs.q()) {
            synchronized (this.G0) {
                if (this.H0 == null) {
                    return;
                }
                monitorexit(this.G0);
                this.F0.execute((Runnable)new f3y((Object)this, 3));
            }
        }
    }
}
