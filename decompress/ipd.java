import android.content.DialogInterface;
import java.util.Objects;
import com.twitter.inlinereplies.InlineRepliesContentViewArgs;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipd extends a implements ilx<jpd, Object, Object>
{
    public final Activity D0;
    public final kpd E0;
    
    public ipd(final qv8 qv8, final InlineRepliesContentViewArgs inlineRepliesContentViewArgs, final Activity d0, final kpd e0) {
        czd.f((Object)qv8, "presenter");
        czd.f((Object)inlineRepliesContentViewArgs, "contentViewArgs");
        czd.f((Object)d0, "activity");
        czd.f((Object)e0, "inlineRepliesScribeEventReporter");
        this.D0 = d0;
        this.E0 = e0;
        qv8.F0 = (pv8)this;
        Objects.requireNonNull(e0);
    }
    
    @Override
    public final void R0(final DialogInterface dialogInterface, final int n) {
        czd.f((Object)dialogInterface, "dialog");
        Objects.requireNonNull(this.E0);
        this.D0.finish();
        this.D0.overridePendingTransition(2130772041, 2130772042);
    }
    
    public final void T(final jbx jbx) {
        czd.f((Object)jbx, "state");
    }
    
    public final void q(final Object o) {
    }
    
    public final h5j w() {
        return zip.a();
    }
}
