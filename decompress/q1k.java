import android.os.BaseBundle;
import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.app.Activity;
import com.twitter.notification.push.dispatch.NotificationDispatchActivity;
import android.os.Parcelable;
import android.net.Uri;
import android.os.Build$VERSION;
import com.twitter.util.InvalidDataException;
import com.twitter.model.notification.NotificationSettingsLink;
import com.twitter.util.user.UserIdentifier;
import android.preference.PreferenceManager;
import android.content.Intent;
import java.util.Objects;
import android.os.Bundle;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q1k implements p1k
{
    public final Context a;
    public final ssi b;
    public final pfw<ah7> c;
    public final jfr d;
    public final scs e;
    
    public q1k(final Context a, final ssi b, final pfw<ah7> c, final jfr d, final scs e) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "intentFactory");
        czd.f((Object)c, "dmChatLauncher");
        czd.f((Object)d, "statusBarNotifFactory");
        czd.f((Object)e, "taskStackManagerUtility");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(Object o) {
        final lsi lsi = (lsi)o;
        czd.f((Object)lsi, "notificationInfo");
        final f2a d0 = f2a.D0;
        final dui dui = new dui((List)d0, "open");
        final dui dui2 = new dui((List)d0, "background_open");
        final Bundle bundle = new Bundle(6);
        Objects.requireNonNull(dui.Companion);
        final dui$b b = dui$b.b;
        dwj.k(bundle, "extra_scribe_info", (Object)dui, (rlp)b);
        dwj.k(bundle, "extra_scribe_info_background", (Object)dui2, (rlp)b);
        ((BaseBundle)bundle).putLong("sb_account_id", lsi.B.getId());
        dwj.k(bundle, "notification_info", (Object)lsi, (rlp)lsi.Z);
        final Context a = this.a;
        final Class b2 = this.d.b(lsi);
        Intent intent;
        if (czd.a((Object)b2, (Object)w8h.class) || czd.a((Object)b2, (Object)cs7.class) || czd.a((Object)b2, (Object)bw.class)) {
            final ah7 ah7 = (ah7)((zyr)this.c).get((Object)lsi.B);
            final Context a2 = this.a;
            final tj7$b tj7$b = new tj7$b();
            ((tj7$a)tj7$b).A(lsi.g);
            ((tj7$a)tj7$b).D(true);
            intent = ah7.e(a2, (tj7)((n4j)tj7$b).e());
        }
        else if (czd.a((Object)b2, (Object)cw.class)) {
            intent = this.b.e();
        }
        else {
            o = ((ypa)this.b).a((Object)lsi);
            czd.e(o, "{\n                intent\u2026cationInfo)\n            }");
            intent = (Intent)o;
        }
        final NotificationSettingsLink h = lsi.H;
        if (h != null) {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(a);
            final String type = h.type;
            final StringBuilder sb = new StringBuilder();
            sb.append("notif_settings_link_num_times_shown_");
            sb.append(type);
            final int int1 = defaultSharedPreferences.getInt(sb.toString(), 0);
            if (int1 >= 0 && int1 < 3) {
                NotificationSettingsLink copyWithText = h;
                if (UserIdentifier.Companion.b().size() > 1) {
                    final String l = ikr.l(lsi.d());
                    final String text = h.text;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(l);
                    sb2.append("\n");
                    sb2.append(text);
                    copyWithText = h.copyWithText(sb2.toString());
                }
                intent.putExtra("NotificationSettingsActivity_settings_link", klp.e((Object)copyWithText, NotificationSettingsLink.SERIALIZER));
            }
        }
        if (intent.resolveActivity(a.getPackageManager()) == null) {
            final Class b3 = this.d.b(lsi);
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unresolved activity for: ");
            sb3.append(b3);
            m8a.d((Throwable)new InvalidDataException(sb3.toString()));
        }
        final Intent putExtras = intent.putExtras(bundle);
        czd.e((Object)putExtras, "createContentIntent(cont\u2026onInfo).putExtras(bundle)");
        final int n = (int)lsi.a;
        int n2 = 268435456;
        if (Build$VERSION.SDK_INT >= 23) {
            n2 = 335544320;
        }
        putExtras.putExtra("ref_event", "notification::::open").putExtra("AbsFragmentActivity_intent_origin", q1k.class.getName()).setFlags(335544320);
        dwj.m(putExtras, "AbsFragmentActivity_account_user_identifier", lsi.B);
        o = nri.Companion;
        Objects.requireNonNull(o);
        final String j = lsi.j;
        boolean a3;
        try {
            a3 = czd.a((Object)Uri.parse(j).getPath(), (Object)"/i/view");
        }
        catch (final Exception ex) {
            a3 = false;
        }
        final boolean b4 = a3 || lsi.w == 74 || ((nri$a)o).b(lsi);
        o = new Intent();
        final UserIdentifier b5 = lsi.B;
        if (b5 != null) {
            ((Intent)o).putExtra("ActivityStarter_owner_id", b5.getId());
        }
        else {
            ((Intent)o).removeExtra("ActivityStarter_owner_id");
        }
        final int a4 = c5j.a;
        ((Intent)o).putExtra("arg_dispatch_intent", (Parcelable)putExtras);
        ((Intent)o).putExtra("arg_scribe_element", lsi.h);
        ((Intent)o).putExtra("arg_track_render_time", b4);
        final Intent intent2 = new NotificationDispatchActivity.a((Intent)o).toIntent(this.a, (Class<? extends Activity>)NotificationDispatchActivity.class);
        czd.e((Object)intent2, "Builder()\n            .s\u2026atchActivity::class.java)");
        final String i = lsi.j;
        String queryParameter;
        if (i == null) {
            queryParameter = null;
        }
        else {
            queryParameter = Uri.parse(i).getQueryParameter("tab");
        }
        final rcs a5 = this.e.a(this.a, intent2, queryParameter, putExtras);
        czd.e((Object)a5, "taskStackManagerUtility\n\u2026ntent, parameter, intent)");
        if (a5.l() > 0) {
            final Intent k = a5.j(0);
            if (k != null) {
                final Intent putExtra = k.putExtra("AbsFragmentActivity_intent_origin", q1k.class.getName());
                if (putExtra != null) {
                    putExtra.putExtra("sb_account_id", lsi.B.getId());
                }
            }
        }
        final Intent m = a5.j(0);
        if (m != null) {
            m.putExtra("extra_is_notification_status_bar_intent", true);
        }
        final PendingIntent m2 = a5.m(n, n2);
        czd.c((Object)m2);
        return m2;
    }
}
