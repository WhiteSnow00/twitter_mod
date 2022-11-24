import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a1w extends xn1
{
    public static final jca q1;
    
    static {
        q1 = (jca)hca.c("app", "twitter_service", "mute_convo", "destroy");
    }
    
    public a1w(final Context context, final UserIdentifier userIdentifier, final long n, final long n2) {
        super(context, userIdentifier, n, n2, false, kbv.d2(userIdentifier));
        ((v2p$a)((pnm)this).Y()).a.M0 = (ica)a1w.q1;
    }
    
    public final String o0() {
        return "/1.1/mutes/conversations/destroy.json";
    }
}
