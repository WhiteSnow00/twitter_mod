import android.widget.TextView;
import com.twitter.ui.widget.TwitterEditText;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngh extends pue implements stb<jhh, vzv>
{
    public final mgh F0;
    
    public ngh(final mgh f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jhh jhh = (jhh)o;
        e0e.f((Object)jhh, "$this$distinct");
        final TwitterEditText m0 = this.F0.M0;
        InputFilter[] filters;
        if (jhh.i <= 0) {
            filters = new InputFilter[0];
        }
        else {
            filters = (InputFilter[])new InputFilter$LengthFilter[] { new InputFilter$LengthFilter(jhh.i) };
        }
        ((TextView)m0).setFilters(filters);
        return vzv.a;
    }
}
