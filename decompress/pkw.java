import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkw extends d2v<h9w>
{
    public final String j1;
    public final boolean k1;
    
    public pkw(final String j1, final boolean k1) {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        czd.f((Object)j1, "moduleId");
        super(c, 0);
        this.j1 = j1;
        this.k1 = k1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_update_module_visibility");
        a.p("module_id", (Object)this.j1);
        a.p("enabled_for_display", (Object)this.k1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<h9w, kbv> g0() {
        return (asc<h9w, kbv>)e7c.Companion.b(h9w.class, "user_update_module_visibility", "user_results", "result", "editable_profilemodules");
    }
}
