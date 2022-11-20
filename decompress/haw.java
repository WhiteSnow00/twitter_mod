import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class haw extends d2v<rfw>
{
    public final d93 j1;
    public final String k1;
    public final boolean l1;
    
    public haw(final d93 j1, final String k1, final boolean l1) {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        czd.f((Object)j1, "cta");
        czd.f((Object)k1, "rawUrl");
        super(c, 0);
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_create_link_module");
        a.p("cta", (Object)this.j1.D0);
        a.p("raw_url", (Object)this.k1);
        a.p("visible_on_creation", (Object)this.l1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<rfw, kbv> g0() {
        return (asc<rfw, kbv>)e7c.Companion.b(rfw.class, "user_create_link_module");
    }
}
