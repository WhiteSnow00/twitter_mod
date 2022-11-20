import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glf extends d2v<b4l>
{
    public glf() {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        super(c, 0);
    }
    
    public glf(UserIdentifier c, final int n, final rf8 rf8) {
        c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        super(c, 0);
    }
    
    public final tqc f0() {
        return (tqc)caa.f("list_product_subscriptions");
    }
    
    public final asc<b4l, kbv> g0() {
        return (asc<b4l, kbv>)e7c.Companion.b(b4l.class, "viewer");
    }
}
