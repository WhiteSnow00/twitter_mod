import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k9w extends d2v<miw>
{
    public final String j1;
    
    public k9w(final String j1, final UserIdentifier userIdentifier) {
        czd.f((Object)j1, "screenName");
        czd.f((Object)userIdentifier, "owner");
        super(userIdentifier, 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_result_by_screen_name_query");
        a.p("screen_name", (Object)this.j1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<miw, kbv> g0() {
        return (asc<miw, kbv>)e7c.Companion.b(miw.class, new String[0]);
    }
}
