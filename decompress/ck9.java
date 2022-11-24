import com.google.android.material.textfield.b;
import android.widget.AutoCompleteTextView$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ck9 implements AutoCompleteTextView$OnDismissListener
{
    public final b a;
    
    public ck9(final b a) {
        this.a = a;
    }
    
    public final void onDismiss() {
        b.h(this.a);
        b.f(this.a, false);
    }
}
