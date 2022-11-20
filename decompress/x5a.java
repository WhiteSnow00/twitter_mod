import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x5a implements CompoundButton$OnCheckedChangeListener
{
    public final y5a D0;
    
    public x5a(final y5a d0) {
        this.D0 = d0;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean a) {
        this.D0.J0.a = a;
    }
}
