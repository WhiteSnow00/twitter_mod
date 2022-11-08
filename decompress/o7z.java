import java.util.concurrent.FutureTask;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7z extends dbz
{
    public static final AtomicLong M0;
    public k7z E0;
    public k7z F0;
    public final PriorityBlockingQueue G0;
    public final LinkedBlockingQueue H0;
    public final c7z I0;
    public final c7z J0;
    public final Object K0;
    public final Semaphore L0;
    
    static {
        M0 = new AtomicLong(Long.MIN_VALUE);
    }
    
    public o7z(final y7z y7z) {
        super(y7z);
        this.K0 = new Object();
        this.L0 = new Semaphore(2);
        this.G0 = new PriorityBlockingQueue();
        this.H0 = new LinkedBlockingQueue();
        this.I0 = new c7z(this, "Thread death: Uncaught exception on worker thread");
        this.J0 = new c7z(this, "Thread death: Uncaught exception on network thread");
    }
    
    public final void f() {
        if (Thread.currentThread() == this.F0) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
    
    public final void g() {
        if (Thread.currentThread() == this.E0) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    public final boolean i() {
        return false;
    }
    
    public final Object n(AtomicReference value, final long n, final String s, final Runnable runnable) {
        synchronized (value) {
            ((abz)this).C0.a().q(runnable);
            try {
                value.wait(n);
                monitorexit(value);
                value = ((AtomicReference)value).get();
                if (value == null) {
                    ((abz)this).C0.b().K0.a("Timed out waiting for ".concat(s));
                }
                return value;
            }
            catch (final InterruptedException ex) {
                final x0z k0 = ((abz)this).C0.b().K0;
                final StringBuilder sb = new StringBuilder();
                sb.append("Interrupted waiting for ");
                sb.append(s);
                k0.a(sb.toString());
                return null;
            }
        }
    }
    
    public final Future o(final Callable callable) throws IllegalStateException {
        this.j();
        final g7z g7z = new g7z(this, callable, false);
        if (Thread.currentThread() == this.E0) {
            if (!this.G0.isEmpty()) {
                ((abz)this).C0.b().K0.a("Callable skipped the worker queue.");
            }
            ((FutureTask)g7z).run();
        }
        else {
            this.t(g7z);
        }
        return (Future)g7z;
    }
    
    public final void p(final Runnable runnable) throws IllegalStateException {
        this.j();
        final g7z g7z = new g7z(this, runnable, false, "Task exception on network thread");
        synchronized (this.K0) {
            this.H0.add(g7z);
            final k7z f0 = this.F0;
            if (f0 == null) {
                ((Thread)(this.F0 = new k7z(this, "Measurement Network", (BlockingQueue)this.H0))).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.J0);
                ((Thread)this.F0).start();
                return;
            }
            synchronized (f0.C0) {
                f0.C0.notifyAll();
            }
        }
    }
    
    public final void q(final Runnable runnable) throws IllegalStateException {
        this.j();
        Objects.requireNonNull(runnable, "null reference");
        this.t(new g7z(this, runnable, false, "Task exception on worker thread"));
    }
    
    public final void r(final Runnable runnable) throws IllegalStateException {
        this.j();
        this.t(new g7z(this, runnable, true, "Task exception on worker thread"));
    }
    
    public final boolean s() {
        return Thread.currentThread() == this.E0;
    }
    
    public final void t(g7z e0) {
        synchronized (this.K0) {
            this.G0.add(e0);
            final k7z e2 = this.E0;
            if (e2 == null) {
                e0 = (g7z)new k7z(this, "Measurement Worker", (BlockingQueue)this.G0);
                ((Thread)(this.E0 = (k7z)e0)).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.I0);
                ((Thread)this.E0).start();
                return;
            }
            synchronized (e2.C0) {
                e2.C0.notifyAll();
            }
        }
    }
}
