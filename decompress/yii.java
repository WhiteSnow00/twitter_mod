import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yii extends BottomSheetBehavior$c
{
    public final BottomSheetBehavior<FrameLayout> a;
    
    public yii(final BottomSheetBehavior<FrameLayout> a) {
        this.a = a;
    }
    
    public final void b(final View view, final float n) {
    }
    
    public final void c(final View view, final int n) {
        if (n == 1) {
            this.a.H(3);
        }
    }
}
