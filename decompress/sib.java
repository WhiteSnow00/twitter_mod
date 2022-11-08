import java.util.Objects;
import com.twitter.ui.user.UserView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sib extends gue implements rtb<Boolean, oyv>
{
    public final /* synthetic */ UserView C0;
    public final /* synthetic */ qib D0;
    public final /* synthetic */ vo6 E0;
    public final /* synthetic */ hfv F0;
    
    public sib(final UserView c0, final qib d0, final vo6 e0, final hfv f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Boolean b = (Boolean)o;
        zzd.e((Object)b, "positiveClicked");
        if (b) {
            this.C0.D1 = true;
            final qib d0 = this.D0;
            final vo6 e0 = this.E0;
            final hfv f0 = this.F0;
            Objects.requireNonNull(d0);
            zzd.f((Object)e0, "contextualTweet");
            zzd.f((Object)f0, "user");
            d0.c.a(e0, "follow_nudge", "unfollow", d0.e);
            final UserView a = d0.a;
            if (a != null) {
                a.setIsFollowing(false);
            }
            d0.e.k(f0.C0, 1);
        }
        return oyv.a;
    }
}
