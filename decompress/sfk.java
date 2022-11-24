import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.OkHttpClient$Builder;
import okhttp3.Interceptor;
import okhttp3.Dns;

// 
// Decompiled by Procyon v0.6.0
// 

public class sfk extends vgj
{
    public final ppo f;
    public final Dns g;
    public final Interceptor h;
    
    public sfk(final ppo f, final dsc dsc) {
        super(dsc, zk.a().S2());
        this.f = f;
        this.g = null;
        this.h = null;
    }
    
    public sfk(final ppo f, final dsc dsc, final Dns g, final Interceptor h) {
        super(dsc, zk.a().S2());
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public OkHttpClient$Builder e(final dsc dsc) {
        final OkHttpClient$Builder e = super.e(dsc);
        this.f.a();
        final SSLSocketFactory f = this.f.f();
        final X509TrustManager d = this.f.d();
        final HostnameVerifier c = this.f.c();
        if (c != null) {
            e.hostnameVerifier(c);
        }
        if (f != null && d != null) {
            e.sslSocketFactory(f, d);
        }
        final Dns g = this.g;
        if (g != null) {
            e.dns(g);
        }
        final Interceptor h = this.h;
        if (h != null) {
            e.addInterceptor(h);
        }
        d7b.a();
        e.addInterceptor((Interceptor)new hbc());
        return e;
    }
}
