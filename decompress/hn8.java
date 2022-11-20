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

public final class hn8 implements gn8
{
    public final Context a;
    
    public hn8(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final lsi lsi = (lsi)o;
        czd.f((Object)lsi, "notificationInfo");
        final Bundle bundle = new Bundle(5);
        final f2a d0 = f2a.D0;
        final dui dui = new dui((List)d0, "dismiss");
        Objects.requireNonNull(dui.Companion);
        final dui$b b = dui$b.b;
        dwj.k(bundle, "extra_scribe_info", (Object)dui, (rlp)b);
        dwj.k(bundle, "extra_scribe_info_background", (Object)new dui((List)d0, "background_dismiss"), (rlp)b);
        final Context a = this.a;
        final String k = gui.k;
        czd.e((Object)k, "ACTION_DISMISS");
        ((BaseBundle)bundle).putLong("sb_account_id", lsi.B.getId());
        dwj.k(bundle, "notification_info", (Object)lsi, (rlp)lsi.Z);
        final Intent putExtras = new Intent(a, (Class)NotificationService.class).setAction(k).setData(Uri.withAppendedPath(bgv$l.a, String.valueOf(lsi.a))).setPackage(f61.a).putExtras(bundle);
        czd.e((Object)putExtras, "Intent(context, Notifica\u2026       .putExtras(bundle)");
        int n = 268435456;
        if (Build$VERSION.SDK_INT >= 23) {
            n = 335544320;
        }
        final PendingIntent service = PendingIntent.getService(a, 0, putExtras, n);
        czd.e((Object)service, "getService(context, 0, intent, flags)");
        return service;
    }
}
