import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sam extends v3e<qpv, wam>
{
    public final a6p d;
    public final exs e;
    public final q6p f;
    
    public sam(final a6p d, final exs e, final q6p f) {
        super((Class)qpv.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final wam wam = (wam)c7x;
        final qpv qpv = (qpv)o;
        final mhp onClickListener = new mhp((Object)this, (Object)qpv, 1);
        final String a = qpv.k.a.a;
        final String g = this.f.g();
        final vam d0 = wam.D0;
        Object text = a;
        if (!pjr.e((CharSequence)g)) {
            if (pjr.e((CharSequence)a)) {
                text = a;
            }
            else {
                text = new SpannableStringBuilder((CharSequence)a);
                final int length = a.length();
                final int length2 = g.length();
                final int index = a.toLowerCase(t4s.d()).indexOf(g);
                if (index > -1 && index + length2 <= length) {
                    ((SpannableStringBuilder)text).setSpan((Object)new StyleSpan(1), 0, index, 33);
                    ((SpannableStringBuilder)text).setSpan((Object)new StyleSpan(1), index + length2, length, 33);
                }
            }
        }
        d0.D0.setText((CharSequence)text);
        final TextView d2 = d0.D0;
        ((View)d2).setContentDescription((CharSequence)mhc.b(((View)d2).getContext(), ((CharSequence)text).toString()));
        wam.D0.C0.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        final View b = w30.B(viewGroup, 2131625472, viewGroup, false);
        return (c7x)new wam(new vam(b, (TextView)b.findViewById(2131432073)));
    }
    
    public static final class a extends v3e$a<qpv>
    {
        public a(final fxe<sam> fxe) {
            super((Class)qpv.class, (fxe)fxe);
        }
    }
}
