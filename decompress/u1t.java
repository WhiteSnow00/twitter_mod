import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u1t
{
    public final yvm a;
    
    public u1t(final yvm a) {
        this.a = a;
    }
    
    public final void a(final TextView textView, final String text) {
        if (flr.g((CharSequence)text)) {
            textView.setText((CharSequence)text);
            ((View)textView).setVisibility(0);
        }
        else {
            ((View)textView).setVisibility(8);
        }
    }
}
