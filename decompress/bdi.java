import java.util.Objects;
import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdi implements hqi
{
    public final Context a;
    public final vpi b;
    public final qp3 c;
    
    public bdi(final Context a, final vpi b, final qp3 c) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "notificationChannelFeatures");
        czd.f((Object)c, "channelImportanceChecker");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final eaq<List<NotificationChannel>> a(final String s, final UserIdentifier userIdentifier, final rvi rvi) {
        czd.f((Object)s, "groupId");
        czd.f((Object)userIdentifier, "userIdentifier");
        czd.f((Object)rvi, "accountSettings");
        final List q = xjr.q(s);
        final List s2 = xjr.s(s);
        final Context a = this.a;
        Objects.requireNonNull(this.b);
        int a2;
        if (asa.a(userIdentifier).b("android_enable_in_and_out_of_magic_rec_channel_in_network_default_on_enabled", false)) {
            a2 = 4;
        }
        else {
            a2 = this.c.a(q, 4);
        }
        return (eaq<List<NotificationChannel>>)eaq.v((Object)s9i.s(gqi.a(a, "recommendations_in_network", 2131952413, a2, s, rvi.d()), gqi.a(this.a, "recommendations_out_of_network", 2131952419, this.c.a(q, 4), s, rvi.d()), gqi.a(this.a, "topics", 2131952423, this.c.a(s2, 2), s, rvi.d())));
    }
}
