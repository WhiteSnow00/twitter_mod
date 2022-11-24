import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class ldx extends kdx
{
    public static boolean R0 = true;
    public static boolean S0 = true;
    public static boolean T0 = true;
    
    @SuppressLint({ "NewApi" })
    public void g(final View view, final Matrix animationMatrix) {
        if (ldx.R0) {
            try {
                view.setAnimationMatrix(animationMatrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                ldx.R0 = false;
            }
        }
    }
    
    @SuppressLint({ "NewApi" })
    public void h(final View view, final Matrix matrix) {
        if (ldx.S0) {
            try {
                view.transformMatrixToGlobal(matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                ldx.S0 = false;
            }
        }
    }
    
    @SuppressLint({ "NewApi" })
    public void i(final View view, final Matrix matrix) {
        if (ldx.T0) {
            try {
                view.transformMatrixToLocal(matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                ldx.T0 = false;
            }
        }
    }
}
