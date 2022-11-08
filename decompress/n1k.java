import android.os.BaseBundle;
import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.app.Activity;
import com.twitter.notification.push.dispatch.NotificationDispatchActivity;
import com.twitter.notification.push.dispatch.NotificationDispatchActivity$a;
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

public final class n1k implements m1k
{
    public final Context a;
    public final qsi b;
    public final cfw<th7> c;
    public final per d;
    public final xbs e;
    
    public n1k(final Context a, final qsi b, final cfw<th7> c, final per d, final xbs e) {
        zzd.f((Object)a, "context");
        zzd.f((Object)b, "intentFactory");
        zzd.f((Object)c, "dmChatLauncher");
        zzd.f((Object)d, "statusBarNotifFactory");
        zzd.f((Object)e, "taskStackManagerUtility");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(Object o) {
        final jsi jsi = (jsi)o;
        zzd.f((Object)jsi, "notificationInfo");
        final v2a c0 = v2a.C0;
        final cui cui = new cui((List)c0, "open");
        final cui cui2 = new cui((List)c0, "background_open");
        final Bundle bundle = new Bundle(6);
        Objects.requireNonNull(cui.Companion);
        final cui$b b = cui$b.b;
        yvj.k(bundle, "extra_scribe_info", (Object)cui, (alp)b);
        yvj.k(bundle, "extra_scribe_info_background", (Object)cui2, (alp)b);
        ((BaseBundle)bundle).putLong("sb_account_id", jsi.B.getId());
        yvj.k(bundle, "notification_info", (Object)jsi, (alp)jsi.Z);
        final Context a = this.a;
        final Class b2 = this.d.b(jsi);
        Intent intent;
        if (zzd.a((Object)b2, (Object)u8h.class) || zzd.a((Object)b2, (Object)ss7.class) || zzd.a((Object)b2, (Object)bw.class)) {
            final th7 th7 = (th7)((hyr)this.c).get((Object)jsi.B);
            final Context a2 = this.a;
            final kk7$b kk7$b = new kk7$b();
            ((kk7$a)kk7$b).A(jsi.g);
            ((kk7$a)kk7$b).D(true);
            intent = th7.e(a2, (kk7)((h4j)kk7$b).e());
        }
        else if (zzd.a((Object)b2, (Object)cw.class)) {
            intent = this.b.e();
        }
        else {
            o = ((bra)this.b).a((Object)jsi);
            zzd.e(o, "{\n                intent\u2026cationInfo)\n            }");
            intent = (Intent)o;
        }
        final NotificationSettingsLink h = jsi.H;
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
                    final String l = pjr.l(jsi.d());
                    final String text = h.text;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(l);
                    sb2.append("\n");
                    sb2.append(text);
                    copyWithText = h.copyWithText(sb2.toString());
                }
                intent.putExtra("NotificationSettingsActivity_settings_link", tkp.e((Object)copyWithText, NotificationSettingsLink.SERIALIZER));
            }
        }
        if (intent.resolveActivity(a.getPackageManager()) == null) {
            final Class b3 = this.d.b(jsi);
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unresolved activity for: ");
            sb3.append(b3);
            e9a.d((Throwable)new InvalidDataException(sb3.toString()));
        }
        final Intent putExtras = intent.putExtras(bundle);
        zzd.e((Object)putExtras, "createContentIntent(cont\u2026onInfo).putExtras(bundle)");
        final int n = (int)jsi.a;
        int n2 = 268435456;
        if (Build$VERSION.SDK_INT >= 23) {
            n2 = 335544320;
        }
        putExtras.putExtra("ref_event", "notification::::open").putExtra("AbsFragmentActivity_intent_origin", n1k.class.getName()).setFlags(335544320);
        yvj.m(putExtras, "AbsFragmentActivity_account_user_identifier", jsi.B);
        o = lri.Companion;
        Objects.requireNonNull(o);
        final String j = jsi.j;
        boolean a3;
        try {
            a3 = zzd.a((Object)Uri.parse(j).getPath(), (Object)"/i/view");
        }
        catch (final Exception ex) {
            a3 = false;
        }
        final boolean b4 = a3 || jsi.w == 74 || ((lri.a)o).b(jsi);
        o = new Intent();
        final UserIdentifier b5 = jsi.B;
        if (b5 != null) {
            ((Intent)o).putExtra("ActivityStarter_owner_id", b5.getId());
        }
        else {
            ((Intent)o).removeExtra("ActivityStarter_owner_id");
        }
        final int a4 = w4j.a;
        ((Intent)o).putExtra("arg_dispatch_intent", (Parcelable)putExtras);
        ((Intent)o).putExtra("arg_scribe_element", jsi.h);
        ((Intent)o).putExtra("arg_track_render_time", b4);
        final Intent intent2 = ((dj1)new NotificationDispatchActivity$a((Intent)o)).toIntent(this.a, (Class<? extends Activity>)NotificationDispatchActivity.class);
        zzd.e((Object)intent2, "Builder()\n            .s\u2026atchActivity::class.java)");
        final String i = jsi.j;
        String queryParameter;
        if (i == null) {
            queryParameter = null;
        }
        else {
            queryParameter = Uri.parse(i).getQueryParameter("tab");
        }
        final wbs a5 = this.e.a(this.a, intent2, queryParameter, putExtras);
        zzd.e((Object)a5, "taskStackManagerUtility\n\u2026ntent, parameter, intent)");
        if (a5.l() > 0) {
            final Intent k = a5.j(0);
            if (k != null) {
                final Intent putExtra = k.putExtra("AbsFragmentActivity_intent_origin", n1k.class.getName());
                if (putExtra != null) {
                    putExtra.putExtra("sb_account_id", jsi.B.getId());
                }
            }
        }
        final Intent m = a5.j(0);
        if (m != null) {
            m.putExtra("extra_is_notification_status_bar_intent", true);
        }
        final PendingIntent m2 = a5.m(n, n2);
        zzd.c((Object)m2);
        return m2;
    }
}
