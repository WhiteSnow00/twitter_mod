import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager$l0;
import java.util.Map;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Iterator;
import java.util.Set;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d8o
{
    public final RoomStateManager a;
    public final c11 b;
    public final UserIdentifier c;
    public final de6 d;
    
    public d8o(final RoomStateManager a, final c11 b, final UserIdentifier c, final kcm kcm) {
        e0e.f((Object)a, "stateManager");
        e0e.f((Object)b, "contentSharingRepository");
        e0e.f((Object)c, "userIdentifier");
        e0e.f((Object)kcm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new de6();
        kcm.i((sj)new nj4((Object)this, 26));
    }
    
    public final boolean a(final lrn lrn, final sxp sxp) {
        e0e.f((Object)lrn, "state");
        e0e.f((Object)sxp, "content");
        final vjo a = vjo.a;
        final rmv b = ita.b();
        final boolean b2 = false;
        if (!b.b("android_audio_delete_content_sharing_enabled", false)) {
            return false;
        }
        if (lrn.b == null) {
            return false;
        }
        final String stringId = this.c.getStringId();
        final qgv a2 = sxp.a().a();
        boolean b3 = b2;
        if (a2 != null) {
            final String e = a2.e();
            if (e == null) {
                b3 = b2;
            }
            else {
                final Set<RoomUserItem> n = lrn.n;
                boolean b4 = false;
                Label_0159: {
                    if (!(n instanceof Collection) || !n.isEmpty()) {
                        final Iterator iterator = n.iterator();
                        while (iterator.hasNext()) {
                            if (e0e.a((Object)((RoomUserItem)iterator.next()).getTwitterUserId(), (Object)stringId)) {
                                b4 = true;
                                break Label_0159;
                            }
                        }
                    }
                    b4 = false;
                }
                final boolean b5 = lrn.w == w1r.H0;
                final boolean a3 = e0e.a((Object)stringId, (Object)e);
                if (!b4) {
                    b3 = b2;
                    if (!b5) {
                        return b3;
                    }
                    b3 = b2;
                    if (!a3) {
                        return b3;
                    }
                }
                b3 = true;
            }
        }
        return b3;
    }
    
    public final bbq<lrn> b() {
        return (bbq<lrn>)f.n(((MviViewModel)this.a).R(), (Object)new lrn(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -1, 2047, null));
    }
}
