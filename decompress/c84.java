import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c84 extends wf
{
    public final CheckableImageButton d;
    
    public c84(final CheckableImageButton d) {
        this.d = d;
    }
    
    @Override
    public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setChecked(this.d.isChecked());
    }
    
    @Override
    public final void d(final View view, final ng ng) {
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        ng.C(this.d.J0);
        ng.D(this.d.isChecked());
    }
}
