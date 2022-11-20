import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnw
{
    public static final ExecutorService a;
    
    static {
        a = ifa.a("awaitEvenIfOnMainThread task continuation executor");
    }
    
    public static <T> T a(final ubs<T> ubs) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ubs.k((Executor)jnw.a, (fo6<T, Object>)new fe8((Object)countDownLatch, 3));
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (ubs.s()) {
            return ubs.o();
        }
        if (ubs.q()) {
            throw new CancellationException("Task is already canceled");
        }
        if (ubs.r()) {
            throw new IllegalStateException(ubs.n());
        }
        throw new TimeoutException();
    }
}
