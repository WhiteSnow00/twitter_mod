import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.media.ui.image.b;
import android.graphics.Rect;
import com.twitter.media.ui.image.b$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qda implements b$a
{
    public final Rect D0;
    public final edq E0;
    
    public qda(final Rect d0, final edq e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final pbm c(final b b) {
        final Rect d0 = this.D0;
        final edq e0 = this.E0;
        final FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)b;
        return pbm.b(d0, e0);
    }
}
