import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.DatePicker;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.view.LayoutInflater;
import com.twitter.onboarding.ocf.OcfDateViewDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g5a extends nsr
{
    public final w92 E0;
    public final OcfDateViewDelegate F0;
    
    public g5a(final LayoutInflater layoutInflater, final e5a e5a, final NavigationHandler navigationHandler, final bra<View, w92> bra, final yqa<TextInputLayout, DatePicker, snj<ea8>, OcfDateViewDelegate> yqa, final lcj lcj, final xqa<TextInputLayout, b5j<snj<ea8>>, enw> xqa) {
        zzd.f((Object)layoutInflater, "layoutInflater");
        zzd.f((Object)e5a, "properties");
        zzd.f((Object)navigationHandler, "navigationHandler");
        zzd.f((Object)bra, "navigationBarFactory");
        zzd.f((Object)yqa, "dateViewDelegateFactory");
        zzd.f((Object)lcj, "ocfDataReferenceReader");
        zzd.f((Object)xqa, "validationPresenterFactory");
        final String s = null;
        final View inflate = layoutInflater.inflate(2131625050, (ViewGroup)null);
        zzd.e((Object)inflate, "layoutInflater.inflate(R\u2026cf_enter_date_step, null)");
        super(inflate);
        final View viewById = this.getHeldView().findViewById(2131427812);
        zzd.e((Object)viewById, "heldView.findViewById(R.id.birthday_field)");
        final TextInputLayout textInputLayout = (TextInputLayout)viewById;
        final View viewById2 = this.getHeldView().findViewById(2131428590);
        zzd.e((Object)viewById2, "heldView.findViewById(R.id.date_picker)");
        final DatePicker datePicker = (DatePicker)viewById2;
        final Object a = bra.a((Object)this.getHeldView());
        zzd.e(a, "navigationBarFactory.create(heldView)");
        final w92 e0 = (w92)a;
        this.E0 = e0;
        final kcj p7 = e5a.p;
        ea8 a2;
        if (p7 != null) {
            a2 = lcj.a(p7);
        }
        else {
            a2 = null;
        }
        final Object a3 = yqa.a((Object)textInputLayout, (Object)datePicker, (Object)snj.b((Object)a2));
        zzd.e(a3, "dateViewDelegateFactory.\u2026taReferenceReader))\n    )");
        final OcfDateViewDelegate f0 = (OcfDateViewDelegate)a3;
        this.F0 = f0;
        final Object a4 = xqa.a((Object)textInputLayout, (Object)f0.f);
        zzd.e(a4, "validationPresenterFacto\u2026eViewDelegate.observable)");
        final enw enw = (enw)a4;
        final ga8 j = e5a.j;
        if (j != null) {
            final ea8 a5 = j.a;
            if (a5 != null) {
                f0.c.setMinDate(a5.a());
            }
        }
        if (j != null) {
            final ea8 b = j.b;
            if (b != null) {
                f0.c.setMaxDate(b.a());
            }
        }
        enw.a.subscribe((fk6)new xja((rtb)new f5a(this), 29));
        final String n = e5a.n;
        final xdj o = e5a.o;
        String c0;
        if (o != null) {
            c0 = ((xwm)o).C0;
        }
        else {
            c0 = null;
        }
        f0.c(n, c0);
        final xrv a6 = e5a.a;
        if (a6 != null) {
            final String c2 = a6.c;
            final String s2 = "";
            String s3;
            if ((s3 = c2) == null) {
                s3 = "";
            }
            ((kqt)e0).o0((CharSequence)s3);
            ((kqt)e0).n0((View$OnClickListener)new npf(navigationHandler, a6, this, 3));
            final xrv b2 = e5a.b;
            String c3 = s;
            if (b2 != null) {
                c3 = b2.c;
            }
            if (c3 == null) {
                c3 = s2;
            }
            e0.r0((CharSequence)c3);
            e0.p0((View$OnClickListener)new sy((Object)navigationHandler, (Object)e5a, 21));
            return;
        }
        throw new IllegalArgumentException("Expected javaClass to have non-null primary link".toString());
    }
    
    public final int l0() {
        return 0;
    }
}
