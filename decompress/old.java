import android.widget.EditText;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class old extends View$AccessibilityDelegate
{
    public final nld a;
    
    public old(final nld a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        final EditText editText = this.a.b.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy((View)editText);
        }
    }
}
