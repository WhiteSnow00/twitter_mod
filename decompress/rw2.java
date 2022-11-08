import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import java.util.concurrent.TimeUnit;
import com.twitter.business.api.BusinessHoursContentViewResult;
import androidx.fragment.app.p;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.material.timepicker.c;
import android.content.Context;
import android.text.format.DateFormat;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView$j;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rw2 implements okx<zw2, rv2, nv2>
{
    public final View C0;
    public final vv2 D0;
    public final bw2 E0;
    public final pca<p4h> F0;
    public final kn G0;
    public final gv2 H0;
    public final av2 I0;
    public final q13 J0;
    public final yv2 K0;
    public final z7x L0;
    public final Toolbar M0;
    public final mhh<zw2> N0;
    
    public rw2(final View c0, final c4e<wv2> adapter, final vv2 d0, final bw2 e0, final pca<p4h> f0, final kn g0, final gv2 h0, final av2 i0, final q13 j0, final yv2 k0, final z7x l0, final ibm ibm) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)adapter, "itemBinderAdapter");
        zzd.f((Object)d0, "itemProvider");
        zzd.f((Object)e0, "hoursPickerLauncher");
        zzd.f((Object)f0, "menuEventObservable");
        zzd.f((Object)g0, "activityFinisher");
        zzd.f((Object)h0, "businessHoursActionDispatcher");
        zzd.f((Object)i0, "businessDialogBuilder");
        zzd.f((Object)j0, "listSelectionScreenLauncher");
        zzd.f((Object)k0, "navigationConfigurator");
        zzd.f((Object)l0, "viewLifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        final rd6 rd6 = new rd6();
        final RecyclerView recyclerView = (RecyclerView)c0.findViewById(2131429484);
        this.M0 = (Toolbar)c0.findViewById(2131432111);
        final Drawable drawable = ((View)recyclerView).getContext().getDrawable(2131231156);
        if (drawable != null) {
            final n n = new n(((View)recyclerView).getRootView().getContext(), 1);
            n.j(drawable);
            recyclerView.h((RecyclerView$l)n);
        }
        recyclerView.setAdapter((RecyclerView$e)adapter);
        recyclerView.setItemAnimator((RecyclerView$j)null);
        final b5j filter = j0.a().filter((ptk)new jn0((rtb)pw2.C0, 4));
        zzd.e((Object)filter, "listSelectionScreenLaunc\u2026tem is BusinessTimezone }");
        final m29 m29;
        m29.c(filter.doOnComplete((rj)new nw2(m29 = new m29())).subscribe((fk6)new fk6((rtb)new ow2(this))));
        l0.l().subscribe((fk6)new sna((rtb)new qw2(this), 22));
        ibm.i((rj)new h00(rd6, 2));
        this.N0 = (mhh<zw2>)ajy.a0((rtb)new rw2$j(this));
    }
    
    public final void T(final oax oax) {
        final zw2 zw2 = (zw2)oax;
        zzd.f((Object)zw2, "state");
        this.N0.b((Object)zw2);
    }
    
    public final void s(final Object o) {
        final nv2 nv2 = (nv2)o;
        zzd.f((Object)nv2, "effect");
        if (nv2 instanceof nv2$d) {
            final bw2 e0 = this.E0;
            final nv2$d nv2$d = (nv2$d)nv2;
            Objects.requireNonNull(e0);
            final boolean is24HourFormat = DateFormat.is24HourFormat((Context)e0.c);
            final int hour = nv2$d.a.getHour();
            final int minute = nv2$d.a.getMinute();
            final tps tps = new tps(0, 0, 10, is24HourFormat ? 1 : 0);
            tps.G0 = minute % 60 % 60;
            int i0;
            if (hour >= 12) {
                i0 = 1;
            }
            else {
                i0 = 0;
            }
            tps.I0 = i0;
            tps.F0 = hour;
            final c c = new c();
            final Bundle bundle = new Bundle();
            bundle.putParcelable("TIME_PICKER_TIME_MODEL", (Parcelable)tps);
            ((BaseBundle)bundle).putInt("TIME_PICKER_INPUT_MODE", 0);
            ((BaseBundle)bundle).putInt("TIME_PICKER_TITLE_RES", 0);
            ((BaseBundle)bundle).putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
            ((BaseBundle)bundle).putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
            ((BaseBundle)bundle).putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
            ((Fragment)c).N1(bundle);
            e0.a(c);
            ((cw8)c).e2((p)e0.d, "business_hours_time_picker");
            e0.b.a(ov2.c);
        }
        else if (nv2 instanceof nv2$b) {
            this.G0.c((vn6)new BusinessHoursContentViewResult(((nv2$b)nv2).a));
        }
        else if (nv2 instanceof nv2$e) {
            final av2 i2 = this.I0;
            final lw2 lw2 = new lw2(this.H0);
            final Context context = this.C0.getContext();
            final mw2 mw2 = new mw2(this.H0);
            zzd.e((Object)context, "context");
            i2.c((otb)lw2, (otb)mw2, context);
        }
        else if (nv2 instanceof nv2$a) {
            this.G0.cancel();
        }
        else if (nv2 instanceof nv2$c) {
            final q13 j0 = this.J0;
            final nv2$c nv2$c = (nv2$c)nv2;
            j0.b(nv2$c.a, nv2$c.b, nv2$c.c, Integer.valueOf(nv2$c.d), true);
        }
    }
    
    public final b5j<rv2> x() {
        final Toolbar m0 = this.M0;
        zzd.e((Object)m0, "toolbar");
        final b5j map = zi8.L(m0).map((qtb)new c9v((rtb)rw2$a.C0, 14));
        final b5j map2 = this.H0.a().filter((ptk)new lt1((rtb)rw2$b.C0, 5)).map((qtb)new di((rtb)rw2$c.C0, 18));
        final b5j ofType = this.F0.v0().ofType((Class)p4h.b.class);
        zzd.e((Object)ofType, "onEvent().ofType(ME::class.java)");
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)map, (naj)map2, (naj)ofType.filter((ptk)new zt1((rtb)rw2$d.C0, 6)).map((qtb)new yt1((rtb)rw2$e.C0, 22)).debounce(100L, TimeUnit.MILLISECONDS), (naj)this.H0.a().filter((ptk)new di((rtb)rw2$f.C0, 6)).map((qtb)new nma((rtb)rw2$g.C0, 23)), (naj)this.H0.a().filter((ptk)new wj4((rtb)rw2$h.C0, 3)).map((qtb)new uj4((rtb)rw2$i.C0, 17)) });
        zzd.e((Object)mergeArray, "mergeArray(\n        tool\u2026ardHoursCancelled }\n    )");
        return (b5j<rv2>)mergeArray;
    }
}
