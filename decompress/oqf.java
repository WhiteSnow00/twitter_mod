import com.twitter.model.liveevent.LiveEventConfiguration;
import com.twitter.model.liveevent.LiveEventConfiguration$a;
import android.preference.PreferenceManager;
import java.util.Objects;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oqf extends sw6 implements asf$a, m81
{
    public final yqf X0;
    public final asf Y0;
    public final x7f Z0;
    public final zj3 a1;
    public final xrf b1;
    public final vrf c1;
    public final tqf d1;
    public final yhf e1;
    public xqf f1;
    public wvf g1;
    
    public oqf(final Activity activity, final z19 z19, final ck3 ck3, final ii3 ii3, final mi3 mi3, final mk3 mk3, final lk3 lk3, final yqf x0, final asf y0, final x7f z20, final zj3 a1, final xrf b1, final vrf c1, final jev jev, final tqf d1, final yhf e1, final wv1 wv1) {
        super(activity, z19, ck3, ii3, mi3, mk3, lk3, wve.g((Context)activity, z19), jev, wv1);
        this.X0 = x0;
        this.Y0 = y0;
        this.c1 = c1;
        ((e7x)this).C1(y0.C0.a);
        this.a1 = a1;
        this.Z0 = z20;
        this.b1 = b1;
        this.d1 = d1;
        this.e1 = e1;
    }
    
    public final void F1() {
        super.F1();
        final asf y0 = this.Y0;
        final x30 c0 = x30.C0;
        Objects.requireNonNull(y0);
        y0.D0 = (asf$a)c0;
        this.a1.e();
        this.b1.a.a();
    }
    
    public final void I1(final l9i l9i) {
        super.I1(l9i);
        final asf y0 = this.Y0;
        Objects.requireNonNull(y0);
        y0.D0 = (asf$a)this;
        final jev o0 = super.O0;
        final jev jev = new jev();
        jev jev2 = o0;
        if (o0 == null) {
            jev2 = jev;
        }
        if (super.P0 == z19.k) {
            ((vyo)jev2).a("superhero");
        }
        this.g1 = new wvf(jev2, "LexCard");
        this.f1 = this.X0.a(l9i.b(), l9i.b.f, super.S0, this.g1);
        this.a1.c(l9i);
        final x7f z0 = this.Z0;
        final xqf f1 = this.f1;
        ((ggm)z0.a).a((Object)f1);
        if (f1.f()) {
            z0.b.a((Object)f1.s);
        }
        super.L0.d(new j29[] { ((e7x)this).C0.d().subscribe((fk6)new pcs((Object)this, 4)), ((e7x)this).C0.g().subscribe((fk6)new ocs((Object)this, 7)), ((e7x)this).C0.b().subscribe((fk6)new tag((Object)this, 4)) });
    }
    
    public final k81 getAutoPlayableItem() {
        return this.Y0.getAutoPlayableItem();
    }
    
    public final void k1() {
        if (this.f1 == null) {
            return;
        }
        final hlv b = dta.b();
        final boolean b2 = true;
        if (b.b("live_event_experience_enabled", true)) {
            final int a = this.c1.a(this.f1);
            boolean e = b2;
            if (a != 1) {
                e = b2;
                if (a != 2) {
                    final tqf d1 = this.d1;
                    final Activity u0 = super.U0;
                    Objects.requireNonNull(d1);
                    e = (!rez.d(PreferenceManager.getDefaultSharedPreferences((Context)u0)) && b2);
                }
            }
            final LiveEventConfiguration$a liveEventConfiguration$a = new LiveEventConfiguration$a(this.f1.c);
            liveEventConfiguration$a.b = fj3.d(super.S0);
            liveEventConfiguration$a.e = e;
            liveEventConfiguration$a.i = this.f1.r;
            final tvf tvf = new tvf((LiveEventConfiguration)((h4j)liveEventConfiguration$a).e());
            c0p t1;
            if (super.I0.m() != null) {
                t1 = super.I0.m().t1();
            }
            else {
                t1 = null;
            }
            final yhf e2 = this.e1;
            final hil e3 = super.I0.e();
            final jev o0 = super.O0;
            String d2;
            if (o0 != null) {
                d2 = ((vyo)o0).d;
            }
            else {
                d2 = "";
            }
            e2.b.onNext((Object)new td4(8, t1, true, e3, d2, super.I0.m()));
            super.M0.a(tvf);
        }
        else {
            final StringBuilder g = w48.g("https://mobile.twitter.com/i/events/");
            g.append(this.f1.c);
            super.K0.a(g.toString());
        }
    }
}
