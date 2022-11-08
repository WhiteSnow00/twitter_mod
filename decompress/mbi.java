import com.twitter.util.user.UserIdentifier;
import com.twitter.app.common.args.ContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public interface mbi<NAV>
{
     <ARG extends ContentViewArgs, RES extends vn6> xn6<ARG, RES> a(final Class<RES> p0);
    
    void b(final ContentViewArgs p0);
    
    void c(final ContentViewArgs p0, final UserIdentifier p1, final ebi p2);
    
    void d(final zm p0);
    
    void e(final ContentViewArgs p0, final ebi p1);
    
    void f(final ContentViewArgs p0, final UserIdentifier p1);
    
     <ARG extends zm, RES> xn6<ARG, RES> g(final Class<RES> p0, final bsm<RES> p1, final String p2);
    
     <ARG extends zm, RES> xn6<ARG, RES> h(final Class<RES> p0, final bsm<RES> p1);
    
    void i(final zm p0, final ebi p1);
    
    void j();
}
