import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wgz<TResult> implements uvz<TResult>
{
    public final Executor C0;
    public final Object D0;
    public ahj<TResult> E0;
    
    public wgz(final Executor c0, final ahj<TResult> e0) {
        this.D0 = new Object();
        this.C0 = c0;
        this.E0 = e0;
    }
    
    @Override
    public final void d() {
        synchronized (this.D0) {
            this.E0 = null;
        }
    }
    
    @Override
    public final void e(final zas<TResult> zas) {
        synchronized (this.D0) {
            if (this.E0 == null) {
                return;
            }
            monitorexit(this.D0);
            this.C0.execute((Runnable)new d9z((Object)this, (Object)zas, 3));
        }
    }
}
