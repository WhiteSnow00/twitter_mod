import com.twitter.util.user.UserIdentifier;
import com.twitter.nft.subsystem.model.Web3Wallet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m3i extends d2v<Web3Wallet>
{
    public static final a Companion;
    public final String j1;
    
    static {
        Companion = new a();
    }
    
    public m3i(final String j1) {
        super(nb0.x(UserIdentifier.Companion, j1, "address", "owner"), 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("web3_wallet_by_address");
        a.p("address", (Object)this.j1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<Web3Wallet, kbv> g0() {
        return (asc<Web3Wallet, kbv>)e7c.Companion.b(Web3Wallet.class, "web3_wallet_by_address");
    }
    
    public static final class a
    {
    }
}
