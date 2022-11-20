import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8p extends enm<q8p.q8p$a, s8p, r8p>
{
    public final UserIdentifier E0;
    
    public q8p(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final q8p.q8p$a q8p$a = (q8p.q8p$a)o;
        czd.f((Object)q8p$a, "args");
        return (orc)new r8p(this.E0, q8p$a.a);
    }
    
    public final Object d(final orc orc) {
        final r8p r8p = (r8p)orc;
        czd.f((Object)r8p, "request");
        ((orc)r8p).T();
        final xrc t = ((orc)r8p).T();
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
