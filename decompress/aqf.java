import com.twitter.model.liveevent.LiveEventConfiguration;
import com.twitter.model.liveevent.LiveEventConfiguration$a;
import android.preference.PreferenceManager;
import java.util.Objects;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqf extends wv6 implements mrf$a, g81
{
    public final kqf Y0;
    public final mrf Z0;
    public final j7f a1;
    public final hj3 b1;
    public final jrf c1;
    public final hrf d1;
    public final fqf e1;
    public final jhf f1;
    public jqf g1;
    public hvf h1;
    
    public aqf(final Activity activity, final j19 j19, final kj3 kj3, final qh3 qh3, final uh3 uh3, final tj3 tj3, final sj3 sj3, final kqf y0, final mrf z0, final j7f a1, final hj3 b1, final jrf c1, final hrf d1, final efv efv, final fqf e1, final jhf f1, final rv1 rv1) {
        super(activity, j19, kj3, qh3, uh3, tj3, sj3, ive.g((Context)activity, j19), efv, rv1);
        this.Y0 = y0;
        this.Z0 = z0;
        this.d1 = d1;
        ((x7x)this).C1(z0.D0.a);
        this.b1 = b1;
        this.a1 = a1;
        this.c1 = c1;
        this.e1 = e1;
        this.f1 = f1;
    }
    
    public final /* bridge */ void E1(final Object o) {
        this.I1((m9i)o);
    }
    
    public final void F1() {
        super.F1();
        final mrf z0 = this.Z0;
        final gw8 e0 = gw8.E0;
        Objects.requireNonNull(z0);
        z0.E0 = (mrf.mrf$a)e0;
        this.b1.e();
        this.c1.a.a();
    }
    
    public final void I1(final m9i m9i) {
        super.I1(m9i);
        final mrf z0 = this.Z0;
        Objects.requireNonNull(z0);
        z0.E0 = (mrf.mrf$a)this;
        final efv p = super.P0;
        final efv efv = new efv();
        efv efv2 = p;
        if (p == null) {
            efv2 = efv;
        }
        if (super.Q0 == j19.k) {
            ((lzo)efv2).a("superhero");
        }
        this.h1 = new hvf(efv2, "LexCard");
        this.g1 = this.Y0.a(m9i.b(), m9i.b.f, super.T0, this.h1);
        this.b1.c(m9i);
        final j7f a1 = this.a1;
        final jqf g1 = this.g1;
        ((wgm)a1.a).a((Object)g1);
        if (g1.f()) {
            ((wgm)a1.b).a((Object)g1.s);
        }
        super.M0.d(new t19[] { ((x7x)this).D0.d().subscribe((lj6)new kds((Object)this, 4)), ((x7x)this).D0.g().subscribe((lj6)new jds((Object)this, 7)), ((x7x)this).D0.b().subscribe((lj6)new iag(this, 4)) });
    }
    
    public final e81 getAutoPlayableItem() {
        return this.Z0.getAutoPlayableItem();
    }
    
    public final void k1() {
        if (this.g1 == null) {
            return;
        }
        final fmv b = asa.b();
        final boolean b2 = true;
        if (b.b("live_event_experience_enabled", true)) {
            final int a = this.d1.a(this.g1);
            boolean e = b2;
            if (a != 1) {
                e = b2;
                if (a != 2) {
                    final fqf e2 = this.e1;
                    final Activity v0 = super.V0;
                    Objects.requireNonNull(e2);
                    e = (!q3j.q(PreferenceManager.getDefaultSharedPreferences((Context)v0)) && b2);
                }
            }
            final LiveEventConfiguration$a liveEventConfiguration$a = new LiveEventConfiguration$a(this.g1.c);
            liveEventConfiguration$a.b = ni3.d(super.T0);
            liveEventConfiguration$a.e = e;
            liveEventConfiguration$a.i = this.g1.r;
            final evf evf = new evf((LiveEventConfiguration)((n4j)liveEventConfiguration$a).e());
            t0p s1;
            if (super.J0.m() != null) {
                s1 = super.J0.m().s1();
            }
            else {
                s1 = null;
            }
            final jhf f1 = this.f1;
            final uil e3 = super.J0.e();
            final efv p0 = super.P0;
            String d;
            if (p0 != null) {
                d = ((lzo)p0).d;
            }
            else {
                d = "";
            }
            f1.b.onNext((Object)new vc4(8, s1, true, e3, d, super.J0.m()));
            super.N0.a(evf);
        }
        else {
            final StringBuilder j = fu8.j("https://mobile.twitter.com/i/events/");
            j.append(this.g1.c);
            super.L0.a(j.toString());
        }
    }
}
