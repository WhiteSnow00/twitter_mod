// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.concurrent.Callable;
import java.util.Objects;
import com.twitter.rooms.di.room.RoomObjectGraph;

public final class n extends ste implements qsb<p01, lcq<? extends lvj<? extends p01, ? extends ynj<qt3>>>>
{
    public final RoomStateManager D0;
    public final String E0;
    public final vqn F0;
    public final RoomObjectGraph G0;
    
    public n(final RoomStateManager d0, final String e0, final vqn f0, final RoomObjectGraph g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final p01 p = (p01)o;
        czd.f((Object)p, "audioSpace");
        if (djo.u()) {
            final RoomStateManager d0 = this.D0;
            final String e0 = this.E0;
            final t21 b = p.b;
            czd.c((Object)b);
            d0.n0(e0, b);
        }
        final vqn f0 = this.F0;
        final qt3 i = f0.i;
        final String j = f0.j;
        eaq eaq;
        if (i != null && j != null) {
            eaq = eaq.v((Object)new ynj((Object)i));
        }
        else {
            final RoomStateManager d2 = this.D0;
            final RoomObjectGraph g0 = this.G0;
            final String e2 = this.E0;
            final String e3 = p.c.e;
            final boolean n = blz.N(f0);
            Objects.requireNonNull(d2);
            czd.f((Object)g0, "withCurrentRoom");
            czd.f((Object)e2, "roomId");
            czd.f((Object)e3, "mediaKey");
            final y7n r3 = g0.r3();
            Objects.requireNonNull(r3);
            eaq = eaq.t((Callable)new u7n(e2, e3, n, r3)).I(owo.c()).p((psb)new hvl((qsb)new v9o(d2, g0, e2), 14));
        }
        return eaq.w((psb)new vt1((qsb)new m(this.D0, p), 11));
    }
}
