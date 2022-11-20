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

public final class uql
{
    public final Context a;
    public final UserIdentifier b;
    public final qft c;
    public final trc d;
    public final bvi e;
    public final vvi f;
    
    public uql(final Context a, final UserIdentifier b, final qft c, final trc d, final bvi e, final vvi f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final vql vql, final boolean b, final boolean b2) {
        final boolean b3 = vql.d.b.isEmpty() ^ true;
        if (b) {
            if (b2) {
                final gyi gyi = new gyi(this.a, this.b, vql.b, (Map)vql.b(), this.e);
                gyi.v1 = this.c;
                this.d.f((orc)gyi);
                cbw.b((elm)new af4(vba.f((ica)PushNotificationsSettingsContentViewProvider.q1, "", "", "enable_notifications")));
            }
            else {
                final hyi hyi = new hyi(this.a, this.b);
                hyi.k1 = this.c;
                this.d.f((orc)hyi);
                cbw.b((elm)new af4(vba.f((ica)PushNotificationsSettingsContentViewProvider.q1, "", "", "disable_notifications")));
            }
        }
        else if (b3) {
            final int ordinal = ((Enum)this.e).ordinal();
            nyi nyi;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    m8a.d((Throwable)new IllegalStateException("Invalid notification setting type"));
                    throw new IllegalStateException("Invalid notification setting type");
                }
                nyi = new nyi(this.a, this.b, (String)null, vql.b, (Map)null, (Map)vql.b(), false, true);
            }
            else {
                nyi = new nyi(this.a, this.b, vql.b, (String)null, (Map)vql.b(), (Map)null, true, false);
            }
            nyi.v1 = this.c;
            this.d.f((orc)nyi);
        }
        final boolean b4 = vql.e.b.isEmpty() ^ true;
        if (b4) {
            rw0.c((oj)new tql((Object)this, (Object)vql, b2, 0));
        }
        if (b2 && (b4 || b3)) {
            for (final Map.Entry<String, V> entry : vql.a().entrySet()) {
                String s;
                if ((s = vql.c.get(entry.getKey())) == null) {
                    s = "";
                }
                final String s2 = (String)entry.getValue();
                final Pattern a = ikr.a;
                czd.f((Object)s2, "<this>");
                final Pattern compile = Pattern.compile("(.)(\\p{Upper})");
                czd.e((Object)compile, "compile(pattern)");
                final String replaceAll = compile.matcher(s2).replaceAll("$1_$2");
                czd.e((Object)replaceAll, "nativePattern.matcher(in\u2026).replaceAll(replacement)");
                final Locale english = Locale.ENGLISH;
                cbw.b((elm)new af4(vba.f((ica)PushNotificationsSettingsContentViewProvider.q1, s, oqf.m(english, "ENGLISH", replaceAll, english, "this as java.lang.String).toLowerCase(locale)"), "setting_changed")));
            }
        }
    }
}
