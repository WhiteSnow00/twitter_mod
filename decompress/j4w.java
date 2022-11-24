import com.twitter.subscriptions.preferences.api.UpdateSettingsDataSourceException;
import com.twitter.async.http.HttpRequestResultException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j4w extends tnm<xvv, kni, k4w>
{
    public j4w() {
        super(null, 1, null);
    }
    
    @Override
    public final osc c(final Object o) {
        final xvv xvv = (xvv)o;
        e0e.f((Object)xvv, "args");
        return (osc)new k4w(xvv);
    }
    
    @Override
    public final Object d(final osc osc) {
        final k4w k4w = (k4w)osc;
        e0e.f((Object)k4w, "request");
        final xsc t = ((osc)k4w).T();
        e0e.e((Object)t, "request.result");
        if (t.b && t.g != null) {
            return kni.a;
        }
        throw new UpdateSettingsDataSourceException((Throwable)HttpRequestResultException.a(t));
    }
}
