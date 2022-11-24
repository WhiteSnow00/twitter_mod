import androidx.annotation.RecentlyNonNull;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xch extends xgy
{
    public static final ThreadLocal<Deque<Runnable>> G0;
    public final ThreadPoolExecutor F0;
    
    static {
        G0 = new ThreadLocal<Deque<Runnable>>();
    }
    
    public xch() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        (this.F0 = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new klz(defaultThreadFactory))).allowCoreThreadTimeOut(true);
    }
    
    public static void a(final Deque<Runnable> deque, Runnable runnable) {
        Objects.requireNonNull(deque, "null reference");
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
            } while ((runnable = deque.peekFirst()) != null);
        }
    }
    
    public final void execute(@RecentlyNonNull final Runnable runnable) {
        final Deque deque = xch.G0.get();
        if (deque != null && deque.size() <= 1) {
            a(deque, runnable);
            return;
        }
        this.F0.execute((Runnable)new t000((Object)runnable, 4));
    }
}
