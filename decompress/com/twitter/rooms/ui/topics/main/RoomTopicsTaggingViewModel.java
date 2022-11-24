// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.main;

import java.util.Iterator;
import java.util.Objects;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/main/RoomTopicsTaggingViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lhio;", "", "Lwho;", "Companion", "e", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicsTaggingViewModel extends MviViewModel<hio, Object, who>
{
    public static final RoomTopicsTaggingViewModel.RoomTopicsTaggingViewModel$e Companion;
    public final ffo Q0;
    public final oko R0;
    public final k9x S0;
    public final List<vgo> T0;
    
    static {
        Companion = new RoomTopicsTaggingViewModel.RoomTopicsTaggingViewModel$e();
    }
    
    public RoomTopicsTaggingViewModel(final kcm kcm, final a31 a31, final sdn sdn, final ffo q0, final oko r0, final ygo ygo, final nxn nxn, final k9x s0) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)a31, "recommendedTopicsDataSource");
        e0e.f((Object)sdn, "roomDescriptionDispatcher");
        e0e.f((Object)q0, "roomTaggedTopicsDispatcher");
        e0e.f((Object)r0, "roomsScribeReporter");
        e0e.f((Object)ygo, "roomTopicItemClickDispatcher");
        e0e.f((Object)nxn, "recentTopicsRepository");
        e0e.f((Object)s0, "viewLifecycle");
        super((iae)kcm, (ccx)new hio(null, 1, null));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = new ArrayList();
        if (vjo.J()) {
            final xmq a32 = nxn.a;
            final utg f0 = utg.F0;
            final m2d b = jih.b((Class)kxn$a.class, (Class)AudioSpaceTopicItem.class);
            e0e.c((Object)b);
            MviViewModel.N((MviViewModel)this, ((ctl$a)ctl.b(d4j.J(a32, b), (btl)f0)).S((Object)kni.a), (String)null, (asx)null, (hub)new dio(this, (mp6)null), 3, (Object)null);
            MviViewModel.M((MviViewModel)this, (t5j)q0.F0, (String)null, (asx)null, (hub)new eio(this, (mp6)null), 3, (Object)null);
            MviViewModel.M((MviViewModel)this, s0.l(), (String)null, (asx)null, (hub)new RoomTopicsTaggingViewModel$a(this, (mp6)null), 3, (Object)null);
            q0.a((Object)r3a.F0);
        }
        else {
            final t5j debounce = ((t5j)((lhm)sdn).F0).debounce((rtb)new uyn((stb)new RoomTopicsTaggingViewModel$b(this), 12));
            e0e.e((Object)debounce, "roomDescriptionDispatche\u2026ce { debounceSelector() }");
            MviViewModel.M((MviViewModel)this, debounce, (String)null, (asx)null, (hub)new RoomTopicsTaggingViewModel$c(this, a31, (mp6)null), 3, (Object)null);
        }
        final znl a33 = ((zaa)ygo).a;
        e0e.e((Object)a33, "observe()");
        MviViewModel.M((MviViewModel)this, (t5j)a33, (String)null, (asx)null, (hub)new RoomTopicsTaggingViewModel$d(this, (mp6)null), 3, (Object)null);
    }
    
    public static final void W(final RoomTopicsTaggingViewModel roomTopicsTaggingViewModel, final ygo.a a, final int n, final boolean b) {
        Objects.requireNonNull(roomTopicsTaggingViewModel);
        final String b2 = a.b;
        final boolean j = vjo.J();
        final int n2 = 1;
        int n3 = 0;
        Label_0123: {
            Label_0120: {
                if (j) {
                    while (true) {
                        for (final Object next : roomTopicsTaggingViewModel.T0) {
                            final vgo vgo = (vgo)next;
                            if (e0e.a((Object)vgo.a, (Object)a.a) && e0e.a((Object)vgo.b, (Object)b2)) {
                                final Object o = next;
                                if (o != null) {
                                    n3 = n2;
                                    break Label_0123;
                                }
                                break Label_0120;
                            }
                        }
                        final Object o = null;
                        continue;
                    }
                }
            }
            n3 = 0;
        }
        if (n3 != 0 && b) {
            final oko r0 = roomTopicsTaggingViewModel.R0;
            Objects.requireNonNull(r0);
            e0e.f((Object)b2, "topicId");
            r0.Z(b2, n, r0.b.g(), "recent_topic", "select");
        }
        else if (n3 != 0) {
            final oko r2 = roomTopicsTaggingViewModel.R0;
            Objects.requireNonNull(r2);
            e0e.f((Object)b2, "topicId");
            r2.Z(b2, n, r2.b.g(), "recent_topic", "deselect");
        }
        else if (b) {
            roomTopicsTaggingViewModel.R0.P(b2, n);
        }
        else {
            roomTopicsTaggingViewModel.R0.C(b2, n);
        }
    }
    
    public final boolean X() {
        return this.T0.isEmpty() ^ true;
    }
}
