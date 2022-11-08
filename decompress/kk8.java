import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Looper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kk8 extends n5r
{
    public final Object D0;
    public final ExecutorService E0;
    public volatile Handler F0;
    
    public kk8() {
        super(1);
        this.D0 = new Object();
        this.E0 = Executors.newFixedThreadPool(4, (ThreadFactory)new kk8$a());
    }
    
    public static Handler N(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        }
        catch (final InvocationTargetException ex) {
            return new Handler(looper);
        }
        catch (final IllegalAccessException | InstantiationException | NoSuchMethodException ex2) {
            return new Handler(looper);
        }
    }
    
    public final void O(final Runnable runnable) {
        this.E0.execute(runnable);
    }
    
    public final boolean P() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
    
    public final void Q(final Runnable runnable) {
        if (this.F0 == null) {
            synchronized (this.D0) {
                if (this.F0 == null) {
                    this.F0 = N(Looper.getMainLooper());
                }
            }
        }
        this.F0.post(runnable);
    }
}
