import android.widget.TextView;
import android.content.res.Resources;
import com.twitter.ui.components.button.legacy.TwitterButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gt5 extends gue implements rtb<ht5, oyv>
{
    public final /* synthetic */ ct5 C0;
    
    public gt5(final ct5 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ht5 ht5 = (ht5)o;
        zzd.f((Object)ht5, "$this$distinct");
        final TwitterButton h0 = this.C0.H0;
        int buttonAppearance;
        if (ht5.b) {
            buttonAppearance = 2132018993;
        }
        else {
            buttonAppearance = 2132018994;
        }
        h0.setButtonAppearance(buttonAppearance);
        final ct5 c0 = this.C0;
        final TwitterButton h2 = c0.H0;
        final Resources resources = c0.C0.getResources();
        int n;
        if (ht5.b) {
            n = 2131953879;
        }
        else {
            n = 2131953881;
        }
        ((TextView)h2).setText((CharSequence)resources.getString(n));
        return oyv.a;
    }
}
