import androidx.constraintlayout.widget.b;
import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ytc implements View$OnLayoutChangeListener
{
    public final ztc F0;
    
    public ytc(final ztc f0) {
        this.F0 = f0;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final ztc f0 = this.F0;
        e0e.f((Object)f0, "this$0");
        final b constraintSet = new b();
        constraintSet.g(f0.a);
        constraintSet.f(2131432077, 3);
        constraintSet.f(2131432077, 4);
        if (f0.b.getLineCount() == 1) {
            constraintSet.i(2131432077, 3, 2131432471, 3);
            constraintSet.i(2131432077, 4, 2131432471, 4);
        }
        else {
            constraintSet.j(2131432077, 3, 0, 3, ((View)f0.b).getResources().getDimensionPixelOffset(2131167445));
            constraintSet.i(2131427975, 4, 2131427571, 3);
        }
        f0.a.setConstraintSet(constraintSet);
    }
}
