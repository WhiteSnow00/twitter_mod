import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lkw extends d2v<rfw>
{
    public final String j1;
    public final d93 k1;
    public final String l1;
    
    public lkw(final String j1, final d93 k1, final String l1) {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        czd.f((Object)j1, "moduleId");
        czd.f((Object)k1, "cta");
        czd.f((Object)l1, "rawUrl");
        super(c, 0);
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_update_link_module");
        a.p("module_id", (Object)this.j1);
        a.p("cta", (Object)this.k1.D0);
        a.p("raw_url", (Object)this.l1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<rfw, kbv> g0() {
        return (asc<rfw, kbv>)e7c.Companion.b(rfw.class, "user_update_link_module");
    }
}
