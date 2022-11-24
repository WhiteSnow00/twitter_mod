import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htj extends tnm<p7c, btm<mtj, zbv>, ltj>
{
    public final UserIdentifier G0;
    
    public htj(final UserIdentifier g0) {
        e0e.f((Object)g0, "owner");
        super(null, 1, null);
        this.G0 = g0;
    }
    
    @Override
    public final osc c(final Object o) {
        final p7c p7c = (p7c)o;
        e0e.f((Object)p7c, "args");
        return (osc)new ltj(this.G0, p7c);
    }
    
    @Override
    public final Object d(final osc osc) {
        final ltj ltj = (ltj)osc;
        e0e.f((Object)ltj, "request");
        final xsc t = ((osc)ltj).T();
        e0e.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            if (g != null) {
                return btm.e(g);
            }
        }
        zbv g2;
        if ((g2 = (zbv)t.h) == null) {
            g2 = zbv.G0;
        }
        return btm.a((Object)g2);
    }
}
