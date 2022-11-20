import com.twitter.ui.user.UserView;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pox extends a9t
{
    public pox(final Context context, final p p10, final kc1 kc1, final trc trc, final UserIdentifier userIdentifier, final brb brb, final obi obi, final efv efv, final jkq jkq, final qkq qkq) {
        super(context, p10, kc1, trc, userIdentifier, brb, obi, (t81)null, efv, true, false, jkq, qkq);
    }
    
    public final void i(final UserView userView) {
        this.h(userView, super.a, "user", "follow");
    }
    
    public final void j(final UserView userView) {
        this.h(userView, super.a, "user", "unfollow");
    }
}
