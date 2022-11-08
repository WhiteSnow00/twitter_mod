import java.net.URI;
import java.io.IOException;
import java.security.GeneralSecurityException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import java.io.InterruptedIOException;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsa
{
    public volatile Set<String> a;
    
    public fsa() {
        this.a = (Set<String>)f3a.C0;
        dta.b().o("traffic_paths_to_ignore_from_failback").subscribe((fk6)new gh5((rtb)new fsa$a(this), 29));
    }
    
    public final lsa a(final xrc<?, ?> xrc, final Exception ex) {
        zzd.f((Object)xrc, "httpOperation");
        Object o;
        if (!xrc.f) {
            o = lsa$a.a;
        }
        else {
            final URI c = xrc.c;
            zzd.e((Object)c, "httpOperation.uri");
            final Set<String> a = this.a;
            final String path = c.getPath();
            boolean contains = false;
            Label_0084: {
                if (!a.isEmpty()) {
                    zzd.e((Object)path, "uriPath");
                    if (!ckr.h1((CharSequence)path)) {
                        contains = a.contains(path);
                        break Label_0084;
                    }
                }
                contains = false;
            }
            if (contains) {
                o = lsa$a.a;
            }
            else if (ex == null && xrc.z()) {
                o = ksa.a;
            }
            else if (ex == null && xrc.n.a >= 500) {
                o = jsa.a;
            }
            else if (ex instanceof InterruptedIOException) {
                o = lsa$a.a;
            }
            else if (ex instanceof StreamResetException) {
                o = lsa$a.a;
            }
            else if (ex instanceof ConnectionShutdownException) {
                o = lsa$a.a;
            }
            else if (ex instanceof GeneralSecurityException) {
                o = lsa$b.a;
            }
            else if (ex instanceof IOException) {
                o = jsa.a;
            }
            else {
                o = lsa$a.a;
            }
        }
        return (lsa)o;
    }
}
