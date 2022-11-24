import android.view.View;
import java.util.List;
import java.util.Objects;
import tv.periscope.android.video.RTMPPublisher$RTMPPublishListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c5k implements rk6
{
    public final int F0;
    public final i5k G0;
    
    public c5k(final i5k g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        final int f0 = this.F0;
        boolean x2 = true;
        switch (f0) {
            default: {
                final i5k g0 = this.G0;
                final kni kni = (kni)o;
                final boolean x3 = g0.X2;
                final List j = g0.g1.j();
                final List i = g0.g1.i();
                if (i.size() + j.size() <= 0) {
                    x2 = false;
                }
                g0.X2 = x2;
                g0.q2 = null;
                if (!i.isEmpty()) {
                    final nq3 a = g0.Y1.a((String)i.get(0));
                    if (a != null) {
                        if (a.a.a().startsWith("mod-")) {
                            g0.q2 = g0.V0.getString(2131956146);
                        }
                        else {
                            g0.q2 = a.a.F0;
                        }
                    }
                }
                if (g0.C2 != null && x3 != g0.X2 && !g0.Z2) {
                    final StringBuilder f2 = ehk.f("Switching ");
                    String s;
                    if (g0.X2) {
                        s = "to";
                    }
                    else {
                        s = "from";
                    }
                    f2.append(s);
                    f2.append(" private");
                    t8g.a("PeriscopeBroadcaster", f2.toString());
                    ((fe)g0.I0).b("InitializingTime").c();
                    g0.g1.h((n5c)n5c$e.b);
                    g0.O0.g(g0.C2, (RTMPPublisher$RTMPPublishListener)g0, g0.X2);
                }
                else {
                    g0.K();
                }
                return;
            }
            case 0: {
                final i5k g2 = this.G0;
                final vvc$c vvc$c = (vvc$c)o;
                Objects.requireNonNull(g2);
                final int ordinal = ((Enum)vvc$c).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            g2.e2.n(g2.y2, g2.C2.d().a());
                        }
                    }
                    else {
                        g2.e2.s(g2.y2, g2.C2.d().a());
                    }
                }
                else {
                    final View u2 = g2.u2;
                    if (u2 != null && g2.z1.c(u2)) {
                        g2.z1.a();
                    }
                    g2.e2.E(g2.y2, g2.C2.d().a());
                }
            }
        }
    }
}
