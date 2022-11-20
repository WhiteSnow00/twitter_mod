import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p1c extends d2v<p21>
{
    public final String j1;
    
    public p1c(final String j1, final UserIdentifier userIdentifier) {
        czd.f((Object)j1, "audioSpaceId");
        czd.f((Object)userIdentifier, "userIdentifier");
        super(userIdentifier, 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("audiospace_is_subscribed_query");
        a.p("audio_space_id", (Object)this.j1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<p21, kbv> g0() {
        return (asc<p21, kbv>)e7c.Companion.b(p21.class, "audio_space_by_rest_id");
    }
}
