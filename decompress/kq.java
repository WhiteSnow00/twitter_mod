import java.util.TimeZone;
import com.twitter.util.user.UserIdentifier;
import java.net.URI;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kq implements urc
{
    public final void a(final URI uri, final UserIdentifier userIdentifier, final urc$a urc$a) {
        final lq a = mp.a();
        if (a == null || !a.b) {
            urc$a.k("Timezone", TimeZone.getDefault().getID());
        }
        if (a != null) {
            urc$a.k("X-Twitter-Client-AdID", a.a);
            String s;
            if (a.b) {
                s = "1";
            }
            else {
                s = "0";
            }
            urc$a.k("X-Twitter-Client-Limit-Ad-Tracking", s);
        }
    }
}
