import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.ExtractedText;
import android.view.View;
import android.os.IBinder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brd implements ard
{
    public final qwe a;
    
    public brd(final Context context) {
        this.a = pps.m(3, (nsb)new brd$a(context));
    }
    
    public final void a(final IBinder binder) {
        this.f().hideSoftInputFromWindow(binder, 0);
    }
    
    public final void b(final View view, final int n, final int n2, final int n3, final int n4) {
        czd.f((Object)view, "view");
        this.f().updateSelection(view, n, n2, n3, n4);
    }
    
    public final void c(final View view) {
        czd.f((Object)view, "view");
        this.f().showSoftInput(view, 0);
    }
    
    public final void d(final View view, final int n, final ExtractedText extractedText) {
        this.f().updateExtractedText(view, n, extractedText);
    }
    
    public final void e(final View view) {
        czd.f((Object)view, "view");
        this.f().restartInput(view);
    }
    
    public final InputMethodManager f() {
        return (InputMethodManager)this.a.getValue();
    }
}
