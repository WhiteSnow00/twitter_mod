import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oov extends nqv
{
    public final long E1;
    public final String F1;
    public final boolean G1;
    
    public oov(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final int n, final long e1, final int n2, final yov yov, final vav vav, final pqv pqv, final String f1, final boolean g1) {
        super(context, userIdentifier, userIdentifier2, n, n2, yov, String.valueOf(e1), pqv, vav);
        this.E1 = e1;
        this.F1 = f1;
        this.G1 = g1;
    }
    
    public oov(final Context context, final UserIdentifier userIdentifier, final UserIdentifier userIdentifier2, final long n, final vav vav, final pqv pqv) {
        this(context, userIdentifier, userIdentifier2, 14, n, 1, (yov)a83.b, vav, pqv, null, false);
    }
    
    public final g7c r0() {
        final g7c$a g7c$a = new g7c$a();
        String a;
        if (asa.b().b("graphql_timeline_v2_query_threaded_conversation_with_injections", false)) {
            a = "conversation_timeline_v2";
        }
        else {
            a = "conversation_timeline";
        }
        g7c$a.a = a;
        g7c$a.b = new f7c(new String[] { "timeline_response" });
        ((qjg)g7c$a.c).w((Object)"focalTweetId", (Object)this.E1);
        ((qjg)g7c$a.c).w((Object)"isReaderMode", (Object)this.G1);
        final Boolean true = Boolean.TRUE;
        ((qjg)g7c$a.c).w((Object)"includeCommunityTweetRelationship", (Object)true);
        ((qjg)g7c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)xa8.p());
        ((qjg)g7c$a.c).w((Object)"include_tweet_quick_promote_eligibility", (Object)j8a.B());
        ((qjg)g7c$a.c).w((Object)"includeHasConversationContext", (Object)asa.b().b("c9s_tweet_anatomy_conversation_fetch_tweet_details_enabled", false));
        if (asa.b().b("graphql_display_location_enabled", false)) {
            g7c$a.p("displayLocation", "TweetDetails");
        }
        final String f1 = this.F1;
        if (f1 != null) {
            ((qjg)g7c$a.c).w((Object)"ruxContext", (Object)f1);
            g7c$a.o("withRuxInjections", (Object)true);
        }
        final String a2 = super.u1.a("referrer");
        if (a2 != null) {
            g7c$a.p("referrer", a2);
        }
        if (asa.b().b("view_counts_tweet_details_api_enabled", false)) {
            g7c$a.o("includeTweetImpression", (Object)true);
        }
        return (g7c)((n4j)g7c$a).e();
    }
    
    @Override
    public final String s() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.s());
        sb.append("_");
        sb.append(this.E1);
        return sb.toString();
    }
    
    public final zvl s0() {
        final zvl$a zvl$a = new zvl$a();
        zvl$a.a = hmg.i(fu8.j("/2/timeline/conversation/"), this.E1, ".json");
        return (zvl)((n4j)zvl$a).e();
    }
    
    @Override
    public final void x0(final yrm yrm) {
        super.x0(yrm);
        final oqv v0 = this.v0();
        final int n = 0;
        boolean b = false;
        Label_0145: {
            if (v0 != null) {
                switch (v0.b) {
                    default: {
                        final StringBuilder j = fu8.j("Unhandled CursorType ");
                        j.append(v0.b);
                        final IllegalStateException ex = new IllegalStateException(j.toString());
                        if (!cj1.d()) {
                            m8a.d((Throwable)ex);
                        }
                        throw ex;
                    }
                    case -1:
                    case 6:
                    case 7: {
                        b = false;
                        break Label_0145;
                    }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 9:
                    case 10:
                    case 11:
                    case 12: {
                        break;
                    }
                }
            }
            b = true;
        }
        if (b) {
            final Iterator iterator = yrm.c((Class)ir$a.class).iterator();
            int n2 = n;
            int n3 = 0;
        Label_0242:
            do {
                n3 = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                final Iterator iterator2 = ((ir$a)iterator.next()).c.iterator();
                zus zus;
                do {
                    n3 = n2;
                    if (!iterator2.hasNext()) {
                        continue Label_0242;
                    }
                    zus = (zus)iterator2.next();
                } while (!(zus instanceof wov) || ((wov)zus).q.b != 3);
                n3 = 1;
            } while ((n2 = n3) == 0);
            if (n3 != 0) {
                super.D1 = 2;
            }
            else {
                super.D1 = 1;
            }
        }
    }
    
    @Override
    public final boolean y0() {
        final int l1 = super.l1;
        boolean b = true;
        if (l1 != 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean z0() {
        return false;
    }
}
