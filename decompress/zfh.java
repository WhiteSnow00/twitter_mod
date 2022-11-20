import android.widget.TextView;
import com.twitter.ui.widget.TwitterEditText;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfh extends ste implements qsb<tgh, fzv>
{
    public final yfh D0;
    
    public zfh(final yfh d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tgh tgh = (tgh)o;
        czd.f((Object)tgh, "$this$distinct");
        final TwitterEditText k0 = this.D0.K0;
        InputFilter[] filters;
        if (tgh.i <= 0) {
            filters = new InputFilter[0];
        }
        else {
            filters = (InputFilter[])new InputFilter$LengthFilter[] { new InputFilter$LengthFilter(tgh.i) };
        }
        ((TextView)k0).setFilters(filters);
        return fzv.a;
    }
}
