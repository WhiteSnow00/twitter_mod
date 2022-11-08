import androidx.appcompat.widget.AppCompatEditText;
import android.widget.TextView;
import android.view.View;
import android.widget.CompoundButton$OnCheckedChangeListener;
import androidx.recyclerview.widget.RecyclerView$e;
import java.util.Objects;
import android.view.View$OnClickListener;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m5a extends e7x implements e97
{
    public final j5a H0;
    public final NavigationHandler I0;
    public final k5a J0;
    public final n5a K0;
    public final v5q L0;
    public final oqd M0;
    
    public m5a(final z7x z7x, final k5a j0, final n5a k0, final lsr lsr, final NavigationHandler i0, final ibm ibm, final gnw gnw, final x3e<vnp> x3e, final ri8<vnp> ri8, final oqd m0, final OcfEventReporter ocfEventReporter, final mf1 mf1, final d0c d0c) {
        super(z7x);
        this.I0 = i0;
        final int a = w4j.a;
        final j5a h0 = (j5a)lsr;
        this.H0 = h0;
        this.J0 = j0;
        this.K0 = k0;
        this.M0 = m0;
        this.C1(((el8)j0).C0);
        d0c.a(this.c().getView());
        ocfEventReporter.c();
        final xdj a2 = ((lsr)h0).f.a;
        if (a2 != null && !pjr.e((CharSequence)((xwm)a2).C0)) {
            ((View)j0.F0).setVisibility(0);
            ((TextView)j0.F0).setText((CharSequence)((xwm)a2).C0);
        }
        else {
            ((View)j0.F0).setVisibility(8);
        }
        final xdj b = ((lsr)h0).f.b;
        if (b != null && !pjr.e((CharSequence)((xwm)b).C0)) {
            ((View)j0.G0).setVisibility(0);
            ((TextView)j0.G0).setText((CharSequence)((xwm)b).C0);
        }
        else {
            ((View)j0.G0).setVisibility(8);
        }
        j0.D0.setHint(h0.j);
        ((TextView)j0.E0).setInputType(32);
        ((kqt)j0.I0).m0(false);
        final xrv a3 = ((lsr)h0).a;
        if (a3 != null) {
            final String c = a3.c;
            final n94 n94 = new n94((Object)this, 2);
            ((kqt)j0.I0).o0((CharSequence)c);
            ((kqt)j0.I0).n0((View$OnClickListener)n94);
        }
        final xrv c2 = ((lsr)h0).c;
        if (c2 != null) {
            final String c3 = c2.c;
            final yrf yrf = new yrf((Object)this, 21);
            j0.I0.r0((CharSequence)c3);
            j0.I0.p0((View$OnClickListener)yrf);
        }
        this.L0 = new v5q(j0.D0, gnw.c.map((qtb)new ekc(this, 10)));
        final j29 subscribe = ((b5j)k0.a).hide().subscribe((fk6)new bf2((Object)this, 16));
        Objects.requireNonNull(subscribe);
        ibm.i((rj)new hjd(subscribe, 7));
        if (!h0.l.isEmpty()) {
            m0.c(h0.l);
            final j29 subscribe2 = m0.b().subscribe((fk6)new y9f((Object)ri8, 10));
            Objects.requireNonNull(subscribe2);
            ibm.i((rj)new c41(subscribe2, 8));
            final c4e c4e = new c4e((y4e)ri8, (x3e)x3e, ibm);
            ((RecyclerView$e)c4e).A(true);
            j0.K0.b0(true);
            j0.K0.E0.z((RecyclerView$e)c4e);
            j0.K0.l0((x3e)x3e);
            ((el8)j0.H0).C0.setVisibility(8);
        }
        else {
            final fqp l = h0.k;
            boolean b2;
            if (l != null && l.d == 2) {
                final n72 n95 = (n72)l;
                Label_0595: {
                    if (((fqp)n95).c != null) {
                        final snp snp = n95.c().get(((fqp)n95).c);
                        if (snp != null) {
                            b2 = ((m72)snp).b;
                            break Label_0595;
                        }
                    }
                    b2 = false;
                }
                final xdj a4 = ((fqp)n95).a;
                final l5a l5a = new l5a(this);
                j0.H0.p0(j0.J0, a4);
                j0.H0.o0((CompoundButton$OnCheckedChangeListener)l5a);
                ((el8)j0.H0).C0.setVisibility(0);
            }
            else {
                b2 = false;
            }
            if (!k0.c) {
                k0.c = true;
                k0.b = b2;
                k0.a.onNext((Object)new n5a.a(b2));
            }
            j0.K0.b0(false);
        }
        mf1.a(((el8)j0).C0, ((lsr)h0).d, (View$OnClickListener)null);
    }
    
    public final prd h3() {
        final i5a$a i5a$a = new i5a$a();
        final k5a j0 = this.J0;
        String string;
        if (((AppCompatEditText)j0.E0).getText() != null) {
            string = ((AppCompatEditText)j0.E0).getText().toString();
        }
        else {
            string = "";
        }
        i5a$a.b = string;
        i5a$a.c = this.K0.b;
        ((wd$a)i5a$a).o(this.M0.b);
        return (prd)((h4j)i5a$a).e();
    }
    
    @Override
    public final void w1() {
        this.L0.d();
    }
}
