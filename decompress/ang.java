import android.view.View;
import com.google.android.material.datepicker.c;
import com.google.android.material.datepicker.g;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ang implements View$OnClickListener
{
    public final /* synthetic */ g C0;
    public final /* synthetic */ c D0;
    
    public ang(final c d0, final g c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void onClick(final View view) {
        final int n = this.D0.Z1().t1() - 1;
        if (n >= 0) {
            this.D0.b2(this.C0.C(n));
        }
    }
}
