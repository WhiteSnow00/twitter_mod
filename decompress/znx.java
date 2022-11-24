import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.webkit.WebView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class znx extends WebView
{
    public znx(final Context context) {
        super(context, (AttributeSet)null);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }
    
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
