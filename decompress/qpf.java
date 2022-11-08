import android.view.ViewStub$OnInflateListener;
import android.view.View;
import android.view.ViewStub;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.ui.view.CircleProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qpf extends el8 implements xpf
{
    public final v53 D0;
    public CircleProgressBar E0;
    public FrescoMediaImageView F0;
    
    public qpf(final ViewStub viewStub) {
        super((View)viewStub);
        this.D0 = new v53(viewStub);
        viewStub.setLayoutResource(2131624730);
        viewStub.setOnInflateListener((ViewStub$OnInflateListener)new ppf(this));
    }
    
    public final void n(final float progress) {
        final CircleProgressBar e0 = this.E0;
        if (e0 != null) {
            e0.setProgress(progress);
        }
    }
}
