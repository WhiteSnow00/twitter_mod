import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class stx extends omm<g7p, Boolean, ttx>
{
    public final UserIdentifier D0;
    
    public stx(final UserIdentifier d0) {
        this.D0 = d0;
    }
    
    public final ksc c(final Object o) {
        final g7p g7p = (g7p)o;
        final UserIdentifier d0 = this.D0;
        final g7p d2 = g7p.d;
        g7p g7p2 = g7p;
        if (g7p == null) {
            g7p2 = d2;
        }
        return (ksc)new ttx(d0, g7p2);
    }
    
    public final Object d(final ksc ksc) {
        return ((ksc)ksc).T().b;
    }
}
