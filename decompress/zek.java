import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.OkHttpClient$Builder;
import okhttp3.Interceptor;
import okhttp3.Dns;

// 
// Decompiled by Procyon v0.6.0
// 

public class zek extends bgj
{
    public final eoo f;
    public final Dns g;
    public final Interceptor h;
    
    public zek(final eoo f, final asc asc) {
        super(asc, cj2.d().S2());
        this.f = f;
        this.g = null;
        this.h = null;
    }
    
    public zek(final eoo f, final asc asc, final Dns g, final Interceptor h) {
        super(asc, cj2.d().S2());
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public OkHttpClient$Builder e(final asc asc) {
        final OkHttpClient$Builder e = super.e(asc);
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
        e7b.a();
        e.addInterceptor((Interceptor)new fbc());
        return e;
    }
}
