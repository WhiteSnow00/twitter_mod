import com.twitter.util.user.UserIdentifier;
import com.twitter.business.features.mobileappmodule.model.MobileAppUrlsByStore;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kaw extends d2v<rfw>
{
    public final MobileAppUrlsByStore j1;
    public final boolean k1;
    
    public kaw(final MobileAppUrlsByStore j1, final boolean k1) {
        final UserIdentifier c = UserIdentifier.Companion.c();
        czd.f((Object)c, "owner");
        czd.f((Object)j1, "mobileAppUrlsByStore");
        super(c, 0);
        this.j1 = j1;
        this.k1 = k1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_create_app_module");
        a.p("app_urls_by_store", (Object)this.j1);
        a.p("visible_on_creation", (Object)this.k1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<rfw, kbv> g0() {
        return (asc<rfw, kbv>)e7c.Companion.b(rfw.class, "user_create_app_module");
    }
}
