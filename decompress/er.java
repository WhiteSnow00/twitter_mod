// 
// Decompiled by Procyon v0.6.0
// 

public final class er extends enm<fr, msm<g42, kbv>, cs>
{
    public er() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final fr fr = (fr)o;
        czd.f((Object)fr, "args");
        return (orc)new cs(fr.a, fr.b);
    }
    
    public final Object d(final orc orc) {
        final cs cs = (cs)orc;
        czd.f((Object)cs, "request");
        final xrc t = ((orc)cs).T();
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
