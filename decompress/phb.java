import java.util.Objects;
import com.twitter.ui.user.UserView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phb extends ste implements qsb<Boolean, fzv>
{
    public final UserView D0;
    public final nhb E0;
    public final bo6 F0;
    public final cgv G0;
    
    public phb(final UserView d0, final nhb e0, final bo6 f0, final cgv g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Boolean b = (Boolean)o;
        czd.e((Object)b, "positiveClicked");
        if (b) {
            this.D0.E1 = true;
            final nhb e0 = this.E0;
            final bo6 f0 = this.F0;
            final cgv g0 = this.G0;
            Objects.requireNonNull(e0);
            czd.f((Object)f0, "contextualTweet");
            czd.f((Object)g0, "user");
            e0.c.a(f0, "follow_nudge", "unfollow", e0.e);
            final UserView a = e0.a;
            if (a != null) {
                a.setIsFollowing(false);
            }
            e0.e.k(g0.D0, 1);
        }
        return fzv.a;
    }
}
