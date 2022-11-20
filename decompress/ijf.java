import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijf extends hpv
{
    public ijf(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final yov yov, final String s, final pqv pqv, final vav vav) {
        super(context, userIdentifier, userIdentifier2, 47, n, yov, s, pqv, vav);
    }
    
    public final g7c r0() {
        final g7c$a g7c$a = new g7c$a();
        g7c$a.a = "viewer_channels_discovery_timeline_query";
        g7c$a.b = new f7c(new String[] { "viewer", "timeline_response", "timeline" });
        ((qjg)g7c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)xa8.p());
        return (g7c)((n4j)g7c$a).e();
    }
    
    @Override
    public final boolean y0() {
        final int l1 = super.l1;
        boolean b = true;
        if (l1 != 1) {
            b = (l1 == 2 && b);
        }
        return b;
    }
    
    @Override
    public final boolean z0() {
        final int l1 = super.l1;
        boolean b = true;
        if (l1 != 1) {
            b = (l1 == 2 && b);
        }
        return b;
    }
}
