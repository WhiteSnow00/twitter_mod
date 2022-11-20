import android.widget.TextView;
import android.view.View;
import android.widget.RadioButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w23 extends ste implements qsb<i33, fzv>
{
    public final m23 D0;
    
    public w23(final m23 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final i33 i33 = (i33)o;
        czd.f((Object)i33, "$this$distinct");
        ((View)this.D0.R0).setEnabled(i33.j ^ true);
        final m23 d0 = this.D0;
        final RadioButton r0 = d0.R0;
        int textColor;
        if (i33.j) {
            textColor = krm.f(d0.M0, 2130968590, 0, 2, (Object)null);
        }
        else {
            textColor = krm.f(d0.M0, 2130968593, 0, 2, (Object)null);
        }
        ((TextView)r0).setTextColor(textColor);
        return fzv.a;
    }
}
