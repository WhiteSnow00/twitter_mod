import android.view.MotionEvent;
import com.twitter.android.liveevent.landing.LiveEventAppBarLayoutBehavior;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpf extends GestureDetector$SimpleOnGestureListener
{
    public final LiveEventAppBarLayoutBehavior F0;
    
    public dpf(final LiveEventAppBarLayoutBehavior f0) {
        this.F0 = f0;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        if (LiveEventAppBarLayoutBehavior.P(this.F0, motionEvent, motionEvent2)) {
            this.F0.p.onNext((Object)Boolean.TRUE);
        }
        return super.onFling(motionEvent, motionEvent2, n, n2);
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        if (LiveEventAppBarLayoutBehavior.P(this.F0, motionEvent, motionEvent2)) {
            this.F0.p.onNext((Object)Boolean.TRUE);
        }
        else {
            this.F0.p.onNext((Object)Boolean.FALSE);
        }
        return super.onScroll(motionEvent, motionEvent2, n, n2);
    }
}
