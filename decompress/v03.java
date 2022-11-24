import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.twitter.ui.widget.TwitterEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v03 extends pue implements stb<p13, vzv>
{
    public final s03 F0;
    
    public v03(final s03 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final p13 p = (p13)o;
        e0e.f((Object)p, "$this$distinct");
        if (!e0e.a((Object)String.valueOf(((AppCompatEditText)this.F0.L0).getText()), (Object)p.e)) {
            ((TextView)this.F0.L0).setText((CharSequence)p.e);
        }
        final TwitterEditText l0 = this.F0.L0;
        ((EditText)l0).setSelection(String.valueOf(((AppCompatEditText)l0).getText()).length());
        return vzv.a;
    }
}
