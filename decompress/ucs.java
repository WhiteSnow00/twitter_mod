import java.util.concurrent.CancellationException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ucs
{
    public static <TResult> TResult a(final ubs<TResult> ubs) throws ExecutionException, InterruptedException {
        eli.p("Must not be called on the main application thread");
        eli.r(ubs, "Task must not be null");
        if (ubs.r()) {
            return (TResult)g((ubs<Object>)ubs);
        }
        final aby aby = new aby();
        h((ubs<TResult>)ubs, (kby<? super TResult>)aby);
        aby.D0.await();
        return (TResult)g((ubs<T>)ubs);
    }
    
    public static <TResult> TResult b(final ubs<TResult> ubs, final long n, final TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        eli.p("Must not be called on the main application thread");
        eli.r(ubs, "Task must not be null");
        eli.r(timeUnit, "TimeUnit must not be null");
        if (ubs.r()) {
            return g(ubs);
        }
        final aby aby = new aby();
        h(ubs, (kby<? super TResult>)aby);
        if (aby.D0.await(n, timeUnit)) {
            return g(ubs);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
    
    @Deprecated
    public static <TResult> ubs<TResult> c(final Executor executor, final Callable<TResult> callable) {
        eli.r(executor, "Executor must not be null");
        final c000 c000 = new c000();
        executor.execute(new uaz(c000, callable, 4));
        return c000;
    }
    
    public static <TResult> ubs<TResult> d(final Exception ex) {
        final c000 c000 = new c000();
        c000.w(ex);
        return c000;
    }
    
    public static <TResult> ubs<TResult> e(final TResult tResult) {
        final c000 c000 = new c000();
        c000.x(tResult);
        return c000;
    }
    
    public static ubs<Void> f(final Collection<? extends ubs<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                Objects.requireNonNull(iterator.next(), "null tasks are not accepted");
            }
            final c000 c000 = new c000();
            final tby tby = new tby(collection.size(), c000);
            final Iterator iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                h((ubs<Object>)iterator2.next(), (kby<? super Object>)tby);
            }
            return c000;
        }
        return e((Void)null);
    }
    
    public static <TResult> TResult g(final ubs<TResult> ubs) throws ExecutionException {
        if (ubs.s()) {
            return ubs.o();
        }
        if (ubs.q()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(ubs.n());
    }
    
    public static <T> void h(final ubs<T> ubs, final kby<? super T> kby) {
        final jyz b = ics.b;
        ubs.i(b, (akj<? super T>)kby);
        ubs.f(b, (kij)kby);
        ubs.b(b, (zgj)kby);
    }
}
