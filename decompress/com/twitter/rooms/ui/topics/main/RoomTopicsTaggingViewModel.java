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

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/main/RoomTopicsTaggingViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Laho;", "", "Lpgo;", "Companion", "e", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicsTaggingViewModel extends MviViewModel<aho, Object, pgo>
{
    public static final RoomTopicsTaggingViewModel.RoomTopicsTaggingViewModel$e Companion;
    public final wdo N0;
    public final gjo O0;
    public final z7x P0;
    public final List<ofo> Q0;
    
    static {
        Companion = new RoomTopicsTaggingViewModel.RoomTopicsTaggingViewModel$e();
    }
    
    public RoomTopicsTaggingViewModel(final ibm ibm, final y21 y21, final ncn ncn, final wdo n0, final gjo o0, final rfo rfo, final iwn iwn, final z7x p8) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)y21, "recommendedTopicsDataSource");
        zzd.f((Object)ncn, "roomDescriptionDispatcher");
        zzd.f((Object)n0, "roomTaggedTopicsDispatcher");
        zzd.f((Object)o0, "roomsScribeReporter");
        zzd.f((Object)rfo, "roomTopicItemClickDispatcher");
        zzd.f((Object)iwn, "recentTopicsRepository");
        zzd.f((Object)p8, "viewLifecycle");
        super((fae)ibm, (oax)new aho(null, 1, null));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = new ArrayList();
        if (oio.J()) {
            final glq a = iwn.a;
            final yg2 i0 = yg2.I0;
            final h2d b = qhh.b((Class)fwn$a.class, (Class)AudioSpaceTopicItem.class);
            zzd.c((Object)b);
            MviViewModel.N((MviViewModel)this, ((csl$a)csl.b(djr.i(a, b), (bsl)i0)).S((Object)pmi.a), (String)null, (qqx)null, (gub)new wgo(this, (ap6)null), 3, (Object)null);
            MviViewModel.M((MviViewModel)this, (b5j)((ggm)n0).C0, (String)null, (qqx)null, (gub)new xgo(this, (ap6)null), 3, (Object)null);
            MviViewModel.M((MviViewModel)this, (b5j)p8.l(), (String)null, (qqx)null, (gub)new RoomTopicsTaggingViewModel$a(this, (ap6)null), 3, (Object)null);
            ((ggm)n0).a((Object)f3a.C0);
        }
        else {
            final b5j debounce = ((b5j)((ggm)ncn).C0).debounce((qtb)new vj4((rtb)new RoomTopicsTaggingViewModel$b(this), 11));
            zzd.e((Object)debounce, "roomDescriptionDispatche\u2026ce { debounceSelector() }");
            MviViewModel.M((MviViewModel)this, debounce, (String)null, (qqx)null, (gub)new RoomTopicsTaggingViewModel$c(this, y21, (ap6)null), 3, (Object)null);
        }
        final zml a2 = ((laa)rfo).a;
        zzd.e((Object)a2, "observe()");
        MviViewModel.M((MviViewModel)this, (b5j)a2, (String)null, (qqx)null, (gub)new RoomTopicsTaggingViewModel$d(this, (ap6)null), 3, (Object)null);
    }
    
    public static final void W(final RoomTopicsTaggingViewModel roomTopicsTaggingViewModel, final rfo$a rfo$a, final int n, final boolean b) {
        Objects.requireNonNull(roomTopicsTaggingViewModel);
        final String b2 = rfo$a.b;
        final boolean j = oio.J();
        final int n2 = 1;
        int n3 = 0;
        Label_0123: {
            Label_0120: {
                if (j) {
                    while (true) {
                        for (final Object next : roomTopicsTaggingViewModel.Q0) {
                            final ofo ofo = (ofo)next;
                            if (zzd.a((Object)ofo.a, (Object)rfo$a.a) && zzd.a((Object)ofo.b, (Object)b2)) {
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
            final gjo o2 = roomTopicsTaggingViewModel.O0;
            Objects.requireNonNull(o2);
            zzd.f((Object)b2, "topicId");
            o2.Z(b2, n, o2.b.d(), "recent_topic", "select");
        }
        else if (n3 != 0) {
            final gjo o3 = roomTopicsTaggingViewModel.O0;
            Objects.requireNonNull(o3);
            zzd.f((Object)b2, "topicId");
            o3.Z(b2, n, o3.b.d(), "recent_topic", "deselect");
        }
        else if (b) {
            roomTopicsTaggingViewModel.O0.P(b2, n);
        }
        else {
            roomTopicsTaggingViewModel.O0.C(b2, n);
        }
    }
    
    public final boolean X() {
        return this.Q0.isEmpty() ^ true;
    }
}
