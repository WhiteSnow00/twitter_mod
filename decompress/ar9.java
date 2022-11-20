// 
// Decompiled by Procyon v0.6.0
// 

public final class ar9 extends enm<br9, msm<u42, kbv>, zq9>
{
    public ar9() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final br9 br9 = (br9)o;
        czd.f((Object)br9, "args");
        return (orc)new zq9(br9.a, br9.b, br9.c);
    }
    
    public final Object d(final orc orc) {
        final zq9 zq9 = (zq9)orc;
        czd.f((Object)zq9, "request");
        final xrc t = ((orc)zq9).T();
        czd.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            if (g != null) {
                return msm.e(g);
            }
        }
        kbv kbv;
        if ((kbv = (kbv)t.h) == null) {
            kbv = new kbv(new hbv[] { new hbv(t.c) });
        }
        return msm.a((Object)kbv);
    }
}
