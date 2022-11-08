import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elc implements dqi
{
    public final Context a;
    public final iq3 b;
    
    public elc(final Context a, final iq3 b) {
        zzd.f((Object)a, "context");
        zzd.f((Object)b, "channelImportanceChecker");
        this.a = a;
        this.b = b;
    }
    
    public final n9q<List<NotificationChannel>> a(final String s, final UserIdentifier userIdentifier, final pvi pvi) {
        zzd.f((Object)s, "groupId");
        zzd.f((Object)userIdentifier, "userIdentifier");
        zzd.f((Object)pvi, "accountSettings");
        return (n9q<List<NotificationChannel>>)n9q.v((Object)tdy.v0((Object[])new NotificationChannel[] { cqi.a(this.a, "recommendations_high_priority_2", 2131952422, this.b.a(rqu.q(s), 4), s, pvi.d()), cqi.a(this.a, "topics_high_priority", 2131952424, this.b.a(rqu.t(s), 4), s, pvi.d()) }));
    }
}
