import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class no9 extends tnm<r9, btm<mtj, zbv>, oo9>
{
    public final UserIdentifier G0;
    
    public no9(final UserIdentifier g0) {
        this.G0 = g0;
    }
    
    @Override
    public final bxo b() {
        return jxo.c();
    }
    
    @Override
    public final osc c(final Object o) {
        return (osc)new oo9(this.G0, (r9)o);
    }
    
    @Override
    public final Object d(final osc osc) {
        final xsc t = ((osc)osc).T();
        if (t.b) {
            final Object g = t.g;
            if (g != null) {
                return btm.e((Object)g);
            }
        }
        final zbv zbv = (zbv)t.h;
        final zbv g2 = zbv.G0;
        zbv zbv2;
        if ((zbv2 = zbv) == null) {
            zbv2 = g2;
        }
        return btm.a((Object)zbv2);
    }
}
