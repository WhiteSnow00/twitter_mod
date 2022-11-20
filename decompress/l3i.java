import com.twitter.nft.subsystem.model.Web3Wallet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l3i extends enm<String, Web3Wallet, m3i>
{
    public l3i() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final String s = (String)o;
        czd.f((Object)s, "address");
        return (orc)new m3i(s);
    }
    
    public final Object d(final orc orc) {
        final m3i m3i = (m3i)orc;
        czd.f((Object)m3i, "request");
        final xrc t = ((orc)m3i).T();
        czd.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            czd.c(g);
            return g;
        }
        kbv kbv;
        if ((kbv = (kbv)t.h) == null) {
            kbv = new kbv(new hbv[] { new hbv(t.c) });
        }
        throw new IllegalStateException(kbv.toString());
    }
}
