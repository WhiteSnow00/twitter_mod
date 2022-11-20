import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ywb implements oj
{
    public final zwb D0;
    public final View E0;
    public final float F0;
    
    public ywb(final zwb d0, final View e0, final float f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void run() {
        final zwb d0 = this.D0;
        final View e0 = this.E0;
        final float f0 = this.F0;
        Objects.requireNonNull(d0);
        e0.animate().alpha(0.0f).translationY(f0).setInterpolator((TimeInterpolator)new AccelerateInterpolator()).withEndAction((Runnable)new mob((Object)d0, (Object)e0, 8)).start();
    }
}
