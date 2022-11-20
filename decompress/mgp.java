import com.twitter.util.user.UserIdentifier$Companion;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgp extends enm
{
    public final int E0;
    
    public mgp(final int e0) {
        this.E0 = e0;
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        switch (this.E0) {
            default: {
                final String s = (String)o;
                czd.f((Object)s, "profileUserId");
                return (orc)new waw(s);
            }
            case 0: {
                final ngp ngp = (ngp)o;
                czd.f((Object)ngp, "args");
                final niw.a a = new niw.a();
                a.a = ngp.a;
                final int a2 = c5j.a;
                final UserIdentifier$Companion companion = UserIdentifier.Companion;
                a.b = companion.c();
                a.c = companion.c();
                a.d = zcw.d().c();
                a.e = true;
                return (orc)a.e();
            }
        }
    }
    
    public final Object d(final orc orc) {
        switch (this.E0) {
            default: {
                final waw waw = (waw)orc;
                czd.f((Object)waw, "request");
                final xrc t = ((orc)waw).T();
                czd.e((Object)t, "request.result");
                msm msm;
                if (jee.g0(((orc)waw).T())) {
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
            case 0: {
                final niw niw = (niw)orc;
                czd.f((Object)niw, "request");
                final xrc t2 = ((orc)niw).T();
                czd.e((Object)t2, "request.result");
                msm msm2;
                if (jee.g0(((orc)niw).T())) {
                    final Object g2 = t2.g;
                    czd.c(g2);
                    msm2 = msm.e(g2);
                }
                else {
                    kbv kbv2;
                    if ((kbv2 = (kbv)t2.h) == null) {
                        kbv2 = new kbv(new hbv[] { new hbv(t2.c) });
                    }
                    msm2 = msm.a((Object)kbv2);
                }
                return msm2;
            }
        }
    }
}
