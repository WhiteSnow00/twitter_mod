// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab.tabItem.card;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Objects;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/rooms/ui/tab/tabItem/card/SpacesTabCardViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lhwq;", "Lbwq;", "Lawq;", "Lnjm;", "Companion", "g", "feature.tfa.rooms.ui.tab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesTabCardViewModel extends MviViewModel<hwq, bwq, awq> implements njm
{
    public static final g Companion;
    public static final coe<Object>[] W0;
    public final asq O0;
    public final vjo P0;
    public final jeo Q0;
    public final c2o R0;
    public final awo S0;
    public final u6n T0;
    public final SpacesTabCardViewModel U0;
    public final hyh V0;
    
    static {
        W0 = new coe[] { (coe)w9.f((Class)SpacesTabCardViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new g();
    }
    
    public SpacesTabCardViewModel(final rwq$a rwq$a, final asq o0, final xbm xbm, final giw giw, final qmw qmw, final vjo p13, final jeo q0, final cwq cwq, final s2e s2e, final c2o r0, final awo s0, final u6n t0, final r8x r8x) {
        czd.f((Object)rwq$a, "item");
        czd.f((Object)o0, "spacesLauncher");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)giw, "userRepository");
        czd.f((Object)qmw, "usersRepository");
        czd.f((Object)p13, "roomsScribeReporter");
        czd.f((Object)q0, "roomTabCardRankDispatcher");
        czd.f((Object)cwq, "seenHostSet");
        czd.f((Object)s2e, "isSubscribedRepository");
        czd.f((Object)r0, "rsvpDispatcher");
        czd.f((Object)s0, "scheduledSpaceSubscriptionRepository");
        czd.f((Object)t0, "audioSpacesRepository");
        czd.f((Object)r8x, "viewLifecycle");
        final r21 a = rwq$a.a;
        final String j = a.j;
        final String h = a.h;
        final String i = a.i;
        final Long k = a.k;
        final List h2 = a.H;
        final boolean q2 = a.Q;
        final boolean c = a.c;
        final s21 o2 = a.O;
        final List p14 = a.P;
        List h3;
        if (p14 != null) {
            h3 = mq4.H0((Iterable)p14, 3);
        }
        else {
            h3 = null;
        }
        final r21 a2 = rwq$a.a;
        final int p15 = a2.p;
        final int r2 = a2.r;
        final int s2 = a2.s;
        final int u = a2.u;
        final ijq b = rwq$a.b;
        final Long l = a2.l;
        final int c2 = rwq$a.c;
        final Long s3 = a2.S;
        final boolean m = a2.J;
        final String d = rwq$a.d;
        final boolean b2 = czd.a((Object)a2.i, (Object)"NOT_STARTED") && a2.l == null;
        final gps w = ii8.W(rwq$a.a);
        final r21 a3 = rwq$a.a;
        super((k9e)xbm, (jbx)new hwq(j, h, i, k, h2, q2, c, o2, "", h3, p15, r2, s2, u, b, l, null, false, c2, s3, m, d, b2, w, a3.n, a3.T, a3.K));
        this.O0 = o0;
        this.P0 = p13;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = this;
        final h5j take = r8x.d().take(1L);
        czd.e((Object)take, "viewLifecycle.observeFocus().take(1)");
        MviViewModel.M((MviViewModel)this, take, (String)null, (jrx)null, (ftb)new ftb<tmi, go6<? super fzv>, Object>(this, rwq$a, null) {
            public final SpacesTabCardViewModel D0;
            public final rwq$a E0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<tmi, go6<? super fzv>, Object>(this.D0, this.E0, go6) {
                    public final SpacesTabCardViewModel D0;
                    public final rwq$a E0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<tmi, go6<? super fzv>, Object> ftb = (ftb<tmi, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final vjo p = this.D0.P0;
                final rwq$a e0 = this.E0;
                final String h = e0.a.h;
                final String d = e0.d;
                final Integer n = new Integer(e0.c);
                Objects.requireNonNull(p);
                czd.f((Object)h, "spaceId");
                vjo.T(p, "tab", null, "audiospace_card", "impression", h, d, n, null, 386);
                return fzv.a;
            }
        }, 3, (Object)null);
        final s21 o3 = rwq$a.a.O;
        if (o3 != null) {
            final cgv e = o3.e();
            if (e != null) {
                final h5j compose = giw.b(e.f()).compose((pbj)vnj.D0);
                czd.e((Object)compose, "userRepository.getUser(h\u2026tional.unwrapIfPresent())");
                this.B(compose, (qsb)new SpacesTabCardViewModel$b(e, this, cwq));
            }
        }
        Object o4;
        if ((o4 = rwq$a.a.P) == null) {
            o4 = f2a.D0;
        }
        final ArrayList<cgv> list = new ArrayList<cgv>();
        final Iterator iterator = ((Iterable)o4).iterator();
        while (iterator.hasNext()) {
            final cgv e2 = ((s21)iterator.next()).e();
            if (e2 != null) {
                list.add(e2);
            }
        }
        final List h4 = mq4.H0((Iterable)list, 3);
        final ArrayList list2 = new ArrayList<Long>(iq4.H((Iterable)h4, 10));
        final Iterator iterator2 = h4.iterator();
        while (iterator2.hasNext()) {
            list2.add(((cgv)iterator2.next()).D0);
        }
        MviViewModel.N((MviViewModel)this, qmw.a((List<Long>)list2).first((Object)f2a.D0).w((psb)new abr((qsb)SpacesTabCardViewModel$c.D0, 3)), (String)null, (jrx)null, (ftb)new ftb<Map<Long, ? extends cgv>, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final SpacesTabCardViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<Map<Long, ? extends cgv>, go6<? super fzv>, Object> ftb = (ftb<Map<Long, ? extends cgv>, go6<? super fzv>, Object>)new ftb<Map<Long, ? extends cgv>, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final SpacesTabCardViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<Map<Long, ? extends cgv>, go6<? super fzv>, Object> ftb = (ftb<Map<Long, ? extends cgv>, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final Map map = (Map)this.D0;
                final SpacesTabCardViewModel e0 = this.E0;
                final SpacesTabCardViewModel$d$a spacesTabCardViewModel$d$a = new SpacesTabCardViewModel$d$a(map);
                final g companion = SpacesTabCardViewModel.Companion;
                e0.Q((qsb)spacesTabCardViewModel$d$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        final String h5 = rwq$a.a.h;
        czd.f((Object)h5, "value");
        MviViewModel.N((MviViewModel)this, s2e.a(h5), (String)null, (jrx)null, (ftb)new ftb<Boolean, go6<? super fzv>, Object>(this, null) {
            public boolean D0;
            public final SpacesTabCardViewModel E0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                final ftb<Boolean, go6<? super fzv>, Object> ftb = (ftb<Boolean, go6<? super fzv>, Object>)new ftb<Boolean, go6<? super fzv>, Object>(this.E0, go6) {
                    public boolean D0;
                    public final SpacesTabCardViewModel E0;
                };
                ftb.D0 = (boolean)o;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<Boolean, go6<? super fzv>, Object> ftb = (ftb<Boolean, go6<? super fzv>, Object>)this.create((boolean)o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final boolean d0 = this.D0;
                final SpacesTabCardViewModel e0 = this.E0;
                final SpacesTabCardViewModel$e$a spacesTabCardViewModel$e$a = new SpacesTabCardViewModel$e$a(d0);
                final g companion = SpacesTabCardViewModel.Companion;
                e0.Q((qsb)spacesTabCardViewModel$e$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        MviViewModel.M((MviViewModel)this, this.R0.a(), (String)null, (jrx)null, (ftb)new ftb<b2o, go6<? super fzv>, Object>(rwq$a, this, null) {
            public Object D0;
            public final rwq$a E0;
            public final SpacesTabCardViewModel F0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<b2o, go6<? super fzv>, Object> ftb = (ftb<b2o, go6<? super fzv>, Object>)new ftb<b2o, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                    public Object D0;
                    public final rwq$a E0;
                    public final SpacesTabCardViewModel F0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<b2o, go6<? super fzv>, Object> ftb = (ftb<b2o, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final b2o b2o = (b2o)this.D0;
                final String a = b2o.a;
                final boolean b = b2o.b;
                if (czd.a((Object)a, (Object)this.E0.a.h)) {
                    final SpacesTabCardViewModel f0 = this.F0;
                    final SpacesTabCardViewModel$f$a spacesTabCardViewModel$f$a = new SpacesTabCardViewModel$f$a(b);
                    final g companion = SpacesTabCardViewModel.Companion;
                    f0.Q((qsb)spacesTabCardViewModel$f$a);
                }
                return fzv.a;
            }
        }, 3, (Object)null);
        this.V0 = ewj.n(this, (qsb)new SpacesTabCardViewModel$h(this));
    }
    
    public final void j() {
        this.V((Object)awq.a.a);
    }
    
    public final jyh<bwq> v() {
        return (jyh<bwq>)this.V0.a((coe)SpacesTabCardViewModel.W0[0]);
    }
    
    public static final class g
    {
    }
}
