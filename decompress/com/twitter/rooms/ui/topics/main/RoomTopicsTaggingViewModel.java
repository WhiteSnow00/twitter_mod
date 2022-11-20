// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.main;

import java.util.Set;
import java.util.Iterator;
import java.util.Objects;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/main/RoomTopicsTaggingViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lpho;", "", "Ldho;", "Companion", "e", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicsTaggingViewModel extends MviViewModel<pho, Object, dho>
{
    public static final e Companion;
    public final leo O0;
    public final vjo P0;
    public final r8x Q0;
    public final List<cgo> R0;
    
    static {
        Companion = new e();
    }
    
    public RoomTopicsTaggingViewModel(final xbm xbm, final u21 u21, final adn adn, final leo o0, final vjo p8, final fgo fgo, final vwn vwn, final r8x q0) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)u21, "recommendedTopicsDataSource");
        czd.f((Object)adn, "roomDescriptionDispatcher");
        czd.f((Object)o0, "roomTaggedTopicsDispatcher");
        czd.f((Object)p8, "roomsScribeReporter");
        czd.f((Object)fgo, "roomTopicItemClickDispatcher");
        czd.f((Object)vwn, "recentTopicsRepository");
        czd.f((Object)q0, "viewLifecycle");
        super((k9e)xbm, (jbx)new pho((List)null, 1, (rf8)null));
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = new ArrayList();
        if (djo.J()) {
            final amq<swn$a> a = vwn.a;
            final shc d0 = shc.D0;
            final m1d b = vhh.b((Class)swn$a.class, (Class)AudioSpaceTopicItem.class);
            czd.c((Object)b);
            MviViewModel.N((MviViewModel)this, ((rsl$a)rsl.b(j8a.s((amq)a, b), (qsl)d0)).R((Object)tmi.a), (String)null, (jrx)null, (ftb)new lho(this, (go6)null), 3, (Object)null);
            MviViewModel.M((MviViewModel)this, (h5j)((wgm)o0).D0, (String)null, (jrx)null, (ftb)new mho(this, (go6)null), 3, (Object)null);
            MviViewModel.M((MviViewModel)this, q0.k(), (String)null, (jrx)null, (ftb)new RoomTopicsTaggingViewModel$a(this, (go6)null), 3, (Object)null);
            ((wgm)o0).a((Object)p2a.D0);
        }
        else {
            final h5j debounce = ((h5j)((wgm)adn).D0).debounce((psb)new hpn((qsb)new RoomTopicsTaggingViewModel$b(this), 13));
            czd.e((Object)debounce, "roomDescriptionDispatche\u2026ce { debounceSelector() }");
            MviViewModel.M((MviViewModel)this, debounce, (String)null, (jrx)null, (ftb)new RoomTopicsTaggingViewModel$c(this, u21, (go6)null), 3, (Object)null);
        }
        final nnl a2 = ((t9a)fgo).a;
        czd.e((Object)a2, "observe()");
        MviViewModel.M((MviViewModel)this, (h5j)a2, (String)null, (jrx)null, (ftb)new RoomTopicsTaggingViewModel$d(this, (go6)null), 3, (Object)null);
    }
    
    public static final void W(final RoomTopicsTaggingViewModel roomTopicsTaggingViewModel, final fgo.a a, final int n, final boolean b) {
        Objects.requireNonNull(roomTopicsTaggingViewModel);
        final String b2 = a.b;
        final boolean j = djo.J();
        final int n2 = 1;
        int n3 = 0;
        Label_0123: {
            Label_0120: {
                if (j) {
                    while (true) {
                        for (final Object next : roomTopicsTaggingViewModel.R0) {
                            final cgo cgo = (cgo)next;
                            if (czd.a((Object)cgo.a, (Object)a.a) && czd.a((Object)cgo.b, (Object)b2)) {
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
            final vjo p4 = roomTopicsTaggingViewModel.P0;
            Objects.requireNonNull(p4);
            czd.f((Object)b2, "topicId");
            p4.Z(b2, n, p4.b.d(), "recent_topic", "select");
        }
        else if (n3 != 0) {
            final vjo p5 = roomTopicsTaggingViewModel.P0;
            Objects.requireNonNull(p5);
            czd.f((Object)b2, "topicId");
            p5.Z(b2, n, p5.b.d(), "recent_topic", "deselect");
        }
        else if (b) {
            roomTopicsTaggingViewModel.P0.P(b2, n);
        }
        else {
            roomTopicsTaggingViewModel.P0.C(b2, n);
        }
    }
    
    public final boolean X() {
        return this.R0.isEmpty() ^ true;
    }
    
    public static final class e
    {
        public static final cgo a(final e e, final AudioSpaceTopicItem audioSpaceTopicItem, final boolean b) {
            Objects.requireNonNull(e);
            return new cgo(audioSpaceTopicItem.getCategoryId(), audioSpaceTopicItem.getTopicId(), audioSpaceTopicItem.getName(), b, true, true);
        }
        
        public static final List b(final e e, final List list, final Set set) {
            Objects.requireNonNull(e);
            final boolean b = set.size() >= 3;
            final ArrayList<cgo> list2 = new ArrayList<cgo>();
            for (final Object next : list) {
                if (set.contains(((cgo)next).b) ^ true) {
                    list2.add((cgo)next);
                }
            }
            final ArrayList list3 = new ArrayList<cgo>(iq4.H((Iterable)list2, 10));
            for (final cgo cgo : list2) {
                list3.add(new cgo(cgo.a, cgo.b, cgo.c, false, b ^ true, true));
            }
            return list3;
        }
    }
}
