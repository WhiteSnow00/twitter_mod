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

public final class g2k implements f2k
{
    public final Context a;
    public final iti b;
    public final fgw<ci7> c;
    public final ggr d;
    public final kds e;
    
    public g2k(final Context a, final iti b, final fgw<ci7> c, final ggr d, final kds e) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "intentFactory");
        e0e.f((Object)c, "dmChatLauncher");
        e0e.f((Object)d, "statusBarNotifFactory");
        e0e.f((Object)e, "taskStackManagerUtility");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(Object o) {
        final bti bti = (bti)o;
        e0e.f((Object)bti, "notificationInfo");
        final h3a f0 = h3a.F0;
        final uui uui = new uui((List<? extends d1p>)f0, "open");
        final uui uui2 = new uui((List<? extends d1p>)f0, "background_open");
        final Bundle bundle = new Bundle(6);
        Objects.requireNonNull(uui.Companion);
        final uui$b b = uui$b.b;
        swj.k(bundle, "extra_scribe_info", (Object)uui, (nmp)b);
        swj.k(bundle, "extra_scribe_info_background", (Object)uui2, (nmp)b);
        ((BaseBundle)bundle).putLong("sb_account_id", bti.B.getId());
        swj.k(bundle, "notification_info", (Object)bti, (nmp)bti.Z);
        final Context a = this.a;
        final Class b2 = this.d.b(bti);
        Intent intent;
        if (e0e.a((Object)b2, (Object)n9h.class) || e0e.a((Object)b2, (Object)ft7.class) || e0e.a((Object)b2, (Object)bw.class)) {
            final ci7 ci7 = (ci7)((vzr)this.c).get((Object)bti.B);
            final Context a2 = this.a;
            final uk7$b uk7$b = new uk7$b();
            ((uk7$a)uk7$b).A(bti.g);
            ((uk7$a)uk7$b).D(true);
            intent = ci7.e(a2, (uk7)((z4j)uk7$b).e());
        }
        else if (e0e.a((Object)b2, (Object)cw.class)) {
            intent = this.b.e();
        }
        else {
            o = ((gra)this.b).a((Object)bti);
            e0e.e(o, "{\n                intent\u2026cationInfo)\n            }");
            intent = (Intent)o;
        }
        final NotificationSettingsLink h = bti.H;
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
                    final String l = flr.l(bti.d());
                    final String text = h.text;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(l);
                    sb2.append("\n");
                    sb2.append(text);
                    copyWithText = h.copyWithText(sb2.toString());
                }
                intent.putExtra("NotificationSettingsActivity_settings_link", gmp.e((Object)copyWithText, NotificationSettingsLink.SERIALIZER));
            }
        }
        if (intent.resolveActivity(a.getPackageManager()) == null) {
            final Class b3 = this.d.b(bti);
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unresolved activity for: ");
            sb3.append(b3);
            r9a.d((Throwable)new InvalidDataException(sb3.toString()));
        }
        final Intent putExtras = intent.putExtras(bundle);
        e0e.e((Object)putExtras, "createContentIntent(cont\u2026onInfo).putExtras(bundle)");
        final int n = (int)bti.a;
        int n2 = 268435456;
        if (Build$VERSION.SDK_INT >= 23) {
            n2 = 335544320;
        }
        putExtras.putExtra("ref_event", "notification::::open").putExtra("AbsFragmentActivity_intent_origin", g2k.class.getName()).setFlags(335544320);
        swj.m(putExtras, "AbsFragmentActivity_account_user_identifier", bti.B);
        o = dsi.Companion;
        Objects.requireNonNull(o);
        final String j = bti.j;
        boolean a3;
        try {
            a3 = e0e.a((Object)Uri.parse(j).getPath(), (Object)"/i/view");
        }
        catch (final Exception ex) {
            a3 = false;
        }
        final boolean b4 = a3 || bti.w == 74 || ((dsi.a)o).b(bti);
        o = new Intent();
        final UserIdentifier b5 = bti.B;
        if (b5 != null) {
            ((Intent)o).putExtra("ActivityStarter_owner_id", b5.getId());
        }
        else {
            ((Intent)o).removeExtra("ActivityStarter_owner_id");
        }
        final int a4 = o5j.a;
        ((Intent)o).putExtra("arg_dispatch_intent", (Parcelable)putExtras);
        ((Intent)o).putExtra("arg_scribe_element", bti.h);
        ((Intent)o).putExtra("arg_track_render_time", b4);
        final Intent intent2 = new NotificationDispatchActivity.a((Intent)o).toIntent(this.a, (Class<? extends Activity>)NotificationDispatchActivity.class);
        e0e.e((Object)intent2, "Builder()\n            .s\u2026atchActivity::class.java)");
        final String i = bti.j;
        String queryParameter;
        if (i == null) {
            queryParameter = null;
        }
        else {
            queryParameter = Uri.parse(i).getQueryParameter("tab");
        }
        final jds a5 = this.e.a(this.a, intent2, queryParameter, putExtras);
        e0e.e((Object)a5, "taskStackManagerUtility\n\u2026ntent, parameter, intent)");
        if (a5.k() > 0) {
            final Intent k = a5.j(0);
            if (k != null) {
                final Intent putExtra = k.putExtra("AbsFragmentActivity_intent_origin", g2k.class.getName());
                if (putExtra != null) {
                    putExtra.putExtra("sb_account_id", bti.B.getId());
                }
            }
        }
        final Intent m = a5.j(0);
        if (m != null) {
            m.putExtra("extra_is_notification_status_bar_intent", true);
        }
        final PendingIntent m2 = a5.m(n, n2);
        e0e.c((Object)m2);
        return m2;
    }
}
