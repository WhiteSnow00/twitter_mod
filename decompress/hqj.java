import com.twitter.network.usage.service.OverlayService;
import android.view.View;
import android.view.View$OnLongClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqj implements View$OnLongClickListener
{
    public static final hqj D0;
    
    static {
        D0 = new hqj();
    }
    
    public final boolean onLongClick(final View view) {
        final int l0 = OverlayService.L0;
        k88.a().e();
        m1f.e().a((CharSequence)"Data tracker reset triggered", 1);
        return false;
    }
}
