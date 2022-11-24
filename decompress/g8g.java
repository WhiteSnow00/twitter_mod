import com.twitter.ui.widget.TwitterEditText;
import android.widget.TextView;
import android.content.Context;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.app.Activity;
import com.twitter.onboarding.ocf.entertext.LocationEditTextViewPresenter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g8g extends g7a
{
    public final LocationEditTextViewPresenter H0;
    
    public g8g(final Activity activity, final f8g f8g, final str str, final duo duo, final qgv qgv, final f0c f0c) {
        super((hjs)f8g, str);
        ((TextView)f8g.L0).setHint((CharSequence)super.F0.j);
        final int m = super.F0.m;
        if (m > 0) {
            ((TextView)f8g.L0).setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(m) });
            ((TwitterEditText)f8g.L0).setMaxCharacterCount(m);
            ((TwitterEditText)f8g.L0).setCharacterCounterMode(2);
        }
        final efv efv = (efv)noj.d(qgv.T0);
        this.H0 = new LocationEditTextViewPresenter((Context)activity, new j7g(efv, efv), qgv, f8g, duo);
        f0c.a(((dur)f8g).getHeldView());
    }
    
    public final e7a a() {
        final LocationEditTextViewPresenter h0 = this.H0;
        final boolean b = h0.b();
        final String s = null;
        efv m0 = null;
        Label_0036: {
            if (b) {
                final m7g k0 = h0.K0;
                if (k0 != null) {
                    m0 = k0.M0;
                    break Label_0036;
                }
            }
            m0 = null;
        }
        final e7a$a e7a$a = new e7a$a();
        final LocationEditTextViewPresenter h2 = this.H0;
        efv m2 = null;
        Label_0079: {
            if (h2.b()) {
                final m7g k2 = h2.K0;
                if (k2 != null) {
                    m2 = k2.M0;
                    break Label_0079;
                }
            }
            m2 = null;
        }
        String a;
        if (m2 != null) {
            a = m2.c;
        }
        else {
            a = h2.F0;
        }
        e7a$a.a = a;
        String a2 = s;
        if (m0 != null) {
            a2 = m0.a;
        }
        e7a$a.b = a2;
        return (e7a)((z4j)e7a$a).e();
    }
}
