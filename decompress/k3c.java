import android.view.View;
import android.app.Activity;
import java.util.Objects;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k3c implements TextView$OnEditorActionListener
{
    public final int F0;
    public final Object G0;
    
    public k3c(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final boolean onEditorAction(final TextView textView, int n, final KeyEvent keyEvent) {
        final int f0 = this.F0;
        final boolean b = false;
        switch (f0) {
            default: {
                final zcn zcn = (zcn)this.G0;
                e0e.f((Object)zcn, "this$0");
                if (n == 6) {
                    ((View)zcn.Q0).clearFocus();
                }
                return false;
            }
            case 0: {
                final l3c l3c = (l3c)this.G0;
                Objects.requireNonNull(l3c);
                boolean b2 = b;
                if (keyEvent != null) {
                    b2 = b;
                    if (keyEvent.getAction() == 0) {
                        final String string = textView.getText().toString();
                        if (!string.isEmpty() && !string.equals(l3c.e1)) {
                            if (l3c.g1 == 2 && "trending".equals(l3c.e1)) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            if (n != 0) {
                                iwl.n((Activity)((u9)l3c).G0, string, 1, string, "trending", 2, l3c.a1, ((u9)l3c).M0);
                            }
                            else {
                                l3c.e1 = string;
                                l3c.d1 = string;
                                l3c.g1 = 1;
                                l3c.i1(false);
                                l3c.Z0.j2(1, l3c.e1);
                            }
                        }
                        else {
                            l3c.i1(false);
                        }
                        b2 = true;
                    }
                }
                return b2;
            }
        }
    }
}
