import java.util.Objects;
import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nb7 implements xqi
{
    public final Context a;
    public final lqi b;
    public final pq3 c;
    
    public nb7(final Context a, final lqi b, final pq3 c) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "notificationChannelFeatures");
        e0e.f((Object)c, "channelImportanceChecker");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final bbq<List<NotificationChannel>> a(final String s, final UserIdentifier userIdentifier, final iwi iwi) {
        e0e.f((Object)s, "groupId");
        e0e.f((Object)userIdentifier, "userIdentifier");
        e0e.f((Object)iwi, "accountSettings");
        final String packageName = this.a.getPackageName();
        final StringBuilder sb = new StringBuilder();
        sb.append("android.resource://");
        sb.append(packageName);
        sb.append("/");
        sb.append(2131886107);
        final String string = sb.toString();
        final ojf h = ojf.H();
        Objects.requireNonNull(this.b);
        if (ita.a(userIdentifier).b("android_notification_custom_sound_engagement_channel_enabled", false)) {
            h.p((Object)wqi.a(this.a, "engagement_sound", 2131952411, this.c.a(shw.x0((Object)b1b.p(s, "engagement")), 3), s, iwi.c(3, iwi, string)));
        }
        else {
            h.p((Object)wqi.a(this.a, "engagement_sound", 2131952411, this.c.a(shw.x0((Object)b1b.p(s, "engagement")), 2), s, iwi.c(3, iwi, string)));
        }
        h.r((Object[])new NotificationChannel[] { wqi.a(this.a, "people_sound", 2131952420, this.c.a(shw.x0((Object)b1b.p(s, "people")), 3), s, iwi.c(3, iwi, string)), wqi.a(this.a, "dms_sound", 2131952409, this.c.a(shw.x0((Object)b1b.p(s, "dms")), 4), s, iwi.c(4, iwi, string)), wqi.a(this.a, "emergency_alerts_sound", 2131952410, this.c.a(shw.x0((Object)b1b.p(s, "emergency_alerts")), 4), s, iwi.c(4, iwi, string)) });
        return (bbq<List<NotificationChannel>>)bbq.v(((z4j)h).e());
    }
}
