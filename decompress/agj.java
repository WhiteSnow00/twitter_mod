import okhttp3.MediaType;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import okhttp3.HttpUrl;
import okhttp3.Handshake;
import java.io.InputStream;
import java.util.Map;
import java.util.List;
import okhttp3.ResponseBody;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.RequestBody;
import java.util.Locale;
import java.net.URI;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.Request$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agj extends xrc<Request$Builder, Response>
{
    public static final b I;
    public OkHttpClient G;
    public Call H;
    
    static {
        I = new b((src)new ajr("", fn6.K0));
    }
    
    public agj(final OkHttpClient g, final xrc$b xrc$b, final URI uri, final hsc hsc) {
        super(xrc$b, uri, hsc);
        this.G = g;
    }
    
    public final void C(final Object o, final String s, final String s2) {
        ((Request$Builder)o).addHeader(s, s2);
    }
    
    public final void D(final Object o, final src src) {
        final Request$Builder request$Builder = (Request$Builder)o;
        final String upperCase = super.b.C0.toUpperCase(Locale.ENGLISH);
        b b;
        if (src != null) {
            b = new b(src);
        }
        else {
            b = null;
        }
        b i = b;
        if (super.b.D0 && (i = b) == null) {
            i = agj.I;
        }
        request$Builder.method(upperCase, (RequestBody)i);
    }
    
    public final void F(final Object o, final int n) {
        final Request$Builder request$Builder = (Request$Builder)o;
        this.G = this.G.newBuilder().readTimeout((long)n, TimeUnit.MILLISECONDS).build();
    }
    
    public final void c(final Object o) {
        final Request$Builder request$Builder = (Request$Builder)o;
        final Call h = this.H;
        if (h != null) {
            h.cancel();
        }
    }
    
    public final Object e(final Object o) throws IOException {
        final Call call = this.G.newCall(((Request$Builder)o).build());
        this.H = call;
        return call.execute();
    }
    
    public final URI h() {
        final Response response = (Response)super.s;
        if (response != null) {
            final Response networkResponse = response.networkResponse();
            if (networkResponse != null) {
                return networkResponse.request().url().uri();
            }
        }
        return super.c;
    }
    
    public final void l() {
    }
    
    public final String m(final Object o) {
        return ((Response)o).message();
    }
    
    public final String n(final Object o) {
        return ((Response)o).header("Content-Encoding");
    }
    
    public final int o(final Object o) {
        final ResponseBody body = ((Response)o).body();
        long contentLength;
        if (body == null) {
            contentLength = -1L;
        }
        else {
            contentLength = body.contentLength();
        }
        int n;
        if (contentLength > 2147483647L) {
            cag.k("TwitterNetwork", "OkHttp4 response body exceeded Integer.MAX_VALUE. Returning Integer.MAX_VALUE");
            n = Integer.MAX_VALUE;
        }
        else {
            n = (int)contentLength;
        }
        return n;
    }
    
    public final String p(final Object o) {
        return ((Response)o).header("Content-Type");
    }
    
    public final String q(final Object o, final String s) {
        final List headers = ((Response)o).headers(s);
        String s2;
        if (headers.size() > 0) {
            s2 = headers.get(0);
        }
        else {
            s2 = null;
        }
        return s2;
    }
    
    public final Map r(final Object o) {
        return ((Response)o).headers().toMultimap();
    }
    
    public final InputStream s(final Object o) throws IOException {
        final ResponseBody body = ((Response)o).body();
        InputStream byteStream;
        if (body == null) {
            byteStream = null;
        }
        else {
            byteStream = body.byteStream();
        }
        return byteStream;
    }
    
    public final boolean t(final Object o) {
        return ((Response)o).cacheResponse() != null;
    }
    
    public final xrc$a u(final Object o) {
        final String string = ((Response)o).protocol().toString();
        xrc$a xrc$a;
        try {
            xrc$a = xrc$a.valueOf(string.toUpperCase(Locale.ENGLISH).replaceAll("[-/.]", "_"));
        }
        catch (final IllegalArgumentException ex) {
            xrc$a = xrc$a.D0;
        }
        return xrc$a;
    }
    
    public final String v(final Object o) {
        final Handshake handshake = ((Response)o).handshake();
        String s;
        if (handshake == null) {
            s = null;
        }
        else {
            final int n = agj$a.a[((Enum)handshake.tlsVersion()).ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                s = "unknown";
                            }
                            else {
                                s = "ssl3.0";
                            }
                        }
                        else {
                            s = "1.0";
                        }
                    }
                    else {
                        s = "1.1";
                    }
                }
                else {
                    s = "1.2";
                }
            }
            else {
                s = "1.3";
            }
        }
        return s;
    }
    
    public final int w(final Object o) {
        return ((Response)o).code();
    }
    
    public final Object y() throws IOException {
        try {
            return new Request$Builder().tag((Object)this).url(HttpUrl.get(super.c.toString()));
        }
        catch (final IllegalArgumentException ex) {
            if (ex.getMessage().startsWith("Invalid URL host")) {
                final UnknownHostException ex2 = new UnknownHostException();
                ex2.initCause(ex);
                throw ex2;
            }
            final MalformedURLException ex3 = new MalformedURLException();
            ex3.initCause(ex);
            throw ex3;
        }
    }
    
    public static final class b extends RequestBody
    {
        public static final MediaType c;
        public final src a;
        public final MediaType b;
        
        static {
            c = MediaType.get("application/octet-stream");
        }
        
        public b(final src a) {
            this.a = a;
            if (a.d() != null) {
                this.b = MediaType.get(a.d().getValue());
            }
            else {
                this.b = b.c;
            }
        }
        
        public final long contentLength() {
            return this.a.a();
        }
        
        public final MediaType contentType() {
            return this.b;
        }
        
        public final void writeTo(final kr2 kr2) throws IOException {
            this.a.c(kr2.C3());
        }
    }
}
