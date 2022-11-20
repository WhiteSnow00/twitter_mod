import com.twitter.android.topiccarousel.MediaTileContainerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g1h implements View$OnTouchListener
{
    public static final g1h D0;
    
    static {
        D0 = new g1h();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int p2 = MediaTileContainerView.P0;
        return motionEvent.getAction() == 2;
    }
}
