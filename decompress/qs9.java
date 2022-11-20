import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qs9 extends enm<qs9.qs9$a, tmi, xs9>
{
    public final UserIdentifier E0;
    
    public qs9(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final qs9.qs9$a qs9$a = (qs9.qs9$a)o;
        czd.f((Object)qs9$a, "args");
        return (orc)new xs9(this.E0, qs9$a.a);
    }
    
    public final Object d(final orc orc) {
        final xs9 xs9 = (xs9)orc;
        czd.f((Object)xs9, "request");
        final xrc t = ((orc)xs9).T();
        czd.e((Object)t, "request.result");
        if (jee.g0(t)) {
            return tmi.a;
        }
        kbv kbv;
        if ((kbv = (kbv)t.h) == null) {
            kbv = new kbv(new hbv[] { new hbv(t.c) });
        }
        throw new IllegalStateException(kbv.toString());
    }
}
