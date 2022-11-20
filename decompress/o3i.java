import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o3i extends d2v<ulx>
{
    public o3i() {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        super(c, 0);
    }
    
    public o3i(UserIdentifier c, final int n, final rf8 rf8) {
        c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        super(c, 0);
    }
    
    public final tqc f0() {
        return (tqc)caa.f("web3_wallets");
    }
    
    public final asc<ulx, kbv> g0() {
        return (asc<ulx, kbv>)e7c.Companion.b(ulx.class, new String[0]);
    }
}
