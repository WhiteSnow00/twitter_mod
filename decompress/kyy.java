import java.util.Objects;
import android.app.Application$ActivityLifecycleCallbacks;
import android.util.Log;
import android.app.Application;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyy
{
    public static volatile kyy g;
    public final ExecutorService a;
    public final mn0 b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile qoy f;
    
    public kyy(Context context, final Bundle bundle) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new muy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new mn0(this);
        this.c = new ArrayList();
        while (true) {
            try {
                wd.G(context, k7z.a(context));
                this.b(new vry(this, context, bundle));
                context = context.getApplicationContext();
                if (context == null) {
                    Log.w("FA", "Unable to register lifecycle notifications. Application null.");
                    return;
                }
                ((Application)context).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new gyy(this));
            }
            catch (final IllegalStateException ex) {
                continue;
            }
            break;
        }
    }
    
    public static kyy c(final Context context, final Bundle bundle) {
        Objects.requireNonNull(context, "null reference");
        if (kyy.g == null) {
            synchronized (kyy.class) {
                if (kyy.g == null) {
                    kyy.g = new kyy(context, bundle);
                }
            }
        }
        return kyy.g;
    }
    
    public final void a(final Exception ex, final boolean b, final boolean b2) {
        this.e |= b;
        if (b) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", (Throwable)ex);
            return;
        }
        if (b2) {
            this.b(new euy(this, ex));
        }
        Log.w("FA", "Error with data collection. Data lost.", (Throwable)ex);
    }
    
    public final void b(final xvy xvy) {
        this.a.execute((Runnable)xvy);
    }
}
