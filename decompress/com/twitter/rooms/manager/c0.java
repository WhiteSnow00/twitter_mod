// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import tv.periscope.model.b;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import com.twitter.weaver.mvi.MviViewModel;
import tv.periscope.android.api.Invitee;
import java.util.List;
import java.util.ArrayList;
import com.twitter.rooms.di.room.RoomObjectGraph;

public final class c0 extends ste implements qsb<vqn, fzv>
{
    public final RoomObjectGraph D0;
    public final RoomStateManager E0;
    
    public c0(final RoomObjectGraph d0, final RoomStateManager e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "state");
        if (vqn.k.isEmpty() ^ true) {
            if (vqn.P.b) {
                final qan h0 = this.D0.h0();
                final Set<uon> k = vqn.k;
                final ArrayList list = new ArrayList<String>(iq4.H((Iterable)k, 10));
                final Iterator<Object> iterator = k.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().a);
                }
                h0.s((List<String>)list);
            }
            else {
                final String h2 = hmg.h("https://twitter.com/i/spaces/", vqn.b);
                final RoomStateManager e0 = this.E0;
                final bfv q0 = e0.Q0;
                final String j = da8.j(e0.O0.getString(2131953308), " ", h2);
                final Set<uon> i = vqn.k;
                final ArrayList list2 = new ArrayList<Invitee>(iq4.H((Iterable)i, 10));
                final Iterator<Object> iterator2 = i.iterator();
                while (iterator2.hasNext()) {
                    list2.add(new Invitee(iterator2.next().a, (String)null, (String)null, 0L, (String)null, false, 62, (rf8)null));
                }
                MviViewModel.N((MviViewModel)e0, q0.a(j, (List)list2), (String)null, (jrx)null, (ftb)new a0(this.D0, vqn, (go6)null), 3, (Object)null);
            }
        }
        final qon c6 = this.D0.C6();
        final String b = vqn.b;
        if (b == null) {
            throw new IllegalStateException("Expected a not null roomId to startUploadLogs".toString());
        }
        Objects.requireNonNull(c6);
        final String h3 = c6.b.h();
        if (okr.b((CharSequence)b) && h3 != null && h3.length() != 0) {
            c6.d.a(h5j.interval(30L, 30L, TimeUnit.SECONDS).subscribeOn(owo.c()).subscribe((lj6)new ewi((qsb)new ron(c6, b, h3), 20)));
        }
        final a8n w4 = this.D0.w4();
        final b e2 = vqn.e;
        if (e2 == null) {
            throw new IllegalStateException("Expected a not null broadcast".toString());
        }
        final qt3 l = vqn.i;
        if (l != null) {
            w4.b(e2, l);
            MviViewModel.M((MviViewModel)this.E0, (h5j)this.D0.w4().H0.O0, (String)null, (jrx)null, (ftb)new b0(this.E0, (go6)null), 3, (Object)null);
            final String b2 = vqn.b;
            if (b2 != null) {
                this.E0.C0(b2);
            }
            final RoomStateManager e3 = this.E0;
            final gio e4 = e3.e1;
            final String id = e3.U0.q().id;
            czd.e((Object)id, "userCache.currentUser.id");
            e4.a((gio$a)new gio$a$e(true, id, vqn.b, vqn.i));
            return fzv.a;
        }
        throw new IllegalStateException("Expected a not null chatAccess".toString());
    }
}
