// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.HashMap;
import java.net.NoRouteToHostException;
import java.net.MalformedURLException;
import java.net.URL;
import android.net.Uri;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import android.util.Log;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Objects;
import java.io.InputStream;
import java.net.HttpURLConnection;

public final class e extends nk1 implements HttpDataSource
{
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final HttpDataSource$c i;
    public final HttpDataSource$c j;
    public final boolean k;
    public muk<String> l;
    public b m;
    public HttpURLConnection n;
    public InputStream o;
    public boolean p;
    public int q;
    public long r;
    public long s;
    
    public e(final String h, final int f, final int g, final HttpDataSource$c i) {
        super(true);
        this.h = h;
        this.f = f;
        this.g = g;
        this.e = false;
        this.i = i;
        this.l = null;
        this.j = new HttpDataSource$c();
        this.k = false;
    }
    
    public static void x(final HttpURLConnection httpURLConnection, final long n) {
        if (httpURLConnection == null) {
            return;
        }
        final int a = rnw.a;
        if (a < 19) {
            return;
        }
        if (a > 20) {
            return;
        }
        try {
            final InputStream inputStream = httpURLConnection.getInputStream();
            if (n == -1L) {
                if (inputStream.read() == -1) {
                    return;
                }
            }
            else if (n <= 2048L) {
                return;
            }
            final String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                final Class<? super InputStream> superclass = inputStream.getClass().getSuperclass();
                Objects.requireNonNull(superclass);
                final Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", (Class[])new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        }
        catch (final Exception ex) {}
    }
    
    public final long a(final b m) throws HttpDataSource$HttpDataSourceException {
        this.m = m;
        long n = 0L;
        this.s = 0L;
        this.r = 0L;
        this.r(m);
        try {
            final HttpURLConnection v = this.v(m);
            this.n = v;
            this.q = v.getResponseCode();
            v.getResponseMessage();
            final int q = this.q;
            if (q >= 200) {
                if (q <= 299) {
                    final String contentType = v.getContentType();
                    final muk<String> l = this.l;
                    if (l != null && !l.apply(contentType)) {
                        this.t();
                        throw new HttpDataSource.InvalidContentTypeException(contentType, m);
                    }
                    long n2 = n;
                    if (this.q == 200) {
                        final long f = m.f;
                        n2 = n;
                        if (f != 0L) {
                            n2 = f;
                        }
                    }
                    final boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(v.getHeaderField("Content-Encoding"));
                    if (!equalsIgnoreCase) {
                        final long g = m.g;
                        if (g != -1L) {
                            this.r = g;
                        }
                        else {
                            final String headerField = v.getHeaderField("Content-Length");
                            final String headerField2 = v.getHeaderField("Content-Range");
                            final Pattern a = gtc.a;
                            long long1 = 0L;
                            Label_0298: {
                                if (!TextUtils.isEmpty((CharSequence)headerField)) {
                                    try {
                                        long1 = Long.parseLong(headerField);
                                        break Label_0298;
                                    }
                                    catch (final NumberFormatException ex) {
                                        final StringBuilder sb = new StringBuilder(l58.g(headerField, 28));
                                        sb.append("Unexpected Content-Length [");
                                        sb.append(headerField);
                                        sb.append("]");
                                        Log.e("HttpUtil", sb.toString());
                                    }
                                }
                                long1 = -1L;
                            }
                            long max = long1;
                            if (!TextUtils.isEmpty((CharSequence)headerField2)) {
                                final Matcher matcher = gtc.a.matcher(headerField2);
                                max = long1;
                                if (matcher.matches()) {
                                    try {
                                        final String group = matcher.group(2);
                                        Objects.requireNonNull(group);
                                        final long long2 = Long.parseLong(group);
                                        final String group2 = matcher.group(1);
                                        Objects.requireNonNull(group2);
                                        final long n3 = long2 - Long.parseLong(group2) + 1L;
                                        if (long1 < 0L) {
                                            max = n3;
                                        }
                                        else {
                                            max = long1;
                                            if (long1 != n3) {
                                                final StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
                                                sb2.append("Inconsistent headers [");
                                                sb2.append(headerField);
                                                sb2.append("] [");
                                                sb2.append(headerField2);
                                                sb2.append("]");
                                                Log.w("HttpUtil", sb2.toString());
                                                max = Math.max(long1, n3);
                                            }
                                        }
                                    }
                                    catch (final NumberFormatException ex2) {
                                        final StringBuilder sb3 = new StringBuilder(l58.g(headerField2, 27));
                                        sb3.append("Unexpected Content-Range [");
                                        sb3.append(headerField2);
                                        sb3.append("]");
                                        Log.e("HttpUtil", sb3.toString());
                                        max = long1;
                                    }
                                }
                            }
                            long r;
                            if (max != -1L) {
                                r = max - n2;
                            }
                            else {
                                r = -1L;
                            }
                            this.r = r;
                        }
                    }
                    else {
                        this.r = m.g;
                    }
                    try {
                        this.o = v.getInputStream();
                        if (equalsIgnoreCase) {
                            this.o = new GZIPInputStream(this.o);
                        }
                        this.p = true;
                        this.s(m);
                        try {
                            this.y(n2, m);
                            return this.r;
                        }
                        catch (final IOException ex3) {
                            this.t();
                            if (ex3 instanceof HttpDataSource$HttpDataSourceException) {
                                throw (HttpDataSource$HttpDataSourceException)ex3;
                            }
                            throw new HttpDataSource$HttpDataSourceException(ex3, m, 2000, 1);
                        }
                    }
                    catch (final IOException ex4) {
                        this.t();
                        throw new HttpDataSource$HttpDataSourceException(ex4, m, 2000, 1);
                    }
                }
            }
            final Map<String, List<String>> headerFields = v.getHeaderFields();
            if (this.q == 416 && m.f == gtc.b(v.getHeaderField("Content-Range"))) {
                this.p = true;
                this.s(m);
                final long g2 = m.g;
                if (g2 != -1L) {
                    n = g2;
                }
                return n;
            }
            final InputStream errorStream = v.getErrorStream();
            while (true) {
                if (errorStream != null) {
                    byte[] array = null;
                    Label_0826: {
                        try {
                            array = rnw.R(errorStream);
                            break Label_0826;
                            array = rnw.f;
                        }
                        catch (final IOException ex5) {
                            array = rnw.f;
                        }
                    }
                    this.t();
                    Object o;
                    if (this.q == 416) {
                        o = new DataSourceException(2008);
                    }
                    else {
                        o = null;
                    }
                    throw new HttpDataSource.InvalidResponseCodeException(this.q, (IOException)o, (Map)headerFields, m, array);
                }
                continue;
            }
        }
        catch (final IOException ex6) {
            this.t();
            throw HttpDataSource$HttpDataSourceException.b(ex6, m, 1);
        }
    }
    
    public final int b(final byte[] array, int n, int a) throws HttpDataSource$HttpDataSourceException {
        final int n2 = -1;
        if (a == 0) {
            n = 0;
            return n;
        }
        try {
            final long r = this.r;
            int n3 = a;
            if (r != -1L) {
                final long n4 = r - this.s;
                if (n4 == 0L) {
                    n = n2;
                    return n;
                }
                n3 = (int)Math.min(a, n4);
            }
            final InputStream o = this.o;
            a = rnw.a;
            n = o.read(array, n, n3);
            if (n == -1) {
                n = n2;
            }
            else {
                this.s += n;
                this.p(n);
            }
            return n;
        }
        catch (final IOException ex) {
            final b m = this.m;
            n = rnw.a;
            throw HttpDataSource$HttpDataSourceException.b(ex, m, 2);
        }
    }
    
    public final void close() throws HttpDataSource$HttpDataSourceException {
        try {
            final InputStream o = this.o;
            if (o != null) {
                final long r = this.r;
                long n = -1L;
                if (r != -1L) {
                    n = r - this.s;
                }
                x(this.n, n);
                try {
                    o.close();
                }
                catch (final IOException ex) {
                    final b m = this.m;
                    final int a = rnw.a;
                    throw new HttpDataSource$HttpDataSourceException(ex, m, 2000, 3);
                }
            }
        }
        finally {
            this.o = null;
            this.t();
            if (this.p) {
                this.p = false;
                this.q();
            }
        }
    }
    
    @Override
    public final Map<String, List<String>> d() {
        final HttpURLConnection n = this.n;
        if (n == null) {
            return (Map<String, List<String>>)obm.L0;
        }
        return (Map<String, List<String>>)new e.e$b((Map)n.getHeaderFields());
    }
    
    public final Uri m() {
        final HttpURLConnection n = this.n;
        Uri parse;
        if (n == null) {
            parse = null;
        }
        else {
            parse = Uri.parse(n.getURL().toString());
        }
        return parse;
    }
    
    public final void t() {
        final HttpURLConnection n = this.n;
        if (n != null) {
            try {
                n.disconnect();
            }
            catch (final Exception ex) {
                tqb.y("DefaultHttpDataSource", "Unexpected error while disconnecting", ex);
            }
            this.n = null;
        }
    }
    
    public final URL u(final URL url, String protocol, final b b) throws HttpDataSource$HttpDataSourceException {
        if (protocol != null) {
            try {
                final URL url2 = new URL(url, protocol);
                protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    final String value = String.valueOf(protocol);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Unsupported protocol redirect: ".concat(value);
                    }
                    else {
                        concat = new String("Unsupported protocol redirect: ");
                    }
                    throw new HttpDataSource$HttpDataSourceException(concat, b, 2001);
                }
                if (!this.e && !protocol.equals(url.getProtocol())) {
                    final String protocol2 = url.getProtocol();
                    final StringBuilder k = tf8.k(protocol.length() + l58.g(protocol2, 41), "Disallowed cross-protocol redirect (", protocol2, " to ", protocol);
                    k.append(")");
                    throw new HttpDataSource$HttpDataSourceException(k.toString(), b, 2001);
                }
                return url2;
            }
            catch (final MalformedURLException ex) {
                throw new HttpDataSource$HttpDataSourceException((IOException)ex, b, 2001, 1);
            }
        }
        throw new HttpDataSource$HttpDataSourceException("Null location redirect", b, 2001);
    }
    
    public final HttpURLConnection v(final b b) throws IOException {
        URL url = new URL(b.a.toString());
        int c = b.c;
        byte[] d = b.d;
        final long f = b.f;
        final long g = b.g;
        final boolean c2 = b.c(1);
        if (!this.e && !this.k) {
            return this.w(url, c, d, f, g, c2, true, b.e);
        }
        int n = 0;
        while (true) {
            final int n2 = n + 1;
            if (n > 20) {
                throw new HttpDataSource$HttpDataSourceException((IOException)new NoRouteToHostException(go9.p(31, "Too many redirects: ", n2)), b, 2001, 1);
            }
            final HttpURLConnection w = this.w(url, c, d, f, g, c2, false, b.e);
            final int responseCode = w.getResponseCode();
            final String headerField = w.getHeaderField("Location");
            if ((c == 1 || c == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                w.disconnect();
                url = this.u(url, headerField, b);
            }
            else {
                if (c != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return w;
                }
                w.disconnect();
                if (!this.k || responseCode != 302) {
                    d = null;
                    c = 1;
                }
                url = this.u(url, headerField, b);
            }
            n = n2;
        }
    }
    
    public final HttpURLConnection w(final URL url, final int n, final byte[] array, final long n2, final long n3, final boolean b, final boolean instanceFollowRedirects, final Map<String, String> map) throws IOException {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        final HashMap hashMap = new HashMap();
        final HttpDataSource$c i = this.i;
        if (i != null) {
            hashMap.putAll(i.a());
        }
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
        }
        final String a = gtc.a(n2, n3);
        if (a != null) {
            httpURLConnection.setRequestProperty("Range", a);
        }
        final String h = this.h;
        if (h != null) {
            httpURLConnection.setRequestProperty("User-Agent", h);
        }
        String s;
        if (b) {
            s = "gzip";
        }
        else {
            s = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", s);
        httpURLConnection.setInstanceFollowRedirects(instanceFollowRedirects);
        httpURLConnection.setDoOutput(array != null);
        httpURLConnection.setRequestMethod(b.b(n));
        if (array != null) {
            httpURLConnection.setFixedLengthStreamingMode(array.length);
            httpURLConnection.connect();
            final OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(array);
            outputStream.close();
        }
        else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }
    
    public final void y(long n, final b b) throws IOException {
        if (n == 0L) {
            return;
        }
        final byte[] array = new byte[4096];
        while (n > 0L) {
            final int n2 = (int)Math.min(n, 4096);
            final InputStream o = this.o;
            final int a = rnw.a;
            final int read = o.read(array, 0, n2);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException((IOException)new InterruptedIOException(), b, 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException(b, 2008);
            }
            n -= read;
            this.p(read);
        }
    }
}
