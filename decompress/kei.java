import android.widget.TextView;
import android.content.res.Resources;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kei implements nhj
{
    public final iei a;
    
    public kei(final iei a) {
        this.a = a;
    }
    
    public final void a(final kvj<Integer, String> kvj) {
        final iei a = this.a;
        final aa8.a companion = aa8.Companion;
        final Object a2 = ((m2j)kvj).a;
        jee.l(a2);
        czd.e(a2, "dateSelected.first()");
        a.U0 = companion.a(((Number)a2).intValue());
        final iei a3 = this.a;
        final TypefacesTextView s0 = a3.S0;
        final Resources f0 = a3.F0;
        final Object a4 = ((m2j)kvj).a;
        jee.l(a4);
        czd.e(a4, "dateSelected.first()");
        ((TextView)s0).setText((CharSequence)f0.getString(((Number)a4).intValue()));
        final iei$b t0 = this.a.T0;
        if (t0 != null) {
            t0.a((kvj)kvj);
        }
    }
}
