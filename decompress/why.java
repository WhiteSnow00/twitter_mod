import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class why<ResultT> implements z5z<ResultT>
{
    public final Executor a;
    public final Object b;
    public final zgj<ResultT> c;
    
    public why(final Executor a, final zgj<ResultT> c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void a(final ppz ppz) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            monitorexit(this.b);
            this.a.execute((Runnable)new w8y(this, ppz));
        }
    }
}
