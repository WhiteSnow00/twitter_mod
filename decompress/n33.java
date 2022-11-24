import android.widget.TextView;
import android.view.View;
import android.widget.RadioButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n33 extends pue implements stb<b43, vzv>
{
    public final f33 F0;
    
    public n33(final f33 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final b43 b43 = (b43)o;
        e0e.f((Object)b43, "$this$distinct");
        ((View)this.F0.S0).setEnabled(b43.i ^ true);
        final f33 f0 = this.F0;
        final RadioButton s0 = f0.S0;
        int textColor;
        if (b43.i) {
            textColor = zrm.f(f0.O0, 2130968590, 0, 2, (Object)null);
        }
        else {
            textColor = zrm.f(f0.O0, 2130968593, 0, 2, (Object)null);
        }
        ((TextView)s0).setTextColor(textColor);
        return vzv.a;
    }
}
