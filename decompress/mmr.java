import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmr extends enm<mmr.mmr$a, nwm, omr>
{
    public final UserIdentifier E0;
    
    public mmr(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final mmr.mmr$a mmr$a = (mmr.mmr$a)o;
        czd.f((Object)mmr$a, "args");
        return (orc)new omr(this.E0, mmr$a.a, mmr$a.b);
    }
    
    public final Object d(final orc orc) {
        final omr omr = (omr)orc;
        czd.f((Object)omr, "request");
        final xrc t = ((orc)omr).T();
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
