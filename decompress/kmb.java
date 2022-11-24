import android.os.ResultReceiver;
import android.view.View;
import java.util.Objects;
import com.twitter.app.safety.mutedkeywords.composer.c;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmb implements TextView$OnEditorActionListener
{
    public final lmb F0;
    
    public kmb(final lmb f0) {
        this.F0 = f0;
    }
    
    public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        final lmb f0 = this.F0;
        f0.c();
        final lmb$b d = f0.d;
        if (d != null) {
            final c c = (c)((vrx)d).G0;
            Objects.requireNonNull(c);
            if (n == 5 && p70.o(((sml$a$b)((u9)c).c()).G0.getContext())) {
                hdx.w(((View)c.a1.b).getContext(), (View)c.a1.b, false, (ResultReceiver)null);
            }
        }
        return false;
    }
}
