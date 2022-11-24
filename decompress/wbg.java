import com.twitter.util.user.UserIdentifier;
import tv.periscope.android.api.Invitee;
import java.util.List;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wbg implements rtb
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public wbg(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final Object apply(final Object o) {
        switch (this.F0) {
            default: {
                return ((LayoutInflater)((rno)this.G0).b.get()).inflate((int)o, (ViewGroup)this.H0, false);
            }
            case 2: {
                return p0b.Q("NotificationChannelsListChecker#getListsForCreationAndDeletion", (ptb)new sqi((List)o, (List)this.G0, (qgv)this.H0));
            }
            case 1: {
                final String s = (String)this.G0;
                final Invitee invitee = (Invitee)this.H0;
                final Throwable t = (Throwable)o;
                final rav$a companion = rav.Companion;
                e0e.f((Object)s, "$url");
                e0e.f((Object)invitee, "$recipient");
                e0e.f((Object)t, "error");
                return new nip(s, invitee, t);
            }
            case 0: {
                final UserIdentifier userIdentifier = (UserIdentifier)this.G0;
                final yhv yhv = (yhv)this.H0;
                final gcu$e gcu$e = (gcu$e)o;
                final yhv b = xbg.b(userIdentifier);
                yhv yhv2 = yhv;
                if (b != null) {
                    yhv2 = b;
                }
                return yhv2;
            }
        }
    }
}
