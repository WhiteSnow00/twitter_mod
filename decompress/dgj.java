import java.io.InterruptedIOException;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import okhttp3.ResponseBody;
import okhttp3.Request;
import java.util.Iterator;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import java.util.Map;
import java.util.HashMap;
import okhttp3.Request$Builder;
import okhttp3.HttpUrl;
import java.util.Objects;
import java.io.InputStream;
import okhttp3.Response;
import com.google.android.exoplayer2.upstream.b;
import okhttp3.CacheControl;
import com.google.android.exoplayer2.upstream.HttpDataSource$c;
import okhttp3.Call$Factory;
import com.google.android.exoplayer2.upstream.HttpDataSource;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgj extends pk1 implements HttpDataSource
{
    public final Call$Factory e;
    public final HttpDataSource$c f;
    public final String g;
    public final CacheControl h;
    public final HttpDataSource$c i;
    public b j;
    public Response k;
    public InputStream l;
    public boolean m;
    public long n;
    public long o;
    
    static {
        eha.a("goog.exo.okhttp");
    }
    
    @Deprecated
    public dgj(final Call$Factory e, final String g, final CacheControl h, final HttpDataSource$c i) {
        super(true);
        Objects.requireNonNull(e);
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.f = new HttpDataSource$c();
    }
    
    public final long a(final b j) throws HttpDataSource$HttpDataSourceException {
        this.j = (b)j;
        long n = 0L;
        this.o = 0L;
        this.n = 0L;
        this.r((b)j);
        final long f = ((b)j).f;
        final long g = ((b)j).g;
        final HttpUrl parse = HttpUrl.parse(((b)j).a.toString());
        if (parse != null) {
            final Request$Builder url = new Request$Builder().url(parse);
            final CacheControl h = this.h;
            if (h != null) {
                url.cacheControl(h);
            }
            final HashMap hashMap = new HashMap();
            final HttpDataSource$c i = this.i;
            if (i != null) {
                hashMap.putAll(i.a());
            }
            hashMap.putAll(this.f.a());
            hashMap.putAll(((b)j).e);
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                url.header((String)entry.getKey(), (String)entry.getValue());
            }
            final String a = ctc.a(f, g);
            if (a != null) {
                url.addHeader("Range", a);
            }
            final String g2 = this.g;
            if (g2 != null) {
                url.addHeader("User-Agent", g2);
            }
            if (!((b)j).c(1)) {
                url.addHeader("Accept-Encoding", "identity");
            }
            final byte[] d = ((b)j).d;
            Object o = null;
            RequestBody requestBody;
            if (d != null) {
                requestBody = RequestBody.create((MediaType)null, d);
            }
            else if (((b)j).c == 2) {
                requestBody = RequestBody.create((MediaType)null, imw.f);
            }
            else {
                requestBody = null;
            }
            url.method(b.b(((b)j).c), requestBody);
            final Request build = url.build();
            try {
                final Response execute = this.e.newCall(build).execute();
                this.k = execute;
                final ResponseBody body = execute.body();
                Objects.requireNonNull(body);
                this.l = body.byteStream();
                final int code = execute.code();
                final boolean successful = execute.isSuccessful();
                final long n2 = -1L;
                if (!successful) {
                    if (code == 416 && ((b)j).f == ctc.b(execute.headers().get("Content-Range"))) {
                        this.m = true;
                        this.s((b)j);
                        final long g3 = ((b)j).g;
                        if (g3 != -1L) {
                            n = g3;
                        }
                        return n;
                    }
                    byte[] array;
                    try {
                        final InputStream l = this.l;
                        Objects.requireNonNull(l);
                        array = imw.R(l);
                    }
                    catch (final IOException ex) {
                        array = imw.f;
                    }
                    final Map multimap = execute.headers().toMultimap();
                    this.t();
                    if (code == 416) {
                        o = new DataSourceException(2008);
                    }
                    execute.message();
                    throw new InvalidResponseCodeException(code, (IOException)o, multimap, (b)j, array);
                }
                else {
                    final MediaType contentType = body.contentType();
                    if (contentType != null) {
                        contentType.toString();
                    }
                    long n3 = n;
                    if (code == 200) {
                        final long f2 = ((b)j).f;
                        n3 = n;
                        if (f2 != 0L) {
                            n3 = f2;
                        }
                    }
                    final long g4 = ((b)j).g;
                    if (g4 != -1L) {
                        this.n = g4;
                    }
                    else {
                        final long contentLength = body.contentLength();
                        long n4 = n2;
                        if (contentLength != -1L) {
                            n4 = contentLength - n3;
                        }
                        this.n = n4;
                    }
                    this.m = true;
                    this.s((b)j);
                    try {
                        this.u(n3, (b)j);
                        return this.n;
                    }
                    catch (final HttpDataSource$HttpDataSourceException j) {
                        this.t();
                        throw j;
                    }
                }
            }
            catch (final IOException ex2) {
                throw HttpDataSource$HttpDataSourceException.b(ex2, (b)j, 1);
            }
        }
        throw new HttpDataSource$HttpDataSourceException("Malformed URL", (b)j, 1004);
    }
    
    public final int b(final byte[] array, int n, int a) throws HttpDataSource$HttpDataSourceException {
        final int n2 = -1;
        if (a == 0) {
            n = 0;
            return n;
        }
        try {
            final long n3 = this.n;
            int n4 = a;
            if (n3 != -1L) {
                final long n5 = n3 - this.o;
                if (n5 == 0L) {
                    n = n2;
                    return n;
                }
                n4 = (int)Math.min(a, n5);
            }
            final InputStream l = this.l;
            a = imw.a;
            n = l.read(array, n, n4);
            if (n == -1) {
                n = n2;
            }
            else {
                this.o += n;
                this.p(n);
            }
            return n;
        }
        catch (final IOException ex) {
            final b j = this.j;
            n = imw.a;
            throw HttpDataSource$HttpDataSourceException.b(ex, j, 2);
        }
    }
    
    public final void close() {
        if (this.m) {
            this.m = false;
            this.q();
            this.t();
        }
    }
    
    public final Map<String, List<String>> d() {
        final Response k = this.k;
        Map<Object, Object> map;
        if (k == null) {
            map = Collections.emptyMap();
        }
        else {
            map = k.headers().toMultimap();
        }
        return (Map<String, List<String>>)map;
    }
    
    public final Uri m() {
        final Response k = this.k;
        Uri parse;
        if (k == null) {
            parse = null;
        }
        else {
            parse = Uri.parse(k.request().url().toString());
        }
        return parse;
    }
    
    public final void t() {
        final Response k = this.k;
        if (k != null) {
            final ResponseBody body = k.body();
            Objects.requireNonNull(body);
            body.close();
            this.k = null;
        }
        this.l = null;
    }
    
    public final void u(long n, final b b) throws HttpDataSource$HttpDataSourceException {
        if (n == 0L) {
            return;
        }
        final byte[] array = new byte[4096];
        while (n > 0L) {
            final long n2 = 4096;
            try {
                final int n3 = (int)Math.min(n, n2);
                final InputStream l = this.l;
                final int a = imw.a;
                final int read = l.read(array, 0, n3);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read != -1) {
                    n -= read;
                    this.p(read);
                    continue;
                }
                throw new HttpDataSource$HttpDataSourceException(b, 2008);
            }
            catch (final IOException ex) {
                if (ex instanceof HttpDataSource$HttpDataSourceException) {
                    throw (HttpDataSource$HttpDataSourceException)ex;
                }
                throw new HttpDataSource$HttpDataSourceException(b, 2000);
            }
            break;
        }
    }
}
