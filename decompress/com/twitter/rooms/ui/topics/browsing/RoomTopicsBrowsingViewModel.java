// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/topics/browsing/RoomTopicsBrowsingViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Laho;", "Ltgo;", "Lsgo;", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicsBrowsingViewModel extends MviViewModel<aho, tgo, sgo>
{
    public static final coe<Object>[] R0;
    public final leo O0;
    public final vjo P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)RoomTopicsBrowsingViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomTopicsBrowsingViewModel(final xbm xbm, final t01 t01, final fgo fgo, final jfo jfo, final bho bho, final leo o0, final vjo p8, final v01 v01) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)t01, "browseTopicsDataSource");
        czd.f((Object)fgo, "roomTopicItemClickDispatcher");
        czd.f((Object)jfo, "roomTopicCategoryClickDispatcher");
        czd.f((Object)bho, "roomTopicsBrowsingViewStateManager");
        czd.f((Object)o0, "roomTaggedTopicsDispatcher");
        czd.f((Object)p8, "roomsScribeReporter");
        czd.f((Object)v01, "componentPrefixDispatcher");
        super((k9e)xbm, (jbx)new aho((List)f2a.D0, true));
        this.O0 = o0;
        vjo.b0(this.P0 = p8, null, "impression", null, 27);
        MviViewModel.M((MviViewModel)this, (h5j)bho.D0, (String)null, (jrx)null, (ftb)new ftb<List<? extends nfo>, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final RoomTopicsBrowsingViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<List<? extends nfo>, go6<? super fzv>, Object> ftb = (ftb<List<? extends nfo>, go6<? super fzv>, Object>)new ftb<List<? extends nfo>, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final RoomTopicsBrowsingViewModel E0;
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
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final List list = (List)this.D0;
                final RoomTopicsBrowsingViewModel e0 = this.E0;
                final RoomTopicsBrowsingViewModel$a$a roomTopicsBrowsingViewModel$a$a = new RoomTopicsBrowsingViewModel$a$a(list);
                final coe<Object>[] r0 = RoomTopicsBrowsingViewModel.R0;
                e0.Q((qsb)roomTopicsBrowsingViewModel$a$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        this.C(((enm)t01).R((Object)"INITIAL_QUERY"), (qsb)new RoomTopicsBrowsingViewModel$b(this, bho));
        final nnl a = ((t9a)fgo).a;
        czd.e((Object)a, "observe()");
        MviViewModel.M((MviViewModel)this, (h5j)a, (String)null, (jrx)null, (ftb)new ftb<fgo.a, go6<? super fzv>, Object>(bho, this, null) {
            public Object D0;
            public final bho E0;
            public final RoomTopicsBrowsingViewModel F0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<fgo.a, go6<? super fzv>, Object> ftb = (ftb<fgo.a, go6<? super fzv>, Object>)new ftb<fgo.a, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                    public Object D0;
                    public final bho E0;
                    public final RoomTopicsBrowsingViewModel F0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<fgo.a, go6<? super fzv>, Object> ftb = (ftb<fgo.a, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(Object next) {
                b1n.u(next);
                final fgo.a a = (fgo.a)this.D0;
                final bho e0 = this.E0;
                czd.e((Object)a, "args");
                Objects.requireNonNull(e0);
                final List list = (List)e0.b();
                final cgo cgo = null;
                final cgo cgo2 = null;
                nfo nfo = null;
                Label_0106: {
                    if (list != null) {
                        final Iterator iterator = list.iterator();
                        while (true) {
                            while (iterator.hasNext()) {
                                next = iterator.next();
                                if (czd.a((Object)((nfo)next).d, (Object)a.a)) {
                                    nfo = (nfo)next;
                                    break Label_0106;
                                }
                            }
                            next = null;
                            continue;
                        }
                    }
                    nfo = null;
                }
                cgo cgo3 = cgo;
                if (nfo != null) {
                    final List e2 = nfo.e;
                    cgo3 = cgo;
                    if (e2 != null) {
                        final Iterator iterator2 = e2.iterator();
                        Object next2;
                        do {
                            next2 = cgo2;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            next2 = iterator2.next();
                        } while (!czd.a((Object)((cgo)next2).b, (Object)a.b));
                        cgo3 = (cgo)next2;
                    }
                }
                if (cgo3 != null) {
                    final List p = mq4.P0((Collection)nfo.e);
                    final ArrayList list2 = (ArrayList)p;
                    list2.set(list2.indexOf(cgo3), cgo.a(cgo3, cgo3.d ^ true, false, 55));
                    final List list3 = (List)e0.b();
                    if (list3 != null) {
                        final List p2 = mq4.P0((Collection)list3);
                        final ArrayList list4 = (ArrayList)p2;
                        list4.set(list4.indexOf(nfo), nfo.a(nfo, false, p, 15));
                        e0.a((Object)p2);
                    }
                }
                final RoomTopicsBrowsingViewModel f0 = this.F0;
                final coe<Object>[] r0 = RoomTopicsBrowsingViewModel.R0;
                Objects.requireNonNull(f0);
                f0.T((qsb)new zgo(a, f0));
                return fzv.a;
            }
        }, 3, (Object)null);
        final nnl a2 = ((t9a)jfo).a;
        czd.e((Object)a2, "observe()");
        MviViewModel.M((MviViewModel)this, (h5j)a2, (String)null, (jrx)null, (ftb)new ftb<String, go6<? super fzv>, Object>(bho, null) {
            public Object D0;
            public final bho E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<String, go6<? super fzv>, Object> ftb = (ftb<String, go6<? super fzv>, Object>)new ftb<String, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final bho E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<String, go6<? super fzv>, Object> ftb = (ftb<String, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final String s = (String)this.D0;
                final bho e0 = this.E0;
                czd.e((Object)s, "it");
                Objects.requireNonNull(e0);
                final List list = (List)e0.b();
                if (list != null) {
                    int n = 0;
                    final Iterator iterator = list.iterator();
                    while (true) {
                        while (iterator.hasNext()) {
                            if (czd.a((Object)((nfo)iterator.next()).d, (Object)s)) {
                                final List list2 = (List)e0.b();
                                if (list2 == null) {
                                    return fzv.a;
                                }
                                final nfo nfo = (nfo)mq4.j0(list2, n);
                                if (nfo == null) {
                                    return fzv.a;
                                }
                                final boolean a = nfo.a;
                                final List list3 = (List)e0.b();
                                if (list3 != null) {
                                    final List p = mq4.P0((Collection)list3);
                                    ((ArrayList<nfo>)p).set(n, nfo.a(nfo, a ^ true, (List)null, 30));
                                    e0.a((Object)mq4.M0((Iterable)p));
                                    return fzv.a;
                                }
                                return fzv.a;
                            }
                            else {
                                ++n;
                            }
                        }
                        n = -1;
                        continue;
                    }
                }
                return fzv.a;
            }
        }, 3, (Object)null);
        ((wgm)v01).a((Object)bba.Companion.b("audiospace", "topics_browse", "", ""));
        this.Q0 = ewj.n(this, (qsb)new RoomTopicsBrowsingViewModel$e(this));
    }
    
    public final jyh<tgo> v() {
        return (jyh<tgo>)this.Q0.a((coe)RoomTopicsBrowsingViewModel.R0[0]);
    }
}
