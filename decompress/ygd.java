import android.view.View;
import tv.periscope.android.api.PsResponse;
import android.view.View$OnClickListener;
import com.twitter.ui.user.VideoAttributionUserView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ygd implements lj6
{
    public static final ygd E0;
    public static final ygd F0;
    public static final ygd G0;
    public static final ygd H0;
    public static final ygd I0;
    public static final ygd J0;
    public final int D0;
    
    static {
        E0 = new ygd(0);
        F0 = new ygd(1);
        G0 = new ygd(2);
        H0 = new ygd(3);
        I0 = new ygd(4);
        J0 = new ygd(5);
    }
    
    public ygd(final int d0) {
        this.D0 = d0;
    }
    
    public final void accept(final Object o) {
        switch (this.D0) {
            default: {
                final Throwable t = (Throwable)o;
                final int f = lk6.f;
                s9g.c("ContactsUpload", t.getMessage());
                return;
            }
            case 4: {
                final vql vql = (vql)o;
                ogq.b(true);
                return;
            }
            case 3: {
                final nnr nnr = (nnr)o;
                final int r = q0g.r;
                final StringBuilder sb = new StringBuilder();
                sb.append("Subscription event: ");
                sb.append(nnr);
                s9g.a("LivePipeline", sb.toString());
                return;
            }
            case 2: {
                ((View)o).setOnClickListener((View$OnClickListener)null);
                return;
            }
            case 1: {
                final PsResponse psResponse = (PsResponse)o;
                return;
            }
            case 0: {
                ((ydq)o).D0.setVisibility(8);
            }
        }
    }
}
