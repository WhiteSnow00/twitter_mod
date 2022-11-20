import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqq extends ste implements qsb<vrq, fzv>
{
    public final zpq D0;
    
    public yqq(final zpq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vrq vrq = (vrq)o;
        czd.f((Object)vrq, "$this$distinct");
        final zpq d0 = this.D0;
        final TypefacesTextView q0 = d0.Q0;
        String text = vrq.d;
        final s21 c = vrq.c;
        String c2;
        if (c != null) {
            c2 = c.c();
        }
        else {
            c2 = null;
        }
        if (text == null || vkr.V((CharSequence)text)) {
            text = d0.H0.getString(2131958237, new Object[] { c2 });
            czd.e((Object)text, "resources.getString(R.st\u2026_card_title, displayName)");
        }
        ((TextView)q0).setText((CharSequence)text);
        return fzv.a;
    }
}
