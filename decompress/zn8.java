import android.os.BaseBundle;
import android.app.PendingIntent;
import android.os.Build$VERSION;
import android.net.Uri;
import android.content.Intent;
import com.twitter.notification.push.NotificationService;
import java.util.Objects;
import java.util.List;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zn8 implements yn8
{
    public final Context a;
    
    public zn8(final Context a) {
        zzd.f((Object)a, "context");
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final jsi jsi = (jsi)o;
        zzd.f((Object)jsi, "notificationInfo");
        final Bundle bundle = new Bundle(5);
        final v2a c0 = v2a.C0;
        final cui cui = new cui((List)c0, "dismiss");
        Objects.requireNonNull(cui.Companion);
        final cui$b b = cui$b.b;
        yvj.k(bundle, "extra_scribe_info", (Object)cui, (alp)b);
        yvj.k(bundle, "extra_scribe_info_background", (Object)new cui((List)c0, "background_dismiss"), (alp)b);
        final Context a = this.a;
        final String k = fui.k;
        zzd.e((Object)k, "ACTION_DISMISS");
        ((BaseBundle)bundle).putLong("sb_account_id", jsi.B.getId());
        yvj.k(bundle, "notification_info", (Object)jsi, (alp)jsi.Z);
        final Intent putExtras = new Intent(a, (Class)NotificationService.class).setAction(k).setData(Uri.withAppendedPath(gfv$l.a, String.valueOf(jsi.a))).setPackage(l61.a).putExtras(bundle);
        zzd.e((Object)putExtras, "Intent(context, Notifica\u2026       .putExtras(bundle)");
        int n = 268435456;
        if (Build$VERSION.SDK_INT >= 23) {
            n = 335544320;
        }
        final PendingIntent service = PendingIntent.getService(a, 0, putExtras, n);
        zzd.e((Object)service, "getService(context, 0, intent, flags)");
        return service;
    }
}
