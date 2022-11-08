import android.widget.TextView;
import java.util.List;
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

public final class fei implements h7f
{
    public final m61 C0;
    public final ra8 D0;
    public final Resources E0;
    public final f7p F0;
    public final View G0;
    public final View H0;
    public final View I0;
    public final TypefacesTextView J0;
    public final HorizonComposeButton K0;
    public final Switch L0;
    public final View M0;
    public final TypefacesTextView N0;
    public a O0;
    public final View P0;
    public final ImageView Q0;
    public final TypefacesTextView R0;
    public b S0;
    public qa8 T0;
    
    public fei(final LayoutInflater layoutInflater, final m61 c0, final ra8 d0, final Resources e0, final f7p f0) {
        zzd.f((Object)layoutInflater, "inflater");
        zzd.f((Object)c0, "authorsFiltersViewDelegate");
        zzd.f((Object)d0, "datesFilterViewDelegate");
        zzd.f((Object)e0, "resources");
        zzd.f((Object)f0, "scribeReporter");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        int i = 0;
        final View inflate = layoutInflater.inflate(2131625952, (ViewGroup)null, false);
        zzd.e((Object)inflate, "inflater.inflate(R.layou\u2026rs_activity, null, false)");
        this.G0 = inflate;
        final View viewById = inflate.findViewById(2131431257);
        zzd.e((Object)viewById, "rootLayout.findViewById(\u2026_advanced_filters_layout)");
        this.H0 = viewById;
        final View viewById2 = inflate.findViewById(2131429555);
        zzd.e((Object)viewById2, "rootLayout.findViewById(R.id.include_close_button)");
        this.I0 = viewById2;
        final View viewById3 = inflate.findViewById(2131430976);
        zzd.e((Object)viewById3, "rootLayout.findViewById(R.id.reset)");
        this.J0 = (TypefacesTextView)viewById3;
        final View viewById4 = inflate.findViewById(2131427639);
        zzd.e((Object)viewById4, "rootLayout.findViewById(R.id.apply_button)");
        this.K0 = (HorizonComposeButton)viewById4;
        final View viewById5 = inflate.findViewById(2131429133);
        zzd.e((Object)viewById5, "rootLayout.findViewById(R.id.filter_near_you)");
        this.L0 = (Switch)viewById5;
        final View viewById6 = inflate.findViewById(2131427705);
        zzd.e((Object)viewById6, "rootLayout.findViewById(R.id.authors_layout)");
        this.M0 = viewById6;
        final View viewById7 = inflate.findViewById(2131427692);
        zzd.e((Object)viewById7, "rootLayout.findViewById(R.id.author_arrow)");
        final ImageView imageView = (ImageView)viewById7;
        final View viewById8 = inflate.findViewById(2131427701);
        zzd.e((Object)viewById8, "rootLayout.findViewById(R.id.author_selected)");
        this.N0 = (TypefacesTextView)viewById8;
        final View viewById9 = inflate.findViewById(2131428596);
        zzd.e((Object)viewById9, "rootLayout.findViewById(R.id.dates_layout)");
        this.P0 = viewById9;
        final View viewById10 = inflate.findViewById(2131428594);
        zzd.e((Object)viewById10, "rootLayout.findViewById(R.id.dates_arrow)");
        this.Q0 = (ImageView)viewById10;
        final View viewById11 = inflate.findViewById(2131428592);
        zzd.e((Object)viewById11, "rootLayout.findViewById(R.id.date_selected)");
        this.R0 = (TypefacesTextView)viewById11;
        this.T0 = qa8.E0;
        final View viewById12 = inflate.findViewById(2131427697);
        zzd.e((Object)viewById12, "rootLayout.findViewById(R.id.author_filter_layout)");
        c0.a = viewById12;
        final View viewById13 = viewById12.findViewById(2131427753);
        zzd.e((Object)viewById13, "authorsLayout.findViewById(R.id.back_button)");
        final ImageView b = (ImageView)viewById13;
        c0.b = b;
        b.getDrawable().setAutoMirrored(true);
        imageView.getDrawable().setAutoMirrored(true);
        viewById6.setOnClickListener((View$OnClickListener)new vrk((Object)this, 4));
        final spf spf = new spf((Object)this, 6);
        final ImageView b2 = c0.b;
        if (b2 == null) {
            zzd.m("backButton");
            throw null;
        }
        ((View)b2).setOnClickListener((View$OnClickListener)new x7w((Object)c0, (Object)spf, 2));
        c0.d = (m61.a)new gei(this);
        final View viewById14 = inflate.findViewById(2131428595);
        zzd.e((Object)viewById14, "rootLayout.findViewById(R.id.dates_filter_layout)");
        d0.c = viewById14;
        final View viewById15 = viewById14.findViewById(2131427753);
        zzd.e((Object)viewById15, "datesLayout.findViewById(R.id.back_button)");
        final ImageView d2 = (ImageView)viewById15;
        d0.d = d2;
        d2.getDrawable().setAutoMirrored(true);
        final View c2 = d0.c;
        if (c2 == null) {
            zzd.m("datesLayout");
            throw null;
        }
        final View viewById16 = c2.findViewById(2131431327);
        zzd.e((Object)viewById16, "datesLayout.findViewById\u2026.selection_recycler_view)");
        d0.e = (RecyclerView)viewById16;
        for (qa8[] values = qa8.values(); i < values.length; ++i) {
            final qa8 qa8 = values[i];
            final ArrayList f2 = d0.f;
            final la8$a la8$a = new la8$a();
            la8$a.a = d0.a.getString(qa8.C0);
            la8$a.d = qa8.C0;
            f2.add(((h4j)la8$a).e());
        }
        this.Q0.getDrawable().setAutoMirrored(true);
        this.P0.setOnClickListener((View$OnClickListener)new tpf((Object)this, 3));
        final ra8 d3 = this.D0;
        final rzw onClickListener = new rzw((Object)this, 6);
        Objects.requireNonNull(d3);
        final ImageView d4 = d3.d;
        if (d4 != null) {
            ((View)d4).setOnClickListener((View$OnClickListener)onClickListener);
            final ra8 d5 = this.D0;
            final hei g = new hei(this);
            Objects.requireNonNull(d5);
            d5.g = (hhj)g;
            return;
        }
        zzd.m("backButton");
        throw null;
    }
    
    public final void a() {
        saw.b((okm)this.F0.c("", "impression"));
        this.H0.setVisibility(0);
        final View a = this.C0.a;
        if (a == null) {
            zzd.m("authorsLayout");
            throw null;
        }
        a.setVisibility(8);
        final View c = this.D0.c;
        if (c != null) {
            c.setVisibility(8);
            return;
        }
        zzd.m("datesLayout");
        throw null;
    }
    
    public final void b(final String text) {
        oyv a;
        if (text != null) {
            ((TextView)this.N0).setText((CharSequence)text);
            a = oyv.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            ((TextView)this.N0).setText((CharSequence)this.E0.getString(2131951973));
        }
    }
    
    public final View getView() {
        return this.G0;
    }
    
    public interface a
    {
        void a(final List<String> p0);
    }
    
    public interface b
    {
        void a(final fvj<Integer, String> p0);
    }
}
