import com.twitter.util.user.UserIdentifier;
import com.twitter.app.common.args.ContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public interface fci<NAV>
{
     <ARG extends ContentViewArgs, RES extends ho6> jo6<ARG, RES> a(final Class<RES> p0);
    
    void b(final ContentViewArgs p0);
    
    void c(final ContentViewArgs p0, final UserIdentifier p1, final xbi p2);
    
    void d(final cn p0);
    
    void e(final ContentViewArgs p0, final xbi p1);
    
    void f(final ContentViewArgs p0, final UserIdentifier p1);
    
     <ARG extends cn, RES> jo6<ARG, RES> g(final Class<RES> p0, final itm<RES> p1, final String p2);
    
     <ARG extends cn, RES> jo6<ARG, RES> h(final Class<RES> p0, final itm<RES> p1);
    
    void i(final cn p0, final xbi p1);
    
    void k();
}
