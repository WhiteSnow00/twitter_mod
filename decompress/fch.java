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

public final class fch extends nfy
{
    public static final ThreadLocal<Deque<Runnable>> D0;
    public final ThreadPoolExecutor C0;
    
    static {
        D0 = new ThreadLocal<Deque<Runnable>>();
    }
    
    public fch() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        (this.C0 = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new xjz(defaultThreadFactory))).allowCoreThreadTimeOut(true);
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
        final Deque deque = fch.D0.get();
        if (deque != null && deque.size() <= 1) {
            a(deque, runnable);
            return;
        }
        this.C0.execute(new izz(runnable, 4));
    }
}
