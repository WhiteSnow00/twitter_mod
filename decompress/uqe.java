import java.util.Objects;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uqe implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final vqe D0;
    public final View E0;
    public final int F0;
    
    public uqe(final vqe d0, final View e0, final int f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onGlobalLayout() {
        final vqe d0 = this.D0;
        final View e0 = this.E0;
        final int f0 = this.F0;
        Objects.requireNonNull(d0);
        ((wgm)d0).a((Object)(e0.getRootView().getHeight() - e0.getHeight() > f0));
    }
}
