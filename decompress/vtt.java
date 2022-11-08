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

public final class vtt extends GestureDetector$SimpleOnGestureListener implements View$OnTouchListener, koj$a
{
    public final PointF C0;
    public final PointF D0;
    public final vtt.vtt$a E0;
    public final float F0;
    public final GestureDetector G0;
    public volatile float H0;
    
    public vtt(final Context context, final vtt.vtt$a e0) {
        this.C0 = new PointF();
        this.D0 = new PointF();
        this.E0 = e0;
        this.F0 = 25.0f;
        this.G0 = new GestureDetector(context, (GestureDetector$OnGestureListener)this);
        this.H0 = 3.1415927f;
    }
    
    public final void a(final float[] array, final float n) {
        this.H0 = -n;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        this.C0.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, MotionEvent motionEvent2, float y, float y2) {
        y = (motionEvent2.getX() - this.C0.x) / this.F0;
        y2 = motionEvent2.getY();
        final PointF c0 = this.C0;
        final float n = (y2 - c0.y) / this.F0;
        c0.set(motionEvent2.getX(), motionEvent2.getY());
        final double n2 = this.H0;
        y2 = (float)Math.cos(n2);
        final float n3 = (float)Math.sin(n2);
        final PointF d0 = this.D0;
        d0.x -= y2 * y - n3 * n;
        y = y2 * n + n3 * y + d0.y;
        d0.y = y;
        d0.y = Math.max(-45.0f, Math.min(45.0f, y));
        final vtt.vtt$a e0 = this.E0;
        final PointF d2 = this.D0;
        motionEvent2 = (MotionEvent)e0;
        synchronized (motionEvent2) {
            ((d1r$a)motionEvent2).I0 = d2.y;
            ((d1r$a)motionEvent2).b();
            Matrix.setRotateM(((d1r$a)motionEvent2).H0, 0, -d2.x, 0.0f, 1.0f, 0.0f);
            return true;
        }
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        return ((View)((d1r$a)this.E0).M0).performClick();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        return this.G0.onTouchEvent(motionEvent);
    }
}
