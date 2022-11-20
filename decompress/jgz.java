import java.io.InputStream;
import java.util.List;
import java.net.URLConnection;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import java.net.HttpURLConnection;
import java.util.Map;
import java.net.URL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgz implements Runnable
{
    public final URL D0;
    public final lgz E0;
    public final pbz F0;
    
    public jgz(final lgz e0, final String s, final URL d0, final pbz f0) {
        this.E0 = e0;
        eli.n(s);
        this.D0 = d0;
        this.F0 = f0;
    }
    
    public final void a(final int n, final Exception ex, final byte[] array, final Map map) {
        ((pbz)this.E0).D0.a().q((Runnable)new ggz(this, n, ex, array, map));
    }
    
    @Override
    public final void run() {
        ((pbz)this.E0).f();
        HttpURLConnection httpURLConnection3 = null;
        Label_0267: {
            try {
                final lgz e0 = this.E0;
                final URLConnection openConnection = this.D0.openConnection();
                if (openConnection instanceof HttpURLConnection) {
                    final HttpURLConnection httpURLConnection = (HttpURLConnection)openConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    Objects.requireNonNull(((pbz)e0).D0);
                    httpURLConnection.setConnectTimeout(60000);
                    Objects.requireNonNull(((pbz)e0).D0);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        final int responseCode = httpURLConnection.getResponseCode();
                        try {
                            final Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            InputStream inputStream;
                            byte[] byteArray;
                            try {
                                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    final byte[] array = new byte[1024];
                                    while (true) {
                                        final int read = inputStream.read(array);
                                        if (read <= 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(array, 0, read);
                                    }
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    final InputStream inputStream2 = inputStream;
                                    inputStream2.close();
                                    final HttpURLConnection httpURLConnection2 = httpURLConnection;
                                    httpURLConnection2.disconnect();
                                    final jgz jgz = this;
                                    final int n = responseCode;
                                    final Exception ex = null;
                                    final byte[] array2 = byteArray;
                                    final Map<String, List<String>> map = headerFields;
                                    jgz.a(n, ex, array2, map);
                                    return;
                                }
                                finally {
                                    final Object o2;
                                    final Object o = o2;
                                }
                            }
                            finally {
                                final Object o3;
                                final Object o = o3;
                                inputStream = null;
                            }
                            try {
                                final InputStream inputStream2 = inputStream;
                                inputStream2.close();
                                final HttpURLConnection httpURLConnection2 = httpURLConnection;
                                httpURLConnection2.disconnect();
                                final jgz jgz = this;
                                final int n = responseCode;
                                final Exception ex = null;
                                final byte[] array2 = byteArray;
                                final Map<String, List<String>> map = headerFields;
                                jgz.a(n, ex, array2, map);
                                return;
                                iftrue(Label_0183:)(inputStream == null);
                                Block_20: {
                                    break Block_20;
                                    Label_0183: {
                                        throw;
                                    }
                                }
                                inputStream.close();
                            }
                            catch (final IOException ex2) {}
                        }
                        catch (final IOException ex3) {}
                    }
                    catch (final IOException ex4) {
                        break Label_0267;
                    }
                    finally {
                        goto Label_0238;
                    }
                }
                throw new IOException("Failed to obtain HTTP connection");
            }
            catch (final IOException ex5) {
                httpURLConnection3 = null;
            }
            finally {
                httpURLConnection3 = null;
            }
        }
        final Map<String, List<String>> headerFields = null;
        final int responseCode = 0;
        if (httpURLConnection3 != null) {
            httpURLConnection3.disconnect();
        }
        final IOException ex5;
        this.a(responseCode, ex5, null, headerFields);
    }
}
