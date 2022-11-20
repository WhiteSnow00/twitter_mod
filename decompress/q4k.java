import android.view.View;
import java.util.List;
import java.util.Objects;
import tv.periscope.android.video.RTMPPublisher$RTMPPublishListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q4k implements lj6
{
    public final int D0;
    public final u4k E0;
    
    public q4k(final u4k e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void accept(final Object o) {
        final int d0 = this.D0;
        boolean v2 = true;
        switch (d0) {
            default: {
                final u4k e0 = this.E0;
                final tmi tmi = (tmi)o;
                final boolean v3 = e0.V2;
                final List j = e0.e1.j();
                final List i = e0.e1.i();
                if (i.size() + j.size() <= 0) {
                    v2 = false;
                }
                e0.V2 = v2;
                e0.o2 = null;
                if (!i.isEmpty()) {
                    final op3 a = e0.W1.a((String)i.get(0));
                    if (a != null) {
                        if (a.a.a().startsWith("mod-")) {
                            e0.o2 = e0.T0.getString(2131956146);
                        }
                        else {
                            e0.o2 = a.a.D0;
                        }
                    }
                }
                if (e0.A2 != null && v3 != e0.V2 && !e0.X2) {
                    final StringBuilder k = fu8.j("Switching ");
                    String s;
                    if (e0.V2) {
                        s = "to";
                    }
                    else {
                        s = "from";
                    }
                    k.append(s);
                    k.append(" private");
                    y7g.a("PeriscopeBroadcaster", k.toString());
                    ((ee)e0.G0).b("InitializingTime").c();
                    e0.e1.h((l4c)l4c$e.b);
                    e0.M0.g(e0.A2, (RTMPPublisher$RTMPPublishListener)e0, e0.V2);
                }
                else {
                    e0.K();
                }
                return;
            }
            case 0: {
                final u4k e2 = this.E0;
                final uuc$c uuc$c = (uuc$c)o;
                Objects.requireNonNull(e2);
                final int ordinal = ((Enum)uuc$c).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            e2.c2.n(e2.w2, e2.A2.d().a());
                        }
                    }
                    else {
                        e2.c2.s(e2.w2, e2.A2.d().a());
                    }
                }
                else {
                    final View s2 = e2.s2;
                    if (s2 != null && e2.x1.c(s2)) {
                        e2.x1.a();
                    }
                    e2.c2.E(e2.w2, e2.A2.d().a());
                }
            }
        }
    }
}
