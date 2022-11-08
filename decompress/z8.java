import android.view.View;
import android.widget.TextView;
import android.text.style.CharacterStyle;
import android.text.SpannableString;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z8 extends gue implements rtb<m9, oyv>
{
    public final /* synthetic */ k8 C0;
    
    public z8(final k8 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final m9 m9 = (m9)o;
        zzd.f((Object)m9, "$this$distinct");
        final k8 c0 = this.C0;
        final w5w a = m9.a;
        Objects.requireNonNull(c0);
        if (a != null) {
            final String j0 = a.J0;
            zzd.e((Object)j0, "it.displayUrl");
            if (j0.length() > 0) {
                final TextView f0 = c0.F0;
                zzd.e((Object)f0, "websiteText");
                ((View)f0).setVisibility(0);
                final TextView f2 = c0.F0;
                final SpannableString text = new SpannableString((CharSequence)a.J0);
                c0.a(text, (CharacterStyle)c0.S0.getValue());
                f2.setText((CharSequence)text);
                lzq.c(c0.F0);
                return oyv.a;
            }
        }
        final TextView f3 = c0.F0;
        zzd.e((Object)f3, "websiteText");
        ((View)f3).setVisibility(8);
        return oyv.a;
    }
}
