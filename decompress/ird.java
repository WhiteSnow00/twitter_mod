import android.os.Build$VERSION;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.app.Dialog;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ird implements View$OnTouchListener
{
    public final Dialog D0;
    public final int E0;
    public final int F0;
    public final int G0;
    
    public ird(final Dialog d0, final Rect rect) {
        this.D0 = d0;
        this.E0 = rect.left;
        this.F0 = rect.top;
        this.G0 = ViewConfiguration.get(d0.getContext()).getScaledWindowTouchSlop();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final View viewById = view.findViewById(16908290);
        final int n = viewById.getLeft() + this.E0;
        final int width = viewById.getWidth();
        final int n2 = viewById.getTop() + this.F0;
        if (new RectF((float)n, (float)n2, (float)(width + n), (float)(viewById.getHeight() + n2)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build$VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            final int g0 = this.G0;
            obtain.setLocation((float)(-g0 - 1), (float)(-g0 - 1));
        }
        view.performClick();
        return this.D0.onTouchEvent(obtain);
    }
}
