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

public final class k7o
{
    public final RoomStateManager a;
    public final w01 b;
    public final UserIdentifier c;
    public final wc6 d;
    
    public k7o(final RoomStateManager a, final w01 b, final UserIdentifier c, final xbm xbm) {
        czd.f((Object)a, "stateManager");
        czd.f((Object)b, "contentSharingRepository");
        czd.f((Object)c, "userIdentifier");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new wc6();
        xbm.i((oj)new ifc(this, 24));
    }
    
    public final boolean a(final vqn vqn, final vwp vwp) {
        czd.f((Object)vqn, "state");
        czd.f((Object)vwp, "content");
        final djo a = djo.a;
        final fmv b = asa.b();
        final boolean b2 = false;
        if (!b.b("android_audio_delete_content_sharing_enabled", false)) {
            return false;
        }
        if (vqn.b == null) {
            return false;
        }
        final String stringId = this.c.getStringId();
        final cgv a2 = vwp.a().a();
        boolean b3 = b2;
        if (a2 != null) {
            final String e = a2.e();
            if (e == null) {
                b3 = b2;
            }
            else {
                final Set<RoomUserItem> n = vqn.n;
                boolean b4 = false;
                Label_0159: {
                    if (!(n instanceof Collection) || !n.isEmpty()) {
                        final Iterator iterator = n.iterator();
                        while (iterator.hasNext()) {
                            if (czd.a((Object)((RoomUserItem)iterator.next()).getTwitterUserId(), (Object)stringId)) {
                                b4 = true;
                                break Label_0159;
                            }
                        }
                    }
                    b4 = false;
                }
                final boolean b5 = vqn.w == z0r.F0;
                final boolean a3 = czd.a((Object)stringId, (Object)e);
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
    
    public final eaq<vqn> b() {
        return (eaq<vqn>)f.n(((MviViewModel)this.a).R(), (Object)new vqn(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -1, 2047, null));
    }
}
