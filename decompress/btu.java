import android.os.Bundle;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build$VERSION;
import android.os.Parcelable;
import java.util.Random;
import android.net.Uri;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.List;
import java.util.Collections;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btu implements dpi
{
    public final Context a;
    public final cn b;
    public final xvi c;
    
    public btu(final Context a, final cn b, final xvi c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o, final Object o2) {
        final jsi jsi = (jsi)o;
        final cpi cpi = (cpi)o2;
        final cui cui = new cui((List)Collections.emptyList(), "tweet_to");
        final cn b = this.b;
        final Context a = this.a;
        final o76 o3 = new o76();
        o3.t(UserIdentifier.fromId(jsi.n.a.a));
        final StringBuilder sb = new StringBuilder();
        sb.append(pjr.l(jsi.n.b.b));
        sb.append(" ");
        o3.s(sb.toString(), (int[])null);
        int nextInt = 0;
        o3.q(false);
        final PendingIntent b2 = this.c.b(jsi, Boolean.TRUE, b.a(a, (zm)o3), cui);
        final Context a2 = this.a;
        final String h = fui.h;
        final int a3 = fpi.a;
        Objects.requireNonNull(gpi.Companion);
        final Intent putExtra = ((gpi)((v4j)jr0.Companion.a()).B((Class)gpi.class)).h8().setAction(h).setData(Uri.withAppendedPath(gfv$l.a, String.valueOf(jsi.a))).putExtra("sb_account_id", jsi.B.getId());
        yvj.c(putExtra, "notification_info", (Object)jsi, (alp)jsi.Z);
        final UserIdentifier b3 = jsi.B;
        if (w48.i(lri.Companion, b3, "userIdentifier", b3, "android_create_unique_notification_intents", false)) {
            nextInt = new Random().nextInt();
        }
        final cui$b b4 = cui$b.b;
        yvj.c(putExtra, "extra_scribe_info", (Object)cui, (alp)b4);
        yvj.c(putExtra, "extra_scribe_info_background", (Object)cui, (alp)b4);
        putExtra.putExtra("action_intent", (Parcelable)b2);
        int n;
        if (Build$VERSION.SDK_INT >= 31) {
            n = 301989888;
        }
        else {
            n = 268435456;
        }
        final PendingIntent service = PendingIntent.getService(a2, nextInt, new Intent(putExtra), n);
        final String c = cpi.c;
        final String string = this.a.getString(2131955513);
        String s = c;
        if (c == null) {
            s = string;
        }
        return new iqi(2131231770, (CharSequence)s, service);
    }
    
    public final void b(final Context context, final UserIdentifier userIdentifier, final Bundle bundle, final Intent intent) {
    }
}
