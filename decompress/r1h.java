import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r1h implements View$OnTouchListener
{
    public static final r1h G0;
    public static final r1h H0;
    public final int F0;
    
    static {
        G0 = new r1h(0);
        H0 = new r1h(1);
    }
    
    public r1h(final int f0) {
        this.F0 = f0;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        switch (this.F0) {
            default: {
                return true;
            }
            case 0: {
                final int k2 = s1h.k2;
                return false;
            }
        }
    }
}
