import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qaw extends d2v<rfw>
{
    public final String j1;
    
    public qaw(final String j1) {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        czd.f((Object)j1, "moduleId");
        super(c, 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_delete_link_module");
        a.p("module_id", (Object)this.j1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<rfw, kbv> g0() {
        return (asc<rfw, kbv>)e7c.Companion.b(rfw.class, "user_delete_link_module");
    }
}
