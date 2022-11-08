import java.util.concurrent.Callable;
import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import android.util.Log;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xsa
{
    public static final Object b;
    public static dqx c;
    public final Context a;
    
    static {
        b = new Object();
    }
    
    public xsa(final Context a) {
        this.a = a;
    }
    
    public static zas<Integer> a(Context c, final Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        Object b = xsa.b;
        synchronized (b) {
            if (xsa.c == null) {
                xsa.c = new dqx(c);
            }
            c = (Context)xsa.c;
            monitorexit(b);
            synchronized (c) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
                }
                b = new dqx$a(intent);
                final ScheduledExecutorService e0 = ((dqx)c).E0;
                ((dqx$a)b).b.a.v((Executor)e0, (ahj)new yga((Object)e0.schedule((Runnable)new p16(b, 6), 9000L, TimeUnit.MILLISECONDS), 4));
                ((dqx)c).F0.add(b);
                ((dqx)c).b();
                return (zas<Integer>)((dqx$a)b).b.a.k((Executor)v4a.E0, (zo6)vno.H0);
            }
        }
    }
    
    public final zas<Integer> b(final Intent intent) {
        final String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context a = this.a;
        final boolean a2 = kik.a();
        boolean b = true;
        final boolean b2 = a2 && a.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 0x10000000) == 0x0) {
            b = false;
        }
        zas zas;
        if (b2 && !b) {
            zas = a(a, intent);
        }
        else {
            final wsa c0 = wsa.C0;
            zas = zbs.c((Executor)c0, (Callable)new vsa(a, intent, 0)).m((Executor)c0, (zo6)new xno((Object)a, (Object)intent, 6));
        }
        return (zas<Integer>)zas;
    }
}
