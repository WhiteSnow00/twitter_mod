import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s3 implements q1s$c
{
    public float D0;
    public final t3 E0;
    
    public s3(final t3 e0) {
        this.E0 = e0;
        this.D0 = 0.0f;
    }
    
    public final void K3(final ViewGroup viewGroup) {
        if (this.D0 > 0.0f) {
            this.E0.X0.a = new pzt(null, new ozt(2130772038, 2130772040));
        }
        else {
            this.E0.X0.a = new pzt(null, new ozt(2130772038, 2130772039));
        }
        ((vbv)this.E0).R0.j();
    }
    
    public final void N0() {
    }
    
    public final void Q3(final ViewGroup viewGroup) {
    }
    
    public final boolean S2(final MotionEvent motionEvent) {
        return false;
    }
    
    public final void a2(ViewGroup k4, final float n) {
        this.D0 = n;
        k4 = ((u9)this.E0).K4();
        if (k4 != null) {
            if (n >= 0.0f) {
                ((View)k4).setTranslationY(-n);
            }
            else {
                ((View)k4).setTranslationY(n);
            }
        }
    }
    
    public final boolean c3(final MotionEvent motionEvent) {
        return false;
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        return false;
    }
}
