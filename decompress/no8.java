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

public final class no8 implements mo8
{
    public final Context a;
    
    public no8(final Context a) {
        e0e.f((Object)a, "context");
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final bti bti = (bti)o;
        e0e.f((Object)bti, "notificationInfo");
        final Bundle bundle = new Bundle(5);
        final h3a f0 = h3a.F0;
        final uui uui = new uui((List<? extends d1p>)f0, "dismiss");
        Objects.requireNonNull(uui.Companion);
        final uui$b b = uui$b.b;
        swj.k(bundle, "extra_scribe_info", (Object)uui, (nmp)b);
        swj.k(bundle, "extra_scribe_info_background", (Object)new uui((List<? extends d1p>)f0, "background_dismiss"), (nmp)b);
        final Context a = this.a;
        final String k = xui.k;
        e0e.e((Object)k, "ACTION_DISMISS");
        ((BaseBundle)bundle).putLong("sb_account_id", bti.B.getId());
        swj.k(bundle, "notification_info", (Object)bti, (nmp)bti.Z);
        final Intent putExtras = new Intent(a, (Class)NotificationService.class).setAction(k).setData(Uri.withAppendedPath(pgv$l.a, String.valueOf(bti.a))).setPackage(m61.a).putExtras(bundle);
        e0e.e((Object)putExtras, "Intent(context, Notifica\u2026       .putExtras(bundle)");
        int n = 268435456;
        if (Build$VERSION.SDK_INT >= 23) {
            n = 335544320;
        }
        final PendingIntent service = PendingIntent.getService(a, 0, putExtras, n);
        e0e.e((Object)service, "getService(context, 0, intent, flags)");
        return service;
    }
}
