import java.util.ArrayDeque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ext implements Executor
{
    public final Executor D0;
    public final ArrayDeque<Runnable> E0;
    public Runnable F0;
    
    public ext(final Executor d0) {
        this.E0 = new ArrayDeque<Runnable>();
        this.D0 = d0;
    }
    
    public final void a() {
        synchronized (this) {
            final Runnable f0 = this.E0.poll();
            this.F0 = f0;
            if (f0 != null) {
                this.D0.execute(f0);
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this) {
            this.E0.offer(new Runnable(this, runnable) {
                public final Runnable D0;
                public final ext E0;
                
                @Override
                public final void run() {
                    try {
                        this.D0.run();
                    }
                    finally {
                        this.E0.a();
                    }
                }
            });
            if (this.F0 == null) {
                this.a();
            }
        }
    }
}
