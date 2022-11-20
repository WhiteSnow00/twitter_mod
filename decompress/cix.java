import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cix
{
    public static final long a;
    public static final Object b;
    public static bix c;
    
    static {
        a = TimeUnit.MINUTES.toMillis(1L);
        b = new Object();
    }
    
    public static ComponentName a(final Context context, final Intent intent) {
        synchronized (cix.b) {
            if (cix.c == null) {
                final bix bix = cix.c = new bix(context);
                synchronized (bix.a) {
                    bix.g = true;
                }
            }
            final boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            final ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                cix.c.a(cix.a);
            }
            return startService;
        }
    }
}
