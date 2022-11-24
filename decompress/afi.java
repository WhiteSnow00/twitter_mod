import android.widget.TextView;
import java.util.ArrayList;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.Switch;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afi implements q7f
{
    public final n61 F0;
    public final fb8 G0;
    public final Resources H0;
    public final r8p I0;
    public final View J0;
    public final View K0;
    public final View L0;
    public final TypefacesTextView M0;
    public final HorizonComposeButton N0;
    public final Switch O0;
    public final View P0;
    public final TypefacesTextView Q0;
    public afi.afi$a R0;
    public final View S0;
    public final ImageView T0;
    public final TypefacesTextView U0;
    public afi.afi$b V0;
    public eb8 W0;
    
    public afi(final LayoutInflater layoutInflater, final n61 f0, final fb8 g0, final Resources h0, final r8p i0) {
        e0e.f((Object)layoutInflater, "inflater");
        e0e.f((Object)f0, "authorsFiltersViewDelegate");
        e0e.f((Object)g0, "datesFilterViewDelegate");
        e0e.f((Object)h0, "resources");
        e0e.f((Object)i0, "scribeReporter");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        int j = 0;
        final View inflate = layoutInflater.inflate(2131625954, (ViewGroup)null, false);
        e0e.e((Object)inflate, "inflater.inflate(R.layou\u2026rs_activity, null, false)");
        this.J0 = inflate;
        final View viewById = inflate.findViewById(2131431260);
        e0e.e((Object)viewById, "rootLayout.findViewById(\u2026_advanced_filters_layout)");
        this.K0 = viewById;
        final View viewById2 = inflate.findViewById(2131429556);
        e0e.e((Object)viewById2, "rootLayout.findViewById(R.id.include_close_button)");
        this.L0 = viewById2;
        final View viewById3 = inflate.findViewById(2131430979);
        e0e.e((Object)viewById3, "rootLayout.findViewById(R.id.reset)");
        this.M0 = (TypefacesTextView)viewById3;
        final View viewById4 = inflate.findViewById(2131427639);
        e0e.e((Object)viewById4, "rootLayout.findViewById(R.id.apply_button)");
        this.N0 = (HorizonComposeButton)viewById4;
        final View viewById5 = inflate.findViewById(2131429133);
        e0e.e((Object)viewById5, "rootLayout.findViewById(R.id.filter_near_you)");
        this.O0 = (Switch)viewById5;
        final View viewById6 = inflate.findViewById(2131427705);
        e0e.e((Object)viewById6, "rootLayout.findViewById(R.id.authors_layout)");
        this.P0 = viewById6;
        final View viewById7 = inflate.findViewById(2131427692);
        e0e.e((Object)viewById7, "rootLayout.findViewById(R.id.author_arrow)");
        final ImageView imageView = (ImageView)viewById7;
        final View viewById8 = inflate.findViewById(2131427701);
        e0e.e((Object)viewById8, "rootLayout.findViewById(R.id.author_selected)");
        this.Q0 = (TypefacesTextView)viewById8;
        final View viewById9 = inflate.findViewById(2131428596);
        e0e.e((Object)viewById9, "rootLayout.findViewById(R.id.dates_layout)");
        this.S0 = viewById9;
        final View viewById10 = inflate.findViewById(2131428594);
        e0e.e((Object)viewById10, "rootLayout.findViewById(R.id.dates_arrow)");
        this.T0 = (ImageView)viewById10;
        final View viewById11 = inflate.findViewById(2131428592);
        e0e.e((Object)viewById11, "rootLayout.findViewById(R.id.date_selected)");
        this.U0 = (TypefacesTextView)viewById11;
        this.W0 = eb8.H0;
        final View viewById12 = inflate.findViewById(2131427697);
        e0e.e((Object)viewById12, "rootLayout.findViewById(R.id.author_filter_layout)");
        f0.a = viewById12;
        final View viewById13 = viewById12.findViewById(2131427753);
        e0e.e((Object)viewById13, "authorsLayout.findViewById(R.id.back_button)");
        final ImageView b = (ImageView)viewById13;
        f0.b = b;
        b.getDrawable().setAutoMirrored(true);
        imageView.getDrawable().setAutoMirrored(true);
        viewById6.setOnClickListener((View$OnClickListener)new qsk((Object)this, 4));
        final bqf bqf = new bqf((Object)this, 6);
        final ImageView b2 = f0.b;
        if (b2 == null) {
            e0e.m("backButton");
            throw null;
        }
        ((View)b2).setOnClickListener((View$OnClickListener)new v8w((Object)f0, (Object)bqf, 2));
        f0.d = (n61$a)new bfi(this);
        final View viewById14 = inflate.findViewById(2131428595);
        e0e.e((Object)viewById14, "rootLayout.findViewById(R.id.dates_filter_layout)");
        g0.c = viewById14;
        final View viewById15 = viewById14.findViewById(2131427753);
        e0e.e((Object)viewById15, "datesLayout.findViewById(R.id.back_button)");
        final ImageView d = (ImageView)viewById15;
        g0.d = d;
        d.getDrawable().setAutoMirrored(true);
        final View c = g0.c;
        if (c == null) {
            e0e.m("datesLayout");
            throw null;
        }
        final View viewById16 = c.findViewById(2131431330);
        e0e.e((Object)viewById16, "datesLayout.findViewById\u2026.selection_recycler_view)");
        g0.e = (RecyclerView)viewById16;
        for (eb8[] values = eb8.values(); j < values.length; ++j) {
            final eb8 eb8 = values[j];
            final ArrayList f2 = g0.f;
            final za8$a za8$a = new za8$a();
            za8$a.a = g0.a.getString(eb8.F0);
            za8$a.d = eb8.F0;
            f2.add(((z4j)za8$a).e());
        }
        this.T0.getDrawable().setAutoMirrored(true);
        this.S0.setOnClickListener((View$OnClickListener)new cqf((Object)this, 3));
        final fb8 g2 = this.G0;
        final d1x onClickListener = new d1x((Object)this, 6);
        Objects.requireNonNull(g2);
        final ImageView d2 = g2.d;
        if (d2 != null) {
            ((View)d2).setOnClickListener((View$OnClickListener)onClickListener);
            final fb8 g3 = this.G0;
            final cfi g4 = new cfi(this);
            Objects.requireNonNull(g3);
            g3.g = (bij)g4;
            return;
        }
        e0e.m("backButton");
        throw null;
    }
    
    public final void a() {
        sbw.b((tlm)this.I0.c("", "impression"));
        this.K0.setVisibility(0);
        final View a = this.F0.a;
        if (a == null) {
            e0e.m("authorsLayout");
            throw null;
        }
        a.setVisibility(8);
        final View c = this.G0.c;
        if (c != null) {
            c.setVisibility(8);
            return;
        }
        e0e.m("datesLayout");
        throw null;
    }
    
    public final void b(final String text) {
        vzv a;
        if (text != null) {
            ((TextView)this.Q0).setText((CharSequence)text);
            a = vzv.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            ((TextView)this.Q0).setText((CharSequence)this.H0.getString(2131951973));
        }
    }
    
    public final View getView() {
        return this.J0;
    }
}
