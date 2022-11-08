// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

public final class m extends gue implements rtb<snj<iu3>, gvj<? extends t01, ? extends snj<iu3>>>
{
    public final /* synthetic */ RoomStateManager C0;
    public final /* synthetic */ t01 D0;
    
    public m(final RoomStateManager c0, final t01 d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final snj snj = (snj)o;
        zzd.f((Object)snj, "it");
        final RoomStateManager c0 = this.C0;
        final t01 d0 = this.D0;
        final StringBuilder sb = new StringBuilder();
        sb.append("getAudioSpace ");
        sb.append(d0);
        final String string = sb.toString();
        final RoomStateManager.k0 companion = RoomStateManager.Companion;
        c0.s0(string);
        return new gvj((Object)this.D0, (Object)snj);
    }
}
