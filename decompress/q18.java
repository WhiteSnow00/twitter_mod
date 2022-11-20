import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q18 extends ste implements qsb<s18, fzv>
{
    public final o18 D0;
    
    public q18(final o18 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final s18 s18 = (s18)o;
        czd.f((Object)s18, "$this$distinct");
        final boolean a = czd.a((Object)String.valueOf(((AppCompatEditText)this.D0.E0).getText()), (Object)s18.a);
        int visibility = 0;
        if (!a) {
            ((TextView)this.D0.E0).setText(s18.a);
            ((EditText)this.D0.E0).setSelection(Math.max(s18.a.length(), 0));
        }
        final ImageButton f0 = this.D0.F0;
        if (s18.a.length() == 0) {
            visibility = 8;
        }
        ((View)f0).setVisibility(visibility);
        return fzv.a;
    }
}
