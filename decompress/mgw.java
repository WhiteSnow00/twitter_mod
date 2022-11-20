// 
// Decompiled by Procyon v0.6.0
// 

public final class mgw extends enm<String, msm<j9w, kbv>, ngw>
{
    public mgw() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final String s = (String)o;
        czd.f((Object)s, "profileUserId");
        return (orc)new ngw(s);
    }
    
    public final Object d(final orc orc) {
        final ngw ngw = (ngw)orc;
        czd.f((Object)ngw, "request");
        final xrc t = ((orc)ngw).T();
        czd.e((Object)t, "request.result");
        msm msm;
        if (jee.g0(((orc)ngw).T())) {
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
