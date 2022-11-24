import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.twitter.ui.tweet.inlineactions.InlineActionView;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joi implements rk6
{
    public final int F0;
    public final Object G0;
    
    public joi(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        switch (this.F0) {
            default: {
                ((baw)((njb)this.G0).a.F0).l((String)o);
                return;
            }
            case 4: {
                ((pr9)this.G0).g((long)o);
                return;
            }
            case 3: {
                final rpx rpx = (rpx)this.G0;
                final gcu$e gcu$e = (gcu$e)o;
                Objects.requireNonNull(rpx);
                if (gcu$e.b.equals("wifi_only_mode")) {
                    rpx.e(gcu$e.a(false), rpx.c);
                }
                return;
            }
            case 2: {
                final InlineActionView inlineActionView = (InlineActionView)this.G0;
                final noj noj = (noj)o;
                final int[] c1 = InlineActionView.c1;
                Objects.requireNonNull(inlineActionView);
                if (noj.f()) {
                    inlineActionView.c((Drawable)noj.c(), inlineActionView.F0);
                }
                return;
            }
            case 1: {
                final y59 y59 = (y59)this.G0;
                final PointF pointF = (PointF)o;
                y59.d();
                return;
            }
            case 0: {
                final jcx jcx = (jcx)this.G0;
                if (o) {
                    jcx.a();
                }
            }
        }
    }
}
