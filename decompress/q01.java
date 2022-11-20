import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q01 extends enm<q01.q01$a, y21, r01>
{
    public final UserIdentifier E0;
    
    public q01(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final q01.q01$a q01$a = (q01.q01$a)o;
        czd.f((Object)q01$a, "args");
        return (orc)new r01(q01$a.a, q01$a.b, this.E0);
    }
    
    public final Object d(final orc orc) {
        final r01 r01 = (r01)orc;
        czd.f((Object)r01, "request");
        final xrc t = ((orc)r01).T();
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
