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

public final class c9z extends rcz
{
    public static final AtomicLong P0;
    public y8z H0;
    public y8z I0;
    public final PriorityBlockingQueue J0;
    public final LinkedBlockingQueue K0;
    public final q8z L0;
    public final q8z M0;
    public final Object N0;
    public final Semaphore O0;
    
    static {
        P0 = new AtomicLong(Long.MIN_VALUE);
    }
    
    public c9z(final m9z m9z) {
        super(m9z);
        this.N0 = new Object();
        this.O0 = new Semaphore(2);
        this.J0 = new PriorityBlockingQueue();
        this.K0 = new LinkedBlockingQueue();
        this.L0 = new q8z(this, "Thread death: Uncaught exception on worker thread");
        this.M0 = new q8z(this, "Thread death: Uncaught exception on network thread");
    }
    
    public final void f() {
        if (Thread.currentThread() == this.I0) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
    
    public final void g() {
        if (Thread.currentThread() == this.H0) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    @Override
    public final boolean i() {
        return false;
    }
    
    public final Object n(AtomicReference value, final long n, final String s, final Runnable runnable) {
        synchronized (value) {
            super.F0.a().q(runnable);
            try {
                value.wait(n);
                monitorexit(value);
                value = ((AtomicReference)value).get();
                if (value == null) {
                    super.F0.b().N0.a("Timed out waiting for ".concat(s));
                }
                return value;
            }
            catch (final InterruptedException ex) {
                final l2z n2 = super.F0.b().N0;
                final StringBuilder sb = new StringBuilder();
                sb.append("Interrupted waiting for ");
                sb.append(s);
                n2.a(sb.toString());
                return null;
            }
        }
    }
    
    public final Future o(final Callable callable) throws IllegalStateException {
        this.j();
        final u8z u8z = new u8z(this, callable, false);
        if (Thread.currentThread() == this.H0) {
            if (!this.J0.isEmpty()) {
                super.F0.b().N0.a("Callable skipped the worker queue.");
            }
            ((FutureTask)u8z).run();
        }
        else {
            this.t(u8z);
        }
        return (Future)u8z;
    }
    
    public final void p(final Runnable runnable) throws IllegalStateException {
        this.j();
        final u8z u8z = new u8z(this, runnable, false, "Task exception on network thread");
        synchronized (this.N0) {
            this.K0.add(u8z);
            final y8z i0 = this.I0;
            if (i0 == null) {
                ((Thread)(this.I0 = new y8z(this, "Measurement Network", (BlockingQueue)this.K0))).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.M0);
                ((Thread)this.I0).start();
                return;
            }
            synchronized (i0.F0) {
                i0.F0.notifyAll();
            }
        }
    }
    
    public final void q(final Runnable runnable) throws IllegalStateException {
        this.j();
        Objects.requireNonNull(runnable, "null reference");
        this.t(new u8z(this, runnable, false, "Task exception on worker thread"));
    }
    
    public final void r(final Runnable runnable) throws IllegalStateException {
        this.j();
        this.t(new u8z(this, runnable, true, "Task exception on worker thread"));
    }
    
    public final boolean s() {
        return Thread.currentThread() == this.H0;
    }
    
    public final void t(u8z h0) {
        synchronized (this.N0) {
            this.J0.add(h0);
            final y8z h2 = this.H0;
            if (h2 == null) {
                h0 = (u8z)new y8z(this, "Measurement Worker", (BlockingQueue)this.J0);
                ((Thread)(this.H0 = (y8z)h0)).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)this.L0);
                ((Thread)this.H0).start();
                return;
            }
            synchronized (h2.F0) {
                h2.F0.notifyAll();
            }
        }
    }
}
