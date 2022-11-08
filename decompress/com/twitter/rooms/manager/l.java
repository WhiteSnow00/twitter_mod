// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

public final class l extends gue implements rtb<t01, ubq<? extends t01>>
{
    public final /* synthetic */ RoomStateManager C0;
    
    public l(final RoomStateManager c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t01 t01 = (t01)o;
        zzd.f((Object)t01, "audioSpace");
        if (!oio.u()) {
            final String z = t01.c.Z;
            if (z != null) {
                return this.C0.x1.I(z).p((qtb)new uii((rtb)new k(t01), 18));
            }
        }
        return n9q.v((Object)t01);
    }
}
