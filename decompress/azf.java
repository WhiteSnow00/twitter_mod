import java.util.List;
import com.twitter.model.liveevent.LiveEventConfiguration$a;
import android.net.Uri;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class azf
{
    public static final Set<String> a;
    public static final Set<String> b;
    public static final umx c;
    public static final iq0 d;
    public static final umx e;
    
    static {
        final Set<String> set = a = dnp.t((Object)"twitter.com", (Object[])new String[] { "www.twitter.com" });
        final Set s = dnp.s((Object)"mobile.twitter.com");
        azf.b = (qdd)s;
        final umx umx = c = new umx();
        final iq0 iq0 = d = new iq0();
        final umx umx2 = e = new umx();
        ((wqb)umx).g((Iterable)set, "i/events/*", 0);
        ((wqb)umx2).g((Iterable)s, "i/events/*", 0);
        ((wqb)iq0).a("events", "timeline/*", 0);
    }
    
    public static void a(final umx umx, final Iterable<String> iterable, final int n) {
        ((wqb)umx).g((Iterable)iterable, "i/events/*", n);
    }
    
    public static LiveEventConfiguration$a b(final Uri uri) {
        final LiveEventConfiguration$a liveEventConfiguration$a = new LiveEventConfiguration$a(c(uri));
        liveEventConfiguration$a.f = d(uri);
        final List queryParameters = uri.getQueryParameters("source");
        String g;
        if (queryParameters.isEmpty()) {
            g = null;
        }
        else {
            g = queryParameters.get(0);
        }
        liveEventConfiguration$a.g = g;
        return liveEventConfiguration$a;
    }
    
    public static String c(final Uri uri) {
        final String lastPathSegment = uri.getLastPathSegment();
        if (ikr.g((CharSequence)lastPathSegment)) {
            return lastPathSegment;
        }
        return "INVALID_ID";
    }
    
    public static String d(final Uri uri) {
        final List queryParameters = uri.getQueryParameters("timeline");
        if (queryParameters.isEmpty()) {
            return null;
        }
        return (String)queryParameters.get(0);
    }
    
    public static boolean e(final String s) {
        boolean b = true;
        if (s == null || azf.c.h(Uri.parse(s), false) != 0) {
            b = false;
        }
        return b;
    }
}
