import android.graphics.Matrix;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acx extends zbx
{
    public final void c(final View view, final int n, final int n2, final int n3, final int n4) {
        view.setLeftTopRightBottom(n, n2, n3, n4);
    }
    
    @Override
    public final void d(final View view, final int transitionVisibility) {
        view.setTransitionVisibility(transitionVisibility);
    }
    
    public final float e(final View view) {
        return view.getTransitionAlpha();
    }
    
    public final void f(final View view, final float transitionAlpha) {
        view.setTransitionAlpha(transitionAlpha);
    }
    
    public final void g(final View view, final Matrix animationMatrix) {
        view.setAnimationMatrix(animationMatrix);
    }
    
    public final void h(final View view, final Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
    
    public final void i(final View view, final Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
