// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.endscreen;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import com.twitter.rooms.subsystem.api.args.RoomEndScreenArgs;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/utils/endscreen/RoomEndScreenViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lpin;", "Lchn;", "Lzgn;", "Companion", "c", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomEndScreenViewModel extends MviViewModel<pin, chn, zgn>
{
    public static final RoomEndScreenViewModel.RoomEndScreenViewModel$c Companion;
    public static final ape<Object>[] c1;
    public final Context Q0;
    public final cw6 R0;
    public final m7n S0;
    public final oko T0;
    public final qdw U0;
    public final fnw V0;
    public final kmn W0;
    public final String X0;
    public final boolean Y0;
    public final boolean Z0;
    public final Set<AudioSpaceTopicItem> a1;
    public final yyh b1;
    
    static {
        c1 = new ape[] { (ape)lb0.h(RoomEndScreenViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomEndScreenViewModel.RoomEndScreenViewModel$c();
    }
    
    public RoomEndScreenViewModel(final Context q0, final RoomEndScreenArgs roomEndScreenArgs, final cw6 r0, final m7n s0, final a1o a1o, final oko t0, final qdw u0, final fnw v0, final kmn w0, final kcm kcm) {
        e0e.f((Object)q0, "context");
        e0e.f((Object)roomEndScreenArgs, "args");
        e0e.f((Object)r0, "authedRepository");
        e0e.f((Object)s0, "audioSpacesRepository");
        e0e.f((Object)a1o, "roomReplayDockShownDispatcher");
        e0e.f((Object)t0, "roomsScribeReporter");
        e0e.f((Object)u0, "userInfo");
        e0e.f((Object)v0, "usersRepository");
        e0e.f((Object)w0, "friendshipRepository");
        e0e.f((Object)kcm, "releaseCompletable");
        final String title = roomEndScreenArgs.getTitle();
        String s2;
        if ((title == null || title.length() == 0) && roomEndScreenArgs.isHost()) {
            s2 = q0.getString(2131956945);
        }
        else {
            s2 = roomEndScreenArgs.getTitle();
        }
        final Long started = roomEndScreenArgs.getStartedAt();
        String format;
        if (started != null) {
            format = DateFormat.getDateInstance(1).format(new Date(started.longValue()));
        }
        else {
            format = null;
        }
        final boolean b = roomEndScreenArgs.isAvailableForReplay() && roomEndScreenArgs.isHost();
        final boolean availableForReplay = roomEndScreenArgs.isAvailableForReplay();
        final RoomEndScreenViewModel.RoomEndScreenViewModel$c companion = RoomEndScreenViewModel.Companion;
        super((iae)kcm, (ccx)new pin(s2, format, b, availableForReplay, RoomEndScreenViewModel.RoomEndScreenViewModel$c.a(companion, roomEndScreenArgs), (List<? extends t1r>)h3a.F0, rr4.I1((Iterable)rr4.n2((Iterable)roomEndScreenArgs.getTopics()), (CharSequence)" · ", (CharSequence)null, (CharSequence)null, (stb)RoomEndScreenViewModel$a.F0, 30), null, null, vjo.C() && roomEndScreenArgs.isHost() && roomEndScreenArgs.isAvailableForClipping(), roomEndScreenArgs.isAvailableForClipping(), roomEndScreenArgs.isAvailableForReplay(), null));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = v0;
        this.W0 = w0;
        this.X0 = roomEndScreenArgs.getRoomId();
        this.Y0 = roomEndScreenArgs.isHost();
        this.Z0 = roomEndScreenArgs.getFromSpacesTab();
        this.a1 = rr4.n2((Iterable)roomEndScreenArgs.getTopics());
        final String roomId = roomEndScreenArgs.getRoomId();
        final boolean availableForReplay2 = roomEndScreenArgs.isAvailableForReplay();
        e0e.f((Object)roomId, "spaceId");
        String s3;
        if (availableForReplay2) {
            s3 = "live_recording";
        }
        else {
            s3 = "live_not_recording";
        }
        oko.G(t0, "end_screen", "", "", "impression", a11.d(roomId, s3, false, t0.i.getScribeDetailFromType()), 32);
        MviViewModel.M((MviViewModel)this, (t5j)a1o.a, (String)null, (asx)null, (hub)new RoomEndScreenViewModel$b(this, (mp6)null), 3, (Object)null);
        MviViewModel.N((MviViewModel)this, s0.h(roomEndScreenArgs.getRoomId()), (String)null, (asx)null, (hub)new ein(this, (mp6)null), 3, (Object)null);
        if (RoomEndScreenViewModel.RoomEndScreenViewModel$c.a(companion, roomEndScreenArgs)) {
            oko.G(t0, "end_screen", "analytics", "", "impression", (ufv)null, 48);
        }
        this.b1 = hfe.v((MviViewModel)this, (stb)new RoomEndScreenViewModel$d(this));
    }
    
    public static final void W(final RoomEndScreenViewModel roomEndScreenViewModel, final long n, final boolean b, final boolean b2) {
        Objects.requireNonNull(roomEndScreenViewModel);
        roomEndScreenViewModel.T((stb)new oin(n, b, b2, roomEndScreenViewModel));
    }
    
    public final List<t1r$c> X(final List<y21> list, final Object o) {
        final HashSet set = new HashSet();
        final ArrayList list2 = new ArrayList();
        for (final y21 next : list) {
            if (set.add(next.d())) {
                list2.add(next);
            }
        }
        final ArrayList<y21> list3 = new ArrayList<y21>();
        for (final Object next2 : list2) {
            if (((y21)next2).e() != null) {
                list3.add((y21)next2);
            }
        }
        final ArrayList list4 = new ArrayList<t1r$c>(nr4.d1((Iterable)list3, 10));
        final Iterator<y21> iterator3 = list3.iterator();
        while (iterator3.hasNext()) {
            list4.add(this.Y(iterator3.next(), (int)o));
        }
        return (List<t1r$c>)list4;
    }
    
    public final t1r$c Y(final y21 y21, final int n) {
        final qgv e = y21.e();
        e0e.c((Object)e);
        return new t1r$c(e, !fbx.E(e.K1) && !fbx.F(e.K1), e0e.a((Object)this.U0.getUser().e(), (Object)e.e()), fbx.J(e.K1), fbx.H(e.K1), e.O0, fbx.E(e.K1), fbx.F(e.K1), n);
    }
    
    public final azh<chn> v() {
        return (azh<chn>)this.b1.a((ape)RoomEndScreenViewModel.c1[0]);
    }
}
