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

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/survey/RoomPostSurveyViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvvn;", "Llvn;", "Ljvn;", "Companion", "a", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomPostSurveyViewModel extends MviViewModel<vvn, lvn, jvn>
{
    public static final RoomPostSurveyViewModel.RoomPostSurveyViewModel$a Companion;
    public static final ape<Object>[] S0;
    public final nvn Q0;
    public final yyh R0;
    
    static {
        S0 = new ape[] { (ape)lb0.h(RoomPostSurveyViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomPostSurveyViewModel.RoomPostSurveyViewModel$a();
    }
    
    public RoomPostSurveyViewModel(final RoomPostSurveyArgs roomPostSurveyArgs, final nvn q0, final kcm kcm) {
        e0e.f((Object)roomPostSurveyArgs, "args");
        e0e.f((Object)q0, "scribeReporter");
        e0e.f((Object)kcm, "releaseCompletable");
        final ysk type = roomPostSurveyArgs.getType();
        final e1s f0 = e1s.F0;
        final h3a f2 = h3a.F0;
        final RoomPostSurveyViewModel.RoomPostSurveyViewModel$a companion = RoomPostSurveyViewModel.Companion;
        final ysk type2 = roomPostSurveyArgs.getType();
        Objects.requireNonNull(companion);
        final vsk o0 = vsk.O0;
        final vsk n0 = vsk.N0;
        final vsk j0 = vsk.J0;
        final vsk i0 = vsk.I0;
        final vsk h0 = vsk.H0;
        final vsk f3 = vsk.F0;
        e0e.f((Object)type2, "type");
        final int ordinal = type2.ordinal();
        List list;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                list = shw.y0((Object[])new vsk[] { f3, h0, i0, j0, n0, o0 });
            }
            else {
                list = shw.y0((Object[])new vsk[] { f3, vsk.G0, h0, i0, j0, n0, o0 });
            }
        }
        else {
            list = ft0.p1((Object[])vsk.values());
        }
        super((iae)kcm, (ccx)new vvn(type, f0, (List)f2, list, roomPostSurveyArgs.getShouldLaunchEndScreen(), roomPostSurveyArgs.getRoomId(), roomPostSurveyArgs.getTitle(), roomPostSurveyArgs.getStartedAt(), roomPostSurveyArgs.isHost(), roomPostSurveyArgs.getTopics(), roomPostSurveyArgs.isAvailableForReplay(), roomPostSurveyArgs.isAvailableForClipping()));
        this.Q0 = q0;
        q0.b = roomPostSurveyArgs.getRoomId();
        final String twitterId = roomPostSurveyArgs.getAdmin().getTwitterId();
        final String periscopeId = roomPostSurveyArgs.getAdmin().getPeriscopeId();
        q0.c = twitterId;
        q0.d = periscopeId;
        final NarrowcastSpaceType narrowCastSpaceType = roomPostSurveyArgs.getNarrowCastSpaceType();
        e0e.f((Object)narrowCastSpaceType, "type");
        q0.e = narrowCastSpaceType;
        this.R0 = hfe.v((MviViewModel)this, (stb)new RoomPostSurveyViewModel$b(this));
    }
    
    public final azh<lvn> v() {
        return (azh<lvn>)this.R0.a((ape)RoomPostSurveyViewModel.S0[0]);
    }
}
