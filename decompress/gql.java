import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import com.twitter.notifications.settings.presenter.PushNotificationsSettingsContentViewProvider;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gql
{
    public final Context a;
    public final UserIdentifier b;
    public final bft c;
    public final psc d;
    public final avi e;
    public final uvi f;
    
    public gql(final Context a, final UserIdentifier b, final bft c, final psc d, final avi e, final uvi f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final hql hql, final boolean b, final boolean b2) {
        final boolean b3 = hql.d.b.isEmpty() ^ true;
        if (b) {
            if (b2) {
                final ayi ayi = new ayi(this.a, this.b, hql.b, (Map)hql.b(), this.e);
                ayi.u1 = this.c;
                this.d.f((ksc)ayi);
                saw.b((okm)new zf4(nca.f((ada)PushNotificationsSettingsContentViewProvider.p1, "", "", "enable_notifications")));
            }
            else {
                final byi byi = new byi(this.a, this.b);
                byi.j1 = this.c;
                this.d.f((ksc)byi);
                saw.b((okm)new zf4(nca.f((ada)PushNotificationsSettingsContentViewProvider.p1, "", "", "disable_notifications")));
            }
        }
        else if (b3) {
            final int ordinal = ((Enum)this.e).ordinal();
            hyi hyi;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    e9a.d((Throwable)new IllegalStateException("Invalid notification setting type"));
                    throw new IllegalStateException("Invalid notification setting type");
                }
                hyi = new hyi(this.a, this.b, (String)null, hql.b, (Map)null, (Map)hql.b(), false, true);
            }
            else {
                hyi = new hyi(this.a, this.b, hql.b, (String)null, (Map)hql.b(), (Map)null, true, false);
            }
            hyi.u1 = this.c;
            this.d.f((ksc)hyi);
        }
        final boolean b4 = hql.e.b.isEmpty() ^ true;
        if (b4) {
            xw0.c((rj)new fql((Object)this, (Object)hql, b2, 0));
        }
        if (b2 && (b4 || b3)) {
            for (final Map.Entry<String, V> entry : hql.a().entrySet()) {
                String s;
                if ((s = hql.c.get(entry.getKey())) == null) {
                    s = "";
                }
                final String s2 = (String)entry.getValue();
                final Pattern a = pjr.a;
                zzd.f((Object)s2, "<this>");
                final Pattern compile = Pattern.compile("(.)(\\p{Upper})");
                zzd.e((Object)compile, "compile(pattern)");
                final String replaceAll = compile.matcher(s2).replaceAll("$1_$2");
                zzd.e((Object)replaceAll, "nativePattern.matcher(in\u2026).replaceAll(replacement)");
                final Locale english = Locale.ENGLISH;
                saw.b((okm)new zf4(nca.f((ada)PushNotificationsSettingsContentViewProvider.p1, s, w88.q(english, "ENGLISH", replaceAll, english, "this as java.lang.String).toLowerCase(locale)"), "setting_changed")));
            }
        }
    }
}
