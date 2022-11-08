import java.util.Objects;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public class jcc extends AbstractExecutorService implements ScheduledExecutorService
{
    public final Handler C0;
    
    public jcc(final Handler c0) {
        this.C0 = c0;
    }
    
    public final <T> ruo<T> a(final Runnable runnable, final T t) {
        return (ruo<T>)new ruo(runnable, (Object)t);
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
    
    public final <T> ruo<T> b(final Callable<T> callable) {
        return (ruo<T>)new ruo((Callable)callable);
    }
    
    @Override
    public void execute(final Runnable runnable) {
        this.C0.post(runnable);
    }
    
    @Override
    public final boolean isShutdown() {
        return false;
    }
    
    @Override
    public final boolean isTerminated() {
        return false;
    }
    
    @Override
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final ruo<Object> a = this.a(runnable, (Object)null);
        this.C0.postDelayed((Runnable)a, timeUnit.toMillis(n));
        return (ScheduledFuture<?>)a;
    }
    
    @Override
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long n, final TimeUnit timeUnit) {
        final ruo<V> b = this.b(callable);
        this.C0.postDelayed((Runnable)b, timeUnit.toMillis(n));
        return (ScheduledFuture<V>)b;
    }
    
    @Override
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Future submit(final Runnable runnable) {
        Objects.requireNonNull(runnable);
        final ruo<Object> a = this.a(runnable, (Object)null);
        this.execute((Runnable)a);
        return (Future)a;
    }
    
    @Override
    public final Future submit(final Runnable runnable, final Object o) {
        Objects.requireNonNull(runnable);
        final ruo<Object> a = this.a(runnable, o);
        this.execute((Runnable)a);
        return (Future)a;
    }
    
    @Override
    public final Future submit(final Callable callable) {
        Objects.requireNonNull(callable);
        final ruo<Object> b = this.b((Callable<Object>)callable);
        this.execute((Runnable)b);
        return (Future)b;
    }
}
