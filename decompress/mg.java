import android.widget.TextView;
import java.util.WeakHashMap;
import com.google.android.material.internal.CheckableImageButton;
import android.text.method.KeyListener;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b$h;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mg implements AccessibilityManager$TouchExplorationStateChangeListener
{
    public final lg C0;
    
    public mg(final lg c0) {
        this.C0 = c0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mg && this.C0.equals(((mg)o).C0));
    }
    
    @Override
    public final int hashCode() {
        return this.C0.hashCode();
    }
    
    public final void onTouchExplorationStateChanged(final boolean b) {
        final b$h b$h = (b$h)this.C0;
        final TextInputLayout a = ((p4a)b$h.a).a;
        if (a != null) {
            final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)a.getEditText();
            if (autoCompleteTextView != null) {
                final KeyListener keyListener = ((TextView)autoCompleteTextView).getKeyListener();
                final int n = 1;
                if (keyListener == null) {
                    final CheckableImageButton c = ((p4a)b$h.a).c;
                    int n2 = n;
                    if (b) {
                        n2 = 2;
                    }
                    final WeakHashMap a2 = p5x.a;
                    p5x$d.s((View)c, n2);
                }
            }
        }
    }
}
