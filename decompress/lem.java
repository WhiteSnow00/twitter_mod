// 
// Decompiled by Procyon v0.6.0
// 

public final class lem extends enm<mem, msm<tmi, kbv>, kem>
{
    public lem() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final mem mem = (mem)o;
        czd.f((Object)mem, "args");
        return (orc)new kem(mem.a, mem.b, mem.c);
    }
    
    public final Object d(final orc orc) {
        final kem kem = (kem)orc;
        czd.f((Object)kem, "request");
        final xrc t = ((orc)kem).T();
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
