import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkw extends d2v<rfw>
{
    public final String j1;
    public final l33 k1;
    public final j7 l1;
    
    public jkw(final String j1, final l33 k1, final j7 l1) {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        czd.f((Object)j1, "moduleId");
        czd.f((Object)k1, "venueData");
        czd.f((Object)l1, "config");
        super(c, 0);
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_update_about_module_from_venue");
        a.p("module_id", (Object)this.j1);
        a.p("venue_data", (Object)this.k1);
        a.p("config", (Object)this.l1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<rfw, kbv> g0() {
        return (asc<rfw, kbv>)e7c.Companion.b(rfw.class, "user_update_about_module_from_venue");
    }
}
