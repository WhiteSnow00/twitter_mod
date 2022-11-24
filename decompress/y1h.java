import com.twitter.android.topiccarousel.MediaTileContainerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y1h implements View$OnTouchListener
{
    public static final y1h F0;
    
    static {
        F0 = new y1h();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int r0 = MediaTileContainerView.R0;
        return motionEvent.getAction() == 2;
    }
}
