import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class zbx extends ybx
{
    public static boolean S0 = true;
    
    @SuppressLint({ "NewApi" })
    public void d(final View view, final int transitionVisibility) {
        if (Build$VERSION.SDK_INT == 28) {
            super.d(view, transitionVisibility);
        }
        else if (zbx.S0) {
            try {
                view.setTransitionVisibility(transitionVisibility);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                zbx.S0 = false;
            }
        }
    }
}
