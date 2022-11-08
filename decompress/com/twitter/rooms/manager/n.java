// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.concurrent.Callable;
import java.util.Objects;
import com.twitter.rooms.di.room.RoomObjectGraph;

public final class n extends gue implements rtb<t01, ubq<? extends gvj<? extends t01, ? extends snj<iu3>>>>
{
    public final /* synthetic */ RoomStateManager C0;
    public final /* synthetic */ String D0;
    public final /* synthetic */ gqn E0;
    public final /* synthetic */ RoomObjectGraph F0;
    
    public n(final RoomStateManager c0, final String d0, final gqn e0, final RoomObjectGraph f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t01 t01 = (t01)o;
        zzd.f((Object)t01, "audioSpace");
        if (oio.u()) {
            final RoomStateManager c0 = this.C0;
            final String d0 = this.D0;
            final x21 b = t01.b;
            zzd.c((Object)b);
            c0.n0(d0, b);
        }
        final gqn e0 = this.E0;
        final iu3 i = e0.i;
        final String j = e0.j;
        n9q n9q;
        if (i != null && j != null) {
            n9q = n9q.v((Object)new snj((Object)i));
        }
        else {
            final RoomStateManager c2 = this.C0;
            final RoomObjectGraph f0 = this.F0;
            final String d2 = this.D0;
            final String e2 = t01.c.e;
            final boolean n0 = tdy.n0(e0);
            Objects.requireNonNull(c2);
            zzd.f((Object)f0, "withCurrentRoom");
            zzd.f((Object)d2, "roomId");
            zzd.f((Object)e2, "mediaKey");
            final j7n r3 = f0.r3();
            Objects.requireNonNull(r3);
            n9q = n9q.t((Callable)new f7n(d2, e2, n0, r3)).I(yvo.c()).p((qtb)new jhb((rtb)new g9o(c2, f0, d2), 14));
        }
        return n9q.w((qtb)new i5i((rtb)new m(this.C0, t01), 16));
    }
}
