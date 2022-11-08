import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lh1 extends wf
{
    public final /* synthetic */ hh1 d;
    
    public lh1(final View$AccessibilityDelegate view$AccessibilityDelegate, final hh1 d) {
        this.d = d;
        super(view$AccessibilityDelegate);
    }
    
    public final void d(final View view, final ng ng) {
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        ng.I(this.d.c());
    }
}
