import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h11 extends d2v<tmi>
{
    public final String j1;
    public final String k1;
    
    public h11(final String j1, final String k1, final UserIdentifier userIdentifier) {
        czd.f((Object)j1, "audioSpaceId");
        czd.f((Object)k1, "tweetId");
        czd.f((Object)userIdentifier, "userIdentifier");
        super(userIdentifier, 0);
        this.j1 = j1;
        this.k1 = k1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("audiospace_delete_sharing");
        a.p("audio_space_id", (Object)this.j1);
        a.p("sharing_id", (Object)this.k1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<tmi, kbv> g0() {
        return (asc<tmi, kbv>)k0c.i(e7c.Companion);
    }
}
