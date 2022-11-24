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

public final class ftc extends g7r
{
    public int G0;
    public final ExecutorService H0;
    public final uqh I0;
    
    public ftc() {
        final RealtimeSinceBootClock value = RealtimeSinceBootClock.get();
        super(3);
        this.H0 = Executors.newFixedThreadPool(3);
        this.I0 = (uqh)value;
        this.G0 = 30000;
    }
    
    public final HttpURLConnection N(final Uri uri, final int n) throws IOException {
        final Uri a = o6w.a;
        final Uri uri2 = null;
        Label_0031: {
            if (uri == null) {
                final URL url = null;
                break Label_0031;
            }
            try {
                final URL url = new URL(uri.toString());
                final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setConnectTimeout(this.G0);
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
                if (n > 0 && parse != null && !q5j.a((Object)parse.getScheme(), (Object)scheme)) {
                    return this.N(parse, n - 1);
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
    
    public final Map a(final uwa uwa, final int n) {
        final ftc.ftc$a ftc$a = (ftc.ftc$a)uwa;
        final HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(ftc$a.e - ftc$a.d));
        hashMap.put("fetch_time", Long.toString(ftc$a.f - ftc$a.e));
        hashMap.put("total_time", Long.toString(ftc$a.f - ftc$a.d));
        hashMap.put("image_size", Integer.toString(n));
        return hashMap;
    }
    
    public final uwa c(final pk6 pk6, final n1l n1l) {
        return (uwa)new ftc.ftc$a(pk6, n1l);
    }
    
    public final void h(final uwa uwa) {
        ((ftc.ftc$a)uwa).f = this.I0.now();
    }
    
    public final void i(final uwa uwa, final idi$a idi$a) {
        final ftc.ftc$a ftc$a = (ftc.ftc$a)uwa;
        ftc$a.d = this.I0.now();
        ((uwa)ftc$a).b.p((o1l)new etc(this.H0.submit((Runnable)new dtc(this, ftc$a, idi$a)), idi$a));
    }
}
