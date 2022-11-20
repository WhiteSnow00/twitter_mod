import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q6k
{
    public q6k(final fql fql, final gwo gwo, final xbm xbm) {
        czd.f((Object)fql, "pushNotificationBroadcaster");
        czd.f((Object)gwo, "ioScheduler");
        czd.f((Object)xbm, "releaseCompletable");
        xbm.i((oj)new bl0(fql.a().subscribeOn(gwo).observeOn(gwo).filter((ytk)new vt1((qsb)q6k$a.D0, 18)).filter((ytk)new oyf((qsb)new qsb<lsi, Boolean>(this) {
            public final q6k D0;
            
            public final Object invoke(final Object o) {
                final lsi lsi = (lsi)o;
                czd.f((Object)lsi, "it");
                final q6k d0 = this.D0;
                final UserIdentifier b = lsi.B;
                Objects.requireNonNull(d0);
                return asa.a(b).b("android_upload_to_spud_on_push", false);
            }
        }, 20)).subscribe((lj6)new ayi((qsb)q6k$c.D0, 22)), 16));
    }
}
