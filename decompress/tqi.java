import java.util.Iterator;
import android.app.NotificationChannelGroup;
import java.util.Objects;
import android.app.NotificationChannel;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tqi implements rqi
{
    public final pev a;
    public final ksi b;
    
    public tqi(final pev a, final ksi b) {
        this.b = b;
        this.a = a;
    }
    
    public static void b(final UserIdentifier userIdentifier, final String s) {
        final dda g = dda.g("notification", "", "channel", "list_checker", s);
        final nda a = nda.a();
        final fg4 fg4 = new fg4(g);
        ((o1p)fg4).A();
        a.b(userIdentifier, (tlm)fg4);
    }
    
    public final bbq<zvj<List<NotificationChannel>, List<NotificationChannel>>> a(final qdw qdw) {
        final qgv user = qdw.getUser();
        final List j = this.a.j();
        final String s = b1b.s(user.f());
        final ojf h = ojf.H();
        Object g0;
        if (j.isEmpty()) {
            g0 = ged.G0;
            final int a = o5j.a;
        }
        else {
            for (final NotificationChannel notificationChannel : j) {
                if (notificationChannel.getGroup() != null && notificationChannel.getGroup().equals(s)) {
                    h.p((Object)notificationChannel);
                }
            }
            g0 = ((z4j)h).e();
        }
        final ksi b = this.b;
        Objects.requireNonNull(b);
        final qgv user2 = qdw.getUser();
        e0e.e((Object)user2, "userInfo.user");
        Objects.requireNonNull(ksi.Companion);
        final UserIdentifier f = qdw.getUser().f();
        e0e.e((Object)f, "userInfo.user.userIdentifier");
        final String id = new NotificationChannelGroup(f.getStringId(), (CharSequence)b1b.t(qdw)).getId();
        final UserIdentifier f2 = user2.f();
        e0e.e((Object)f2, "user.userIdentifier");
        return (bbq<zvj<List<NotificationChannel>, List<NotificationChannel>>>)((bbq)new hcq((idq)b.b.c(f2).y(b.c), (rtb)new l5i((stb)new lsi(b, id, f2), 1))).w((rtb)new wbg(g0, user, 2));
    }
}
