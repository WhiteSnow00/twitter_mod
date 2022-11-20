import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.twitter.ui.widget.TwitterEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c03 extends ste implements qsb<w03, fzv>
{
    public final zz2 D0;
    
    public c03(final zz2 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final w03 w03 = (w03)o;
        czd.f((Object)w03, "$this$distinct");
        if (!czd.a((Object)String.valueOf(((AppCompatEditText)this.D0.J0).getText()), (Object)w03.e)) {
            ((TextView)this.D0.J0).setText((CharSequence)w03.e);
        }
        final TwitterEditText j0 = this.D0.J0;
        ((EditText)j0).setSelection(String.valueOf(((AppCompatEditText)j0).getText()).length());
        return fzv.a;
    }
}
