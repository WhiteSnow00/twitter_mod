import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dk8 implements xqi
{
    public final Context a;
    public final pq3 b;
    
    public dk8(final Context a, final pq3 b) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "channelImportanceChecker");
        this.a = a;
        this.b = b;
    }
    
    public final bbq<List<NotificationChannel>> a(final String s, final UserIdentifier userIdentifier, final iwi iwi) {
        e0e.f((Object)s, "groupId");
        e0e.f((Object)userIdentifier, "userIdentifier");
        e0e.f((Object)iwi, "accountSettings");
        return (bbq<List<NotificationChannel>>)bbq.v((Object)ojf.w((Object)wqi.a(this.a, "recommendations_default_priority_2", 2131952421, this.b.a(r1n.K(s), 3), s, iwi.d()), (Object[])new NotificationChannel[] { wqi.a(this.a, "topics_default_priority", 2131952423, this.b.a(r1n.L(s), 3), s, iwi.d()) }));
    }
}
