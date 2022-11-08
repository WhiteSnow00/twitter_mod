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

public final class vfz implements Runnable
{
    public final URL C0;
    public final /* synthetic */ xfz D0;
    public final abz E0;
    
    public vfz(final xfz d0, final String s, final URL c0, final abz e0) {
        this.D0 = d0;
        xd.q(s);
        this.C0 = c0;
        this.E0 = e0;
    }
    
    public final void a(final int n, final Exception ex, final byte[] array, final Map map) {
        ((abz)this.D0).C0.a().q((Runnable)new sfz(this, n, ex, array, map));
    }
    
    @Override
    public final void run() {
        ((abz)this.D0).f();
        HttpURLConnection httpURLConnection3 = null;
        Label_0252: {
            try {
                final xfz d0 = this.D0;
                final URLConnection openConnection = this.C0.openConnection();
                if (openConnection instanceof HttpURLConnection) {
                    final HttpURLConnection httpURLConnection = (HttpURLConnection)openConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    Objects.requireNonNull(((abz)d0).C0);
                    httpURLConnection.setConnectTimeout(60000);
                    Objects.requireNonNull(((abz)d0).C0);
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
                                    final vfz vfz = this;
                                    final int n = responseCode;
                                    final Exception ex = null;
                                    final byte[] array2 = byteArray;
                                    final Map<String, List<String>> map = headerFields;
                                    vfz.a(n, ex, array2, map);
                                    return;
                                }
                                finally {
                                    final Throwable t2;
                                    final Throwable t = t2;
                                }
                            }
                            finally {
                                final Throwable t3;
                                final Throwable t = t3;
                                inputStream = null;
                            }
                            try {
                                final InputStream inputStream2 = inputStream;
                                inputStream2.close();
                                final HttpURLConnection httpURLConnection2 = httpURLConnection;
                                httpURLConnection2.disconnect();
                                final vfz vfz = this;
                                final int n = responseCode;
                                final Exception ex = null;
                                final byte[] array2 = byteArray;
                                final Map<String, List<String>> map = headerFields;
                                vfz.a(n, ex, array2, map);
                                return;
                                final Throwable t;
                                while (true) {
                                    inputStream.close();
                                    throw t;
                                    iftrue(Label_0177:)(inputStream == null);
                                    continue;
                                }
                                Label_0177: {
                                    throw t;
                                }
                            }
                            catch (final IOException ex2) {}
                        }
                        catch (final IOException ex3) {}
                    }
                    catch (final IOException ex4) {
                        break Label_0252;
                    }
                    finally {
                        goto Label_0225;
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
