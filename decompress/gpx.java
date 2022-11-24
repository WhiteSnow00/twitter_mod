import com.twitter.ui.user.UserView;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpx extends w9t
{
    public gpx(final Context context, final p p10, final oc1 oc1, final tsc tsc, final UserIdentifier userIdentifier, final dsb dsb, final fci fci, final sfv sfv, final glq glq, final nlq nlq) {
        super(context, p10, oc1, tsc, userIdentifier, dsb, fci, (y81)null, sfv, true, false, glq, nlq);
    }
    
    public final void i(final UserView userView) {
        this.h(userView, super.a, "user", "follow");
    }
    
    public final void j(final UserView userView) {
        this.h(userView, super.a, "user", "unfollow");
    }
}
