import java.util.concurrent.Callable;
import androidx.work.impl.WorkDatabase;
import android.content.Intent;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import androidx.work.impl.background.systemalarm.a;
import android.app.AlarmManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hw
{
    public static final String a;
    
    static {
        a = y9g.g("Alarms");
    }
    
    public static void a(final Context context, final wqx wqx, final int n) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final Intent c = androidx.work.impl.background.systemalarm.a.c(context, wqx);
        int n2;
        if (Build$VERSION.SDK_INT >= 23) {
            n2 = 603979776;
        }
        else {
            n2 = 536870912;
        }
        final PendingIntent service = PendingIntent.getService(context, n, c, n2);
        if (service != null && alarmManager != null) {
            final y9g e = y9g.e();
            final String a = hw.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Cancelling existing alarm with (workSpecId, systemId) (");
            sb.append(wqx);
            sb.append(", ");
            sb.append(n);
            sb.append(")");
            e.a(a, sb.toString());
            alarmManager.cancel(service);
        }
    }
    
    public static void b(final Context context, final irx irx, final wqx wqx, final long n) {
        final WorkDatabase c = irx.c;
        final b5s v = c.v();
        final a5s c2 = v.c(wqx);
        if (c2 != null) {
            a(context, wqx, c2.c);
            c(context, wqx, c2.c, n);
        }
        else {
            final ug3 ug3 = new ug3(c);
            final Object p4 = ((gcn)ug3.C0).p((Callable)new f5d((Object)ug3, 0));
            zzd.e(p4, "workDatabase.runInTransa\u2026ANAGER_ID_KEY)\n        })");
            final int intValue = ((Number)p4).intValue();
            v.d(new a5s(wqx.a, wqx.b, intValue));
            c(context, wqx, intValue, n);
        }
    }
    
    public static void c(final Context context, final wqx wqx, final int n, final long n2) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n3;
        if (Build$VERSION.SDK_INT >= 23) {
            n3 = 201326592;
        }
        else {
            n3 = 134217728;
        }
        final PendingIntent service = PendingIntent.getService(context, n, androidx.work.impl.background.systemalarm.a.c(context, wqx), n3);
        if (alarmManager != null) {
            hw.a.a(alarmManager, 0, n2, service);
        }
    }
    
    public static final class a
    {
        public static void a(final AlarmManager alarmManager, final int n, final long n2, final PendingIntent pendingIntent) {
            alarmManager.setExact(n, n2, pendingIntent);
        }
    }
}
