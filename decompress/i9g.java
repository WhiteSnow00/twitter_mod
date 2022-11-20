import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i9g extends GestureDetector$SimpleOnGestureListener
{
    public final j9g D0;
    
    public i9g(final j9g d0) {
        this.D0 = d0;
    }
    
    public final boolean onSingleTapConfirmed(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "e");
        this.D0.Y4("welcome");
        return true;
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "e");
        return true;
    }
}
