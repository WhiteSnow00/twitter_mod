import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yjn extends ste implements qsb<ckn, fzv>
{
    public final njn D0;
    
    public yjn(final njn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ckn ckn = (ckn)o;
        czd.f((Object)ckn, "$this$distinct");
        final Object value = this.D0.H0.getValue();
        czd.e(value, "<get-descriptionView>(...)");
        ((TextView)value).setText((CharSequence)ckn.c);
        return fzv.a;
    }
}
