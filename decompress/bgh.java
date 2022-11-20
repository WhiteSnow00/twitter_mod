import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.twitter.ui.widget.TwitterEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgh extends ste implements qsb<tgh, fzv>
{
    public final yfh D0;
    
    public bgh(final yfh d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tgh tgh = (tgh)o;
        czd.f((Object)tgh, "$this$distinct");
        if (!czd.a((Object)String.valueOf(((AppCompatEditText)this.D0.K0).getText()), (Object)tgh.e)) {
            ((TextView)this.D0.K0).setText((CharSequence)tgh.e);
        }
        final TwitterEditText k0 = this.D0.K0;
        ((EditText)k0).setSelection(String.valueOf(((AppCompatEditText)k0).getText()).length());
        return fzv.a;
    }
}
