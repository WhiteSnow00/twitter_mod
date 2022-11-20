import android.content.Context;
import com.twitter.rooms.ui.stationstab.follow.RoomFollowPodcastWrapperViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class skn extends ste implements qsb<xkn, fzv>
{
    public final kjn.a D0;
    public final RoomFollowPodcastWrapperViewModel E0;
    public final long F0;
    
    public skn(final kjn.a d0, final RoomFollowPodcastWrapperViewModel e0, final long f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "it");
        final int ordinal = this.D0.d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                final RoomFollowPodcastWrapperViewModel e0 = this.E0;
                final sln r0 = e0.R0;
                final Context o2 = e0.O0;
                final long f0 = this.F0;
                final kjn.a d0 = this.D0;
                r0.b(o2, f0, d0.c, (nsb)new pkn(d0, e0));
            }
        }
        else if (this.D0.c) {
            final RoomFollowPodcastWrapperViewModel e2 = this.E0;
            e2.R0.c(e2.O0, this.F0, (nsb)new qkn(e2));
        }
        else {
            final RoomFollowPodcastWrapperViewModel e3 = this.E0;
            e3.R0.a(e3.O0, this.F0, (nsb)new rkn(e3));
        }
        return fzv.a;
    }
}
