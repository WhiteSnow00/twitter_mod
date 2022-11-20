import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b1t
{
    public final ivm a;
    
    public b1t(final ivm a) {
        this.a = a;
    }
    
    public final void a(final TextView textView, final String text) {
        if (ikr.g((CharSequence)text)) {
            textView.setText((CharSequence)text);
            ((View)textView).setVisibility(0);
        }
        else {
            ((View)textView).setVisibility(8);
        }
    }
}
