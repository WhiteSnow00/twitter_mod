import android.view.View;
import com.google.android.material.datepicker.c;
import com.google.android.material.datepicker.g;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tng implements View$OnClickListener
{
    public final g F0;
    public final c G0;
    
    public tng(final c g0, final g f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        final int n = this.G0.Z1().t1() - 1;
        if (n >= 0) {
            this.G0.b2(this.F0.C(n));
        }
    }
}
