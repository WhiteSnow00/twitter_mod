import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class svg implements Runnable
{
    public final int D0;
    public final tvg E0;
    
    public svg(final int d0, final tvg e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        final int d0 = this.D0;
        final tvg e0 = this.E0;
        czd.f((Object)e0, "this$0");
        final int n = (((nk8)e0).D0.getWidth() - (int)(d0 * m5s.a) * 2) / 3;
        final FrescoMediaImageView f0 = e0.F0;
        czd.e((Object)f0, "startImageView");
        e0.n0((View)f0, n);
        final FrescoMediaImageView g0 = e0.G0;
        czd.e((Object)g0, "middleImageView");
        e0.n0((View)g0, n);
        final FrescoMediaImageView h0 = e0.H0;
        czd.e((Object)h0, "endImageView");
        e0.n0((View)h0, n);
    }
}
