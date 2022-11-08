import android.net.Uri;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k5w
{
    public final gew a;
    public final bft b;
    public final cmx c;
    
    public k5w(final gew a, final bft b) {
        final cmx c = new cmx();
        this.c = c;
        this.a = a;
        this.b = b;
        ((wcg)c).m("i/redirect", 1);
    }
    
    public static void b(final UserIdentifier userIdentifier, final String s, final Uri uri) {
        final zf4 zf4 = new zf4(userIdentifier);
        zf4.s = 2;
        final int a = w4j.a;
        zf4.q(new String[] { "app:url_interpreter:redirect_service:", s });
        if (uri != null) {
            zf4.q = uri.toString();
        }
        saw.b((okm)zf4);
    }
    
    public final boolean a(final Uri uri, final a a) {
        final cmx c = this.c;
        boolean b = false;
        if (c.t(uri, false) == 1) {
            final UserIdentifier b2 = this.a.b();
            b(b2, "impression", uri);
            final String queryParameter = uri.getQueryParameter("url");
            if (queryParameter != null) {
                final Uri parse = Uri.parse(queryParameter);
                if (p5w.r(parse)) {
                    xw0.c((rj)new l6p((Object)b2, (Object)uri, 4));
                    if (a.j(b2, parse)) {
                        b(b2, "resolvable", parse);
                    }
                }
                else {
                    b(b2, "unknown_host", parse);
                    this.b.b(2131956959, 1);
                }
            }
            b = true;
        }
        return b;
    }
    
    public interface a
    {
        boolean j(final UserIdentifier p0, final Uri p1);
    }
}
