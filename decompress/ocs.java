import java.util.concurrent.RejectedExecutionException;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executor;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocs
{
    public final Object a;
    public boolean b;
    public final Queue<kxz> c;
    public final AtomicReference<Thread> d;
    
    public ocs() {
        this.a = new Object();
        this.c = new ArrayDeque();
        this.d = new AtomicReference<Thread>();
    }
    
    public final void a(@RecentlyNonNull final Executor executor, @RecentlyNonNull final Runnable runnable) {
        synchronized (this.a) {
            if (this.b) {
                this.c.add(new kxz(executor, runnable));
                return;
            }
            this.b = true;
            monitorexit(this.a);
            final m3y m3y = new m3y((Object)this, (Object)runnable, 5, (da8)null);
            try {
                executor.execute((Runnable)m3y);
            }
            catch (final RejectedExecutionException ex) {
                this.b();
            }
        }
    }
    
    public final void b() {
        synchronized (this.a) {
            if (this.c.isEmpty()) {
                this.b = false;
                return;
            }
            final kxz kxz = this.c.remove();
            monitorexit(this.a);
            this.c(kxz.a, kxz.b);
        }
    }
    
    public final void c(final Executor executor, final Runnable runnable) {
        final m3y m3y = new m3y((Object)this, (Object)runnable, 5, (da8)null);
        try {
            executor.execute((Runnable)m3y);
        }
        catch (final RejectedExecutionException ex) {
            this.b();
        }
    }
}
