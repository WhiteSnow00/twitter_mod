// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Iterator;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;
import tv.periscope.model.NarrowcastSpaceType$None;
import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.Map;
import java.util.Set;
import tv.periscope.model.b;
import java.util.List;
import java.util.Objects;
import com.twitter.rooms.di.room.RoomObjectGraph;

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$getAudioSpace$1$3$1", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class o extends p0s implements ftb<lvj<? extends p01, ? extends ynj<qt3>>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    public final vqn F0;
    public final boolean G0;
    public final String H0;
    public final RoomObjectGraph I0;
    
    public o(final RoomStateManager e0, final vqn f0, final boolean g0, final String h0, final RoomObjectGraph i0, final go6<? super o> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final o o = new o(this.E0, this.F0, this.G0, this.H0, this.I0, (go6<? super o>)go6);
        o.D0 = d0;
        return (go6<fzv>)o;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final o o3 = (o)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        o3.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lvj lvj = (lvj)this.D0;
        final RoomStateManager e0 = this.E0;
        if (e0.B1 != 0L) {
            e0.B1 = 0L;
            RoomStateManager.i0(e0);
        }
        final r21 c = ((p01)lvj.D0).c;
        final String a0 = c.a0;
        czd.f((Object)c, "<this>");
        final nl2 b = nl2.b(c.i);
        czd.e((Object)b, "safeValueOf(this.state)");
        final boolean j = c.J;
        boolean b2 = false;
        final boolean b3 = j && (b == nl2.G0 || b == nl2.H0) && blz.M(this.F0) && !blz.N(this.F0);
        final boolean b4 = blz.N(this.F0) || b3;
        if (!this.G0 && ((ynj)lvj.E0).f()) {
            final Object c2 = ((ynj)lvj.E0).c();
            czd.e(c2, "it.second.get()");
            final qt3 qt3 = (qt3)c2;
            if (b3) {
                this.E0.m1.a.onNext((Object)new o1o$a$d(this.H0));
                ((MviViewModel)this.E0).Q((qsb)o$a.D0);
            }
            if (b4) {
                final a8n w4 = this.I0.w4();
                final r21 c3 = ((p01)lvj.D0).c;
                Objects.requireNonNull(w4);
                czd.f((Object)c3, "metadata");
                w4.I0.k((Object)w4);
                final b a2 = fun.a(c3);
                final String i = c3.i;
                final nl2 f0 = nl2.F0;
                final boolean b5 = czd.a((Object)i, (Object)"RUNNING") ^ true;
                if (w4.F0.g(qt3)) {
                    w4.c(a2, qt3, true, b5);
                    final o34 k = w4.F0.k;
                    if (k != null) {
                        k.c(true);
                    }
                    w4.F0.s(0L, b5);
                    w4.Q0 = true;
                }
                w4.P0 = new lvj((Object)a2, (Object)qt3);
            }
            else {
                this.I0.w4().b(fun.a(((p01)lvj.D0).c), qt3);
            }
        }
        final nl2 h0 = nl2.H0;
        Label_0526: {
            if (!czd.a((Object)a0, (Object)"ENDED")) {
                final nl2 g0 = nl2.G0;
                if (!czd.a((Object)a0, (Object)"TIMED_OUT")) {
                    if (a0.length() == 0) {
                        b2 = true;
                    }
                    if (!b2) {
                        break Label_0526;
                    }
                }
            }
            if (!b4) {
                RoomStateManager.r0(this.E0, false, true, false, false, (nsb)null, 29);
                return fzv.a;
            }
        }
        final RoomStateManager e2 = this.E0;
        ((MviViewModel)e2).Q((qsb)new qsb<vqn, vqn>(lvj, e2, b3, this.F0, this.G0) {
            public final lvj<p01, ynj<qt3>> D0;
            public final RoomStateManager E0;
            public final boolean F0;
            public final vqn G0;
            public final boolean H0;
            
            public final Object invoke(Object o) {
                final vqn vqn = (vqn)o;
                czd.f((Object)vqn, "$this$setState");
                final r21 c = ((p01)this.D0.D0).c;
                final RoomStateManager e0 = this.E0;
                final RoomStateManager$k0 companion = RoomStateManager.Companion;
                Objects.requireNonNull(e0);
                int n = c.w - 1;
                if (n < 0) {
                    n = 0;
                }
                final vjo b1 = this.E0.b1;
                if (c.k == null) {
                    b1.g = "adhoc";
                }
                else {
                    b1.g = "scheduled";
                }
                if (this.F0) {
                    b1.h = "replay";
                }
                else {
                    b1.g0(c.J);
                }
                this.E0.b1.f0(c.T);
                final RoomStateManager e2 = this.E0;
                final vjo b2 = e2.b1;
                Boolean b3;
                if ((b3 = e2.T0.getUser().A1) == null) {
                    b3 = Boolean.FALSE;
                }
                b2.j = b3;
                this.E0.b1.d0(c.Z != null);
                final RoomStateManager e3 = this.E0;
                final vqn g0 = this.G0;
                Object o2;
                if ((o2 = c.C) == null) {
                    o2 = f2a.D0;
                }
                RoomStateManager.e0(e3, g0, (List)o2);
                vqn vqn2;
                if (this.H0) {
                    final ds5 y = c.Y;
                    Object b4;
                    if (y != null) {
                        b4 = y.b;
                    }
                    else {
                        b4 = null;
                    }
                    tg5 b5;
                    if (b4 instanceof bs5$a) {
                        b5 = ((bs5$a)b4).b;
                    }
                    else {
                        b5 = null;
                    }
                    final String z = c.Z;
                    final Integer e4 = this.G0.E;
                    int intValue;
                    if (e4 != null) {
                        intValue = e4;
                    }
                    else {
                        intValue = n;
                    }
                    vqn2 = vqn.l(vqn, null, null, false, null, null, c, b5, z, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, c.j, c.m, false, null, n, intValue, null, null, null, c.x, false, null, false, c.J, false, null, null, false, -1711276257, 1979);
                }
                else {
                    Label_0634: {
                        if (djo.p()) {
                            final RoomStateManager e5 = this.E0;
                            final vqn g2 = this.G0;
                            final Set l = s9i.l(c);
                            Objects.requireNonNull(e5);
                            czd.f((Object)g2, "state");
                            if (l.isEmpty() ^ true) {
                                final Iterator iterator = l.iterator();
                                while (true) {
                                    while (iterator.hasNext()) {
                                        o = iterator.next();
                                        final CohostInvite cohostInvite = (CohostInvite)o;
                                        if (czd.a((Object)cohostInvite.getTwitterId(), (Object)e5.m0().getStringId()) || czd.a((Object)cohostInvite.getPeriscopeId(), (Object)e5.U0.n())) {
                                            final CohostInvite cohostInvite2 = (CohostInvite)o;
                                            if (g2.F == p9w.I0 && cohostInvite2 != null) {
                                                final qwn h1 = e5.h1;
                                                final b1e e6 = b1e.E0;
                                                final RoomUserItem v0 = fli.v0((Set)g2.n);
                                                String name;
                                                if (v0 == null || (name = v0.getName()) == null) {
                                                    name = "";
                                                }
                                                o = new qwn$a$a(e6, name);
                                                h1.a.onNext(o);
                                            }
                                            break Label_0634;
                                        }
                                    }
                                    o = null;
                                    continue;
                                }
                            }
                        }
                    }
                    Label_0756: {
                        if (djo.i()) {
                            final Set<uon> k = this.G0.k;
                            if (k.isEmpty() ^ true) {
                                final RoomStateManager e7 = this.E0;
                                final Iterator<Object> iterator2 = k.iterator();
                                while (true) {
                                    while (iterator2.hasNext()) {
                                        o = iterator2.next();
                                        if (czd.a((Object)((uon)o).a, (Object)e7.m0().getStringId())) {
                                            if (o != null) {
                                                this.E0.h1.a.onNext((Object)new qwn$a$a(b1e.D0, ""));
                                            }
                                            break Label_0756;
                                        }
                                    }
                                    o = null;
                                    continue;
                                }
                            }
                        }
                    }
                    final Long i = c.L;
                    boolean b6 = false;
                    Label_0810: {
                        if (i != null) {
                            final long longValue = i.longValue();
                            final m4s a = hq1.a;
                            if (longValue - System.currentTimeMillis() < 25000L) {
                                b6 = true;
                                break Label_0810;
                            }
                        }
                        b6 = false;
                    }
                    final ds5 y2 = c.Y;
                    Object b7;
                    if (y2 != null) {
                        b7 = y2.b;
                    }
                    else {
                        b7 = null;
                    }
                    tg5 b8;
                    if (b7 instanceof bs5$a) {
                        b8 = ((bs5$a)b7).b;
                    }
                    else {
                        b8 = null;
                    }
                    final String z2 = c.Z;
                    final qt3 qt3 = (qt3)((ynj)this.D0.E0).c();
                    final String j = c.j;
                    final boolean m = c.m;
                    final boolean b9 = vqn.c || (m && !blz.I(this.G0));
                    final Integer e8 = this.G0.E;
                    int intValue2;
                    if (e8 != null) {
                        intValue2 = e8;
                    }
                    else {
                        intValue2 = n;
                    }
                    final String x = c.x;
                    final boolean j2 = c.J;
                    fmq fmq2;
                    final fmq fmq = fmq2 = fmq.F0;
                    if (j2) {
                        fmq2 = fmq;
                        if (czd.a((Object)c.T, (Object)NarrowcastSpaceType$None.INSTANCE)) {
                            if (c.E != null) {
                                fmq2 = fmq;
                            }
                            else {
                                final boolean a2 = czd.a((Object)c.T, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE);
                                final boolean k2 = c.K;
                                final boolean j3 = c.J;
                                if (!djo.y()) {
                                    fmq2 = fmq;
                                }
                                else if (!j3) {
                                    fmq2 = fmq;
                                }
                                else if (a2) {
                                    fmq2 = fmq;
                                }
                                else if (k2) {
                                    fmq2 = fmq.D0;
                                }
                                else {
                                    fmq2 = fmq;
                                    if (!k2) {
                                        fmq2 = fmq.E0;
                                    }
                                }
                            }
                        }
                    }
                    vqn2 = vqn.l(vqn, null, null, b9, null, null, c, b8, z2, qt3, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, j, m, false, null, n, intValue2, null, fmq2, null, x, b6, null, false, j2, false, null, null, false, -1711276517, 1970);
                }
                return vqn2;
            }
        });
        return fzv.a;
    }
}
