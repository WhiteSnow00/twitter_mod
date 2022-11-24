import java.util.concurrent.TimeUnit;
import com.twitter.business.api.BusinessAddressContentViewResult;
import com.twitter.business.api.BusinessInfoContentViewResult;
import com.twitter.business.api.BusinessPhoneContentViewArgs;
import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.business.api.BusinessHoursContentViewArgs;
import com.twitter.business.api.BusinessAddressContentViewArgs;
import android.net.Uri;
import android.content.Context;
import java.util.ArrayList;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import com.twitter.business.model.hours.BusinessHoursData;
import com.twitter.business.model.address.BusinessAddressInfoData;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.TextView;
import androidx.fragment.app.p;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zx2 implements xlx<d03, nx2, lx2>
{
    public static final a Companion;
    public final View F0;
    public final hu2 G0;
    public final nw2 H0;
    public final c33 I0;
    public final k03 J0;
    public final e03 K0;
    public final e03 L0;
    public final ux2 M0;
    public final p N0;
    public final nn O0;
    public final fda<h5h> P0;
    public final lv2 Q0;
    public final t5j<nx2> R0;
    public final wta S0;
    public final ov2 T0;
    public final View U0;
    public final TextView V0;
    public final View W0;
    public final TextView X0;
    public final View Y0;
    public final TextView Z0;
    public final View a1;
    public final TextView b1;
    public final View c1;
    public final TextView d1;
    public final TextView e1;
    public final View f1;
    public vhl g1;
    public final View h1;
    public final SwitchCompat i1;
    public final TextView j1;
    public final TextView k1;
    public final uv1<noj<BusinessPhoneInfoData>> l1;
    public final uv1<BusinessAddressInfoData> m1;
    public final uv1<BusinessHoursData> n1;
    public final znl<nx2> o1;
    public final znl<nx2> p1;
    public final fih<d03> q1;
    
    static {
        Companion = new a();
    }
    
    public zx2(final View f0, final hu2 g0, final nw2 h0, final c33 i0, final k03 j0, final e03 k0, final e03 l0, final ux2 m0, final p n0, final nn o0, final fda<h5h> p15, final lv2 q0, final t5j<nx2> r0, final wta s0, final ov2 t0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)g0, "addressScreenStarter");
        e0e.f((Object)h0, "businessHoursScreenStarter");
        e0e.f((Object)i0, "businessPhoneScreenLauncher");
        e0e.f((Object)j0, "inputFieldScreenLauncher");
        e0e.f((Object)k0, "inputTextDispatcher");
        e0e.f((Object)l0, "inputTextActionDispatcher");
        e0e.f((Object)m0, "navigationConfigurator");
        e0e.f((Object)n0, "supportFragmentManager");
        e0e.f((Object)o0, "activityFinisher");
        e0e.f((Object)p15, "menuEventObservable");
        e0e.f((Object)q0, "businessDialogBuilder");
        e0e.f((Object)r0, "navigatorEvents");
        e0e.f((Object)s0, "featureSpotlightHalfSheetLauncher");
        e0e.f((Object)t0, "businessHalfSheetActionDispatcher");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p15;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        final View viewById = f0.findViewById(2131432648);
        this.U0 = viewById;
        final TextView textView = (TextView)viewById.findViewById(2131431165);
        this.V0 = (TextView)viewById.findViewById(2131431168);
        final View viewById2 = f0.findViewById(2131427572);
        this.W0 = viewById2;
        final TextView textView2 = (TextView)viewById2.findViewById(2131431165);
        this.X0 = (TextView)viewById2.findViewById(2131431168);
        final View viewById3 = f0.findViewById(2131429487);
        this.Y0 = viewById3;
        final TextView textView3 = (TextView)viewById3.findViewById(2131431165);
        this.Z0 = (TextView)viewById3.findViewById(2131431168);
        final View viewById4 = f0.findViewById(2131428910);
        this.a1 = viewById4;
        final TextView textView4 = (TextView)viewById4.findViewById(2131431165);
        this.b1 = (TextView)viewById4.findViewById(2131431168);
        final View viewById5 = f0.findViewById(2131430559);
        this.c1 = viewById5;
        final TextView textView5 = (TextView)viewById5.findViewById(2131431165);
        this.d1 = (TextView)viewById5.findViewById(2131431168);
        this.e1 = (TextView)f0.findViewById(2131428251);
        final TextView textView6 = (TextView)f0.findViewById(2131431382);
        this.f1 = f0.findViewById(2131430107);
        final ViewStub viewStub = (ViewStub)f0.findViewById(2131430109);
        final ViewStub viewStub2 = (ViewStub)f0.findViewById(2131430111);
        this.h1 = f0.findViewById(2131428703);
        this.i1 = (SwitchCompat)f0.findViewById(2131428704);
        this.j1 = (TextView)f0.findViewById(2131428705);
        final TextView k2 = (TextView)f0.findViewById(2131429350);
        this.k1 = k2;
        final uv1 l2 = new uv1();
        this.l1 = (uv1<noj<BusinessPhoneInfoData>>)l2;
        final uv1 m2 = new uv1();
        this.m1 = (uv1<BusinessAddressInfoData>)m2;
        final uv1 n2 = new uv1();
        this.n1 = (uv1<BusinessHoursData>)n2;
        this.o1 = (znl<nx2>)new znl();
        this.p1 = (znl<nx2>)new znl();
        this.q1 = (fih<d03>)ma7.S((stb)new zx2$p(this));
        textView.setText((CharSequence)this.a(2131959627));
        textView2.setText((CharSequence)this.a(2131951884));
        textView3.setText((CharSequence)this.a(2131954339));
        textView4.setText((CharSequence)this.a(2131953794));
        textView5.setText((CharSequence)this.a(2131955699));
        e0e.e((Object)textView6, "settingsHeaderView");
        u4l.a((View)textView6);
        c1r.c(k2);
        final Context context = f0.getContext();
        e0e.e((Object)context, "rootView.context");
        final String a = this.a(2131954234);
        final View$OnClickListener[] array = new View$OnClickListener[2];
        final cqf cqf = new cqf((Object)this, 13);
        int n3 = 0;
        array[0] = (View$OnClickListener)cqf;
        array[1] = (View$OnClickListener)new d1x((Object)this, 17);
        final int b = b1b.B(context, 2130969074);
        final int b2 = b1b.B(context, 2130969104);
        final ArrayList list = new ArrayList<bjf$a>(array.length);
        while (n3 < array.length) {
            list.add(new bjf$a(b, b2, array[n3]));
            ++n3;
        }
        final gf4[] array2 = list.toArray(new gf4[0]);
        e0e.d((Object)array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        k2.setText((CharSequence)eg8.a0(array2, a, "{{}}"));
        this.g1 = (vhl)n0.H("loading_dialog");
        final t5j map = g0.a.c().filter((ouk)new ak4((stb)fy2.F0, 3)).map((rtb)new zj4((stb)gy2.F0, 14));
        e0e.e((Object)map, "addressScreenStarter.suc\u2026  .map { it.addressData }");
        f.e(map, (xmr)m2, false);
        final e39 e39;
        e39.c(j0.a().doOnComplete((sj)new dy2(e39 = new e39())).subscribe((rk6)new f$x((stb)new ey2(this))));
        final t5j map2 = h0.a.c().map((rtb)new yj4((stb)hy2.F0, 18));
        e0e.e((Object)map2, "businessHoursScreenStart\u2026ccess().map { it.result }");
        f.e(map2, (xmr)n2, false);
        final t5j map3 = i0.a.c().map((rtb)new nav((stb)iy2.F0, 19));
        e0e.e((Object)map3, "businessPhoneScreenLaunc\u2026lable(it.phoneInfoData) }");
        f.e(map3, (xmr)l2, false);
        ViewStub viewStub3;
        if (c5l.Companion.b()) {
            viewStub3 = viewStub2;
        }
        else {
            viewStub3 = viewStub;
        }
        viewStub3.inflate();
    }
    
    public final void T(final ccx ccx) {
        final d03 d03 = (d03)ccx;
        e0e.f((Object)d03, "state");
        this.q1.b((Object)d03);
    }
    
    public final String a(final int n) {
        final String string = this.F0.getContext().getString(n);
        e0e.e((Object)string, "rootView.context.getString(id)");
        return string;
    }
    
    public final void b(final String s) {
        final Context context = this.F0.getContext();
        e0e.e((Object)context, "rootView.context");
        final Uri parse = Uri.parse(s);
        e0e.e((Object)parse, "parse(this)");
        p70.p(context, parse);
    }
    
    public final void r(final Object o) {
        final lx2 lx2 = (lx2)o;
        e0e.f((Object)lx2, "effect");
        if (lx2 instanceof lx2$b) {
            final hu2 g0 = this.G0;
            final BusinessAddressInfoData a = ((lx2$b)lx2).a;
            final jo6<BusinessAddressContentViewArgs, BusinessAddressContentViewResult> a2 = g0.a;
            BusinessAddressContentViewArgs businessAddressContentViewArgs;
            if (a == null) {
                businessAddressContentViewArgs = new BusinessAddressContentViewArgs(null, 1, null);
            }
            else {
                businessAddressContentViewArgs = new BusinessAddressContentViewArgs(a);
            }
            a2.d((Object)businessAddressContentViewArgs);
        }
        else if (lx2 instanceof lx2$e) {
            final nw2 h0 = this.H0;
            final BusinessHoursData a3 = ((lx2$e)lx2).a;
            final jo6 a4 = h0.a;
            BusinessHoursContentViewArgs businessHoursContentViewArgs;
            if (a3 == null) {
                businessHoursContentViewArgs = new BusinessHoursContentViewArgs(null, 1, null);
            }
            else {
                businessHoursContentViewArgs = new BusinessHoursContentViewArgs(a3);
            }
            a4.d((Object)businessHoursContentViewArgs);
        }
        else if (lx2 instanceof lx2$c) {
            final k03 j0 = this.J0;
            final lx2$c lx2$c = (lx2$c)lx2;
            j0.b(lx2$c.a, lx2$c.b, (CountryIso)null);
        }
        else if (lx2 instanceof lx2$f) {
            this.I0.a.d((Object)new BusinessPhoneContentViewArgs(((lx2$f)lx2).a));
        }
        else if (e0e.a((Object)lx2, (Object)lx2$g.a)) {
            final lv2 q0 = this.Q0;
            final ay2 ay2 = new ay2(this);
            final by2 by2 = new by2(this);
            final Context context = this.F0.getContext();
            e0e.e((Object)context, "rootView.context");
            q0.a(2131953063, (ptb)ay2, (ptb)by2, context);
        }
        else if (lx2 instanceof lx2$i) {
            ehk.c().c(((lx2$i)lx2).a, 0);
        }
        else if (lx2 instanceof lx2$a) {
            final nn o2 = this.O0;
            final lx2$a lx2$a = (lx2$a)lx2;
            o2.c((ho6)new BusinessInfoContentViewResult(lx2$a.a, lx2$a.b));
        }
        else if (e0e.a((Object)lx2, (Object)lx2$h.a)) {
            final lv2 q2 = this.Q0;
            final cy2 cy2 = new cy2(this);
            final Context context2 = this.F0.getContext();
            e0e.e((Object)context2, "rootView.context");
            q2.c((ptb)cy2, (ptb)kv2.F0, context2);
        }
        else if (lx2 instanceof lx2$j) {
            final lv2 q3 = this.Q0;
            final String a5 = ((lx2$j)lx2).a;
            final Context context3 = this.F0.getContext();
            e0e.e((Object)context3, "rootView.context");
            q3.d(a5, context3);
        }
        else if (lx2 instanceof lx2$d) {
            wta.b(this.S0);
        }
    }
    
    public final t5j<nx2> w() {
        final View w0 = this.W0;
        e0e.e((Object)w0, "addressRow");
        final t5j map = vq9.a(w0).map((rtb)new mav((stb)zx2$g.F0, 13));
        final View y0 = this.Y0;
        e0e.e((Object)y0, "hoursRow");
        final t5j map2 = vq9.a(y0).map((rtb)new vma((stb)zx2$h.F0, 18));
        final View c1 = this.c1;
        e0e.e((Object)c1, "phoneRow");
        final t5j map3 = vq9.a(c1).map((rtb)new ula((stb)zx2$i.F0, 13));
        final View a1 = this.a1;
        e0e.e((Object)a1, "emailRow");
        final t5j map4 = vq9.a(a1).map((rtb)new zj4((stb)zx2$j.F0, 15));
        final View u0 = this.U0;
        e0e.e((Object)u0, "websiteRow");
        final t5j map5 = vq9.a(u0).map((rtb)new yj4((stb)zx2$k.F0, 19));
        final TextView e1 = this.e1;
        e0e.e((Object)e1, "clearDataView");
        final t5j map6 = vq9.a((View)e1).map((rtb)new nav((stb)zx2$l.F0, 20));
        final View h1 = this.h1;
        e0e.e((Object)h1, "displayMapRow");
        final t5j map7 = vq9.a(h1).map((rtb)new mav((stb)new zx2$m(this), 14));
        final t5j map8 = this.L0.a().map((rtb)new ei((stb)zx2$n.F0, 16));
        final t5j map9 = ((t5j)this.l1).map((rtb)new rla((stb)zx2$o.F0, 14));
        final t5j map10 = ((t5j)this.m1).map((rtb)new cu1((stb)zx2$b.F0, 14));
        final t5j map11 = ((t5j)this.n1).map((rtb)new ei((stb)zx2$c.F0, 15));
        final znl<nx2> o1 = this.o1;
        final t5j ofType = this.P0.v0().ofType((Class)h5h$b.class);
        e0e.e((Object)ofType, "onEvent().ofType(ME::class.java)");
        final t5j merge = t5j.merge((Iterable)shw.y0((Object[])new t5j[] { map, map2, map3, map4, map5, map6, map7, map8, map9, map10, map11, (t5j)o1, ofType.filter((ouk)new du1((stb)zx2$d.F0, 5)).debounce(100L, TimeUnit.MILLISECONDS).map((rtb)new cu1((stb)zx2$e.F0, 13)), (t5j)this.p1, this.R0, this.T0.a().map((rtb)new uma((stb)zx2$f.F0, 11)) }));
        e0e.e((Object)merge, "override fun userIntentO\u2026        }\n        )\n    )");
        return (t5j<nx2>)merge;
    }
    
    public static final class a
    {
    }
}
