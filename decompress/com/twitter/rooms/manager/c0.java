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

public final class c0 extends gue implements rtb<gqn, oyv>
{
    public final /* synthetic */ RoomObjectGraph C0;
    public final /* synthetic */ RoomStateManager D0;
    
    public c0(final RoomObjectGraph c0, final RoomStateManager d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "state");
        if (gqn.k.isEmpty() ^ true) {
            if (gqn.P.b) {
                final ban h0 = this.C0.h0();
                final Set<hon> k = gqn.k;
                final ArrayList list = new ArrayList<String>(kr4.h1((Iterable)k, 10));
                final Iterator<Object> iterator = k.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().a);
                }
                h0.t((List)list);
            }
            else {
                final String c = l7k.c("https://twitter.com/i/spaces/", gqn.b);
                final RoomStateManager d0 = this.D0;
                final gev p = d0.P0;
                final String y = zi.y(d0.N0.getString(2131953308), " ", c);
                final Set<hon> i = gqn.k;
                final ArrayList list2 = new ArrayList<Invitee>(kr4.h1((Iterable)i, 10));
                final Iterator<Object> iterator2 = i.iterator();
                while (iterator2.hasNext()) {
                    list2.add(new Invitee(iterator2.next().a, (String)null, (String)null, 0L, (String)null, false, 62, (hg8)null));
                }
                MviViewModel.N((MviViewModel)d0, (n9q)p.a(y, (List<Invitee>)list2), (String)null, (qqx)null, (gub)new a0(this.C0, gqn, (ap6)null), 3, (Object)null);
            }
        }
        final don c2 = this.C0.C6();
        final String b = gqn.b;
        if (b == null) {
            throw new IllegalStateException("Expected a not null roomId to startUploadLogs".toString());
        }
        Objects.requireNonNull(c2);
        final String h2 = c2.b.h();
        if (vjr.b((CharSequence)b) && h2 != null && h2.length() != 0) {
            c2.d.a(b5j.interval(30L, 30L, TimeUnit.SECONDS).subscribeOn(yvo.c()).subscribe((fk6)new zgw((rtb)new eon(c2, b, h2), 11)));
        }
        final l7n w4 = this.C0.w4();
        final b e = gqn.e;
        if (e == null) {
            throw new IllegalStateException("Expected a not null broadcast".toString());
        }
        final iu3 j = gqn.i;
        if (j != null) {
            w4.b(e, j);
            MviViewModel.M((MviViewModel)this.D0, (b5j)this.C0.w4().G0.N0, (String)null, (qqx)null, (gub)new b0(this.D0, (ap6)null), 3, (Object)null);
            final String b2 = gqn.b;
            if (b2 != null) {
                this.D0.C0(b2);
            }
            final RoomStateManager d2 = this.D0;
            final rho d3 = d2.d1;
            final String id = d2.T0.q().id;
            zzd.e((Object)id, "userCache.currentUser.id");
            d3.a((rho$a)new rho$a$e(true, id, gqn.b, gqn.i));
            return oyv.a;
        }
        throw new IllegalStateException("Expected a not null chatAccess".toString());
    }
}
