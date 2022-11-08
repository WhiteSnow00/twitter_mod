import tv.periscope.android.api.Invitee;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gev
{
    public final h9v a;
    
    public gev(final h9v a) {
        zzd.f((Object)a, "twitterBroadcastInvite");
        this.a = a;
    }
    
    public final n9q<List<zgp>> a(final String s, final List<Invitee> list) {
        zzd.f((Object)s, "shareUrl");
        return (n9q<List<zgp>>)this.a.c(s, (List)list);
    }
}
