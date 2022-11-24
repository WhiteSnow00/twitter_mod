import android.os.Bundle;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build$VERSION;
import android.os.Parcelable;
import java.util.Random;
import android.net.Uri;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.Collections;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class juu implements zpi
{
    public final Context a;
    public final gn b;
    public final pwi c;
    
    public juu(final Context a, final gn b, final pwi c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o, final Object o2) {
        final bti bti = (bti)o;
        final ypi ypi = (ypi)o2;
        final uui uui = new uui(Collections.emptyList(), "tweet_to");
        final gn b = this.b;
        final Context a = this.a;
        final f86 f86 = new f86();
        f86.t(UserIdentifier.fromId(bti.n.a.a));
        final StringBuilder sb = new StringBuilder();
        sb.append(flr.l(bti.n.b.b));
        sb.append(" ");
        f86.s(sb.toString(), null);
        int nextInt = 0;
        f86.q(false);
        final PendingIntent b2 = this.c.b(bti, Boolean.TRUE, b.a(a, (cn)f86), uui);
        final Context a2 = this.a;
        final String h = xui.h;
        final int a3 = bqi.a;
        Objects.requireNonNull(cqi.Companion);
        final Intent putExtra = ((cqi)((n5j)dr0.Companion.a()).B((Class)cqi.class)).h8().setAction(h).setData(Uri.withAppendedPath(pgv$l.a, String.valueOf(bti.a))).putExtra("sb_account_id", bti.B.getId());
        swj.c(putExtra, "notification_info", (Object)bti, (nmp)bti.Z);
        final UserIdentifier b3 = bti.B;
        if (mw.A(dsi.Companion, b3, "userIdentifier", b3, "android_create_unique_notification_intents", false)) {
            nextInt = new Random().nextInt();
        }
        final uui$b b4 = uui$b.b;
        swj.c(putExtra, "extra_scribe_info", (Object)uui, (nmp)b4);
        swj.c(putExtra, "extra_scribe_info_background", (Object)uui, (nmp)b4);
        putExtra.putExtra("action_intent", (Parcelable)b2);
        int n;
        if (Build$VERSION.SDK_INT >= 31) {
            n = 301989888;
        }
        else {
            n = 268435456;
        }
        final PendingIntent service = PendingIntent.getService(a2, nextInt, new Intent(putExtra), n);
        final String c = ypi.c;
        final String string = this.a.getString(2131955513);
        String s = c;
        if (c == null) {
            s = string;
        }
        return new cri(2131231770, (CharSequence)s, service);
    }
    
    public final void b(final Context context, final UserIdentifier userIdentifier, final Bundle bundle, final Intent intent) {
    }
}
