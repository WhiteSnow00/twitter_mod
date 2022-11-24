import com.twitter.util.user.UserIdentifier$Companion;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhp extends tnm
{
    public final int G0;
    
    public jhp(final int g0) {
        this.G0 = g0;
        super(null, 1, null);
    }
    
    @Override
    public final osc c(final Object o) {
        switch (this.G0) {
            default: {
                final String s = (String)o;
                e0e.f((Object)s, "profileUserId");
                return (osc)new mbw(s);
            }
            case 0: {
                final khp khp = (khp)o;
                e0e.f((Object)khp, "args");
                final cjw$a cjw$a = new cjw$a();
                cjw$a.a = khp.a;
                final int a = o5j.a;
                final UserIdentifier$Companion companion = UserIdentifier.Companion;
                cjw$a.b = companion.c();
                cjw$a.c = companion.c();
                cjw$a.d = pdw.d().c();
                cjw$a.e = true;
                return (osc)((z4j)cjw$a).e();
            }
        }
    }
    
    @Override
    public final Object d(final osc osc) {
        switch (this.G0) {
            default: {
                final mbw mbw = (mbw)osc;
                e0e.f((Object)mbw, "request");
                final xsc t = ((osc)mbw).T();
                e0e.e((Object)t, "request.result");
                btm btm;
                if (xli.w(((osc)mbw).T())) {
                    final Object g = t.g;
                    e0e.c(g);
                    btm = btm.e(g);
                }
                else {
                    zbv zbv;
                    if ((zbv = (zbv)t.h) == null) {
                        zbv = new zbv(new wbv[] { new wbv(t.c) });
                    }
                    btm = btm.a((Object)zbv);
                }
                return btm;
            }
            case 0: {
                final cjw cjw = (cjw)osc;
                e0e.f((Object)cjw, "request");
                final xsc t2 = ((osc)cjw).T();
                e0e.e((Object)t2, "request.result");
                btm btm2;
                if (xli.w(((osc)cjw).T())) {
                    final Object g2 = t2.g;
                    e0e.c(g2);
                    btm2 = btm.e(g2);
                }
                else {
                    zbv zbv2;
                    if ((zbv2 = (zbv)t2.h) == null) {
                        zbv2 = new zbv(new wbv[] { new wbv(t2.c) });
                    }
                    btm2 = btm.a((Object)zbv2);
                }
                return btm2;
            }
        }
    }
}
