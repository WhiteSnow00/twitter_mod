import android.widget.CompoundButton;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import java.util.Objects;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uv extends kcv
{
    public qv Z0;
    public final s1c a1;
    public final a5f b1;
    public final zei c1;
    
    public uv(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final a5f b1, final zei c1, final s1c a1, final fda<l7k> fda2, final u7k u7k, final View view, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        final qv qv = (qv)gmp.a(intent.getByteArrayExtra("extra_advanced_filters"), (nmp)qv.f);
        final qv g = qv.g;
        qv z0 = qv;
        if (qv == null) {
            z0 = g;
        }
        final k6g k6g = new k6g(dob, "search_activity_location_dialog", u7k, 71);
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.Z0 = z0;
        if (qsz.r()) {
            Objects.requireNonNull(c1);
            c1.a();
            final afi g2 = c1.G0;
            final g2p onClickListener = new g2p((Object)c1, 6);
            Objects.requireNonNull(g2);
            g2.L0.setOnClickListener((View$OnClickListener)onClickListener);
            final afi g3 = c1.G0;
            final fsf onClickListener2 = new fsf((Object)c1, 2);
            Objects.requireNonNull(g3);
            g3.N0.setOnClickListener((View$OnClickListener)onClickListener2);
            final afi g4 = c1.G0;
            final sy onClickListener3 = new sy((Object)c1, 9);
            Objects.requireNonNull(g4);
            ((View)g4.M0).setOnClickListener((View$OnClickListener)onClickListener3);
            final afi g5 = c1.G0;
            final wei onCheckedChangeListener = new wei(c1, k6g, 0);
            Objects.requireNonNull(g5);
            ((CompoundButton)g5.O0).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)onCheckedChangeListener);
            final afi g6 = c1.G0;
            final xei r0 = new xei(c1);
            Objects.requireNonNull(g6);
            g6.R0 = (afi.afi$a)r0;
            final afi g7 = c1.G0;
            final yei v0 = new yei(c1);
            Objects.requireNonNull(g7);
            g7.V0 = (afi.afi$b)v0;
            f.i(k9x.l(), (fa3)new rp3((Object)this, 4));
        }
        else {
            final b5f k0 = b1.K0;
            final boolean b2 = b1.F0.b;
            ((CompoundButton)k0.K0).setChecked(b2 ^ true);
            ((CompoundButton)k0.L0).setChecked(b2);
            if (b1.M0.a()) {
                ((View)b1.K0.I0).setVisibility(8);
            }
            final b5f k2 = b1.K0;
            final boolean c2 = b1.F0.c;
            ((CompoundButton)k2.M0).setChecked(c2 ^ true);
            ((CompoundButton)k2.N0).setChecked(c2);
            b1.K0.G0.setOnClickListener((View$OnClickListener)new d1x((Object)b1, 5));
            b1.K0.H0.setOnClickListener((View$OnClickListener)new quf(b1, 7));
            final b5f k3 = b1.K0;
            final z4f z4f = new z4f(b1, k6g);
            k3.I0.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)z4f);
            k3.J0.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)z4f);
        }
        this.R4(view);
        n7k.b((fda)fda2, 71, (fa3)new in((Object)this, 4));
    }
    
    @Override
    public final boolean k() {
        if (qsz.r()) {
            final afi g0 = this.c1.G0;
            boolean b;
            if (g0.K0.getVisibility() == 0) {
                b = false;
            }
            else {
                g0.a();
                b = true;
            }
            return b;
        }
        return super.k();
    }
}
