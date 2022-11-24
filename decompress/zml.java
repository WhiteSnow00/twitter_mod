import android.content.SharedPreferences$Editor;
import android.app.NotificationManager;
import android.util.Log;
import android.os.Binder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zml
{
    public static void a(final Context context, final boolean b, final rcs rcs) {
        try {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                final StringBuilder sb = new StringBuilder();
                sb.append("error configuring notification delegate for package ");
                sb.append(context.getPackageName());
                Log.e("FirebaseMessaging", sb.toString());
            }
            else {
                Context applicationContext;
                if ((applicationContext = context.getApplicationContext()) == null) {
                    applicationContext = context;
                }
                final SharedPreferences$Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                final NotificationManager notificationManager = (NotificationManager)context.getSystemService((Class)NotificationManager.class);
                if (b) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                }
                else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String)null);
                }
            }
            rcs.d(null);
        }
        finally {
            rcs.d(null);
        }
    }
}
