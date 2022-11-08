// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers;

import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import com.twitter.rooms.model.RaisedHand;
import java.util.Locale;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Collection;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.TabFilterType;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.rooms.subsystem.api.args.TabFilterType$Removed;
import com.twitter.rooms.subsystem.api.args.TabFilterType$Listeners;
import com.twitter.rooms.subsystem.api.args.TabFilterType$Requests;
import com.twitter.rooms.subsystem.api.args.TabFilterType$Speakers;
import com.twitter.rooms.subsystem.api.args.TabFilterType$Cohosts;
import com.twitter.rooms.subsystem.api.args.TabFilterType$All;
import com.twitter.rooms.subsystem.api.args.RoomManageSpeakersFragmentContentViewArgs;
import com.twitter.rooms.manager.RoomStateManager;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/core/speakers/RoomManageSpeakersViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lfqn;", "Lrpn;", "Lppn;", "Companion", "d0", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomManageSpeakersViewModel extends MviViewModel<fqn, rpn, ppn>
{
    public static final RoomManageSpeakersViewModel.RoomManageSpeakersViewModel$d0 Companion;
    public static final /* synthetic */ soe<Object>[] W0;
    public static final String X0;
    public final Context N0;
    public final ysn O0;
    public final vsn P0;
    public final iln Q0;
    public final wmn R0;
    public final gjo S0;
    public final xio T0;
    public final lio U0;
    public final gyh V0;
    
    static {
        W0 = new soe[] { (soe)hi.m(RoomManageSpeakersViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomManageSpeakersViewModel.RoomManageSpeakersViewModel$d0();
        X0 = "RoomManageSpeakersViewModel";
    }
    
    public RoomManageSpeakersViewModel(final Context n0, final ibm ibm, final RoomStateManager roomStateManager, final ysn o0, final vsn p13, final iln q0, final wmn r0, final jig jig, final gjo s0, final lxn lxn, final xio t0, final lio u0, final RoomManageSpeakersFragmentContentViewArgs roomManageSpeakersFragmentContentViewArgs) {
        zzd.f((Object)n0, "context");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)roomStateManager, "roomStateManager");
        zzd.f((Object)o0, "roomOpenSpaceViewEventDispatcher");
        zzd.f((Object)p13, "roomOpenInviteViewEventDispatcher");
        zzd.f((Object)q0, "roomGuestActionsEventDispatcher");
        zzd.f((Object)r0, "roomHostEventDispatcher");
        zzd.f((Object)jig, "actionDispatcher");
        zzd.f((Object)s0, "roomsScribeReporter");
        zzd.f((Object)lxn, "removedListEventDispatcher");
        zzd.f((Object)t0, "roomUtilsFragmentViewEventDispatcher");
        zzd.f((Object)u0, "roomUsersCache");
        zzd.f((Object)roomManageSpeakersFragmentContentViewArgs, "args");
        super((fae)ibm, (oax)new fqn(32766));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p13;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        this.V0 = oyz.f0(this, (rtb)new RoomManageSpeakersViewModel$e0(this));
        final TabFilterType tabFilter = roomManageSpeakersFragmentContentViewArgs.getTabFilter();
        u7s u7s;
        if (tabFilter != null) {
            if (zzd.a((Object)tabFilter, (Object)TabFilterType$All.INSTANCE)) {
                u7s = u7s.D0;
            }
            else if (zzd.a((Object)tabFilter, (Object)TabFilterType$Cohosts.INSTANCE)) {
                u7s = u7s.E0;
            }
            else if (zzd.a((Object)tabFilter, (Object)TabFilterType$Speakers.INSTANCE)) {
                u7s = u7s.F0;
            }
            else if (zzd.a((Object)tabFilter, (Object)TabFilterType$Requests.INSTANCE)) {
                u7s = u7s.G0;
            }
            else if (zzd.a((Object)tabFilter, (Object)TabFilterType$Listeners.INSTANCE)) {
                u7s = u7s.H0;
            }
            else {
                if (!zzd.a((Object)tabFilter, (Object)TabFilterType$Removed.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                u7s = u7s.I0;
            }
        }
        else {
            u7s = null;
        }
        this.V((Object)new ppn$d(u7s));
        gjo.F(s0, "caret", "manage_speakers", "click", null, null, 24);
        lxn.a.onNext((Object)lxn$a$b.a);
        this.Q((rtb)bqn.C0);
        MviViewModel.M((MviViewModel)this, (b5j)lxn.b, (String)null, (qqx)null, (gub)new RoomManageSpeakersViewModel$a(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)q0.a, (String)null, (qqx)null, (gub)new RoomManageSpeakersViewModel$l(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)lxn.a, (String)null, (qqx)null, (gub)new RoomManageSpeakersViewModel$w(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, roomStateManager.D0((voe)RoomManageSpeakersViewModel$x.C0, new voe[] { (voe)RoomManageSpeakersViewModel$y.C0 }), (String)null, (qqx)null, (gub)new RoomManageSpeakersViewModel$z(this, (ap6)null), 3, (Object)null);
        final b5j distinctUntilChanged = roomStateManager.D0((voe)RoomManageSpeakersViewModel$a0.C0, new voe[] { (voe)RoomManageSpeakersViewModel$b0.C0, (voe)RoomManageSpeakersViewModel$c0.C0, (voe)RoomManageSpeakersViewModel$b.C0, (voe)RoomManageSpeakersViewModel$c.C0, (voe)RoomManageSpeakersViewModel$d.C0, (voe)RoomManageSpeakersViewModel$e.C0, (voe)RoomManageSpeakersViewModel$f.C0, (voe)RoomManageSpeakersViewModel$g.C0 }).map((qtb)new ypn((rtb)RoomManageSpeakersViewModel$h.C0, 0)).distinctUntilChanged();
        zzd.e((Object)distinctUntilChanged, "roomStateManager.stateOb\u2026  .distinctUntilChanged()");
        MviViewModel.M((MviViewModel)this, distinctUntilChanged, (String)null, (qqx)null, (gub)new RoomManageSpeakersViewModel$i(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)jig.a, (String)null, (qqx)null, (gub)new RoomManageSpeakersViewModel$j(this, (ap6)null), 3, (Object)null);
        this.U(new voe[] { (voe)RoomManageSpeakersViewModel$k.C0, (voe)RoomManageSpeakersViewModel$m.C0, (voe)RoomManageSpeakersViewModel$n.C0, (voe)RoomManageSpeakersViewModel$o.C0, (voe)RoomManageSpeakersViewModel$p.C0, (voe)RoomManageSpeakersViewModel$q.C0, (voe)RoomManageSpeakersViewModel$r.C0, (voe)RoomManageSpeakersViewModel$s.C0, (voe)RoomManageSpeakersViewModel$t.C0, (voe)RoomManageSpeakersViewModel$u.C0 }, (rtb)new RoomManageSpeakersViewModel$v(this));
    }
    
    public static final void W(final RoomManageSpeakersViewModel roomManageSpeakersViewModel) {
        Objects.requireNonNull(roomManageSpeakersViewModel);
        roomManageSpeakersViewModel.T((rtb)new cqn(roomManageSpeakersViewModel));
    }
    
    public static final void X(final RoomManageSpeakersViewModel roomManageSpeakersViewModel, final fqn fqn) {
        Objects.requireNonNull(roomManageSpeakersViewModel);
        final u7s j = fqn.j;
        if (j == u7s.I0) {
            final ArrayList list = new ArrayList();
            list.add(new hig$b(Integer.valueOf(fqn.f.size()), Integer.valueOf(0), fqn.l));
            final List<RoomUserItem> f = fqn.f;
            final ArrayList list2 = new ArrayList<hig$c>(kr4.h1((Iterable)f, 10));
            final Iterator<Object> iterator = f.iterator();
            while (iterator.hasNext()) {
                list2.add(new hig$c((RoomUserItem)iterator.next(), (RoomUserItem)null, false, false, true, 14));
            }
            list.addAll(list2);
            roomManageSpeakersViewModel.Q((rtb)new dqn(list));
        }
        else {
            final List<RoomUserItem> d = fqn.d;
            if (j == u7s.E0) {
                roomManageSpeakersViewModel.Q((rtb)new eqn(roomManageSpeakersViewModel, fqn));
            }
            else {
                List<RoomUserItem> list3 = d;
                if (j.C0.isEmpty() ^ true) {
                    list3 = new ArrayList<RoomUserItem>();
                    for (final RoomUserItem next : d) {
                        if (fqn.j.C0.contains(next.getUserStatus())) {
                            ((ArrayList<RoomUserItem>)list3).add(next);
                        }
                    }
                }
                Object o = list3;
                if (pjr.g((CharSequence)fqn.i)) {
                    o = new ArrayList<RoomUserItem>();
                    for (final RoomUserItem next2 : list3) {
                        final RoomUserItem roomUserItem = next2;
                        final String name = roomUserItem.getName();
                        final Locale d2 = t4s.d();
                        zzd.e((Object)d2, "getLocale()");
                        final String lowerCase = name.toLowerCase(d2);
                        zzd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        boolean b = false;
                        Label_0429: {
                            if (!gkr.o1((CharSequence)lowerCase, (CharSequence)fqn.i, false)) {
                                final String username = roomUserItem.getUsername();
                                final Locale d3 = t4s.d();
                                zzd.e((Object)d3, "getLocale()");
                                final String lowerCase2 = username.toLowerCase(d3);
                                zzd.e((Object)lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                                if (!gkr.o1((CharSequence)lowerCase2, (CharSequence)fqn.i, false)) {
                                    b = false;
                                    break Label_0429;
                                }
                            }
                            b = true;
                        }
                        if (b) {
                            ((ArrayList<RoomUserItem>)o).add(next2);
                        }
                    }
                }
                final List<RoomUserItem> e = fqn.e;
                final List<RoomUserItem> g = fqn.g;
                final hqn k = fqn.k;
                final Boolean o2 = fqn.o;
                final boolean b2 = o2 != null && o2;
                final List c0 = fqn.j.C0;
                final int n = fqn.n;
                final hio g2 = hio.G0;
                final hio d4 = hio.D0;
                final hio c2 = hio.C0;
                final boolean b3 = k == hqn.D0;
                final int d5 = oio.d();
                final LinkedHashMap<hio, List> linkedHashMap = (LinkedHashMap<hio, List>)new LinkedHashMap<hio, List<?>>();
                for (final RoomUserItem next3 : o) {
                    final hio userStatus = next3.getUserStatus();
                    List<RoomUserItem> value;
                    if ((value = (List<RoomUserItem>)linkedHashMap.get(userStatus)) == null) {
                        value = new ArrayList<RoomUserItem>();
                        linkedHashMap.put(userStatus, value);
                    }
                    value.add(next3);
                }
                final b7m b7m = new b7m();
                Object c3;
                if ((c3 = linkedHashMap.get(d4)) == null) {
                    c3 = v2a.C0;
                }
                final ArrayList c4 = new ArrayList<hig$c>(kr4.h1((Iterable)c3, 10));
                final Iterator iterator5 = ((Iterable)c3).iterator();
                while (iterator5.hasNext()) {
                    c4.add(new hig$c((RoomUserItem)iterator5.next(), (RoomUserItem)null, false, false, false, 30));
                }
                b7m.C0 = c4;
                final int size = c4.size();
                final int n2 = d5 - size;
                final boolean b4 = n2 > 0;
                RoomUserItem roomUserItem2 = null;
                Label_0848: {
                    Label_0846: {
                        Label_0843: {
                            if (oio.p()) {
                                final List list4 = linkedHashMap.get(c2);
                                if (list4 != null) {
                                    while (true) {
                                        for (final Object next4 : list4) {
                                            if (((RoomUserItem)next4).isPrimaryAdmin()) {
                                                roomUserItem2 = (RoomUserItem)next4;
                                                break Label_0843;
                                            }
                                        }
                                        Object next4 = null;
                                        continue;
                                    }
                                }
                                break Label_0846;
                            }
                            else {
                                final List list5 = linkedHashMap.get(c2);
                                if (list5 == null) {
                                    break Label_0846;
                                }
                                roomUserItem2 = (RoomUserItem)or4.I1((List)list5);
                            }
                        }
                        break Label_0848;
                    }
                    roomUserItem2 = null;
                }
                Object o3;
                if (roomUserItem2 != null) {
                    o3 = tdy.v0((Object[])new hig[] { (hig)new hig$b(2131958424, (Integer)null, (Integer)null, 14), (hig)new hig$c(roomUserItem2, (RoomUserItem)null, false, false, false, 30) });
                }
                else {
                    o3 = v2a.C0;
                }
                Object o4;
                if (c0.contains(c2)) {
                    o4 = roomManageSpeakersViewModel.Y((List<RoomUserItem>)o, g, b3, n);
                }
                else {
                    o4 = v2a.C0;
                }
                final hio f2 = hio.F0;
                Object c5;
                if ((c5 = linkedHashMap.get(f2)) == null) {
                    c5 = v2a.C0;
                }
                Object o5;
                if (c0.contains(f2) && b2) {
                    final List u0 = tdy.u0((Object)new hig$b(2131958431, Integer.valueOf(((Collection)c5).size()), Integer.valueOf(n2), 8));
                    final ArrayList list6 = new ArrayList<hig$c>(kr4.h1((Iterable)c5, 10));
                    final Iterator iterator7 = ((Iterable)c5).iterator();
                    while (iterator7.hasNext()) {
                        list6.add(new hig$c((RoomUserItem)iterator7.next(), (RoomUserItem)null, b4, false, false, 26));
                    }
                    o5 = or4.X1((Collection)u0, (Iterable)list6);
                }
                else {
                    o5 = v2a.C0;
                }
                final List list7 = linkedHashMap.get(g2);
                gvj gvj;
                if (list7 != null) {
                    final List<RoomUserItem> list8 = e;
                    final ArrayList list9 = new ArrayList<String>(kr4.h1((Iterable)list8, 10));
                    final Iterator<Object> iterator8 = list8.iterator();
                    while (iterator8.hasNext()) {
                        list9.add(iterator8.next().getTwitterUserId());
                    }
                    final ArrayList<RoomUserItem> list10 = new ArrayList<RoomUserItem>();
                    final ArrayList<RoomUserItem> list11 = new ArrayList<RoomUserItem>();
                    for (final Object next5 : list7) {
                        if (list9.contains(((RoomUserItem)next5).getTwitterUserId())) {
                            list10.add((RoomUserItem)next5);
                        }
                        else {
                            list11.add((RoomUserItem)next5);
                        }
                    }
                    gvj = new gvj((Object)list10, (Object)list11);
                }
                else {
                    final v2a c6 = v2a.C0;
                    gvj = new gvj((Object)c6, (Object)c6);
                }
                final List list12 = (List)gvj.C0;
                final List list13 = (List)gvj.D0;
                Object o6;
                if (c0.contains(g2)) {
                    final List u2 = tdy.u0((Object)new hig$b(2131958429, Integer.valueOf(list13.size()), (Integer)null, 12));
                    final ArrayList list14 = new ArrayList<hig$c>(kr4.h1((Iterable)list13, 10));
                    final Iterator iterator10 = list13.iterator();
                    while (iterator10.hasNext()) {
                        list14.add(new hig$c((RoomUserItem)iterator10.next(), (RoomUserItem)null, b4, false, false, 26));
                    }
                    o6 = or4.X1((Collection)u2, (Iterable)list14);
                }
                else {
                    o6 = v2a.C0;
                }
                final ArrayList list15 = new ArrayList(kr4.h1((Iterable)o, 10));
                final Iterator<Object> iterator11 = (Iterator<Object>)((Iterable<RoomUserItem>)o).iterator();
                while (iterator11.hasNext()) {
                    list15.add((Object)iterator11.next().getTwitterUserId());
                }
                final ArrayList<RoomUserItem> list16 = new ArrayList<RoomUserItem>();
                for (final RoomUserItem next6 : e) {
                    if (!list15.contains(next6.getTwitterUserId())) {
                        list16.add(next6);
                    }
                }
                final Collection collection = (Collection)b7m.C0;
                final ArrayList list17 = new ArrayList<hig$c>(kr4.h1((Iterable)list12, 10));
                final Iterator iterator13 = list12.iterator();
                while (iterator13.hasNext()) {
                    list17.add(new hig$c((RoomUserItem)iterator13.next(), (RoomUserItem)null, false, true, false, 22));
                }
                final List x1 = or4.X1(collection, (Iterable)list17);
                b7m.C0 = x1;
                final ArrayList list18 = new ArrayList<hig$c>(kr4.h1((Iterable)list16, 10));
                final Iterator<RoomUserItem> iterator14 = list16.iterator();
                while (iterator14.hasNext()) {
                    list18.add(new hig$c((RoomUserItem)iterator14.next(), (RoomUserItem)null, false, true, false, 22));
                }
                b7m.C0 = or4.X1((Collection)x1, (Iterable)list18);
                Object c7;
                if (c0.contains(d4)) {
                    final List x2 = or4.X1((Collection)tdy.u0((Object)new hig$b(2131958428, Integer.valueOf(size), Integer.valueOf(n2), 8)), (Iterable)b7m.C0);
                    b7m.C0 = x2;
                    if (b4 && b2) {
                        b7m.C0 = or4.Y1((Collection)x2, (Object)new hig$a());
                    }
                    c7 = b7m.C0;
                }
                else {
                    c7 = v2a.C0;
                }
                b7m.C0 = c7;
                if (oio.p()) {
                    roomManageSpeakersViewModel.Q((rtb)new zpn((List)o3, (List)o4, b7m, (List)o5, (List)o6, n));
                }
                else {
                    roomManageSpeakersViewModel.Q((rtb)new aqn((List)o3, b7m, (List)o5, (List)o6));
                }
            }
        }
    }
    
    public final List<hig> Y(final List<RoomUserItem> list, final List<RoomUserItem> list2, final boolean b, final int n) {
        final hio c0 = hio.C0;
        final ArrayList list3 = new ArrayList();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final RoomUserItem next : list) {
            final hio userStatus = next.getUserStatus();
            Object value;
            if ((value = linkedHashMap.get(userStatus)) == null) {
                value = new ArrayList<RoomUserItem>();
                linkedHashMap.put(userStatus, value);
            }
            ((List<RoomUserItem>)value).add(next);
        }
        final List list4 = linkedHashMap.get(c0);
        boolean b2 = true;
        Object c2;
        if (list4 != null) {
            final ArrayList<RoomUserItem> list5 = new ArrayList<RoomUserItem>();
            final Iterator iterator2 = list4.iterator();
            while (true) {
                c2 = list5;
                if (!iterator2.hasNext()) {
                    break;
                }
                final Object next2 = iterator2.next();
                if (!(((RoomUserItem)next2).isPrimaryAdmin() ^ true)) {
                    continue;
                }
                list5.add((RoomUserItem)next2);
            }
        }
        else {
            c2 = v2a.C0;
        }
        final ArrayList list6 = new ArrayList<hig$c>(kr4.h1((Iterable)c2, 10));
        final Iterator iterator3 = ((Iterable)c2).iterator();
        while (iterator3.hasNext()) {
            list6.add(new hig$c((RoomUserItem)iterator3.next(), (RoomUserItem)null, false, false, false, 30));
        }
        final int size = list6.size();
        Integer value2;
        if (b) {
            value2 = n;
        }
        else {
            value2 = null;
        }
        list3.add(new hig$b(2131958419, Integer.valueOf(size), value2, 8));
        list3.addAll(list6);
        ArrayList list12;
        if (b) {
            final ArrayList<RoomUserItem> list7 = new ArrayList<RoomUserItem>();
            for (final RoomUserItem next3 : list) {
                if (next3.isInvitedToCohost()) {
                    list7.add(next3);
                }
            }
            final ArrayList list8 = new ArrayList(kr4.h1((Iterable)list7, 10));
            final Iterator<RoomUserItem> iterator5 = list7.iterator();
            while (iterator5.hasNext()) {
                list8.add((Object)iterator5.next().getTwitterUserId());
            }
            final ArrayList<RoomUserItem> list9 = new ArrayList<RoomUserItem>();
            for (final RoomUserItem next4 : list2) {
                if (!list8.contains(next4.getTwitterUserId())) {
                    list9.add(next4);
                }
            }
            final List x1 = or4.X1((Collection)list7, (Iterable)list9);
            final ArrayList list10 = new ArrayList<hig$c>(kr4.h1((Iterable)x1, 10));
            final Iterator iterator7 = ((ArrayList)x1).iterator();
            final ArrayList list11 = list3;
            while (iterator7.hasNext()) {
                final RoomUserItem roomUserItem = (RoomUserItem)iterator7.next();
                list10.add(new hig$c(RoomUserItem.copy$default(roomUserItem, (String)null, (String)null, (String)null, false, (String)null, c0, false, false, false, (String)null, (String)null, (Boolean)null, (Boolean)null, false, (RaisedHand)null, true, false, false, false, (Integer)null, (AudioSpaceCommunityRoleType)null, 2064351, (Object)null), roomUserItem, false, false, false, 28));
            }
            list11.addAll(list10);
            if (n <= 0) {
                b2 = false;
            }
            list12 = list11;
            if (b2) {
                list11.add(new hig$a(n));
                list12 = list11;
            }
        }
        else {
            list12 = list3;
        }
        return list12;
    }
    
    public final iyh<rpn> v() {
        return (iyh<rpn>)this.V0.a((soe)RoomManageSpeakersViewModel.W0[0]);
    }
}
