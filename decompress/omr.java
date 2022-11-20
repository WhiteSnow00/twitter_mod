import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class omr extends d2v<nwm>
{
    public static final omr.omr$a Companion;
    public final String j1;
    public final String k1;
    
    static {
        Companion = new omr.omr$a();
    }
    
    public omr(final UserIdentifier userIdentifier, final String j1, final String k1) {
        czd.f((Object)userIdentifier, "userIdentifier");
        czd.f((Object)j1, "revueAccountId");
        czd.f((Object)k1, "newsletterSource");
        super(userIdentifier, 0);
        this.j1 = j1;
        this.k1 = k1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("subscribe_to_revue_account");
        a.p("revue_account_id", (Object)this.j1);
        a.p("double_opt_in", (Object)Boolean.FALSE);
        a.p("via", (Object)this.k1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<nwm, kbv> g0() {
        return (asc<nwm, kbv>)e7c.Companion.b(nwm.class, "subscribe_to_revue_account");
    }
}
