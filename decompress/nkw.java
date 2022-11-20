import com.twitter.util.user.UserIdentifier;
import com.twitter.business.features.mobileappmodule.model.MobileAppUrlsByStore;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nkw extends d2v<rfw>
{
    public final String j1;
    public final MobileAppUrlsByStore k1;
    
    public nkw(final String j1, final MobileAppUrlsByStore k1) {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        czd.f((Object)j1, "moduleId");
        czd.f((Object)k1, "mobileAppUrlsByStore");
        super(c, 0);
        this.j1 = j1;
        this.k1 = k1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_update_app_module");
        a.p("module_id", (Object)this.j1);
        a.p("app_urls_by_store", (Object)this.k1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<rfw, kbv> g0() {
        return (asc<rfw, kbv>)e7c.Companion.b(rfw.class, "user_update_app_module");
    }
}
