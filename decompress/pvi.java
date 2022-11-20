import android.service.notification.StatusBarNotification;
import android.app.NotificationManager;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pvi
{
    public static boolean a(final Context context, final int n, final String s) {
        if (Build$VERSION.SDK_INT >= 23) {
            final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            if (notificationManager != null) {
                for (final StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                    if (statusBarNotification.getId() == n && statusBarNotification.getTag().equals(s)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
