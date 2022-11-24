import android.net.Uri;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k6w
{
    public final kfw a;
    public final igt b;
    public final lnx c;
    
    public k6w(final kfw a, final igt b) {
        final lnx c = new lnx();
        this.c = c;
        this.a = a;
        this.b = b;
        c.c("i/redirect", 1);
    }
    
    public static void b(final UserIdentifier userIdentifier, final String s, final Uri uri) {
        final fg4 fg4 = new fg4(userIdentifier);
        ((o1p)fg4).s = 2;
        final int a = o5j.a;
        ((o1p)fg4).q(new String[] { "app:url_interpreter:redirect_service:", s });
        if (uri != null) {
            ((o1p)fg4).q = uri.toString();
        }
        sbw.b((tlm)fg4);
    }
    
    public final boolean a(final Uri uri, final a a) {
        final lnx c = this.c;
        boolean b = false;
        if (c.f(uri, false) == 1) {
            final UserIdentifier b2 = this.a.b();
            b(b2, "impression", uri);
            final String queryParameter = uri.getQueryParameter("url");
            if (queryParameter != null) {
                final Uri parse = Uri.parse(queryParameter);
                if (p6w.r(parse)) {
                    xw0.c((sj)new zt1((Object)b2, (Object)uri, 5));
                    if (a.c(b2, parse)) {
                        b(b2, "resolvable", parse);
                    }
                }
                else {
                    b(b2, "unknown_host", parse);
                    this.b.c(2131956959, 1);
                }
            }
            b = true;
        }
        return b;
    }
    
    public interface a
    {
        boolean c(final UserIdentifier p0, final Uri p1);
    }
}
