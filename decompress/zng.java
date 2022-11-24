import android.view.View;
import com.google.android.material.datepicker.d;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zng implements View$OnClickListener
{
    public final d F0;
    
    public zng(final d f0) {
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        final d f0 = this.F0;
        ((View)f0.m2).setEnabled(f0.f2().d3());
        this.F0.k2.toggle();
        final d f2 = this.F0;
        f2.l2(f2.k2);
        this.F0.j2();
    }
}
