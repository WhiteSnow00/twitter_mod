import android.view.ViewParent;
import android.view.View;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s83 implements q83
{
    public final Matrix a;
    public final int[] b;
    
    public s83() {
        this.a = new Matrix();
        this.b = new int[2];
    }
    
    @Override
    public void a(View view, final float[] array) {
        czd.f((Object)view, "view");
        czd.f((Object)array, "matrix");
        this.a.reset();
        view.transformMatrixToGlobal(this.a);
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = view.getParent()) {
            view = (View)viewParent;
        }
        view.getLocationOnScreen(this.b);
        final int[] b = this.b;
        final int n = b[0];
        final int n2 = b[1];
        view.getLocationInWindow(b);
        final int[] b2 = this.b;
        this.a.postTranslate((float)(b2[0] - n), (float)(b2[1] - n2));
        blz.X(array, this.a);
    }
}
