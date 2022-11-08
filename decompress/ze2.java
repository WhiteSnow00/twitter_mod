import android.view.ViewStub$OnInflateListener;
import android.view.View;
import android.view.ViewStub;
import com.twitter.media.av.ui.control.SkipWithCountDownBadgeView;
import com.twitter.media.av.ui.AutoPlayBadgeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ze2 extends el8
{
    public final v53 D0;
    public AutoPlayBadgeView E0;
    public SkipWithCountDownBadgeView F0;
    
    public ze2(final ViewStub viewStub) {
        super((View)viewStub);
        this.D0 = new v53(viewStub);
        viewStub.setOnInflateListener((ViewStub$OnInflateListener)new ye2((el8)this, 0));
    }
    
    public final void b() {
        this.D0.k(8);
        final AutoPlayBadgeView e0 = this.E0;
        if (e0 != null) {
            e0.e();
        }
    }
}
