import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k3i extends d2v<d6i>
{
    public static final a Companion;
    public final String j1;
    public final String k1;
    public final boolean l1;
    public final teq m1;
    
    static {
        Companion = new a();
    }
    
    public k3i(final String j1, final String k1, final boolean l1, final teq m1) {
        super(nb0.x(UserIdentifier.Companion, j1, "address", "owner"), 0);
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
        this.m1 = m1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("web3_get_nfts");
        a.p("address", (Object)this.j1);
        a.o("collection_identifier", (Object)this.k1);
        a.p("count", (Object)asa.b().f("creator_nft_picker_nfts_page_size", 10));
        final boolean l1 = this.l1;
        Object b = null;
        if (l1) {
            final teq m1 = this.m1;
            b = b;
            if (m1 != null) {
                b = m1.b;
            }
        }
        a.o("cursor", b);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<d6i, kbv> g0() {
        return (asc<d6i, kbv>)e7c.Companion.b(d6i.class, "web3_get_nfts");
    }
    
    public static final class a
    {
    }
}
