import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cgy implements ExecutorService
{
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) throws InterruptedException {
        return ((hch)this).D0.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> collection) throws InterruptedException {
        return ((hch)this).D0.invokeAll(collection);
    }
    
    @Override
    public final <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> collection, final long n, final TimeUnit timeUnit) throws InterruptedException {
        return ((hch)this).D0.invokeAll(collection, n, timeUnit);
    }
    
    @Override
    public final <T> T invokeAny(final Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return ((hch)this).D0.invokeAny(collection);
    }
    
    @Override
    public final <T> T invokeAny(final Collection<? extends Callable<T>> collection, final long n, final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return ((hch)this).D0.invokeAny(collection, n, timeUnit);
    }
    
    @Override
    public final boolean isShutdown() {
        return ((hch)this).D0.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return ((hch)this).D0.isTerminated();
    }
    
    @Override
    public final void shutdown() {
        ((hch)this).D0.shutdown();
    }
    
    @Override
    public final List<Runnable> shutdownNow() {
        return ((hch)this).D0.shutdownNow();
    }
    
    @Override
    public final Future<?> submit(final Runnable runnable) {
        return ((hch)this).D0.submit(runnable);
    }
    
    @Override
    public final <T> Future<T> submit(final Runnable runnable, final T t) {
        return ((hch)this).D0.submit(runnable, t);
    }
    
    @Override
    public final <T> Future<T> submit(final Callable<T> callable) {
        return ((hch)this).D0.submit(callable);
    }
    
    @Override
    public final String toString() {
        return ((hch)this).D0.toString();
    }
}
