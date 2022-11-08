import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l0t
{
    public final rum a;
    
    public l0t(final rum a) {
        this.a = a;
    }
    
    public final void a(final TextView textView, final String text) {
        if (pjr.g((CharSequence)text)) {
            textView.setText((CharSequence)text);
            ((View)textView).setVisibility(0);
        }
        else {
            ((View)textView).setVisibility(8);
        }
    }
}
