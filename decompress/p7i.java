import com.twitter.narrowcast.feature.api.NarrowcastErrorBottomSheetArgs;
import com.twitter.narrowcast.feature.api.NarrowcastBottomSheetFragmentArgs;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewResult;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7i implements ay9<o7i>
{
    public final nw8 C0;
    public final xn6<TrustedFriendsMembersContentViewArgs, TrustedFriendsMembersContentViewResult> D0;
    public final NarrowcastBottomSheetFragmentArgs E0;
    public final egd F0;
    public final qw8 G0;
    
    public p7i(final nw8 c0, final xn6<TrustedFriendsMembersContentViewArgs, TrustedFriendsMembersContentViewResult> d0, final NarrowcastBottomSheetFragmentArgs e0, final egd f0, final qw8 g0) {
        zzd.f((Object)c0, "dialogNavigationDelegate");
        zzd.f((Object)d0, "contentViewStarter");
        zzd.f((Object)e0, "args");
        zzd.f((Object)f0, "inAppMessageHandler");
        zzd.f((Object)g0, "dialogOpener");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void s(final Object o) {
        final o7i o7i = (o7i)o;
        zzd.f((Object)o7i, "effect");
        if (o7i instanceof o7i$a) {
            this.C0.E0();
        }
        else if (o7i instanceof o7i$b) {
            final xn6<TrustedFriendsMembersContentViewArgs, TrustedFriendsMembersContentViewResult> d0 = this.D0;
            final o7i$b o7i$b = (o7i$b)o7i;
            final long a = o7i$b.a;
            final boolean b = a == 0L;
            int n;
            if (o7i$b.b == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            d0.b(new TrustedFriendsMembersContentViewArgs(a, b, n, u7u.D0), this.E0.getUserIdentifier());
        }
        else if (o7i instanceof o7i$d) {
            final d5s$a d5s$a = new d5s$a();
            d5s$a.e = (nfd$c)nfd$c$b.b;
            d5s$a.s(2131955304);
            d5s$a.r("");
            this.F0.a((zfd)((h4j)d5s$a).e());
        }
        else if (o7i instanceof o7i$c) {
            this.G0.d((uv8)new NarrowcastErrorBottomSheetArgs(((o7i$c)o7i).a), (zw8)zw8$a.C0);
        }
    }
}
