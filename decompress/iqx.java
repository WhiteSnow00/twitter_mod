import android.view.View;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqx extends hqx
{
    public iqx(final Window window, final View view) {
        super(window, view);
    }
    
    public final void M(final boolean b) {
        if (b) {
            ((gqx)this).V0.clearFlags(134217728);
            ((gqx)this).V0.addFlags(Integer.MIN_VALUE);
            final View decorView = ((gqx)this).V0.getDecorView();
            decorView.setSystemUiVisibility(0x10 | decorView.getSystemUiVisibility());
        }
        else {
            final View decorView2 = ((gqx)this).V0.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & 0xFFFFFFEF);
        }
    }
}
