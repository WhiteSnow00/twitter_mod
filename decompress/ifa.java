import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifa
{
    public static ExecutorService a(final String s) {
        final ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), new ffa(s, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        final TimeUnit seconds = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread((Runnable)new gfa(s, unconfigurableExecutorService), hmg.h("Crashlytics Shutdown Hook for ", s)));
        return unconfigurableExecutorService;
    }
}
