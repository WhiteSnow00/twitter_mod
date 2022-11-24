import java.util.Objects;
import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wj8 implements xqi
{
    public final Context a;
    public final r4m b;
    public final jou c;
    public final nb7 d;
    public final lqi e;
    
    public wj8(final Context a, final r4m b, final jou c, final nb7 d, final lqi e) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "recommendationsChannelsProvider");
        e0e.f((Object)c, "tweetNotificationChannelsProvider");
        e0e.f((Object)d, "customSoundNotificationsChannelsProvider");
        e0e.f((Object)e, "notificationChannelFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final bbq<List<NotificationChannel>> a(final String s, final UserIdentifier userIdentifier, final iwi iwi) {
        e0e.f((Object)s, "groupId");
        e0e.f((Object)userIdentifier, "userIdentifier");
        e0e.f((Object)iwi, "accountSettings");
        Objects.requireNonNull(this.e);
        bbq bbq;
        if (ita.a(userIdentifier).b("android_notification_custom_sound_enabled", false)) {
            bbq = this.d.a(s, userIdentifier, iwi);
        }
        else {
            final ojf h = ojf.H();
            h.r((Object[])new NotificationChannel[] { wqi.a(this.a, "engagement", 2131952411, 2, s, iwi.c(2, iwi, (String)null)), wqi.a(this.a, "people", 2131952420, 3, s, iwi.c(3, iwi, (String)null)), wqi.a(this.a, "dms", 2131952409, 4, s, iwi.c(4, iwi, (String)null)), wqi.a(this.a, "emergency_alerts", 2131952410, 4, s, iwi.c(4, iwi, (String)null)) });
            bbq = bbq.v(((z4j)h).e());
        }
        final ojf h2 = ojf.H();
        h2.p((Object)wqi.a(this.a, "news", 2131952417, 2, s, iwi.c(2, iwi, (String)null)));
        if (ita.a(userIdentifier).b("android_audio_room_creation_enabled", false) || ita.a(userIdentifier).b("android_audio_room_fleets_consumption_enabled", false)) {
            h2.p((Object)wqi.a(this.a, "spaces", 2131952422, 2, s, iwi.c(2, iwi, (String)null)));
        }
        if (ita.a(userIdentifier).b("android_audio_tweets_consumption_enabled", false)) {
            h2.p((Object)wqi.a(this.a, "audio_tweet", 2131952408, 2, s, iwi.c(2, iwi, (String)null)));
        }
        Objects.requireNonNull(this.e);
        if (ita.a(userIdentifier).b("android_live_spaces_notification_channel_enabled", false)) {
            h2.p((Object)wqi.a(this.a, "live_spaces", 2131952414, 4, s, iwi.d()));
        }
        Objects.requireNonNull(this.e);
        if (ita.a(userIdentifier).b("android_ads_notification_channel_enabled", false)) {
            h2.p((Object)wqi.a(this.a, "ads", 2131952406, 4, s, iwi.d()));
        }
        Objects.requireNonNull(this.e);
        if (ita.a(userIdentifier).b("android_media_ingest_tweet_uploader_repo_enabled", false)) {
            h2.p((Object)wqi.a(this.a, "media_processing", 2131952415, 2, s, iwi.d()));
        }
        return (bbq<List<NotificationChannel>>)bbq.T(lvb.c((nub)new vj8((mub)wj8$a.F0)), new idq[] { (idq)bbq, (idq)bbq.v(((z4j)h2).e()), (idq)this.b.a(s, userIdentifier, iwi), (idq)this.c.a(s, userIdentifier, iwi) });
    }
}
