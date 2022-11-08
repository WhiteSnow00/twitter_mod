import android.net.Uri;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d19 extends z09
{
    public final int K0;
    public final long L0;
    
    public d19(final Context context, final UserIdentifier userIdentifier, final String s, final int k0, final long l0) {
        super(context, userIdentifier, s);
        this.K0 = k0;
        this.L0 = l0;
    }
    
    @Override
    public final void p(final hn6 hn6) {
        final aav g = this.g();
        final int k0 = this.K0;
        final long l0 = this.L0;
        Objects.requireNonNull(g);
        Uri uri;
        String s;
        if (k0 != 0 && k0 != 42) {
            uri = gfv$n.a;
            s = "status_groups";
        }
        else {
            uri = gfv$o.a;
            s = "timeline";
        }
        if (x3j.w(((tk1)g).H2(), (rtb)new u9v((Object)new long[] { l0 }, (Object)s, (Object)tsl.c("_id"), 0)) > 0) {
            hn6.a(new Uri[] { uri });
        }
    }
}
