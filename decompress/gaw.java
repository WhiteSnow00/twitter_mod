// 
// Decompiled by Procyon v0.6.0
// 

public final class gaw extends enm<iaw, msm<rfw, kbv>, haw>
{
    public gaw() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final iaw iaw = (iaw)o;
        czd.f((Object)iaw, "args");
        final ydf a = iaw.a;
        return (orc)new haw(a.a, a.b, iaw.b);
    }
    
    public final Object d(final orc orc) {
        final haw haw = (haw)orc;
        czd.f((Object)haw, "request");
        final xrc t = ((orc)haw).T();
        czd.e((Object)t, "request.result");
        msm msm;
        if (jee.g0(((orc)haw).T())) {
            final Object g = t.g;
            czd.c(g);
            msm = msm.e(g);
        }
        else {
            kbv kbv;
            if ((kbv = (kbv)t.h) == null) {
                kbv = new kbv(new hbv[] { new hbv(t.c) });
            }
            msm = msm.a((Object)kbv);
        }
        return msm;
    }
}
