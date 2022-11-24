import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ago
{
    public static final void a(final View view, final View view2, final View view3) {
        e0e.f((Object)view, "<this>");
        e0e.f((Object)view2, "reactButton");
        view3.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener(view3, view2, view) {
            public final View F0;
            public final View G0;
            public final View H0;
            
            public final void onGlobalLayout() {
                this.F0.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                final int[] array = new int[2];
                this.G0.getLocationOnScreen(array);
                final int[] array2 = new int[2];
                this.F0.getLocationOnScreen(array2);
                final int n = array[1];
                final int n2 = array2[1];
                final int n3 = array2[0];
                final int n4 = this.F0.getWidth() / 2;
                final int n5 = array[0];
                final int n6 = this.G0.getWidth() / 2;
                final ViewGroup$LayoutParams layoutParams = this.H0.getLayoutParams();
                ViewGroup$MarginLayoutParams layoutParams2;
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    layoutParams2 = (ViewGroup$MarginLayoutParams)layoutParams;
                }
                else {
                    layoutParams2 = null;
                }
                if (layoutParams2 == null) {
                    return;
                }
                layoutParams2.bottomMargin = n - n2;
                layoutParams2.leftMargin = this.F0.getWidth() / 2 + (n4 + n3 - (n6 + n5));
                this.H0.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            }
        });
    }
}
