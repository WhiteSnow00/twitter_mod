// 
// Decompiled by Procyon v0.6.0
// 

public final class yr extends enm<zr, msm<tmi, kbv>, xr>
{
    public yr() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final zr zr = (zr)o;
        czd.f((Object)zr, "args");
        return (orc)new xr(zr.a, zr.b, zr.c);
    }
    
    public final Object d(final orc orc) {
        final xr xr = (xr)orc;
        czd.f((Object)xr, "request");
        final xrc t = ((orc)xr).T();
        czd.e((Object)t, "request.result");
        msm msm;
        if (t.b) {
            msm = msm.e((Object)tmi.a);
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
