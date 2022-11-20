import android.view.animation.Interpolator;
import android.view.MotionEvent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cq2 extends ehj
{
    public final bq2 K0;
    
    public cq2(final bq2 k0) {
        this.K0 = k0;
        super(true, true);
    }
    
    public final void a(View e1, final MotionEvent motionEvent) {
        e1 = this.K0.e1;
        if (e1 != null) {
            if (e1.getVisibility() == 0) {
                ec0.i(e1, 150, (Interpolator)null, 4);
            }
            else {
                ec0.c(e1);
            }
        }
    }
}
