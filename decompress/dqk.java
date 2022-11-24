import android.view.View;
import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqk extends pue implements stb<MotionEvent, Boolean>
{
    public final s70 F0;
    
    public dqk(final s70 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final MotionEvent motionEvent = (MotionEvent)o;
        e0e.f((Object)motionEvent, "motionEvent");
        boolean b = false;
        switch (motionEvent.getActionMasked()) {
            default: {
                b = ((View)this.F0).dispatchGenericMotionEvent(motionEvent);
                break;
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                b = ((View)this.F0).dispatchTouchEvent(motionEvent);
                break;
            }
        }
        return b;
    }
}
