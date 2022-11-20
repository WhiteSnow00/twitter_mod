import java.util.concurrent.Future;
import java.util.HashMap;
import java.util.Map;
import java.net.MalformedURLException;
import java.util.Locale;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import android.net.Uri;
import java.util.concurrent.Executors;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsc extends h6r
{
    public int E0;
    public final ExecutorService F0;
    public final fqh G0;
    
    public fsc() {
        final RealtimeSinceBootClock value = RealtimeSinceBootClock.get();
        super(3);
        this.F0 = Executors.newFixedThreadPool(3);
        this.G0 = (fqh)value;
        this.E0 = 30000;
    }
    
    public final HttpURLConnection L(final Uri uri, final int n) throws IOException {
        final Uri a = z5w.a;
        final Uri uri2 = null;
        Label_0031: {
            if (uri == null) {
                final URL url = null;
                break Label_0031;
            }
            try {
                final URL url = new URL(uri.toString());
                final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setConnectTimeout(this.E0);
                final int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    return httpURLConnection;
                }
                boolean b = false;
                Label_0143: {
                    if (responseCode != 307 && responseCode != 308) {
                        switch (responseCode) {
                            default: {
                                b = false;
                                break Label_0143;
                            }
                            case 300:
                            case 301:
                            case 302:
                            case 303: {
                                break;
                            }
                        }
                    }
                    b = true;
                }
                if (!b) {
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), responseCode));
                }
                final String headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                Uri parse;
                if (headerField == null) {
                    parse = uri2;
                }
                else {
                    parse = Uri.parse(headerField);
                }
                final String scheme = uri.getScheme();
                if (n > 0 && parse != null && !e5j.a((Object)parse.getScheme(), (Object)scheme)) {
                    return this.L(parse, n - 1);
                }
                String s;
                if (n == 0) {
                    s = String.format(Locale.getDefault(), "URL %s follows too many redirects", uri.toString());
                }
                else {
                    s = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), responseCode);
                }
                throw new IOException(s);
            }
            catch (final MalformedURLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public final Map a(final qva qva, final int n) {
        final fsc.fsc$a fsc$a = (fsc.fsc$a)qva;
        final HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(fsc$a.e - fsc$a.d));
        hashMap.put("fetch_time", Long.toString(fsc$a.f - fsc$a.e));
        hashMap.put("total_time", Long.toString(fsc$a.f - fsc$a.d));
        hashMap.put("image_size", Integer.toString(n));
        return hashMap;
    }
    
    public final qva c(final jj6 jj6, final z0l z0l) {
        return (qva)new fsc.fsc$a(jj6, z0l);
    }
    
    public final void f(final qva qva) {
        ((fsc.fsc$a)qva).f = this.G0.now();
    }
    
    public final void g(final qva qva, final rci.a a) {
        final fsc.fsc$a fsc$a = (fsc.fsc$a)qva;
        fsc$a.d = this.G0.now();
        ((qva)fsc$a).b.p((a1l)new esc(this.F0.submit(new dsc(this, fsc$a, a)), a));
    }
}
