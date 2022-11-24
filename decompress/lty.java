import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lty<ResultT> implements n7z<ResultT>
{
    public final Executor a;
    public final Object b;
    public final xij c;
    
    public lty(final Executor a, final xij c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a(final crz crz) {
        if (!crz.b()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                monitorexit(this.b);
                this.a.execute((Runnable)new txz((Object)this, (Object)crz, 2, (j98)null));
            }
        }
    }
}
