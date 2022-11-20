import android.os.Looper;
import android.os.Build$VERSION;
import android.os.Handler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fe6
{
    public static ThreadPoolExecutor a(final String s) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(), (ThreadFactory)new ee6(s));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
    
    public static Handler b() {
        if (Build$VERSION.SDK_INT >= 28) {
            return a.a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
    
    public static final class a
    {
        public static Handler a(final Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
