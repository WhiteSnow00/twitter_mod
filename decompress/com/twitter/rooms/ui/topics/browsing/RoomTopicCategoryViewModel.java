// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/browsing/RoomTopicCategoryViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lxfo;", "Lmfo;", "Llfo;", "Companion", "b", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicCategoryViewModel extends MviViewModel<xfo, mfo, lfo>
{
    public static final b Companion;
    public static final coe<Object>[] T0;
    public final nfo O0;
    public final jfo P0;
    public final vjo Q0;
    public final AtomicBoolean R0;
    public final hyh S0;
    
    static {
        T0 = new coe[] { (coe)w9.f((Class)RoomTopicCategoryViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new b();
    }
    
    public RoomTopicCategoryViewModel(final nfo o0, final jfo p5, final bho bho, final vjo q0, final xbm xbm) {
        czd.f((Object)o0, "item");
        czd.f((Object)p5, "roomTopicCategoryClickDispatcher");
        czd.f((Object)bho, "roomTopicsBrowsingViewStateManager");
        czd.f((Object)q0, "roomsScribeReporter");
        czd.f((Object)xbm, "releaseCompletable");
        Objects.requireNonNull(RoomTopicCategoryViewModel.Companion);
        super((k9e)xbm, (jbx)new xfo(o0.b, o0.c, o0.e, o0.a));
        this.O0 = o0;
        this.P0 = p5;
        this.Q0 = q0;
        this.R0 = new AtomicBoolean(false);
        MviViewModel.M((MviViewModel)this, (h5j)bho.D0, (String)null, (jrx)null, (ftb)new ftb<List<? extends nfo>, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final RoomTopicCategoryViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<List<? extends nfo>, go6<? super fzv>, Object> ftb = (ftb<List<? extends nfo>, go6<? super fzv>, Object>)new ftb<List<? extends nfo>, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final RoomTopicCategoryViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<List<? extends nfo>, go6<? super fzv>, Object> ftb = (ftb<List<? extends nfo>, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(Object next) {
                b1n.u(next);
                final List list = (List)this.D0;
                final RoomTopicCategoryViewModel e0 = this.E0;
                final Iterator iterator = list.iterator();
                while (true) {
                    do {
                        final boolean hasNext = iterator.hasNext();
                        final Number n = null;
                        if (!hasNext) {
                            next = null;
                            final nfo nfo = (nfo)next;
                            if (nfo != null) {
                                final List e2 = nfo.e;
                                if (e2 != null) {
                                    final RoomTopicCategoryViewModel e3 = this.E0;
                                    final RoomTopicCategoryViewModel$a$a roomTopicCategoryViewModel$a$a = new RoomTopicCategoryViewModel$a$a(e2);
                                    final b companion = RoomTopicCategoryViewModel.Companion;
                                    e3.Q((qsb)roomTopicCategoryViewModel$a$a);
                                    if (!e3.R0.get()) {
                                        final AtomicBoolean r0 = e3.R0;
                                        final int n2 = 1;
                                        r0.set(true);
                                        final Iterator iterator2 = e2.iterator();
                                        int n3 = 0;
                                        while (true) {
                                            while (iterator2.hasNext()) {
                                                if (((cgo)iterator2.next()).d) {
                                                    final Integer value = n3;
                                                    int n4;
                                                    if (value.intValue() >= 0) {
                                                        n4 = n2;
                                                    }
                                                    else {
                                                        n4 = 0;
                                                    }
                                                    Number n5 = n;
                                                    if (n4 != 0) {
                                                        n5 = value;
                                                    }
                                                    if (n5 != null) {
                                                        e3.V((Object)new lfo$a(n5.intValue()));
                                                        return fzv.a;
                                                    }
                                                    return fzv.a;
                                                }
                                                else {
                                                    ++n3;
                                                }
                                            }
                                            n3 = -1;
                                            continue;
                                        }
                                    }
                                }
                            }
                            return fzv.a;
                        }
                        next = iterator.next();
                    } while (!czd.a((Object)((nfo)next).d, (Object)e0.O0.d));
                    continue;
                }
            }
        }, 3, (Object)null);
        this.S0 = ewj.n(this, (qsb)new RoomTopicCategoryViewModel$c(this));
    }
    
    public final jyh<mfo> v() {
        return (jyh<mfo>)this.S0.a((coe)RoomTopicCategoryViewModel.T0[0]);
    }
    
    public static final class b
    {
    }
}
