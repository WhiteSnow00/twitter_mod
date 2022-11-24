import java.util.Map;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class haa implements xlx<qaa, paa, oaa>
{
    public final View F0;
    public final ds2 G0;
    public final TextView H0;
    public final TextView I0;
    public final TextView J0;
    public final TextView K0;
    public final TextView L0;
    public final View M0;
    public final znl<paa> N0;
    
    public haa(View viewById, final ds2 g0) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)g0, "bugReporter");
        this.F0 = viewById;
        this.G0 = g0;
        final View viewById2 = viewById.findViewById(2131429425);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.header_text)");
        this.H0 = (TextView)viewById2;
        final View viewById3 = viewById.findViewById(2131428993);
        e0e.e((Object)viewById3, "rootView.findViewById(R.id.exception_message)");
        this.I0 = (TextView)viewById3;
        final View viewById4 = viewById.findViewById(2131428584);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.data_type)");
        this.J0 = (TextView)viewById4;
        final View viewById5 = viewById.findViewById(2131428959);
        e0e.e((Object)viewById5, "rootView.findViewById(R.id.entity_group_id)");
        this.K0 = (TextView)viewById5;
        final View viewById6 = viewById.findViewById(2131431690);
        e0e.e((Object)viewById6, "rootView.findViewById(R.id.stack_trace)");
        this.L0 = (TextView)viewById6;
        viewById = viewById.findViewById(2131427966);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.bug_report_button)");
        this.M0 = viewById;
        this.N0 = (znl<paa>)new znl();
        vq9.a(viewById).subscribe((rk6)new bu1((stb)new stb<vzv, vzv>(this) {
            public final haa F0;
            
            public final Object invoke(final Object o) {
                final vzv vzv = (vzv)o;
                this.F0.N0.onNext((Object)paa$a.a);
                return vzv.a;
            }
        }, 2));
    }
    
    public final void T(final ccx ccx) {
        final qaa qaa = (qaa)ccx;
        e0e.f((Object)qaa, "state");
        final View f0 = this.F0;
        int visibility;
        if (qaa.b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        f0.setVisibility(visibility);
        final aaa a = qaa.a;
        final Map<String, String> k = a.k;
        final String s = "";
        String s2;
        if (k == null || (s2 = k.get("exception")) == null) {
            s2 = "";
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final StyleSpan styleSpan = new StyleSpan(1);
        final int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence)this.F0.getContext().getString(2131953033));
        spannableStringBuilder.setSpan((Object)styleSpan, length, spannableStringBuilder.length(), 17);
        this.H0.setText((CharSequence)spannableStringBuilder.append((CharSequence)" ").append((CharSequence)a.c().a));
        final SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        final StyleSpan styleSpan2 = new StyleSpan(1);
        final int length2 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence)this.F0.getContext().getString(2131955061));
        spannableStringBuilder2.setSpan((Object)styleSpan2, length2, spannableStringBuilder2.length(), 17);
        this.I0.setText((CharSequence)spannableStringBuilder2.append((CharSequence)" ").append((CharSequence)s2));
        final SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        final StyleSpan styleSpan3 = new StyleSpan(1);
        final int length3 = spannableStringBuilder3.length();
        spannableStringBuilder3.append((CharSequence)this.F0.getContext().getString(2131952996));
        spannableStringBuilder3.setSpan((Object)styleSpan3, length3, spannableStringBuilder3.length(), 17);
        this.J0.setText((CharSequence)spannableStringBuilder3.append((CharSequence)" ").append((CharSequence)String.valueOf(a.c().e)));
        final SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
        final StyleSpan styleSpan4 = new StyleSpan(1);
        final int length4 = spannableStringBuilder4.length();
        spannableStringBuilder4.append((CharSequence)this.F0.getContext().getString(2131953887));
        spannableStringBuilder4.setSpan((Object)styleSpan4, length4, spannableStringBuilder4.length(), 17);
        this.K0.setText((CharSequence)spannableStringBuilder4.append((CharSequence)" ").append((CharSequence)a.c().c));
        final SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
        final StyleSpan styleSpan5 = new StyleSpan(1);
        final int length5 = spannableStringBuilder5.length();
        spannableStringBuilder5.append((CharSequence)this.F0.getContext().getString(2131958464));
        spannableStringBuilder5.setSpan((Object)styleSpan5, length5, spannableStringBuilder5.length(), 17);
        final SpannableStringBuilder append = spannableStringBuilder5.append((CharSequence)" ");
        final Map<String, String> i = a.k;
        String s3 = s;
        if (i != null) {
            s3 = i.get("stack_trace");
            if (s3 == null) {
                s3 = s;
            }
        }
        this.L0.setText((CharSequence)append.append((CharSequence)s3));
    }
    
    public final void r(final Object o) {
        final oaa oaa = (oaa)o;
        e0e.f((Object)oaa, "effect");
        if (oaa instanceof oaa$a) {
            final ds2 g0 = this.G0;
            final String string = this.F0.getContext().getString(2131958586);
            e0e.e((Object)string, "rootView.context.getString(R.string.summary_field)");
            g0.f((bs2)new k9a(string, String.valueOf(((oaa$a)oaa).a.k)));
        }
    }
    
    public final t5j<paa> w() {
        return (t5j<paa>)this.N0;
    }
    
    public interface b
    {
        haa a(final View p0);
    }
}
