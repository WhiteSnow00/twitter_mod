// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab.tabItem.card;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/rooms/ui/tab/tabItem/card/SpacesTabCardViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lovq;", "Livq;", "Lhvq;", "Lxim;", "Companion", "g", "feature.tfa.rooms.ui.tab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesTabCardViewModel extends MviViewModel<ovq, ivq, hvq> implements xim
{
    public static final SpacesTabCardViewModel.SpacesTabCardViewModel$g Companion;
    public static final /* synthetic */ soe<Object>[] V0;
    public final grq N0;
    public final gjo O0;
    public final udo P0;
    public final p1o Q0;
    public final kvo R0;
    public final g6n S0;
    public final SpacesTabCardViewModel T0;
    public final gyh U0;
    
    static {
        V0 = new soe[] { (soe)hi.m(SpacesTabCardViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new SpacesTabCardViewModel.SpacesTabCardViewModel$g();
    }
    
    public SpacesTabCardViewModel(final yvq.a a, final grq n0, final ibm ibm, final nhw nhw, final wlw wlw, final gjo o0, final udo p13, final jvq jvq, final n3e n3e, final p1o q0, final kvo r0, final g6n s0, final z7x z7x) {
        zzd.f((Object)a, "item");
        zzd.f((Object)n0, "spacesLauncher");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)nhw, "userRepository");
        zzd.f((Object)wlw, "usersRepository");
        zzd.f((Object)o0, "roomsScribeReporter");
        zzd.f((Object)p13, "roomTabCardRankDispatcher");
        zzd.f((Object)jvq, "seenHostSet");
        zzd.f((Object)n3e, "isSubscribedRepository");
        zzd.f((Object)q0, "rsvpDispatcher");
        zzd.f((Object)r0, "scheduledSpaceSubscriptionRepository");
        zzd.f((Object)s0, "audioSpacesRepository");
        zzd.f((Object)z7x, "viewLifecycle");
        final v21 a2 = a.a;
        final String j = a2.j;
        final String h = a2.h;
        final String i = a2.i;
        final Long k = a2.k;
        final List h2 = a2.H;
        final boolean q2 = a2.Q;
        final boolean c = a2.c;
        final w21 o2 = a2.O;
        final List p14 = a2.P;
        List h3;
        if (p14 != null) {
            h3 = or4.h2((Iterable)p14, 3);
        }
        else {
            h3 = null;
        }
        final v21 a3 = a.a;
        final int p15 = a3.p;
        final int r2 = a3.r;
        final int s2 = a3.s;
        final int u = a3.u;
        final qiq b = a.b;
        final Long l = a3.l;
        final int c2 = a.c;
        final Long s3 = a3.S;
        final boolean m = a3.J;
        final String d = a.d;
        final boolean b2 = zzd.a((Object)a3.i, (Object)"NOT_STARTED") && a3.l == null;
        final mos u2 = ajy.U(a.a);
        final v21 a4 = a.a;
        super((fae)ibm, (oax)new ovq(j, h, i, k, h2, q2, c, o2, "", h3, p15, r2, s2, u, b, l, null, false, c2, s3, m, d, b2, u2, a4.n, a4.T, a4.K));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p13;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = this;
        final b5j take = z7x.d().take(1L);
        zzd.e((Object)take, "viewLifecycle.observeFocus().take(1)");
        MviViewModel.M((MviViewModel)this, take, (String)null, (qqx)null, (gub)new SpacesTabCardViewModel$a(this, a, (ap6)null), 3, (Object)null);
        final w21 o3 = a.a.O;
        if (o3 != null) {
            final hfv e = o3.e();
            if (e != null) {
                final b5j compose = nhw.b(e.f()).compose((jbj)qnj.C0);
                zzd.e((Object)compose, "userRepository.getUser(h\u2026tional.unwrapIfPresent())");
                this.B(compose, (rtb)new SpacesTabCardViewModel$b(e, this, jvq));
            }
        }
        Object o4;
        if ((o4 = a.a.P) == null) {
            o4 = v2a.C0;
        }
        final ArrayList<hfv> list = new ArrayList<hfv>();
        final Iterator iterator = ((Iterable)o4).iterator();
        while (iterator.hasNext()) {
            final hfv e2 = ((w21)iterator.next()).e();
            if (e2 != null) {
                list.add(e2);
            }
        }
        final List h4 = or4.h2((Iterable)list, 3);
        final ArrayList list2 = new ArrayList<Long>(kr4.h1((Iterable)h4, 10));
        final Iterator iterator2 = h4.iterator();
        while (iterator2.hasNext()) {
            list2.add(((hfv)iterator2.next()).C0);
        }
        MviViewModel.N((MviViewModel)this, wlw.a((List<Long>)list2).first((Object)v2a.C0).w((qtb)new pxn((rtb)SpacesTabCardViewModel$c.C0, 8)), (String)null, (qqx)null, (gub)new SpacesTabCardViewModel$d(this, (ap6)null), 3, (Object)null);
        final String h5 = a.a.h;
        zzd.f((Object)h5, "value");
        MviViewModel.N((MviViewModel)this, (n9q)n3e.a(h5), (String)null, (qqx)null, (gub)new SpacesTabCardViewModel$e(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, this.Q0.a(), (String)null, (qqx)null, (gub)new SpacesTabCardViewModel$f(a, this, (ap6)null), 3, (Object)null);
        this.U0 = oyz.f0(this, (rtb)new SpacesTabCardViewModel$h(this));
    }
    
    public final void j() {
        this.V((Object)hvq$a.a);
    }
    
    public final iyh<ivq> v() {
        return (iyh<ivq>)this.U0.a((soe)SpacesTabCardViewModel.V0[0]);
    }
}
