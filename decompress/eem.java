// 
// Decompiled by Procyon v0.6.0
// 

public final class eem extends enm<fem, msm<g42, kbv>, afm>
{
    public eem() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final fem fem = (fem)o;
        czd.f((Object)fem, "args");
        return (orc)new afm(fem.a, fem.b);
    }
    
    public final Object d(final orc orc) {
        final afm afm = (afm)orc;
        czd.f((Object)afm, "request");
        final xrc t = ((orc)afm).T();
        czd.e((Object)t, "request.result");
        msm msm;
        if (t.b) {
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
