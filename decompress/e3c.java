import com.twitter.media.legacy.widget.FoundMediaSearchView;
import android.os.ResultReceiver;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import java.util.Objects;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3c implements TextView$OnEditorActionListener
{
    public final f3c F0;
    
    public e3c(final f3c f0) {
        this.F0 = f0;
    }
    
    public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        final f3c f0 = this.F0;
        Objects.requireNonNull(f0);
        boolean b = false;
        if (keyEvent != null) {
            b = b;
            if (keyEvent.getAction() == 0) {
                final CharSequence text = textView.getText();
                if (text.length() > 0) {
                    final String string = text.toString();
                    iwl.n((Activity)((u9)f0).G0, string, 1, string, "category", 1, f0.a1, f0.Z0);
                    final dob g0 = ((u9)f0).G0;
                    final FoundMediaSearchView b2 = f0.b1;
                    vmw.g((Object)b2);
                    hdx.w((Context)g0, (View)b2, false, (ResultReceiver)null);
                }
                b = true;
            }
        }
        return b;
    }
}
