import android.widget.TextView;
import android.view.View;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b1h extends wiw
{
    public Set<Long> I0;
    
    public b1h(final Context context) {
        super(context, 2131624817);
    }
    
    public final void g(final View view, final Context context, final uiw uiw) {
        super.g(view, context, uiw);
        final kaw kaw = (kaw)view.getTag();
        view.setBackgroundResource(2131230950);
        if ((uiw.g & 0x400) == 0x0) {
            view.setEnabled(false);
            view.setAlpha(0.3f);
            final TextView f = kaw.f;
            pf8.r(f);
            ((View)f).setVisibility(0);
            kaw.b().setVisibility(8);
        }
        else {
            view.setEnabled(true);
            view.setAlpha(1.0f);
            final TextView f2 = kaw.f;
            pf8.r(f2);
            ((View)f2).setVisibility(8);
            final long a = uiw.a;
            final Set<Long> i0 = this.I0;
            if (i0 != null && i0.contains(a)) {
                view.setBackgroundColor(goz.J(context, 2130969094));
                kaw.b().setVisibility(0);
            }
            else {
                kaw.b().setVisibility(8);
            }
        }
        final TextView j = kaw.i;
        pf8.r(j);
        bl0.a().t();
        ((View)j).setVisibility(8);
    }
}
