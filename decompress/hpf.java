import android.view.View;
import java.util.List;
import android.view.ViewStub;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpf implements gra
{
    public final dtf a;
    public final jzw b;
    public final o69 c;
    public final iqf d;
    public final apf e;
    
    public hpf(final dtf a, final jzw b, final o69 c, final iqf d, final apf e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object a(final Object o) {
        final dtf a = this.a;
        final jzw b = this.b;
        final o69 c = this.c;
        final iqf d = this.d;
        final apf e = this.e;
        final ViewGroup viewGroup = (ViewGroup)o;
        e0e.f((Object)a, "$chromeFeatures");
        e0e.f((Object)b, "$videoDockController");
        e0e.f((Object)c, "$dockEventDispatcher");
        e0e.f((Object)d, "$stateCoordinator");
        e0e.f((Object)e, "$accessibilityUtils");
        e0e.f((Object)viewGroup, "viewGroup");
        final ojf h = ojf.H();
        h.p((Object)new n3g(viewGroup));
        if (ita.b().b("live_event_multi_video_auto_advance_dock_enabled", false)) {
            h.p((Object)new axf(b).f(viewGroup));
            final View viewById = ((View)viewGroup).findViewById(2131429832);
            e0e.e((Object)viewById, "viewGroup.findViewById(R\u2026event_video_auto_advance)");
            final zpf zpf = new zpf((ViewStub)viewById);
            final long h2 = ita.b().h("live_event_multi_video_auto_advance_transition_duration_seconds", 5L);
            final bxo j = iqs.j();
            e0e.e((Object)j, "mainThread()");
            h.p((Object)new xpf(zpf, c, new rpf(a, d), new fqf(h2, j, (gqf)zpf, e), b, new wyw((bn9)bn9.a)));
        }
        else {
            h.p((Object)new j69(b));
        }
        return new ha4((List)((z4j)h).e());
    }
}
