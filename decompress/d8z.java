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

public final class d8z extends sbz
{
    public static final AtomicLong N0;
    public z7z F0;
    public z7z G0;
    public final PriorityBlockingQueue H0;
    public final LinkedBlockingQueue I0;
    public final r7z J0;
    public final r7z K0;
    public final Object L0;
    public final Semaphore M0;
    
    static {
        N0 = new AtomicLong(Long.MIN_VALUE);
    }
    
    public d8z(final n8z n8z) {
        super(n8z);
        this.L0 = new Object();
        this.M0 = new Semaphore(2);
        this.H0 = new PriorityBlockingQueue();
        this.I0 = new LinkedBlockingQueue();
        this.J0 = new r7z(this, "Thread death: Uncaught exception on worker thread");
        this.K0 = new r7z(this, "Thread death: Uncaught exception on network thread");
    }
    
    public final void f() {
        if (Thread.currentThread() == this.G0) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
    
    public final void g() {
        if (Thread.currentThread() == this.F0) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    public final boolean i() {
        return false;
    }
    
    public final Object n(AtomicReference value, final long n, final String s, final Runnable runnable) {
        synchronized (value) {
            ((pbz)this).D0.a().q(runnable);
            try {
                value.wait(n);
                monitorexit(value);
                value = ((AtomicReference)value).get();
                if (value == null) {
                    ((pbz)this).D0.b().L0.a("Timed out waiting for ".concat(s));
                }
                return value;
            }
            catch (final InterruptedException ex) {
                final n1z l0 = ((pbz)this).D0.b().L0;
                final StringBuilder sb = new StringBuilder();
                sb.append("Interrupted waiting for ");
                sb.append(s);
                l0.a(sb.toString());
                return null;
            }
        }
    }
    
    public final Future o(final Callable callable) throws IllegalStateException {
        this.j();
        final v7z v7z = new v7z(this, callable, false);
        if (Thread.currentThread() == this.F0) {
            if (!this.H0.isEmpty()) {
                ((pbz)this).D0.b().L0.a("Callable skipped the worker queue.");
            }
            ((FutureTask)v7z).run();
        }
        else {
            this.t(v7z);
        }
        return (Future)v7z;
    }
    
    public final void p(final Runnable runnable) throws IllegalStateException {
        this.j();
        final v7z v7z = new v7z(this, runnable, false, "Task exception on network thread");
        synchronized (this.L0) {
            this.I0.add(v7z);
            final z7z g0 = this.G0;
            if (g0 == null) {
                ((Thread)(this.G0 = new z7z(this, "Measurement Network", (BlockingQueue)this.I0))).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.K0);
                ((Thread)this.G0).start();
                return;
            }
            synchronized (g0.D0) {
                g0.D0.notifyAll();
            }
        }
    }
    
    public final void q(final Runnable runnable) throws IllegalStateException {
        this.j();
        Objects.requireNonNull(runnable, "null reference");
        this.t(new v7z(this, runnable, false, "Task exception on worker thread"));
    }
    
    public final void r(final Runnable runnable) throws IllegalStateException {
        this.j();
        this.t(new v7z(this, runnable, true, "Task exception on worker thread"));
    }
    
    public final boolean s() {
        return Thread.currentThread() == this.F0;
    }
    
    public final void t(v7z f0) {
        synchronized (this.L0) {
            this.H0.add(f0);
            final z7z f2 = this.F0;
            if (f2 == null) {
                f0 = (v7z)new z7z(this, "Measurement Worker", (BlockingQueue)this.H0);
                ((Thread)(this.F0 = (z7z)f0)).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.J0);
                ((Thread)this.F0).start();
                return;
            }
            synchronized (f2.D0) {
                f2.D0.notifyAll();
            }
        }
    }
}
