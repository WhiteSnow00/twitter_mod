import com.twitter.util.user.UserIdentifier;
import com.twitter.app.common.args.ContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public interface yo
{
     <T extends ContentViewArgs, R extends bn6> dn6<T, R> a(final Class<R> p0, final String p1);
    
     <T extends ym, R> dn6<T, R> b(final Class<R> p0, final tsm<R> p1, final String p2);
    
     <T extends ContentViewArgs> void c(final T p0, final UserIdentifier p1, final gbi p2);
    
     <T extends ContentViewArgs> void d(final T p0, final gbi p1);
    
     <T extends ym> void e(final T p0, final gbi p1);
}
