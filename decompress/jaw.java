// 
// Decompiled by Procyon v0.6.0
// 

public final class jaw extends enm<law, msm<rfw, kbv>, kaw>
{
    public jaw() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final law law = (law)o;
        czd.f((Object)law, "args");
        return (orc)new kaw(law.a, law.b);
    }
    
    public final Object d(final orc orc) {
        final kaw kaw = (kaw)orc;
        czd.f((Object)kaw, "request");
        final xrc t = ((orc)kaw).T();
        czd.e((Object)t, "request.result");
        msm msm;
        if (jee.g0(((orc)kaw).T())) {
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
