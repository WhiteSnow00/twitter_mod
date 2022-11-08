import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zox extends ukg
{
    public final WindowInsetsController V0;
    public Window W0;
    
    public zox(final Window w0) {
        final WindowInsetsController insetsController = w0.getInsetsController();
        this.V0 = insetsController;
        this.W0 = w0;
    }
    
    public final void W0(final boolean b) {
        if (b) {
            final Window w0 = this.W0;
            if (w0 != null) {
                final View decorView = w0.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 0x10);
            }
            this.V0.setSystemBarsAppearance(16, 16);
        }
        else {
            final Window w2 = this.W0;
            if (w2 != null) {
                final View decorView2 = w2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & 0xFFFFFFEF);
            }
            this.V0.setSystemBarsAppearance(0, 16);
        }
    }
    
    public final void X0(final boolean b) {
        if (b) {
            final Window w0 = this.W0;
            if (w0 != null) {
                final View decorView = w0.getDecorView();
                decorView.setSystemUiVisibility(0x2000 | decorView.getSystemUiVisibility());
            }
            this.V0.setSystemBarsAppearance(8, 8);
        }
        else {
            final Window w2 = this.W0;
            if (w2 != null) {
                final View decorView2 = w2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & 0xFFFFDFFF);
            }
            this.V0.setSystemBarsAppearance(0, 8);
        }
    }
}
