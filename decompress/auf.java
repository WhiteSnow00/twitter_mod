import android.view.View;
import com.twitter.media.av.ui.ClosedCaptionsView;
import android.view.ViewStub$OnInflateListener;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auf implements rk6
{
    public final cuf F0;
    public final boolean G0;
    
    public auf(final cuf f0, final boolean g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        final cuf f0 = this.F0;
        final boolean g0 = this.G0;
        final Boolean b = (Boolean)o;
        Objects.requireNonNull(f0);
        final boolean booleanValue = b;
        f0.S0 = booleanValue;
        f0.T0 = g0;
        final boolean b2 = lk4.b(g0, booleanValue);
        final ClosedCaptionsView r0 = f0.R0;
        if (r0 == null && b2 && r0 == null) {
            f0.Q0.setOnInflateListener((ViewStub$OnInflateListener)buf.F0);
            f0.R0 = (ClosedCaptionsView)f0.Q0.inflate();
        }
        final ClosedCaptionsView r2 = f0.R0;
        if (r2 != null) {
            int visibility;
            if (b2) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)r2).setVisibility(visibility);
        }
    }
}
