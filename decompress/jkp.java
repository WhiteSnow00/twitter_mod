import java.util.ArrayDeque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkp implements Executor
{
    public final ArrayDeque<a> C0;
    public final Executor D0;
    public Runnable E0;
    public final Object F0;
    
    public jkp(final Executor d0) {
        this.D0 = d0;
        this.C0 = new ArrayDeque<a>();
        this.F0 = new Object();
    }
    
    public final void a() {
        final Runnable e0 = this.C0.poll();
        this.E0 = e0;
        if (e0 != null) {
            this.D0.execute(e0);
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this.F0) {
            this.C0.add(new a(this, runnable));
            if (this.E0 == null) {
                this.a();
            }
        }
    }
    
    public static final class a implements Runnable
    {
        public final jkp C0;
        public final Runnable D0;
        
        public a(final jkp c0, final Runnable d0) {
            this.C0 = c0;
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            try {
                this.D0.run();
                synchronized (this.C0.F0) {
                    this.C0.a();
                }
            }
            finally {
                synchronized (this.C0.F0) {
                    this.C0.a();
                    monitorexit(this.C0.F0);
                }
            }
        }
    }
}
