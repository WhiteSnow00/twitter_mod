import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.b;
import android.widget.AutoCompleteTextView;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cj9 implements View$OnTouchListener
{
    public final AutoCompleteTextView D0;
    public final b E0;
    
    public cj9(final b e0, final AutoCompleteTextView d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.E0.m()) {
                this.E0.l = false;
            }
            b.g(this.E0, this.D0);
            b.h(this.E0);
        }
        return false;
    }
}
