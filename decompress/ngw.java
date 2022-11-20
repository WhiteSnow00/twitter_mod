import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngw extends d2v<j9w>
{
    public final String j1;
    
    public ngw(final String j1) {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        czd.f((Object)j1, "profileUserId");
        super(c, 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_profile_modules_query");
        a.p("rest_id", (Object)this.j1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<j9w, kbv> g0() {
        return (asc<j9w, kbv>)e7c.Companion.b(j9w.class, "user_result", "result", "profilemodules");
    }
}
