// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.Collection;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;
import tv.periscope.model.NarrowcastSpaceType$None;
import java.util.List;
import java.util.Objects;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

@sa8(c = "com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel$fetchAudioSpace$2$1", f = "RoomConsumptionPreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<x3u<? extends GuestServiceJoinResponse, ? extends p01, ? extends t21>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomConsumptionPreviewViewModel E0;
    public final String F0;
    
    public e(final RoomConsumptionPreviewViewModel e0, final String f0, final go6<? super e> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final e e = new e(this.E0, this.F0, (go6<? super e>)go6);
        e.D0 = d0;
        return (go6<fzv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final x3u x3u = (x3u)this.D0;
        final GuestServiceJoinResponse guestServiceJoinResponse = (GuestServiceJoinResponse)x3u.D0;
        final p01 p = (p01)x3u.E0;
        final t21 t21 = (t21)x3u.F0;
        final gps w = ii8.W(p.c);
        final String x = p.c.x;
        final List<s21> a = t21.a;
        final String f0 = this.F0;
        final ArrayList list = new ArrayList<RoomUserItem>(iq4.H((Iterable)a, 10));
        for (final s21 s21 : a) {
            list.add(fli.I0(s21, wio.D0, (Set)p2a.D0, f0, czd.a((Object)s21.a, (Object)x)));
        }
        final List<s21> b = t21.b;
        final String f2 = this.F0;
        final ArrayList list2 = new ArrayList<RoomUserItem>(iq4.H((Iterable)b, 10));
        final Iterator<Object> iterator2 = b.iterator();
        while (iterator2.hasNext()) {
            list2.add(fli.J0((s21)iterator2.next(), wio.E0, (Set)p2a.D0, f2, false, 8));
        }
        final RoomConsumptionPreviewViewModel e0 = this.E0;
        final ArrayList list3 = new ArrayList();
        final Iterator<RoomUserItem> iterator3 = list2.iterator();
        while (true) {
            final boolean hasNext = iterator3.hasNext();
            boolean b2 = true;
            if (!hasNext) {
                break;
            }
            final RoomUserItem next = iterator3.next();
            if (next.getTwitterUserIdLong() == e0.b1.k().getId()) {
                b2 = false;
            }
            if (!b2) {
                continue;
            }
            list3.add(next);
        }
        final List<s21> c = t21.c;
        final String f3 = this.F0;
        final ArrayList list4 = new ArrayList<RoomUserItem>(iq4.H((Iterable)c, 10));
        final Iterator<Object> iterator4 = c.iterator();
        while (iterator4.hasNext()) {
            list4.add(fli.J0((s21)iterator4.next(), wio.H0, (Set)p2a.D0, f3, false, 8));
        }
        final RoomConsumptionPreviewViewModel e2 = this.E0;
        final ArrayList list5 = new ArrayList();
        for (final RoomUserItem next2 : list4) {
            if (next2.getTwitterUserIdLong() != e2.b1.k().getId()) {
                list5.add(next2);
            }
        }
        final boolean b3 = guestServiceJoinResponse.getCanJoinAsSpeaker() && list3.size() < djo.d();
        final int b4 = t21.b();
        while (true) {
            for (final RoomUserItem next3 : list) {
                if (next3.isPrimaryAdmin()) {
                    final RoomUserItem roomUserItem = next3;
                    final vjo u0 = this.E0.U0;
                    String twitterUserId;
                    if (roomUserItem != null) {
                        twitterUserId = roomUserItem.getTwitterUserId();
                    }
                    else {
                        twitterUserId = null;
                    }
                    String periscopeUserId;
                    if (roomUserItem != null) {
                        periscopeUserId = roomUserItem.getPeriscopeUserId();
                    }
                    else {
                        periscopeUserId = null;
                    }
                    u0.e = twitterUserId;
                    u0.f = periscopeUserId;
                    final vjo u2 = this.E0.U0;
                    final r21 c2 = p.c;
                    if (c2.k == null) {
                        u2.g = "adhoc";
                    }
                    else {
                        u2.g = "scheduled";
                    }
                    u2.g0(c2.J);
                    Object o2;
                    if (djo.K()) {
                        o2 = p.c.H;
                    }
                    else {
                        o2 = f2a.D0;
                    }
                    if (((Collection)o2).isEmpty() ^ true) {
                        final vjo u3 = this.E0.U0;
                        final ArrayList list6 = new ArrayList<String>(iq4.H((Iterable)o2, 10));
                        final Iterator iterator7 = ((Iterable)o2).iterator();
                        while (iterator7.hasNext()) {
                            list6.add(((AudioSpaceTopicItem)iterator7.next()).getTopicId());
                        }
                        final Set r0 = mq4.R0((Iterable)list6);
                        Objects.requireNonNull(u3);
                        final ArrayList list7 = new ArrayList<gfv>(iq4.H((Iterable)r0, 10));
                        for (final String s22 : r0) {
                            final gfv gfv = new gfv();
                            gfv.a = Long.parseLong(s22);
                            gfv.c = 36;
                            list7.add(gfv);
                        }
                        vjo.H(u3, "audiospace", "preview", "topics", "", "impression", null, null, null, list7, null, null, null, false, null, null, null, null, null, null, 524000);
                    }
                    Object o3;
                    if (asa.b().b("super_follow_space_consumption_enabled", false)) {
                        o3 = p.c.T;
                    }
                    else {
                        o3 = NarrowcastSpaceType$None.INSTANCE;
                    }
                    if (czd.a(o3, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE)) {
                        final RoomConsumptionPreviewViewModel e3 = this.E0;
                        final nrn r2 = e3.R0;
                        final Set a2 = e3.c1.a(mq4.R0((Iterable)list), (c22)null);
                        final int size = ((ArrayList)mq4.x0((Collection)mq4.x0((Collection)list, (Iterable)list3), (Iterable)list5)).size();
                        Objects.requireNonNull(r2);
                        r2.a.onNext((Object)new bki(a2, size));
                    }
                    this.E0.U0.f0((NarrowcastSpaceType)o3);
                    final RoomConsumptionPreviewViewModel e4 = this.E0;
                    ((MviViewModel)e4).Q((qsb)new e$a(b3, e4, (List)list, (List)list3, (List)list5, p, w, (NarrowcastSpaceType)o3, roomUserItem, b4, x, (List)o2));
                    final RoomConsumptionPreviewViewModel e5 = this.E0;
                    ((MviViewModel)e5).T((qsb)new e$b(e5, this.F0, p));
                    return fzv.a;
                }
            }
            RoomUserItem next3 = null;
            continue;
        }
    }
}
