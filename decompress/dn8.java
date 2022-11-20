// 
// Decompiled by Procyon v0.6.0
// 

public final class dn8 extends enm<en8, msm<tmi, kbv>, cn8>
{
    public dn8() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final en8 en8 = (en8)o;
        czd.f((Object)en8, "args");
        return (orc)new cn8(en8.a, en8.b);
    }
    
    public final Object d(final orc orc) {
        final cn8 cn8 = (cn8)orc;
        czd.f((Object)cn8, "request");
        final xrc t = ((orc)cn8).T();
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
