import android.view.View;
import com.google.android.material.datepicker.d;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fng implements View$OnClickListener
{
    public final d D0;
    
    public fng(final d d0) {
        this.D0 = d0;
    }
    
    public final void onClick(final View view) {
        final d d0 = this.D0;
        ((View)d0.k2).setEnabled(d0.f2().c3());
        this.D0.i2.toggle();
        final d d2 = this.D0;
        d2.l2(d2.i2);
        this.D0.j2();
    }
}
