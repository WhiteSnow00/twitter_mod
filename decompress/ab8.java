import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ab8 implements q7f
{
    public static final ab8.ab8$a Companion;
    public final View F0;
    public final TextView G0;
    public final TextView H0;
    public final RadioButton I0;
    
    static {
        Companion = new ab8.ab8$a();
    }
    
    public ab8(final View f0, final TextView g0, final TextView h0, final RadioButton i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final View getView() {
        return this.F0;
    }
}
