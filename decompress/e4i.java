import com.twitter.nft.subsystem.model.Web3Wallet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4i extends tnm<String, Web3Wallet, f4i>
{
    public e4i() {
        super(null, 1, null);
    }
    
    @Override
    public final osc c(final Object o) {
        final String s = (String)o;
        e0e.f((Object)s, "address");
        return (osc)new f4i(s);
    }
    
    @Override
    public final Object d(final osc osc) {
        final f4i f4i = (f4i)osc;
        e0e.f((Object)f4i, "request");
        final xsc t = ((osc)f4i).T();
        e0e.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            e0e.c(g);
            return g;
        }
        zbv zbv;
        if ((zbv = (zbv)t.h) == null) {
            zbv = new zbv(new wbv[] { new wbv(t.c) });
        }
        throw new IllegalStateException(zbv.toString());
    }
}
