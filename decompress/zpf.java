import android.view.ViewStub$OnInflateListener;
import android.view.View;
import android.view.ViewStub;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.ui.view.CircleProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zpf extends sl8 implements gqf
{
    public final x3c G0;
    public CircleProgressBar H0;
    public FrescoMediaImageView I0;
    
    public zpf(final ViewStub viewStub) {
        super((View)viewStub);
        this.G0 = new x3c(viewStub);
        viewStub.setLayoutResource(2131624730);
        viewStub.setOnInflateListener((ViewStub$OnInflateListener)new ypf(this));
    }
    
    public final void n(final float progress) {
        final CircleProgressBar h0 = this.H0;
        if (h0 != null) {
            h0.setProgress(progress);
        }
    }
}
