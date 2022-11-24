import tv.periscope.chatman.api.HttpClient;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import okhttp3.Interceptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class prc implements Interceptor
{
    public final String a;
    
    public prc(final String a) {
        this.a = a;
    }
    
    public final Response intercept(final Interceptor$Chain interceptor$Chain) {
        return HttpClient.a(this.a, interceptor$Chain);
    }
}
