import java.util.concurrent.FutureTask;
import androidx.core.os.OperationCanceledException;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.util.Objects;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pw0<D> extends z2g<D>
{
    public Executor K0;
    public volatile a L0;
    public volatile a M0;
    
    public pw0(final Context context) {
        super(context);
    }
    
    @Deprecated
    public void d(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.d(s, fileDescriptor, printWriter, array);
        if (this.L0 != null) {
            printWriter.print(s);
            printWriter.print("mTask=");
            printWriter.print(this.L0);
            printWriter.print(" waiting=");
            Objects.requireNonNull(this.L0);
            printWriter.println(false);
        }
        if (this.M0 != null) {
            printWriter.print(s);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.M0);
            printWriter.print(" waiting=");
            Objects.requireNonNull(this.M0);
            printWriter.println(false);
        }
    }
    
    public boolean f() {
        if (this.L0 == null) {
            return false;
        }
        if (!super.F0) {
            this.g();
        }
        if (this.M0 != null) {
            Objects.requireNonNull(this.L0);
            this.L0 = null;
            return false;
        }
        Objects.requireNonNull(this.L0);
        final a l0 = this.L0;
        l0.E0.set(true);
        final boolean cancel = ((FutureTask)l0.C0).cancel(false);
        if (cancel) {
            this.M0 = this.L0;
            this.n();
        }
        this.L0 = null;
        return cancel;
    }
    
    public void h() {
        this.f();
        this.L0 = new a();
        this.p();
    }
    
    public void n() {
    }
    
    public final void o(final a a, final D n) {
        this.r(n);
        if (this.M0 == a) {
            if (super.J0) {
                this.g();
            }
            SystemClock.uptimeMillis();
            this.M0 = null;
            this.p();
        }
    }
    
    public final void p() {
        if (this.M0 == null && this.L0 != null) {
            Objects.requireNonNull(this.L0);
            if (this.K0 == null) {
                this.K0 = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            final a l0 = this.L0;
            final Executor k0 = this.K0;
            if (l0.D0 != 1) {
                final int d = nb0.D(l0.D0);
                if (d == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                if (d != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            else {
                l0.D0 = 2;
                k0.execute((Runnable)l0.C0);
            }
        }
    }
    
    public abstract D q();
    
    public void r(final D n) {
    }
    
    public final class a extends ikh<D> implements Runnable
    {
        public final D a() {
            try {
                return pw0.this.q();
            }
            catch (final OperationCanceledException ex) {
                if (super.E0.get()) {
                    return null;
                }
                throw ex;
            }
        }
        
        public final void b(final D n) {
            pw0.this.o(this, n);
        }
        
        public final void c(final D n) {
            final pw0 h0 = pw0.this;
            if (h0.L0 != this) {
                h0.o(this, n);
            }
            else if (h0.G0) {
                h0.r(n);
            }
            else {
                h0.J0 = false;
                SystemClock.uptimeMillis();
                h0.L0 = null;
                h0.c((Object)n);
            }
        }
        
        public final void run() {
            pw0.this.p();
        }
    }
}
