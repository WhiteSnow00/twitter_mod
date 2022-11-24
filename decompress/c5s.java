import android.content.Intent;
import android.content.Context;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import java.io.IOException;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.os.Build$VERSION;
import android.util.Log;
import android.annotation.SuppressLint;
import android.os.PowerManager;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;
import com.google.firebase.messaging.FirebaseMessaging;
import android.os.PowerManager$WakeLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c5s implements Runnable
{
    public final long F0;
    public final PowerManager$WakeLock G0;
    public final FirebaseMessaging H0;
    
    @SuppressLint({ "InvalidWakeLockTag" })
    public c5s(final FirebaseMessaging h0, final long f0) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new h7i("firebase-iid-executor"));
        this.H0 = h0;
        this.F0 = f0;
        (this.G0 = ((PowerManager)h0.d.getSystemService("power")).newWakeLock(1, "fiid-sync")).setReferenceCounted(false);
    }
    
    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }
    
    public final boolean b() {
        final ConnectivityManager connectivityManager = (ConnectivityManager)this.H0.d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        if (connectivityManager != null) {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        }
        else {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    public final boolean c() throws IOException {
        final boolean b = true;
        try {
            if (this.H0.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        }
        catch (final SecurityException ex) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
        catch (final IOException ex2) {
            final String message = ex2.getMessage();
            int n = b ? 1 : 0;
            if (!"SERVICE_NOT_AVAILABLE".equals(message)) {
                n = (b ? 1 : 0);
                if (!"INTERNAL_SERVER_ERROR".equals(message)) {
                    if ("InternalServerError".equals(message)) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                }
            }
            if (n != 0) {
                final StringBuilder f = ehk.f("Token retrieval failed: ");
                f.append(ex2.getMessage());
                f.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", f.toString());
                return false;
            }
            if (ex2.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw ex2;
        }
    }
    
    @SuppressLint({ "WakelockTimeout" })
    @Override
    public final void run() {
        Label_0023: {
            if (!qnp.a().c(this.H0.d)) {
                break Label_0023;
            }
            this.G0.acquire();
            try {
                while (true) {
                    try {
                        this.H0.f(true);
                        if (!this.H0.k.d()) {
                            this.H0.f(false);
                            if (qnp.a().c(this.H0.d)) {
                                this.G0.release();
                            }
                            return;
                        }
                        if (qnp.a().b(this.H0.d) && !this.b()) {
                            new a(this).a();
                            if (qnp.a().c(this.H0.d)) {
                                this.G0.release();
                            }
                            return;
                        }
                        if (this.c()) {
                            this.H0.f(false);
                        }
                        else {
                            this.H0.h(this.F0);
                        }
                        if (qnp.a().c(this.H0.d)) {
                            this.G0.release();
                        }
                    }
                    finally {
                        if (qnp.a().c(this.H0.d)) {
                            this.G0.release();
                        }
                        continue;
                    }
                    break;
                }
            }
            catch (final IOException ex) {}
        }
    }
    
    public static final class a extends BroadcastReceiver
    {
        public c5s a;
        
        public a(final c5s a) {
            this.a = a;
        }
        
        public final void a() {
            if (c5s.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.a.H0.d.registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        
        public final void onReceive(final Context context, final Intent intent) {
            final c5s a = this.a;
            if (a == null) {
                return;
            }
            if (!a.b()) {
                return;
            }
            if (c5s.a()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            final c5s a2 = this.a;
            a2.H0.b((Runnable)a2, 0L);
            this.a.H0.d.unregisterReceiver((BroadcastReceiver)this);
            this.a = null;
        }
    }
}
