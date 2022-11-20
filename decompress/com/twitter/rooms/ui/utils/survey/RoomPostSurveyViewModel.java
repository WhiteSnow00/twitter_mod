// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.survey;

import tv.periscope.model.NarrowcastSpaceType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomPostSurveyArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/survey/RoomPostSurveyViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Levn;", "Luun;", "Lsun;", "Companion", "a", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomPostSurveyViewModel extends MviViewModel<evn, uun, sun>
{
    public static final a Companion;
    public static final coe<Object>[] Q0;
    public final wun O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)RoomPostSurveyViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public RoomPostSurveyViewModel(final RoomPostSurveyArgs roomPostSurveyArgs, final wun o0, final xbm xbm) {
        czd.f((Object)roomPostSurveyArgs, "args");
        czd.f((Object)o0, "scribeReporter");
        czd.f((Object)xbm, "releaseCompletable");
        final lsk type = roomPostSurveyArgs.getType();
        final i0s d0 = i0s.D0;
        final f2a d2 = f2a.D0;
        final a companion = RoomPostSurveyViewModel.Companion;
        final lsk type2 = roomPostSurveyArgs.getType();
        Objects.requireNonNull(companion);
        final jsk m0 = jsk.M0;
        final jsk l0 = jsk.L0;
        final jsk h0 = jsk.H0;
        final jsk g0 = jsk.G0;
        final jsk f0 = jsk.F0;
        final jsk d3 = jsk.D0;
        czd.f((Object)type2, "type");
        final int ordinal = type2.ordinal();
        List list;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                list = s9i.s(d3, f0, g0, h0, l0, m0);
            }
            else {
                list = s9i.s(d3, jsk.E0, f0, g0, h0, l0, m0);
            }
        }
        else {
            list = ct0.g1((Object[])jsk.values());
        }
        super((k9e)xbm, (jbx)new evn(type, d0, (List)d2, list, roomPostSurveyArgs.getShouldLaunchEndScreen(), roomPostSurveyArgs.getRoomId(), roomPostSurveyArgs.getTitle(), roomPostSurveyArgs.getStartedAt(), roomPostSurveyArgs.isHost(), roomPostSurveyArgs.getTopics(), roomPostSurveyArgs.isAvailableForReplay(), roomPostSurveyArgs.isAvailableForClipping()));
        this.O0 = o0;
        o0.b = roomPostSurveyArgs.getRoomId();
        final String twitterId = roomPostSurveyArgs.getAdmin().getTwitterId();
        final String periscopeId = roomPostSurveyArgs.getAdmin().getPeriscopeId();
        o0.c = twitterId;
        o0.d = periscopeId;
        final NarrowcastSpaceType narrowCastSpaceType = roomPostSurveyArgs.getNarrowCastSpaceType();
        czd.f((Object)narrowCastSpaceType, "type");
        o0.e = narrowCastSpaceType;
        this.P0 = ewj.n(this, (qsb)new qsb<jyh<uun>, fzv>(this) {
            public final RoomPostSurveyViewModel D0;
            
            public final Object invoke(final Object o) {
                final jyh jyh = (jyh)o;
                czd.f((Object)jyh, "$this$weaver");
                jyh.a(v9m.a((Class)uun$b.class), (ftb)new b(this.D0, (go6)null));
                jyh.a(v9m.a((Class)uun$d.class), (ftb)new c(this.D0, (go6)null));
                jyh.a(v9m.a((Class)uun$c.class), (ftb)new d(this.D0, (go6)null));
                jyh.a(v9m.a((Class)uun$a.class), (ftb)new f(this.D0, (go6)null));
                jyh.a(v9m.a((Class)uun$f.class), (ftb)new g(this.D0, (go6)null));
                jyh.a(v9m.a((Class)uun$e.class), (ftb)new h(this.D0, (go6)null));
                return fzv.a;
            }
        });
    }
    
    public final jyh<uun> v() {
        return (jyh<uun>)this.P0.a((coe)RoomPostSurveyViewModel.Q0[0]);
    }
    
    public static final class a
    {
    }
}
