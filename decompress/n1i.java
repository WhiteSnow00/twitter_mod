import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n1i extends d2v<String>
{
    public static final n1i.n1i$a Companion;
    public final String j1;
    
    static {
        Companion = new n1i.n1i$a();
    }
    
    public n1i(final String j1) {
        super(nb0.x(UserIdentifier.Companion, j1, "address", "owner"), 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("web3_wallet_delete");
        a.p("address", (Object)this.j1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<String, kbv> g0() {
        return (asc<String, kbv>)e7c.Companion.b(String.class, "web3_wallet_delete");
    }
}
