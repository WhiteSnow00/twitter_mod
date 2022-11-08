import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.b;
import android.widget.AutoCompleteTextView;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tj9 implements View$OnTouchListener
{
    public final /* synthetic */ AutoCompleteTextView C0;
    public final /* synthetic */ b D0;
    
    public tj9(final b d0, final AutoCompleteTextView c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.D0.m()) {
                this.D0.l = false;
            }
            b.g(this.D0, this.C0);
            b.h(this.D0);
        }
        return false;
    }
}
