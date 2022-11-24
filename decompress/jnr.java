import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnr extends tnm<jnr.jnr$a, dxm, lnr>
{
    public final UserIdentifier G0;
    
    public jnr(final UserIdentifier g0) {
        e0e.f((Object)g0, "userIdentifier");
        super(null, 1, null);
        this.G0 = g0;
    }
    
    @Override
    public final osc c(final Object o) {
        final jnr.jnr$a jnr$a = (jnr.jnr$a)o;
        e0e.f((Object)jnr$a, "args");
        return (osc)new lnr(this.G0, jnr$a.a, jnr$a.b);
    }
    
    @Override
    public final Object d(final osc osc) {
        final lnr lnr = (lnr)osc;
        e0e.f((Object)lnr, "request");
        final xsc t = ((osc)lnr).T();
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
