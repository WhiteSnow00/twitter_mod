import com.twitter.narrowcast.feature.api.NarrowcastErrorBottomSheetArgs;
import com.twitter.narrowcast.feature.api.NarrowcastBottomSheetFragmentArgs;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewResult;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q7i implements mx9<p7i>
{
    public final yv8 D0;
    public final dn6<TrustedFriendsMembersContentViewArgs, TrustedFriendsMembersContentViewResult> E0;
    public final NarrowcastBottomSheetFragmentArgs F0;
    public final ifd G0;
    public final aw8 H0;
    
    public q7i(final yv8 d0, final dn6<TrustedFriendsMembersContentViewArgs, TrustedFriendsMembersContentViewResult> e0, final NarrowcastBottomSheetFragmentArgs f0, final ifd g0, final aw8 h0) {
        czd.f((Object)d0, "dialogNavigationDelegate");
        czd.f((Object)e0, "contentViewStarter");
        czd.f((Object)f0, "args");
        czd.f((Object)g0, "inAppMessageHandler");
        czd.f((Object)h0, "dialogOpener");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void q(final Object o) {
        final p7i p7i = (p7i)o;
        czd.f((Object)p7i, "effect");
        if (p7i instanceof p7i$a) {
            this.D0.E0();
        }
        else if (p7i instanceof p7i$b) {
            final dn6<TrustedFriendsMembersContentViewArgs, TrustedFriendsMembersContentViewResult> e0 = this.E0;
            final p7i$b p7i$b = (p7i$b)p7i;
            final long a = p7i$b.a;
            final boolean b = a == 0L;
            int n;
            if (p7i$b.b == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            e0.b((Object)new TrustedFriendsMembersContentViewArgs(a, b, n, k8u.E0), this.F0.getUserIdentifier());
        }
        else if (p7i instanceof p7i$d) {
            final w5s$a w5s$a = new w5s$a();
            w5s$a.e = (red$c)red$c$b.b;
            w5s$a.s(2131955304);
            w5s$a.r("");
            this.G0.a((dfd)((n4j)w5s$a).e());
        }
        else if (p7i instanceof p7i$c) {
            this.H0.d((fv8)new NarrowcastErrorBottomSheetArgs(((p7i$c)p7i).a), (kw8)kw8$a.D0);
        }
    }
}
