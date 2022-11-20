import android.widget.TextView;
import android.content.res.Resources;
import com.twitter.ui.components.button.legacy.TwitterButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ps5 extends ste implements qsb<qs5, fzv>
{
    public final ls5 D0;
    
    public ps5(final ls5 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qs5 qs5 = (qs5)o;
        czd.f((Object)qs5, "$this$distinct");
        final TwitterButton i0 = this.D0.I0;
        int buttonAppearance;
        if (qs5.b) {
            buttonAppearance = 2132018993;
        }
        else {
            buttonAppearance = 2132018994;
        }
        i0.setButtonAppearance(buttonAppearance);
        final ls5 d0 = this.D0;
        final TwitterButton i2 = d0.I0;
        final Resources resources = d0.D0.getResources();
        int n;
        if (qs5.b) {
            n = 2131953879;
        }
        else {
            n = 2131953881;
        }
        ((TextView)i2).setText((CharSequence)resources.getString(n));
        return fzv.a;
    }
}
