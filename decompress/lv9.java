import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lv9 extends enm<lv9.lv9$a, tmi, sv9>
{
    public final UserIdentifier E0;
    
    public lv9(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final lv9.lv9$a lv9$a = (lv9.lv9$a)o;
        czd.f((Object)lv9$a, "args");
        return (orc)new sv9(this.E0, lv9$a.a);
    }
    
    public final Object d(final orc orc) {
        final sv9 sv9 = (sv9)orc;
        czd.f((Object)sv9, "request");
        final xrc t = ((orc)sv9).T();
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
