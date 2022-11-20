import com.twitter.model.json.traffic.JsonRecommendations;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.util.TimeZone;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hp6 extends d2v<gp6>
{
    public static final a Companion;
    public final lvj<String, String> j1;
    public final n93<hp6> k1;
    public final fp6 l1;
    
    static {
        Companion = new a();
    }
    
    public hp6(final lvj<String, String> j1, final UserIdentifier userIdentifier, final n93<hp6> k1, final boolean b) {
        czd.f((Object)j1, "controlTowerParam");
        Label_0437: {
            if (!b) {
                break Label_0437;
            }
            final fp6.a companion = fp6.Companion;
            final TimeZone default1 = TimeZone.getDefault();
            czd.e((Object)default1, "getDefault()");
            final sbu d = sbu.d();
            czd.e((Object)d, "get()");
            final ydi f0 = ydi.F0;
            Object l1 = pwl.G0;
            final pwl e0 = pwl.E0;
            final ydi g0 = ydi.G0;
            ydi e2 = f0;
            while (true) {
                switch (ib0.E(ch6.f().c)) {
                    default:
                        Label_0173: {
                            if (sds.a().l()) {
                                e2 = f0;
                                break Label_0173;
                            }
                            e2 = ydi.E0;
                            break Label_0173;
                        }
                    case 19: {
                        l1 = e0;
                        break;
                    }
                    case 3:
                    case 17: {
                        e2 = g0;
                        break;
                    }
                    case 18: {
                        l1 = e0;
                        continue;
                    }
                    case 16: {
                        l1 = pwl.T0;
                        continue;
                    }
                    case 15: {
                        l1 = pwl.S0;
                        continue;
                    }
                    case 14: {
                        l1 = pwl.R0;
                        continue;
                    }
                    case 13: {
                        l1 = pwl.O0;
                        continue;
                    }
                    case 12: {
                        l1 = pwl.Q0;
                        continue;
                    }
                    case 11: {
                        l1 = pwl.K0;
                        continue;
                    }
                    case 10: {
                        l1 = pwl.J0;
                        continue;
                    }
                    case 9: {
                        l1 = pwl.I0;
                        continue;
                    }
                    case 8: {
                        l1 = pwl.P0;
                        continue;
                    }
                    case 7: {
                        l1 = pwl.N0;
                        continue;
                    }
                    case 6: {
                        l1 = pwl.M0;
                        continue;
                    }
                    case 5: {
                        l1 = pwl.L0;
                        continue;
                    }
                    case 4: {
                        l1 = pwl.H0;
                        continue;
                    }
                    case 2: {
                        l1 = pwl.F0;
                        continue;
                    }
                }
                break;
            }
            oci.d().f();
            sds.a().e();
            sds.a().f();
            sds.a().g();
            x1b.c().a();
            x1b.c().e();
            x1b.c().d();
            while (true) {
                try {
                    final lq a = np.a();
                    if (a != null) {
                        final boolean b2 = a.b;
                    }
                    oci.d().d.a();
                    Objects.requireNonNull(companion);
                    final m4s a2 = hq1.a;
                    l1 = new fp6(TimeUnit.MILLISECONDS.toMinutes(default1.getOffset(d.a())), e2, (pwl)l1);
                    while (true) {
                        super(userIdentifier, 0);
                        this.j1 = j1;
                        this.k1 = k1;
                        this.l1 = (fp6)l1;
                        return;
                        l1 = null;
                        continue;
                    }
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void C(final xrc<gp6, kbv> xrc) {
        czd.f((Object)xrc, "httpResult");
        czd.e((Object)lcv.a, "DEFAULT_HOST");
        Objects.requireNonNull(xwt.Companion);
        czd.c((Object)asa.b().l("traffic_control_tower_v2_request_path", "/1.1/traffic/recommendations.json"));
        this.k1.a((Object)this);
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        Objects.requireNonNull(xwt.Companion);
        final String l = asa.b().l("traffic_control_tower_v2_request_path", "/1.1/traffic/recommendations.json");
        czd.c((Object)l);
        ((tqc$a)mcv).n(l, "/");
        final int a = c5j.a;
        final int length = ((CharSequence)this.j1.D0).length();
        final int n = 1;
        if (length > 0) {
            int n2;
            if (((CharSequence)this.j1.E0).length() > 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                final lvj<String, String> j1 = this.j1;
                ((tqc$a)mcv).d((String)j1.D0, (String)j1.E0);
            }
        }
        final fp6 l2 = this.l1;
        if (l2 != null) {
            ((tqc$a)mcv).c("time_zone_offset_minutes", l2.a);
            ((tqc$a)mcv).c("network_status", (long)this.l1.b.D0);
            ((tqc$a)mcv).c("radio_status", (long)this.l1.c.D0);
        }
        return ((tqc$a)mcv).k();
    }
    
    public final asc<gp6, kbv> g0() {
        return (asc<gp6, kbv>)new v8g$d((Class)JsonRecommendations.class, (Class)kbv.class);
    }
    
    public static final class a
    {
    }
}
