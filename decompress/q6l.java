import com.twitter.app.common.args.ContentViewArgs;
import android.content.Intent;
import com.twitter.business.api.ModuleOverviewContentViewArgs;
import com.twitter.business.api.ModuleOverviewContentViewResult;
import android.content.Context;
import com.twitter.business.settings.overview.compose.SwitchAccountConfirmationBottomSheetDialogArgs;
import com.twitter.business.settings.overview.compose.SwitchAccountTypeBottomSheetDialogArgs;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q6l implements xlx<q7l, w5l, u5l>
{
    public static final q6l.q6l$a Companion;
    public final View F0;
    public final v2w G0;
    public final nn H0;
    public final lnh I0;
    public final vnd J0;
    public final znl<w5l.d> K0;
    public final gx8 L0;
    public final View M0;
    public final ViewGroup N0;
    public final ViewGroup O0;
    public final TextView P0;
    public final TextView Q0;
    public final SwitchCompat R0;
    public vhl S0;
    public final fih<q7l> T0;
    
    static {
        Companion = new q6l.q6l$a();
    }
    
    public q6l(final View f0, final v2w g0, final nn h0, final lnh i0, final vnd j0, final znl<w5l.d> k0, final gx8 l0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)g0, "updateCategoryFlowLauncher");
        e0e.f((Object)h0, "activityFinisher");
        e0e.f((Object)i0, "moduleOverviewScreenLauncher");
        e0e.f((Object)j0, "injectedFragmentActivity");
        e0e.f((Object)k0, "refreshDispatcher");
        e0e.f((Object)l0, "dialogOpener");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = f0.findViewById(2131427428);
        this.N0 = (ViewGroup)f0.findViewById(2131428139);
        final ViewGroup o0 = (ViewGroup)f0.findViewById(2131430112);
        this.O0 = o0;
        this.P0 = (TextView)f0.findViewById(2131430113);
        this.Q0 = (TextView)f0.findViewById(2131428137);
        final SwitchCompat r0 = (SwitchCompat)f0.findViewById(2131428140);
        this.R0 = r0;
        this.S0 = (vhl)((dob)j0).P().H("loading_dialog");
        e0e.e((Object)o0, "moduleRow");
        yru.E((View)o0, (ptb)t6l.F0);
        e0e.e((Object)r0, "categorySwitch");
        yru.E((View)r0, (ptb)new u6l(this));
        this.T0 = (fih<q7l>)ma7.S((stb)new q6l$f(this));
    }
    
    public final void T(final ccx ccx) {
        final q7l q7l = (q7l)ccx;
        e0e.f((Object)q7l, "state");
        this.T0.b((Object)q7l);
    }
    
    public final void r(final Object o) {
        final u5l u5l = (u5l)o;
        e0e.f((Object)u5l, "effect");
        if (u5l instanceof u5l$f) {
            this.L0.d((lw8)new SwitchAccountTypeBottomSheetDialogArgs(((u5l$f)u5l).a), (px8)px8$a.F0);
        }
        else if (u5l instanceof u5l$e) {
            this.L0.d((lw8)new SwitchAccountConfirmationBottomSheetDialogArgs(((u5l$e)u5l).a), (px8)px8$a.F0);
        }
        else if (u5l instanceof u5l$g) {
            ehk.c().c(((u5l$g)u5l).a, 0);
        }
        else if (e0e.a((Object)u5l, (Object)u5l$c.a)) {
            final v2w g0 = this.G0;
            final dej.a a = new dej.a((Context)g0.a);
            final fds.a a2 = new fds.a();
            a2.p("update_professional_category");
            a.d = (fds)a2.e();
            final Intent a3 = ((dej)a.e()).a();
            e0e.e((Object)a3, "Builder(activity)\n      \u2026ild()\n            .intent");
            g0.a.startActivityForResult(a3, 4838);
        }
        else if (u5l instanceof u5l$b) {
            this.H0.c((ho6)((u5l$b)u5l).a);
        }
        else if (u5l instanceof u5l$a) {
            this.H0.cancel();
        }
        else if (e0e.a((Object)u5l, (Object)u5l$d.a)) {
            final jo6<ContentViewArgs, ModuleOverviewContentViewResult> a4 = this.I0.a.a(ModuleOverviewContentViewResult.class);
            a4.d((Object)ModuleOverviewContentViewArgs.INSTANCE);
            final t5j map = a4.c().filter((ouk)new m7k((stb)r6l.F0, 6)).map((rtb)new rla((stb)s6l.F0, 20));
            e0e.e((Object)map, "moduleOverviewScreenLaun\u2026  .map { RefreshModules }");
            f.e(map, (xmr)this.K0, false);
        }
    }
    
    public final t5j<w5l> w() {
        final View m0 = this.M0;
        e0e.e((Object)m0, "switchAccountTypeButton");
        final t5j map = vq9.a(m0).map((rtb)new zj4((stb)q6l$b.F0, 23));
        final ViewGroup n0 = this.N0;
        e0e.e((Object)n0, "categoryRow");
        final t5j map2 = vq9.a((View)n0).map((rtb)new yj4((stb)q6l$c.F0, 23));
        final ViewGroup o0 = this.O0;
        e0e.e((Object)o0, "moduleRow");
        final t5j map3 = vq9.a((View)o0).map((rtb)new nav((stb)q6l$d.F0, 26));
        final SwitchCompat r0 = this.R0;
        e0e.e((Object)r0, "categorySwitch");
        final t5j merge = t5j.merge((Iterable)shw.y0((Object[])new t5j[] { map, map2, map3, too.f((View)r0).map((rtb)new mav((stb)new q6l$e(this), 20)), (t5j)this.K0 }));
        e0e.e((Object)merge, "override fun userIntentO\u2026ispatcher\n        )\n    )");
        return (t5j<w5l>)merge;
    }
}
