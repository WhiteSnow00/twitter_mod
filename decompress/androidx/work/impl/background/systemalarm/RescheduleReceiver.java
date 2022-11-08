// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver$PendingResult;
import java.util.Objects;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class RescheduleReceiver extends BroadcastReceiver
{
    public static final String a;
    
    static {
        a = y9g.g("RescheduleReceiver");
    }
    
    public final void onReceive(final Context context, Intent intent) {
        final y9g e = y9g.e();
        final String a = RescheduleReceiver.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Received intent ");
        sb.append(intent);
        e.a(a, sb.toString());
        if (Build$VERSION.SDK_INT >= 23) {
            try {
                final irx i = irx.i(context);
                final BroadcastReceiver$PendingResult goAsync = this.goAsync();
                Objects.requireNonNull(i);
                synchronized (irx.m) {
                    i.i = goAsync;
                    if (i.h) {
                        goAsync.finish();
                        i.i = null;
                    }
                }
            }
            catch (final IllegalStateException ex) {
                y9g.e().d(RescheduleReceiver.a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", (Throwable)ex);
                return;
            }
        }
        final String g0 = androidx.work.impl.background.systemalarm.a.G0;
        intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        context.startService(intent);
    }
}
