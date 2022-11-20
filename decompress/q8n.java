import android.view.View;
import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import java.util.Set;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8n extends ste implements qsb<r8n, fzv>
{
    public final l8n D0;
    
    public q8n(final l8n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final r8n r8n = (r8n)o;
        czd.f((Object)r8n, "$this$distinct");
        final boolean c = r8n.c;
        final boolean b = false;
        if (c) {
            final l8n d0 = this.D0;
            final Set b2 = r8n.b;
            ((View)d0.G0).setVisibility(0);
            ((View)d0.K0).setVisibility(8);
            d0.H0.setText(2131957546);
            d0.I0.setText(d0.D0.getResources().getQuantityText(2131820668, b2.size()));
            d0.J0.setText(2131952374);
            d0.a(false);
        }
        else {
            final l8n d2 = this.D0;
            final boolean d3 = r8n.d;
            final TextView h0 = d2.H0;
            int text;
            if (d3) {
                text = 2131956914;
            }
            else {
                text = 2131956913;
            }
            h0.setText(text);
            d2.I0.setText(2131956912);
            d2.J0.setText(2131956915);
            ((View)d2.G0).setVisibility(8);
            final boolean m0 = d2.F0.getUser().M0;
            if (!m0 && !d3) {
                ((View)d2.K0).setVisibility(8);
            }
            else {
                int n;
                if (m0) {
                    n = 2131952531;
                }
                else {
                    n = 2131956951;
                }
                int n2;
                if (m0) {
                    n2 = 2131956008;
                }
                else {
                    n2 = 2131959506;
                }
                final TypefacesTextView k0 = d2.K0;
                czd.f((Object)k0, "textView");
                final Context context = ((View)k0).getContext();
                final Context context2 = ((View)k0).getContext();
                czd.e((Object)context2, "textView.context");
                final ce4 n3 = jee.n(context, n2, d4j.i(context2, 2130969074));
                f0r.c((TextView)k0);
                ((TextView)k0).setText((CharSequence)uoz.D((Object[])new ce4[] { n3 }, ((View)k0).getContext().getString(n), "{{}}"));
                ((View)d2.K0).setVisibility(0);
            }
            boolean b3 = b;
            if (d3) {
                b3 = b;
                if (djo.D()) {
                    b3 = true;
                }
            }
            d2.a(b3);
        }
        return fzv.a;
    }
}
