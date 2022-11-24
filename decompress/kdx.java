import android.annotation.SuppressLint;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class kdx extends pdx
{
    public static boolean Q0 = true;
    
    @SuppressLint({ "NewApi" })
    public float e(final View view) {
        if (kdx.Q0) {
            try {
                return view.getTransitionAlpha();
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                kdx.Q0 = false;
            }
        }
        return view.getAlpha();
    }
    
    @SuppressLint({ "NewApi" })
    public void f(final View view, final float n) {
        if (kdx.Q0) {
            try {
                view.setTransitionAlpha(n);
                return;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                kdx.Q0 = false;
            }
        }
        view.setAlpha(n);
    }
}
