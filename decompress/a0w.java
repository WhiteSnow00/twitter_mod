import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a0w extends enm<a0w.a0w$a, tmi, d0w>
{
    public final UserIdentifier E0;
    
    public a0w(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final a0w.a0w$a a0w$a = (a0w.a0w$a)o;
        czd.f((Object)a0w$a, "args");
        return (orc)new d0w(this.E0, a0w$a.a);
    }
    
    public final Object d(final orc orc) {
        final d0w d0w = (d0w)orc;
        czd.f((Object)d0w, "request");
        final xrc t = ((orc)d0w).T();
        final tmi tmi = (tmi)t.g;
        if (tmi == null) {
            kbv kbv;
            if ((kbv = (kbv)t.h) == null) {
                kbv = new kbv(new hbv[] { new hbv(t.c) });
            }
            throw new IllegalStateException(kbv.toString());
        }
        return tmi;
    }
}
