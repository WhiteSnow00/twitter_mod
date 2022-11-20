import com.twitter.async.http.HttpRequestResultException;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sor extends enm<tmi, tnr, bpr>
{
    public final m8a E0;
    
    public sor(final m8a e0) {
        czd.f((Object)e0, "errorReporter");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        czd.f((Object)o, "args");
        return (orc)new bpr((UserIdentifier)null, 1, (rf8)null);
    }
    
    public final Object d(final orc orc) {
        final bpr bpr = (bpr)orc;
        czd.f((Object)bpr, "request");
        final xrc t = ((orc)bpr).T();
        czd.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            if (g != null) {
                return g;
            }
        }
        this.E0.f((Throwable)new Error("Feature Settings: Failed to retrieve settings"));
        throw HttpRequestResultException.a(t);
    }
}
