import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import android.content.Intent;
import com.openback.receiver.OpenBackReceiver;
import android.content.Context;
import android.app.AlarmManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fw
{
    public final AlarmManager a;
    public final Context b;
    
    public fw(final Context b) {
        this.b = b;
        this.a = (AlarmManager)b.getSystemService("alarm");
    }
    
    @SuppressLint({ "UnspecifiedImmutableFlag" })
    public final void a() {
        try {
            final Intent intent = new Intent(this.b, (Class)OpenBackReceiver.class);
            intent.setAction("com.openback.action.MESSAGE_ALARM_CHECK");
            PendingIntent pendingIntent;
            if (Build$VERSION.SDK_INT >= 23) {
                pendingIntent = PendingIntent.getBroadcast(this.b, 0, intent, 335544320);
            }
            else {
                pendingIntent = PendingIntent.getBroadcast(this.b, 0, intent, 268435456);
            }
            this.a.cancel(pendingIntent);
            pendingIntent.cancel();
        }
        catch (final Exception ex) {}
    }
    
    @SuppressLint({ "MissingPermission" })
    public final void b(final long n) {
        this.a();
        try {
            final Intent intent = new Intent(this.b, (Class)OpenBackReceiver.class);
            intent.setAction("com.openback.action.MESSAGE_ALARM_CHECK");
            if (n > 0L && n > System.currentTimeMillis()) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 23) {
                    boolean canScheduleExactAlarms = true;
                    if (sdk_INT >= 31) {
                        canScheduleExactAlarms = this.a.canScheduleExactAlarms();
                    }
                    final PendingIntent broadcast = PendingIntent.getBroadcast(this.b, 0, intent, 201326592);
                    if (canScheduleExactAlarms) {
                        this.a.setExactAndAllowWhileIdle(0, n, broadcast);
                    }
                    else {
                        this.a.setAndAllowWhileIdle(0, n, broadcast);
                    }
                }
                else {
                    this.a.set(0, n, PendingIntent.getBroadcast(this.b, 0, intent, 134217728));
                }
            }
            else {
                this.b.sendBroadcast(intent);
            }
        }
        catch (final Exception ex) {}
    }
}
