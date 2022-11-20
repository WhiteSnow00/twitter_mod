import android.view.View;
import android.app.Activity;
import java.util.Objects;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i2c implements TextView$OnEditorActionListener
{
    public final int D0;
    public final Object E0;
    
    public i2c(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final boolean onEditorAction(final TextView textView, int n, final KeyEvent keyEvent) {
        final int d0 = this.D0;
        final boolean b = false;
        switch (d0) {
            default: {
                final hcn hcn = (hcn)this.E0;
                czd.f((Object)hcn, "this$0");
                if (n == 6) {
                    ((View)hcn.O0).clearFocus();
                }
                return false;
            }
            case 0: {
                final j2c j2c = (j2c)this.E0;
                Objects.requireNonNull(j2c);
                boolean b2 = b;
                if (keyEvent != null) {
                    b2 = b;
                    if (keyEvent.getAction() == 0) {
                        final String string = textView.getText().toString();
                        if (!string.isEmpty() && !string.equals(j2c.c1)) {
                            if (j2c.e1 == 2 && "trending".equals(j2c.c1)) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            if (n != 0) {
                                ii8.L((Activity)((u9)j2c).E0, string, 1, string, "trending", 2, j2c.Y0, ((u9)j2c).K0);
                            }
                            else {
                                j2c.c1 = string;
                                j2c.b1 = string;
                                j2c.e1 = 1;
                                j2c.i1(false);
                                j2c.X0.j2(1, j2c.c1);
                            }
                        }
                        else {
                            j2c.i1(false);
                        }
                        b2 = true;
                    }
                }
                return b2;
            }
        }
    }
}
