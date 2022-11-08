import android.os.BaseBundle;
import android.annotation.SuppressLint;
import java.util.UUID;
import com.twitter.util.user.UserIdentifier;
import java.util.ArrayList;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.Set;
import java.util.HashSet;
import android.os.Parcelable;
import android.os.Build$VERSION;
import java.util.Random;
import android.net.Uri;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c49 implements dpi
{
    public final Context a;
    public final psc b;
    public final xvi c;
    public final cfw<th7> d;
    public final vpl e;
    
    public c49(final Context a, final psc b, final xvi c, final cfw<th7> d, final vpl e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(Object o, final Object o2) {
        final jsi jsi = (jsi)o;
        final cpi cpi = (cpi)o2;
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("dm_converastion_id", jsi.g);
        final String c = cpi.c;
        final String string = this.a.getString(2131952308);
        String s = c;
        if (c == null) {
            s = string;
        }
        final cui cui = new cui((List)Collections.emptyList(), "dm_reply");
        final Context a = this.a;
        final String j = fui.j;
        final int a2 = fpi.a;
        Objects.requireNonNull(gpi.Companion);
        final Intent putExtra = ((gpi)((v4j)jr0.Companion.a()).B((Class)gpi.class)).h8().setAction(j).setData(Uri.withAppendedPath(gfv$l.a, String.valueOf(jsi.a))).putExtra("sb_account_id", jsi.B.getId());
        yvj.c(putExtra, "notification_info", (Object)jsi, (alp)jsi.Z);
        final UserIdentifier b = jsi.B;
        int nextInt;
        if (w48.i(lri.Companion, b, "userIdentifier", b, "android_create_unique_notification_intents", false)) {
            nextInt = new Random().nextInt();
        }
        else {
            nextInt = 0;
        }
        final cui$b b2 = cui$b.b;
        yvj.c(putExtra, "extra_scribe_info", (Object)cui, (alp)b2);
        yvj.c(putExtra, "extra_scribe_info_background", (Object)cui, (alp)b2);
        putExtra.putExtras(bundle);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 24) {
            final th7 th7 = (th7)((hyr)this.d).get((Object)jsi.B);
            final Context a3 = this.a;
            final kk7$b kk7$b = new kk7$b();
            ((kk7$a)kk7$b).A(jsi.g);
            ((kk7$a)kk7$b).D(true);
            putExtra.putExtra("action_intent", (Parcelable)this.c.b(jsi, Boolean.FALSE, th7.e(a3, (kk7)((h4j)kk7$b).e()), cui));
        }
        final kcm kcm = new kcm("dm_text", (CharSequence)s, true, new Bundle(), (Set)new HashSet());
        int n;
        if (sdk_INT >= 31) {
            n = 301989888;
        }
        else {
            n = 268435456;
        }
        o = new iqi$a(2131231772, (CharSequence)s, PendingIntent.getService(a, nextInt, new Intent(putExtra), n));
        ((iqi$a)o).d = false;
        ((iqi$a)o).g = 1;
        if (((iqi$a)o).f == null) {
            ((iqi$a)o).f = new ArrayList();
        }
        ((iqi$a)o).f.add(kcm);
        return ((iqi$a)o).a();
    }
    
    @SuppressLint({ "CheckResult" })
    public final void b(final Context context, final UserIdentifier b, final Bundle bundle, final Intent intent) {
        final String string = ((BaseBundle)bundle).getString("dm_converastion_id");
        pf8.r(string);
        final Bundle b2 = kcm$a.b(intent);
        CharSequence charSequence;
        if (b2 == null) {
            charSequence = null;
        }
        else {
            charSequence = b2.getCharSequence("dm_text");
        }
        if (charSequence != null) {
            final zf4 zf4 = new zf4(b);
            zf4.q(new String[] { "messages:notifications:::send_dm" });
            saw.b((okm)zf4);
            final oei$a oei$a = new oei$a(context, u28.a(b).v2(), u28.a(b).s6(), u28.a(b).U1());
            oei$a.b = b;
            oei$a.f = string;
            oei$a.g = UUID.randomUUID().toString();
            oei$a.h = charSequence.toString();
            final oei oei = (oei)((h4j)oei$a).e();
            ((kmm)oei).z(true);
            final jsi b3 = oer.b(bundle);
            ((log)new zog((ubq)this.b.a((ksc)oei), (ptk)new zga(b3, b, 6))).p((fk6)new ky0((Object)this, (Object)b3, (Object)charSequence, 1), (fk6)jvb.e, (rj)jvb.c);
        }
    }
}
