// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.host_kudos;

import android.content.res.Resources;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomHostKudosArgs;
import android.content.Context;
import com.twitter.rooms.manager.RoomScheduleSpaceDelegate;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/host_kudos/RoomHostKudosViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lnon;", "Lhon;", "Ldon;", "Companion", "a", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomHostKudosViewModel extends MviViewModel<non, hon, don>
{
    public static final RoomHostKudosViewModel.RoomHostKudosViewModel$a Companion;
    public static final ape<Object>[] T0;
    public final RoomScheduleSpaceDelegate Q0;
    public final oko R0;
    public final yyh S0;
    
    static {
        T0 = new ape[] { (ape)lb0.h(RoomHostKudosViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomHostKudosViewModel.RoomHostKudosViewModel$a();
    }
    
    public RoomHostKudosViewModel(final Context context, final RoomHostKudosArgs roomHostKudosArgs, final RoomScheduleSpaceDelegate q0, final oko r0, final kcm kcm) {
        e0e.f((Object)context, "context");
        e0e.f((Object)roomHostKudosArgs, "args");
        e0e.f((Object)q0, "roomScheduleSpaceDelegate");
        e0e.f((Object)r0, "roomsScribeReporter");
        e0e.f((Object)kcm, "releaseCompletable");
        Objects.requireNonNull(RoomHostKudosViewModel.Companion);
        final vjo a = vjo.a;
        String s;
        if (ita.b().f("spaces_2022_h2_host_kudos_schedule_days_increment", 7) == 1) {
            s = context.getString(2131954321);
        }
        else {
            s = context.getString(2131954320);
        }
        e0e.e((Object)s, "if (RoomUtils.hostKudosS\u2026_next_week)\n            }");
        String s2 = null;
        Label_0199: {
            if (ita.b().b("spaces_2022_h2_host_kudos_show_num_followers", false) && roomHostKudosArgs.getFollowersGained() != null) {
                final Integer followersGained = roomHostKudosArgs.getFollowersGained();
                e0e.c((Object)followersGained);
                if (followersGained > 0) {
                    oko.F(r0, "host_kudos", "followers_gained", "impression", (ufv)null, (String)null, 24);
                    final Resources resources = context.getResources();
                    final Integer followersGained2 = roomHostKudosArgs.getFollowersGained();
                    e0e.c((Object)followersGained2);
                    final int intValue = followersGained2;
                    final Integer followersGained3 = roomHostKudosArgs.getFollowersGained();
                    e0e.c((Object)followersGained3);
                    s2 = resources.getQuantityString(2131820593, intValue, new Object[] { followersGained3 });
                    break Label_0199;
                }
            }
            s2 = context.getString(2131954319);
        }
        e0e.e((Object)s2, "if (RoomUtils.shouldShow\u2026btitle)\n                }");
        super((iae)kcm, (ccx)new non(roomHostKudosArgs.getRoomId(), roomHostKudosArgs.getTitle(), roomHostKudosArgs.getStartedAt(), roomHostKudosArgs.getTopics(), roomHostKudosArgs.isAvailableForReplay(), roomHostKudosArgs.isAvailableForClipping(), s, s2, roomHostKudosArgs.getNarrowCastSpaceType()));
        this.Q0 = q0;
        oko.F(this.R0 = r0, "host_kudos", "", "impression", (ufv)null, (String)null, 24);
        this.S0 = hfe.v((MviViewModel)this, (stb)new RoomHostKudosViewModel$b(this));
    }
    
    public final azh<hon> v() {
        return (azh<hon>)this.S0.a((ape)RoomHostKudosViewModel.T0[0]);
    }
}
