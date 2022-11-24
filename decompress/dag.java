import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dag extends GestureDetector$SimpleOnGestureListener
{
    public final eag F0;
    
    public dag(final eag f0) {
        this.F0 = f0;
    }
    
    public final boolean onSingleTapConfirmed(final MotionEvent motionEvent) {
        e0e.f((Object)motionEvent, "e");
        this.F0.Y4("welcome");
        return true;
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        e0e.f((Object)motionEvent, "e");
        return true;
    }
}
