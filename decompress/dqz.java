import com.google.android.play.core.tasks.RuntimeExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqz<ResultT>
{
    public final Object a;
    public final qxd b;
    public boolean c;
    public ResultT d;
    public Exception e;
    
    public dqz() {
        this.a = new Object();
        this.b = new qxd();
    }
    
    public final ResultT a() {
        synchronized (this.a) {
            rp9.X0(this.c, "Task is not yet complete");
            final Exception e = this.e;
            if (e == null) {
                return this.d;
            }
            throw new RuntimeExecutionException(e);
        }
    }
    
    public final boolean b() {
        synchronized (this.a) {
            final boolean c = this.c;
            boolean b = false;
            if (c) {
                b = b;
                if (this.e == null) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    public final void c(final Exception e) {
        synchronized (this.a) {
            rp9.X0(this.c ^ true, "Task is already complete");
            this.c = true;
            this.e = e;
            monitorexit(this.a);
            this.b.c(this);
        }
    }
    
    public final void d(final ResultT d) {
        synchronized (this.a) {
            rp9.X0(this.c ^ true, "Task is already complete");
            this.c = true;
            this.d = d;
            monitorexit(this.a);
            this.b.c(this);
        }
    }
    
    public final void e() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            monitorexit(this.a);
            this.b.c(this);
        }
    }
}
