import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajw extends tnm<String, bjw, aaw>
{
    public final UserIdentifier G0;
    
    public ajw(final UserIdentifier g0) {
        e0e.f((Object)g0, "userIdentifier");
        super(null, 1, null);
        this.G0 = g0;
    }
    
    @Override
    public final osc c(final Object o) {
        final String s = (String)o;
        e0e.f((Object)s, "args");
        return (osc)new aaw(s, this.G0);
    }
    
    @Override
    public final Object d(final osc osc) {
        final aaw aaw = (aaw)osc;
        e0e.f((Object)aaw, "request");
        final xsc t = ((osc)aaw).T();
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
