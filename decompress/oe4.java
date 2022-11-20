import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oe4 extends ste implements nsb<Boolean>
{
    public final View D0;
    
    public oe4(final View d0) {
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        ViewGroup viewGroup;
        for (ViewParent viewParent = this.D0.getParent(); viewParent != null && viewParent instanceof ViewGroup; viewParent = ((View)viewGroup).getParent()) {
            viewGroup = (ViewGroup)viewParent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }
}
