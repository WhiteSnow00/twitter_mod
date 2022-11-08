import com.twitter.subscriptions.preferences.api.UpdateSettingsDataSourceException;
import com.twitter.async.http.HttpRequestResultException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h3w extends omm<ruv, pmi, i3w>
{
    public h3w() {
        super((psc)null, 1, (hg8)null);
    }
    
    public final ksc c(final Object o) {
        final ruv ruv = (ruv)o;
        zzd.f((Object)ruv, "args");
        return (ksc)new i3w(ruv);
    }
    
    public final Object d(final ksc ksc) {
        final i3w i3w = (i3w)ksc;
        zzd.f((Object)i3w, "request");
        final tsc t = ((ksc)i3w).T();
        zzd.e((Object)t, "request.result");
        if (t.b && t.g != null) {
            return pmi.a;
        }
        throw new UpdateSettingsDataSourceException((Throwable)HttpRequestResultException.a((tsc<?, Object>)t));
    }
}
