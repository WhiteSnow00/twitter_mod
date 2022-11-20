// 
// Decompiled by Procyon v0.6.0
// 

public final class as8 extends enm<es8, msm<g42, kbv>, fs8>
{
    public as8() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final es8 es8 = (es8)o;
        czd.f((Object)es8, "args");
        return (orc)new fs8(es8.a);
    }
    
    public final Object d(final orc orc) {
        final fs8 fs8 = (fs8)orc;
        czd.f((Object)fs8, "request");
        final xrc t = ((orc)fs8).T();
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
