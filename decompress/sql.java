import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sql
{
    public final pfw<rgw> a;
    
    public sql(final pfw<rgw> a) {
        czd.f((Object)a, "repositoryUserObjectProvider");
        this.a = a;
    }
    
    public final sy5 a(final UserIdentifier userIdentifier) {
        return ((rgw)((zyr)this.a).get((Object)userIdentifier)).d();
    }
    
    public final sy5 b(final UserIdentifier userIdentifier, final List<Long> list) {
        czd.f((Object)userIdentifier, "owner");
        czd.f((Object)list, "notificationIds");
        return ((rgw)((zyr)this.a).get((Object)userIdentifier)).i((List)list);
    }
    
    public final eaq<List<lsi>> c(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "owner");
        return (eaq<List<lsi>>)((rgw)((zyr)this.a).get((Object)userIdentifier)).k();
    }
    
    public final eaq<List<lsi>> d(final UserIdentifier userIdentifier, final String s) {
        czd.f((Object)userIdentifier, "owner");
        czd.f((Object)s, "conversationId");
        return (eaq<List<lsi>>)((rgw)((zyr)this.a).get((Object)userIdentifier)).e(s);
    }
    
    public final eaq<List<lsi>> e(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "owner");
        return (eaq<List<lsi>>)((rgw)((zyr)this.a).get((Object)userIdentifier)).f();
    }
    
    public final eaq<List<lsi>> f(final UserIdentifier userIdentifier, final long n) {
        czd.f((Object)userIdentifier, "owner");
        return (eaq<List<lsi>>)((rgw)((zyr)this.a).get((Object)userIdentifier)).g(n);
    }
    
    public final eaq<lsi> g(final lsi lsi) {
        czd.f((Object)lsi, "notificationInfo");
        return (eaq<lsi>)((rgw)((zyr)this.a).get((Object)lsi.B)).l(lsi);
    }
}
