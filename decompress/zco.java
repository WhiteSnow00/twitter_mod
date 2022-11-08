import com.twitter.util.user.UserIdentifier$Companion;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.superfollows.SuperFollowsSubscriptionContentViewArgs;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zco implements ay9<yco>
{
    public final mbi<?> C0;
    public final nw8 D0;
    
    public zco(final mbi<?> c0, final nw8 d0) {
        zzd.f((Object)c0, "navigator");
        zzd.f((Object)d0, "dialogNavigationDelegate");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void a(final yco yco) {
        zzd.f((Object)yco, "effect");
        if (yco instanceof yco$b) {
            final mbi<?> c0 = this.C0;
            final UserIdentifier$Companion companion = UserIdentifier.Companion;
            final yco$b yco$b = (yco$b)yco;
            final UserIdentifier a = companion.a(yco$b.a.a);
            final cwr a2 = yco$b.a;
            c0.b((ContentViewArgs)new SuperFollowsSubscriptionContentViewArgs(a, a2.b, a2.c, a2.d, a2.e));
        }
        else {
            if (!zzd.a((Object)yco, (Object)yco$a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.D0.E0();
        }
    }
}
