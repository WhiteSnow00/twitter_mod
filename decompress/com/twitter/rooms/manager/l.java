// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

public final class l extends ste implements qsb<p01, lcq<? extends p01>>
{
    public final RoomStateManager D0;
    
    public l(final RoomStateManager d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final p01 p = (p01)o;
        czd.f((Object)p, "audioSpace");
        if (!djo.u()) {
            final String z = p.c.Z;
            if (z != null) {
                return this.D0.y1.I(z).p((psb)new g0i((qsb)new k(p), 16));
            }
        }
        return eaq.v((Object)p);
    }
}
