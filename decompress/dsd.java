import android.view.inputmethod.ExtractedText;
import android.view.View;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsd implements csd
{
    public final nxe a;
    
    public dsd(final Context context) {
        this.a = jty.M(3, (ptb)new ptb<InputMethodManager>(context) {
            public final Context F0;
            
            public final Object invoke() {
                final Object systemService = this.F0.getSystemService("input_method");
                e0e.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return systemService;
            }
        });
    }
    
    public final void a(final IBinder binder) {
        this.f().hideSoftInputFromWindow(binder, 0);
    }
    
    public final void b(final View view, final int n, final int n2, final int n3, final int n4) {
        e0e.f((Object)view, "view");
        this.f().updateSelection(view, n, n2, n3, n4);
    }
    
    public final void c(final View view) {
        e0e.f((Object)view, "view");
        this.f().showSoftInput(view, 0);
    }
    
    public final void d(final View view, final int n, final ExtractedText extractedText) {
        this.f().updateExtractedText(view, n, extractedText);
    }
    
    public final void e(final View view) {
        e0e.f((Object)view, "view");
        this.f().restartInput(view);
    }
    
    public final InputMethodManager f() {
        return (InputMethodManager)this.a.getValue();
    }
}
