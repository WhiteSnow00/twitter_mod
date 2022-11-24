import java.util.Iterator;
import java.util.Objects;
import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jou implements xqi
{
    public final Context a;
    public final lqi b;
    public final pq3 c;
    
    public jou(final Context a, final lqi b, final pq3 c) {
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
        final ojf h = ojf.H();
        for (final String s2 : qqi.c) {
            e0e.e((Object)s2, "channel");
            h.p((Object)b1b.p(s, s2));
        }
        final List list = (List)((z4j)h).e();
        final ojf h2 = ojf.H();
        Objects.requireNonNull(this.b);
        if (ita.a(userIdentifier).b("android_enable_silent_tweet_notification_channel", false)) {
            h2.p((Object)wqi.a(this.a, "tweet_notifications_silent", 2131952424, this.c.a(list, 3), s, iwi.d()));
        }
        else {
            h2.p((Object)wqi.a(this.a, "tweet_notifications", 2131952424, this.c.a(list, 3), s, iwi.c(3, iwi, (String)null)));
        }
        return (bbq<List<NotificationChannel>>)bbq.v(((z4j)h2).e());
    }
}
