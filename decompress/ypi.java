import java.util.Iterator;
import android.app.NotificationChannelGroup;
import java.util.Objects;
import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypi implements vpi
{
    public final gdv a;
    public final sri b;
    
    public ypi(final gdv a, final sri b) {
        this.b = b;
        this.a = a;
    }
    
    public static void b(final UserIdentifier userIdentifier, final String s) {
        final nca g = nca.g("notification", "", "channel", "list_checker", s);
        final xca a = xca.a();
        final zf4 zf4 = new zf4(g);
        zf4.A();
        a.b(userIdentifier, (okm)zf4);
    }
    
    public final n9q<fvj<List<NotificationChannel>, List<NotificationChannel>>> a(final ocw ocw) {
        final hfv user = ocw.getUser();
        final List<NotificationChannel> j = this.a.j();
        final String f = dml.F(user.f());
        final ijf h = ijf.H();
        Object d0;
        if (j.isEmpty()) {
            d0 = ced.D0;
            final int a = w4j.a;
        }
        else {
            for (final NotificationChannel notificationChannel : j) {
                if (notificationChannel.getGroup() != null && notificationChannel.getGroup().equals(f)) {
                    h.p((Object)notificationChannel);
                }
            }
            d0 = ((h4j)h).e();
        }
        final sri b = this.b;
        Objects.requireNonNull(b);
        final hfv user2 = ocw.getUser();
        zzd.e((Object)user2, "userInfo.user");
        Objects.requireNonNull(sri.Companion);
        final UserIdentifier f2 = ocw.getUser().f();
        zzd.e((Object)f2, "userInfo.user.userIdentifier");
        final String id = new NotificationChannelGroup(f2.getStringId(), (CharSequence)dml.G(ocw)).getId();
        final UserIdentifier f3 = user2.f();
        zzd.e((Object)f3, "user.userIdentifier");
        return (n9q<fvj<List<NotificationChannel>, List<NotificationChannel>>>)((n9q)new taq((ubq)b.b.c(f3).y(b.c), (qtb)new dzf((rtb)new tri(b, id, f3), 1))).w((qtb)new xpi((List)d0, user));
    }
}
