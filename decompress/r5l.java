import android.content.Intent;
import com.twitter.app.common.args.ContentViewArgs;
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

public final class r5l implements okx<r6l, x4l, v4l>
{
    public static final a Companion;
    public final View C0;
    public final s1w D0;
    public final kn E0;
    public final rmh F0;
    public final snd G0;
    public final zml<x4l$d> H0;
    public final qw8 I0;
    public final View J0;
    public final ViewGroup K0;
    public final ViewGroup L0;
    public final TextView M0;
    public final TextView N0;
    public final SwitchCompat O0;
    public xgl P0;
    public final mhh<r6l> Q0;
    
    static {
        Companion = new a();
    }
    
    public r5l(final View c0, final s1w d0, final kn e0, final rmh f0, final snd g0, final zml<x4l$d> h0, final qw8 i0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)d0, "updateCategoryFlowLauncher");
        zzd.f((Object)e0, "activityFinisher");
        zzd.f((Object)f0, "moduleOverviewScreenLauncher");
        zzd.f((Object)g0, "injectedFragmentActivity");
        zzd.f((Object)h0, "refreshDispatcher");
        zzd.f((Object)i0, "dialogOpener");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = c0.findViewById(2131427428);
        this.K0 = (ViewGroup)c0.findViewById(2131428139);
        final ViewGroup l0 = (ViewGroup)c0.findViewById(2131430109);
        this.L0 = l0;
        this.M0 = (TextView)c0.findViewById(2131430110);
        this.N0 = (TextView)c0.findViewById(2131428137);
        final SwitchCompat o0 = (SwitchCompat)c0.findViewById(2131428140);
        this.O0 = o0;
        this.P0 = (xgl)((gob)g0).Q().H("loading_dialog");
        zzd.e((Object)l0, "moduleRow");
        bqe.s((View)l0, (otb)u5l.C0);
        zzd.e((Object)o0, "categorySwitch");
        bqe.s((View)o0, (otb)new v5l(this));
        this.Q0 = (mhh<r6l>)ajy.a0((rtb)new r5l$f(this));
    }
    
    public final void T(final oax oax) {
        final r6l r6l = (r6l)oax;
        zzd.f((Object)r6l, "state");
        this.Q0.b((Object)r6l);
    }
    
    public final void s(final Object o) {
        final v4l v4l = (v4l)o;
        zzd.f((Object)v4l, "effect");
        if (v4l instanceof v4l.f) {
            this.I0.d((uv8)new SwitchAccountTypeBottomSheetDialogArgs(((v4l.f)v4l).a), (zw8)zw8$a.C0);
        }
        else if (v4l instanceof v4l.e) {
            this.I0.d((uv8)new SwitchAccountConfirmationBottomSheetDialogArgs(((v4l.e)v4l).a), (zw8)zw8$a.C0);
        }
        else if (v4l instanceof v4l.g) {
            p88.f().b(((v4l.g)v4l).a, 0);
        }
        else if (zzd.a((Object)v4l, (Object)v4l.c.a)) {
            final s1w d0 = this.D0;
            final ldj$a ldj$a = new ldj$a((Context)d0.a);
            final sbs$a sbs$a = new sbs$a();
            sbs$a.p("update_professional_category");
            ldj$a.d = (sbs)((h4j)sbs$a).e();
            final Intent a = ((ldj)((h4j)ldj$a).e()).a();
            zzd.e((Object)a, "Builder(activity)\n      \u2026ild()\n            .intent");
            d0.a.startActivityForResult(a, 4838);
        }
        else if (v4l instanceof v4l.b) {
            this.E0.c((vn6)((v4l.b)v4l).a);
        }
        else if (v4l instanceof v4l.a) {
            this.E0.cancel();
        }
        else if (zzd.a((Object)v4l, (Object)v4l.d.a)) {
            final xn6<ContentViewArgs, ModuleOverviewContentViewResult> a2 = this.F0.a.a(ModuleOverviewContentViewResult.class);
            a2.d((ContentViewArgs)ModuleOverviewContentViewArgs.INSTANCE);
            final b5j map = a2.c().filter((ptk)new vj4((rtb)s5l.C0, 5)).map((qtb)new tj4((rtb)t5l.C0, 22));
            zzd.e((Object)map, "moduleOverviewScreenLaun\u2026  .map { RefreshModules }");
            f.e(map, (hlr)this.H0, false);
        }
    }
    
    public final b5j<x4l> x() {
        final View j0 = this.J0;
        zzd.e((Object)j0, "switchAccountTypeButton");
        final b5j map = asy.q(j0).map((qtb)new yt1((rtb)r5l$b.C0, 27));
        final ViewGroup k0 = this.K0;
        zzd.e((Object)k0, "categoryRow");
        final b5j map2 = asy.q((View)k0).map((qtb)new mma((rtb)r5l$c.C0, 21));
        final ViewGroup l0 = this.L0;
        zzd.e((Object)l0, "moduleRow");
        final b5j map3 = asy.q((View)l0).map((qtb)new nma((rtb)r5l$d.C0, 26));
        final SwitchCompat o0 = this.O0;
        zzd.e((Object)o0, "categorySwitch");
        final b5j merge = b5j.merge((Iterable)tdy.v0((Object[])new b5j[] { map, map2, map3, kno.f((View)o0).map((qtb)new nla((rtb)new r5l$e(this), 17)), (b5j)this.H0 }));
        zzd.e((Object)merge, "override fun userIntentO\u2026ispatcher\n        )\n    )");
        return (b5j<x4l>)merge;
    }
    
    public static final class a
    {
    }
}
