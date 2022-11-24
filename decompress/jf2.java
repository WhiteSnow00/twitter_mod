import android.view.ViewStub$OnInflateListener;
import android.view.View;
import android.view.ViewStub;
import com.twitter.media.av.ui.control.SkipWithCountDownBadgeView;
import com.twitter.media.av.ui.AutoPlayBadgeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jf2 extends sl8
{
    public final x3c G0;
    public AutoPlayBadgeView H0;
    public SkipWithCountDownBadgeView I0;
    
    public jf2(final ViewStub viewStub) {
        super((View)viewStub);
        this.G0 = new x3c(viewStub);
        viewStub.setOnInflateListener((ViewStub$OnInflateListener)new if2((sl8)this, 0));
    }
    
    public final void a() {
        this.G0.g(8);
        final AutoPlayBadgeView h0 = this.H0;
        if (h0 != null) {
            h0.e();
        }
    }
}
