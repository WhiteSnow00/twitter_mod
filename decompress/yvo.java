import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yvo extends enm<yvo.yvo$a, tmi, zvo>
{
    public final UserIdentifier E0;
    
    public yvo(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final yvo.yvo$a yvo$a = (yvo.yvo$a)o;
        czd.f((Object)yvo$a, "args");
        return (orc)new zvo(yvo$a.a, this.E0);
    }
    
    public final Object d(final orc orc) {
        final zvo zvo = (zvo)orc;
        czd.f((Object)zvo, "request");
        final xrc t = ((orc)zvo).T();
        czd.e((Object)t, "request.result");
        if (t.b) {
            return tmi.a;
        }
        kbv kbv;
        if ((kbv = (kbv)t.h) == null) {
            kbv = new kbv(new hbv[] { new hbv(t.c) });
        }
        throw new IllegalStateException(kbv.toString());
    }
}
