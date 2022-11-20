import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g3i extends d2v<d1i>
{
    public static final g3i.g3i$a Companion;
    public final String j1;
    public final boolean k1;
    public final teq l1;
    
    static {
        Companion = new g3i.g3i$a();
    }
    
    public g3i(final String j1, final boolean k1, final teq l1) {
        super(nb0.x(UserIdentifier.Companion, j1, "address", "owner"), 0);
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("web3_get_nft_collections");
        a.p("address", (Object)this.j1);
        a.p("countCollection", (Object)asa.b().f("creator_nft_picker_nft_collections_page_size", 10));
        a.p("countNft", (Object)asa.b().f("creator_nft_picker_nfts_per_collections_page_size", 10));
        final boolean k1 = this.k1;
        Object b = null;
        if (k1) {
            final teq l1 = this.l1;
            b = b;
            if (l1 != null) {
                b = l1.b;
            }
        }
        a.o("cursor", b);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<d1i, kbv> g0() {
        return (asc<d1i, kbv>)e7c.Companion.b(d1i.class, "web3_get_nft_collections");
    }
}
