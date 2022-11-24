import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r4m implements xqi
{
    public final elc a;
    public final dk8 b;
    public final teg c;
    public final tdi d;
    public final lqi e;
    public final zgv f;
    public final oqi g;
    
    public r4m(final elc a, final dk8 b, final teg c, final tdi d, final lqi e, final zgv f, final oqi g) {
        e0e.f((Object)a, "highPriorityMagicRecsChannelsProvider");
        e0e.f((Object)b, "defaultPriorityMagicRecsChannelsProvider");
        e0e.f((Object)c, "lowPriorityMagicRecsChannelsProvider");
        e0e.f((Object)d, "networkMagicRecsChannelsProvider");
        e0e.f((Object)e, "notificationChannelFeatures");
        e0e.f((Object)f, "twitterUserManager");
        e0e.f((Object)g, "notificationChannelUserCreatedAtRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final bbq<List<NotificationChannel>> a(final String s, final UserIdentifier userIdentifier, final iwi iwi) {
        e0e.f((Object)s, "groupId");
        e0e.f((Object)userIdentifier, "userIdentifier");
        e0e.f((Object)iwi, "accountSettings");
        final qdw g = this.f.g(userIdentifier);
        e0e.e((Object)g, "twitterUserManager.getUserInfo(userIdentifier)");
        final oqi g2 = this.g;
        final qgv user = g.getUser();
        e0e.e((Object)user, "userInfo.user");
        return (bbq<List<NotificationChannel>>)g2.b(user).p((rtb)new d6i((stb)new r4m$a(this, userIdentifier, s, iwi), 1));
    }
}
