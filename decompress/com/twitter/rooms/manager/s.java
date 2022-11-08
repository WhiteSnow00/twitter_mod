// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import com.twitter.rooms.di.room.RoomObjectGraph;

public final class s extends gue implements rtb<RoomObjectGraph, oyv>
{
    public final /* synthetic */ gqn C0;
    public final /* synthetic */ Set<RoomUserItem> D0;
    public final /* synthetic */ Set<RoomUserItem> E0;
    public final /* synthetic */ Set<RoomUserItem> F0;
    public final /* synthetic */ Set<RoomUserItem> G0;
    public final /* synthetic */ RoomStateManager H0;
    
    public s(final gqn c0, final Set<RoomUserItem> d0, final Set<RoomUserItem> e0, final Set<RoomUserItem> f0, final Set<RoomUserItem> g0, final RoomStateManager h0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        zzd.f((Object)roomObjectGraph, "$this$withCurrentRoom");
        final boolean b = this.C0.d == qh6.C0;
        final boolean empty = ymp.Y(ymp.a0((Set)this.D0, (Iterable)this.E0), (Iterable)ymp.a0((Set)this.F0, (Iterable)this.G0)).isEmpty();
        if (b && (empty ^ true)) {
            final j7o s3 = roomObjectGraph.s3();
            if (!((hr0)s3.c).e()) {
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
                    s3.g.c(b5j.timer(20L, TimeUnit.MINUTES).subscribe((fk6)new ccj((rtb)new k7o(s3), 12)));
                }
            }
        }
        final Set y = ymp.Y((Set)this.D0, (Iterable)this.F0);
        final xqn r1 = this.H0.r1;
        Objects.requireNonNull(r1);
        r1.a.onNext((Object)y);
        return oyv.a;
    }
}
