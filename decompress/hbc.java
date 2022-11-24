import java.io.IOException;
import okhttp3.Request$Builder;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import okhttp3.Interceptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbc implements Interceptor
{
    public final Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
        final Request request = interceptor$Chain.request();
        final RequestBody body = request.body();
        if (request.header("Optimize-Body") != null) {
            int n2;
            final int n = n2 = 0;
            if (body != null) {
                n2 = n;
                if (body.contentLength() > 512L) {
                    n2 = n;
                    if (request.header("Content-Encoding") == null) {
                        final MediaType contentType = body.contentType();
                        boolean b = false;
                        Label_0127: {
                            if (contentType != null) {
                                String string;
                                if ((string = contentType.toString()) == null) {
                                    string = "";
                                }
                                if (string.startsWith("application/x-www-form-urlencoded") || bs4.S(string)) {
                                    b = true;
                                    break Label_0127;
                                }
                            }
                            b = false;
                        }
                        n2 = n;
                        if (b) {
                            n2 = 1;
                        }
                    }
                }
            }
            if (n2 != 0) {
                final Request$Builder header = request.newBuilder().header("Content-Encoding", "gzip");
                final String method = request.method();
                final cr2 cr2 = new cr2();
                final sr2 k = o9a.k((zdq)new ibc((zdq)cr2));
                body.writeTo(k);
                ((w2m)k).close();
                return interceptor$Chain.proceed(header.method(method, (RequestBody)new gbc(body, cr2)).build());
            }
        }
        return interceptor$Chain.proceed(request);
    }
}
