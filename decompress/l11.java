import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l11 extends enm<String, b31, a31>
{
    public final UserIdentifier E0;
    
    public l11(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final String s = (String)o;
        czd.f((Object)s, "args");
        return (orc)new a31(s, this.E0);
    }
    
    public final Object d(final orc orc) {
        final a31 a31 = (a31)orc;
        czd.f((Object)a31, "request");
        final xrc t = ((orc)a31).T();
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
