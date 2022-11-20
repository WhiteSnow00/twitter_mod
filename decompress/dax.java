import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dax extends hpv
{
    public final String E1;
    
    public dax(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final yov yov, final pqv pqv, final String e1, final vav vav) {
        super(context, userIdentifier, userIdentifier2, 35, n, yov, e1, pqv, vav);
        this.E1 = e1;
    }
    
    public final g7c r0() {
        final g7c$a g7c$a = new g7c$a();
        g7c$a.a = "moderated_timeline";
        g7c$a.b = new f7c(new String[] { "tweet_result", "result", "timeline_response", "timeline" });
        ((qjg)g7c$a.c).w((Object)"rest_id", (Object)this.E1);
        ((qjg)g7c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)xa8.p());
        return (g7c)((n4j)g7c$a).e();
    }
    
    @Override
    public final boolean y0() {
        return false;
    }
    
    @Override
    public final boolean z0() {
        return false;
    }
}
