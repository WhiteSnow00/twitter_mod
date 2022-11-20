// 
// Decompiled by Procyon v0.6.0
// 

public final class l37 extends enm<m37, msm<u42, kbv>, j37>
{
    public l37() {
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final m37 m37 = (m37)o;
        czd.f((Object)m37, "args");
        return (orc)new j37(m37.a, m37.b);
    }
    
    public final Object d(final orc orc) {
        final j37 j37 = (j37)orc;
        czd.f((Object)j37, "request");
        final xrc t = ((orc)j37).T();
        czd.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            if (g != null) {
                return msm.e((Object)g);
            }
        }
        kbv kbv;
        if ((kbv = (kbv)t.h) == null) {
            kbv = new kbv(new hbv[] { new hbv(t.c) });
        }
        return msm.a((Object)kbv);
    }
}
