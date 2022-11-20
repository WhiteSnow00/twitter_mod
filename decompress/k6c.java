import com.twitter.model.json.pc.JsonEngagementRequestInput;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k6c extends d6c
{
    public static final k6c.k6c$b Companion;
    public static final cba t1;
    public final long r1;
    public uil s1;
    
    static {
        Companion = new k6c.k6c$b();
        t1 = (cba)bba.Companion.b("app", "twitter_service", "favorite", "delete");
    }
    
    public k6c(final Context context, final UserIdentifier userIdentifier, final long n, final long r1) {
        final vav c2 = vav.c2(userIdentifier);
        czd.e((Object)c2, "get(userIdentifier)");
        czd.f((Object)context, "context");
        czd.f((Object)userIdentifier, "userIdentifier");
        super(context, userIdentifier, n, false, c2);
        this.r1 = r1;
        ((wv0<Object>)this).G((qtm<Object>)new mdi());
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)k6c.t1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("unfavorite_tweet");
        a.p("tweet_id", (Object)this.r1);
        final uil s1 = this.s1;
        if (s1 != null) {
            a.p("engagement_request", (Object)JsonEngagementRequestInput.s(s1));
        }
        return (tqc)((n4j)a).e();
    }
}
