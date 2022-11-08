import java.util.Objects;
import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zci implements dqi
{
    public final Context a;
    public final ppi b;
    public final iq3 c;
    
    public zci(final Context a, final ppi b, final iq3 c) {
        zzd.f((Object)a, "context");
        zzd.f((Object)b, "notificationChannelFeatures");
        zzd.f((Object)c, "channelImportanceChecker");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final n9q<List<NotificationChannel>> a(final String s, final UserIdentifier userIdentifier, final pvi pvi) {
        zzd.f((Object)s, "groupId");
        zzd.f((Object)userIdentifier, "userIdentifier");
        zzd.f((Object)pvi, "accountSettings");
        final List q = rqu.q(s);
        final List t = rqu.t(s);
        final Context a = this.a;
        Objects.requireNonNull(this.b);
        int a2;
        if (dta.a(userIdentifier).b("android_enable_in_and_out_of_magic_rec_channel_in_network_default_on_enabled", false)) {
            a2 = 4;
        }
        else {
            a2 = this.c.a(q, 4);
        }
        return (n9q<List<NotificationChannel>>)n9q.v((Object)tdy.v0((Object[])new NotificationChannel[] { cqi.a(a, "recommendations_in_network", 2131952414, a2, s, pvi.d()), cqi.a(this.a, "recommendations_out_of_network", 2131952420, this.c.a(q, 4), s, pvi.d()), cqi.a(this.a, "topics", 2131952424, this.c.a(t, 2), s, pvi.d()) }));
    }
}
