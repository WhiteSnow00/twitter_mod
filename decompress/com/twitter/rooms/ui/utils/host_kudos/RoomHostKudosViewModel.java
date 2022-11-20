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

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/host_kudos/RoomHostKudosViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvnn;", "Lpnn;", "Llnn;", "Companion", "a", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomHostKudosViewModel extends MviViewModel<vnn, pnn, lnn>
{
    public static final a Companion;
    public static final coe<Object>[] R0;
    public final RoomScheduleSpaceDelegate O0;
    public final vjo P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)RoomHostKudosViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public RoomHostKudosViewModel(final Context context, final RoomHostKudosArgs roomHostKudosArgs, final RoomScheduleSpaceDelegate o0, final vjo p5, final xbm xbm) {
        czd.f((Object)context, "context");
        czd.f((Object)roomHostKudosArgs, "args");
        czd.f((Object)o0, "roomScheduleSpaceDelegate");
        czd.f((Object)p5, "roomsScribeReporter");
        czd.f((Object)xbm, "releaseCompletable");
        Objects.requireNonNull(RoomHostKudosViewModel.Companion);
        final djo a = djo.a;
        String s;
        if (asa.b().f("spaces_2022_h2_host_kudos_schedule_days_increment", 7) == 1) {
            s = context.getString(2131954321);
        }
        else {
            s = context.getString(2131954320);
        }
        czd.e((Object)s, "if (RoomUtils.hostKudosS\u2026_next_week)\n            }");
        String s2 = null;
        Label_0199: {
            if (asa.b().b("spaces_2022_h2_host_kudos_show_num_followers", false) && roomHostKudosArgs.getFollowersGained() != null) {
                final Integer followersGained = roomHostKudosArgs.getFollowersGained();
                czd.c((Object)followersGained);
                if (followersGained > 0) {
                    vjo.F(p5, "host_kudos", "followers_gained", "impression", null, null, 24);
                    final Resources resources = context.getResources();
                    final Integer followersGained2 = roomHostKudosArgs.getFollowersGained();
                    czd.c((Object)followersGained2);
                    final int intValue = followersGained2;
                    final Integer followersGained3 = roomHostKudosArgs.getFollowersGained();
                    czd.c((Object)followersGained3);
                    s2 = resources.getQuantityString(2131820593, intValue, new Object[] { followersGained3 });
                    break Label_0199;
                }
            }
            s2 = context.getString(2131954319);
        }
        czd.e((Object)s2, "if (RoomUtils.shouldShow\u2026btitle)\n                }");
        super((k9e)xbm, (jbx)new vnn(roomHostKudosArgs.getRoomId(), roomHostKudosArgs.getTitle(), roomHostKudosArgs.getStartedAt(), roomHostKudosArgs.getTopics(), roomHostKudosArgs.isAvailableForReplay(), roomHostKudosArgs.isAvailableForClipping(), s, s2, roomHostKudosArgs.getNarrowCastSpaceType()));
        this.O0 = o0;
        vjo.F(this.P0 = p5, "host_kudos", "", "impression", null, null, 24);
        this.Q0 = ewj.n(this, (qsb)new qsb<jyh<pnn>, fzv>(this) {
            public final RoomHostKudosViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)pnn.b.class), (ftb)new com.twitter.rooms.ui.utils.host_kudos.a(this.D0, (go6)null));
                jyh.a(v9m.a((Class)pnn.a.class), (ftb)new c(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<pnn> v() {
        return (jyh<pnn>)this.Q0.a((coe)RoomHostKudosViewModel.R0[0]);
    }
    
    public static final class a
    {
    }
}
