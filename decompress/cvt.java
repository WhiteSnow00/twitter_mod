import android.view.View;
import android.opengl.Matrix;
import android.view.MotionEvent;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.GestureDetector;
import android.graphics.PointF;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvt extends GestureDetector$SimpleOnGestureListener implements View$OnTouchListener, fpj$a
{
    public final PointF F0;
    public final PointF G0;
    public final cvt.cvt$a H0;
    public final float I0;
    public final GestureDetector J0;
    public volatile float K0;
    
    public cvt(final Context context, final cvt.cvt$a h0) {
        this.F0 = new PointF();
        this.G0 = new PointF();
        this.H0 = h0;
        this.I0 = 25.0f;
        this.J0 = new GestureDetector(context, (GestureDetector$OnGestureListener)this);
        this.K0 = 3.1415927f;
    }
    
    public final void a(final float[] array, final float n) {
        this.K0 = -n;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        this.F0.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }
    
    public final boolean onScroll(MotionEvent motionEvent, final MotionEvent motionEvent2, float y, float y2) {
        y = (motionEvent2.getX() - this.F0.x) / this.I0;
        y2 = motionEvent2.getY();
        final PointF f0 = this.F0;
        y2 = (y2 - f0.y) / this.I0;
        f0.set(motionEvent2.getX(), motionEvent2.getY());
        final double n = this.K0;
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final PointF g0 = this.G0;
        g0.x -= n2 * y - n3 * y2;
        y = n2 * y2 + n3 * y + g0.y;
        g0.y = y;
        g0.y = Math.max(-45.0f, Math.min(45.0f, y));
        final cvt.cvt$a h0 = this.H0;
        final PointF g2 = this.G0;
        motionEvent = (MotionEvent)h0;
        synchronized (motionEvent) {
            ((v2r$a)motionEvent).L0 = g2.y;
            ((v2r$a)motionEvent).b();
            Matrix.setRotateM(((v2r$a)motionEvent).K0, 0, -g2.x, 0.0f, 1.0f, 0.0f);
            return true;
        }
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        return ((View)((v2r$a)this.H0).P0).performClick();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        return this.J0.onTouchEvent(motionEvent);
    }
}
