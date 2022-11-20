// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import com.twitter.rooms.di.room.RoomObjectGraph;

public final class s extends ste implements qsb<RoomObjectGraph, fzv>
{
    public final vqn D0;
    public final Set<RoomUserItem> E0;
    public final Set<RoomUserItem> F0;
    public final Set<RoomUserItem> G0;
    public final Set<RoomUserItem> H0;
    public final RoomStateManager I0;
    
    public s(final vqn d0, final Set<RoomUserItem> e0, final Set<RoomUserItem> f0, final Set<RoomUserItem> g0, final Set<RoomUserItem> h0, final RoomStateManager i0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        czd.f((Object)roomObjectGraph, "$this$withCurrentRoom");
        final boolean b = this.D0.d == wg6.D0;
        final boolean empty = onp.Y0(onp.a1((Set)this.E0, (Iterable)this.F0), (Iterable)onp.a1((Set)this.G0, (Iterable)this.H0)).isEmpty();
        if (b && (empty ^ true)) {
            final y7o s3 = roomObjectGraph.s3();
            if (!((ar0)s3.c).e()) {
                if (!s3.f.hasNext()) {
                    s3.f = s3.e.iterator();
                }
                s3.a((String)s3.f.next(), true);
            }
            else if (!s3.g.b()) {
                if (s3.f.hasNext()) {
                    s3.a((String)s3.f.next(), true);
                }
                else {
                    s3.g.c(h5j.timer(20L, TimeUnit.MINUTES).subscribe((lj6)new qsq((qsb)new z7o(s3), 5)));
                }
            }
        }
        final Set y0 = onp.Y0((Set)this.E0, (Iterable)this.G0);
        final mrn s4 = this.I0.s1;
        Objects.requireNonNull(s4);
        s4.a.onNext((Object)y0);
        return fzv.a;
    }
}
