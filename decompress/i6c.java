import com.twitter.model.json.pc.JsonEngagementRequestInput;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i6c extends d6c
{
    public static final i6c.i6c$b Companion;
    public static final cba t1;
    public final long r1;
    public uil s1;
    
    static {
        Companion = new i6c.i6c$b();
        t1 = (cba)bba.Companion.b("app", "twitter_service", "favorite", "create");
    }
    
    public i6c(final Context context, final UserIdentifier userIdentifier, final long n, final long n2) {
        czd.f((Object)context, "context");
        czd.f((Object)userIdentifier, "userIdentifier");
        this(context, userIdentifier, n, n2, null, 16, null);
    }
    
    public i6c(final Context context, final UserIdentifier userIdentifier, final long n, final long r1, vav c2, final int n2, final rf8 rf8) {
        c2 = vav.c2(userIdentifier);
        czd.e((Object)c2, "get(userIdentifier)");
        czd.f((Object)context, "context");
        czd.f((Object)userIdentifier, "userIdentifier");
        super(context, userIdentifier, n, true, c2);
        this.r1 = r1;
        ((wv0<Object>)this).G((qtm<Object>)new mdi());
        final mpm<Object, Object> y = ((anm<Object, Object>)this).Y();
        final cba t1 = i6c.t1;
        final a2p$a a2p$a = (a2p$a)y;
        a2p$a.a.K0 = (bba)t1;
        a2p$a.a("tweet_type", "organic");
        a2p$a.a.L0 = (xtk)new ez6((Object)this, 1);
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("favorite_tweet");
        a.p("tweet_id", (Object)this.r1);
        final uil s1 = this.s1;
        if (s1 != null) {
            a.p("engagement_request", (Object)JsonEngagementRequestInput.s(s1));
        }
        return (tqc)((n4j)a).e();
    }
    
    public final i6c o0(final Boolean b) {
        if (b != null) {
            final mpm<Object, Object> y = ((anm<Object, Object>)this).Y();
            String s;
            if (b) {
                s = "true";
            }
            else {
                s = "false";
            }
            ((a2p$a)y).a("has_media", s);
        }
        return this;
    }
    
    public final i6c p0(final uil s1) {
        this.s1 = s1;
        if (s1 != null) {
            ((a2p$a)((anm<Object, Object>)this).Y()).a("tweet_type", "ad");
        }
        return this;
    }
}
