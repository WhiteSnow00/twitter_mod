import okhttp3.ResponseBody;
import retrofit2.Response;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import retrofit2.HttpException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import tv.periscope.android.api.PsUser;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ytn extends ste implements qsb<Throwable, lcq<? extends ynj<PsUser>>>
{
    public final AtomicInteger D0;
    public final vtn E0;
    
    public ytn(final AtomicInteger d0, final vtn e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final Throwable t = (Throwable)o;
        czd.f((Object)t, "throwable");
        final int value = this.D0.get();
        int n = 1;
        Label_0241: {
            if (value != 1) {
                break Label_0241;
            }
            final vtn.a companion = vtn.Companion;
            Objects.requireNonNull(companion);
            HttpException ex;
            if (t instanceof HttpException) {
                ex = (HttpException)t;
            }
            else {
                ex = null;
            }
            Label_0168: {
                if (ex == null || ex.code() != 401) {
                    break Label_0168;
                }
                final Response response = ex.response();
                while (true) {
                    if (response == null) {
                        break Label_0157;
                    }
                    final ResponseBody errorBody = response.errorBody();
                    if (errorBody == null) {
                        break Label_0157;
                    }
                    try {
                        final dr2 peek = errorBody.source().peek();
                        final MediaType contentType = errorBody.contentType();
                        Charset charset;
                        if (contentType == null || (charset = MediaType.charset$default(contentType, (Charset)null, 1, (Object)null)) == null) {
                            charset = ht3.b;
                        }
                        boolean c0 = zkr.c0((CharSequence)peek.K2(companion.a(peek, charset)), (CharSequence)"rectify_url", false);
                        while (true) {
                            if (c0) {
                                n = 0;
                            }
                            eaq eaq;
                            if (n != 0) {
                                final s3k f = this.E0.f;
                                Objects.requireNonNull(f);
                                o = new af4(f.b);
                                ((u0p)o).T = vba.g("periscope_watch", "", "periscope_authentication", "", "token_refresh").toString();
                                n = c5j.a;
                                cbw.b((elm)o);
                                eaq = this.E0.a().firstOrError();
                            }
                            else {
                                final String message = t.getMessage();
                                if (message != null) {
                                    final s3k f2 = this.E0.f;
                                    Objects.requireNonNull(f2);
                                    final af4 af4 = new af4(f2.b);
                                    ((u0p)af4).T = vba.g("periscope_watch", "", "periscope", "", "call_failed").toString();
                                    n = c5j.a;
                                    ((u0p)af4).D = message;
                                    cbw.b((elm)af4);
                                }
                                eaq = eaq.n(t);
                            }
                            return eaq;
                            c0 = false;
                            continue;
                        }
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
