import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i3i extends d2v<b4i>
{
    public static final a Companion;
    public final String j1;
    public final String k1;
    
    static {
        Companion = new a();
    }
    
    public i3i() {
        UserIdentifier.Companion.c();
        czd.f((Object)null, "address");
        throw null;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("web3_get_nft");
        a.p("erc721_address", (Object)this.j1);
        a.p("token_id", (Object)this.k1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<b4i, kbv> g0() {
        return (asc<b4i, kbv>)e7c.Companion.b(b4i.class, "web3_get_nft");
    }
    
    public static final class a
    {
    }
}
