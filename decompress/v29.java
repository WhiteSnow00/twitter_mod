import java.util.Iterator;
import java.util.List;
import android.app.NotificationManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.graphics.Bitmap;
import java.util.Objects;
import java.net.MalformedURLException;
import android.util.Log;
import java.net.URL;
import android.text.TextUtils;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import android.app.KeyguardManager;
import android.content.Context;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v29
{
    public final ExecutorService a;
    public final Context b;
    public final lui c;
    
    public v29(final Context b, final lui c, final ExecutorService a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        boolean b = false;
        Label_0109: {
            if (!((KeyguardManager)this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                final int myPid = Process.myPid();
                final List runningAppProcesses = ((ActivityManager)this.b.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                        if (activityManager$RunningAppProcessInfo.pid == myPid) {
                            if (activityManager$RunningAppProcessInfo.importance == 100) {
                                b = true;
                                break Label_0109;
                            }
                            break;
                        }
                    }
                }
            }
            b = false;
        }
        if (b) {
            return false;
        }
        final String e = this.c.e("gcm.n.image");
        g7d g7d = null;
        Label_0190: {
            if (!TextUtils.isEmpty((CharSequence)e)) {
                try {
                    g7d = new g7d(new URL(e));
                    break Label_0190;
                }
                catch (final MalformedURLException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Not downloading image, bad URL: ");
                    sb.append(e);
                    Log.w("FirebaseMessaging", sb.toString());
                }
            }
            g7d = null;
        }
        if (g7d != null) {
            final ExecutorService a = this.a;
            final rcs rcs = new rcs();
            g7d.G0 = a.submit((Runnable)new rcx((Object)g7d, (Object)rcs, 4));
            g7d.H0 = rcs.a;
        }
        final cy4$a a2 = cy4.a(this.b, this.c);
        final gri a3 = a2.a;
        if (g7d != null) {
            try {
                final c100 h0 = g7d.H0;
                Objects.requireNonNull(h0, "null reference");
                final Bitmap e2 = (Bitmap)mds.b((mcs)h0, 5L, TimeUnit.SECONDS);
                a3.j(e2);
                final eri eri = new eri();
                eri.e = e2;
                eri.f = null;
                eri.g = true;
                a3.m((lri)eri);
            }
            catch (final TimeoutException ex2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                g7d.close();
            }
            catch (final InterruptedException ex3) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                g7d.close();
                Thread.currentThread().interrupt();
            }
            catch (final ExecutionException ex4) {
                final StringBuilder f = ehk.f("Failed to download image: ");
                f.append(ex4.getCause());
                Log.w("FirebaseMessaging", f.toString());
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager)this.b.getSystemService("notification")).notify(a2.b, 0, a2.a.b());
        return true;
    }
}
