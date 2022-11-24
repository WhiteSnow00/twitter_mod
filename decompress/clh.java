import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.FutureTask;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class clh<Result>
{
    public static Handler J0;
    public final FutureTask<Result> F0;
    public volatile int G0;
    public final AtomicBoolean H0;
    public final AtomicBoolean I0;
    
    public clh() {
        this.G0 = 1;
        this.H0 = new AtomicBoolean();
        this.I0 = new AtomicBoolean();
        this.F0 = new FutureTask<Result>(this, new Callable<Result>(this) {
            public final clh F0;
            
            @Override
            public final Result call() {
                this.F0.I0.set(true);
                Result a = null;
                try {
                    Process.setThreadPriority(10);
                    a = a;
                    final Result result = a = this.F0.a();
                    Binder.flushPendingCommands();
                    this.F0.d(result);
                    return result;
                }
                finally {
                    try {
                        this.F0.H0.set(true);
                    }
                    finally {
                        this.F0.d(a);
                    }
                }
            }
        }) {
            public final clh F0;
            
            public final void done() {
                try {
                    final Result value = this.get();
                    final clh f0 = this.F0;
                    if (!f0.I0.get()) {
                        f0.d(value);
                    }
                }
                catch (final CancellationException ex) {
                    final clh f2 = this.F0;
                    if (!f2.I0.get()) {
                        f2.d(null);
                    }
                }
                catch (final ExecutionException ex2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", ex2.getCause());
                }
                catch (final InterruptedException ex3) {
                    Log.w("AsyncTask", (Throwable)ex3);
                }
                finally {
                    final Throwable t;
                    throw new RuntimeException("An error occurred while executing doInBackground()", t);
                }
            }
        };
    }
    
    public abstract Result a();
    
    public void b(final Result result) {
    }
    
    public void c(final Result result) {
    }
    
    public final void d(final Result result) {
        synchronized (clh.class) {
            if (clh.J0 == null) {
                clh.J0 = new Handler(Looper.getMainLooper());
            }
            final Handler j0 = clh.J0;
            monitorexit(clh.class);
            j0.post((Runnable)new Runnable(this, result) {
                public final Object F0;
                public final clh G0;
                
                @Override
                public final void run() {
                    final clh g0 = this.G0;
                    final Object f0 = this.F0;
                    if (g0.H0.get()) {
                        g0.b(f0);
                    }
                    else {
                        g0.c(f0);
                    }
                    g0.G0 = 3;
                }
            });
        }
    }
}
