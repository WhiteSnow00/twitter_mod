import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yi8 implements hqi
{
    public final Context a;
    public final qp3 b;
    
    public yi8(final Context a, final qp3 b) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "channelImportanceChecker");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final eaq<List<NotificationChannel>> a(final String s, final UserIdentifier userIdentifier, final rvi rvi) {
        czd.f((Object)s, "groupId");
        czd.f((Object)userIdentifier, "userIdentifier");
        czd.f((Object)rvi, "accountSettings");
        return (eaq<List<NotificationChannel>>)eaq.v((Object)rif.w((Object)gqi.a(this.a, "recommendations_default_priority_2", 2131952421, this.b.a(xjr.q(s), 3), s, rvi.d()), (Object[])new NotificationChannel[] { gqi.a(this.a, "topics_default_priority", 2131952423, this.b.a(xjr.s(s), 3), s, rvi.d()) }));
    }
}
