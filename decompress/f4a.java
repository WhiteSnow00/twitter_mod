import java.util.concurrent.Executor;
import android.util.Log;
import android.os.IBinder;
import android.content.Intent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import android.annotation.SuppressLint;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "UnwrappedWakefulBroadcastReceiver" })
public abstract class f4a extends Service
{
    public static final int I0 = 0;
    public final ExecutorService D0;
    public vqx E0;
    public final Object F0;
    public int G0;
    public int H0;
    
    public f4a() {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new o6i("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.D0 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.F0 = new Object();
        this.H0 = 0;
    }
    
    public final void a(final Intent intent) {
        if (intent != null) {
            synchronized (cix.b) {
                if (cix.c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    cix.c.c();
                }
            }
        }
        synchronized (this.F0) {
            final int h0 = this.H0 - 1;
            this.H0 = h0;
            if (h0 == 0) {
                this.stopSelfResult(this.G0);
            }
        }
    }
    
    public Intent b(final Intent intent) {
        return intent;
    }
    
    public abstract void c(final Intent p0);
    
    public final IBinder onBind(final Intent intent) {
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.E0 == null) {
                this.E0 = new vqx((vqx$a)new vqx$a(this) {
                    public final f4a a;
                });
            }
            return (IBinder)this.E0;
        }
    }
    
    public final void onDestroy() {
        this.D0.shutdown();
        super.onDestroy();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int g0) {
        Object o = this.F0;
        synchronized (o) {
            this.G0 = g0;
            ++this.H0;
            monitorexit(o);
            o = this.b(intent);
            if (o == null) {
                this.a(intent);
                return 2;
            }
            final zbs zbs = new zbs();
            this.D0.execute((Runnable)new zsl((Object)this, o, (Object)zbs, 2));
            o = zbs.a;
            if (((c000)o).r()) {
                this.a(intent);
                return 2;
            }
            ((c000)o).v((Executor)e4a.E0, (ghj)new dga((Object)this, (Object)intent, 3));
            return 3;
        }
    }
}
