import android.view.inputmethod.InputMethodManager;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdx implements Runnable
{
    public final View F0;
    
    public cdx(final View f0) {
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        ((InputMethodManager)this.F0.getContext().getSystemService("input_method")).showSoftInput(this.F0, 1);
    }
}
