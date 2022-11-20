// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

public final class m extends ste implements qsb<ynj<qt3>, lvj<? extends p01, ? extends ynj<qt3>>>
{
    public final RoomStateManager D0;
    public final p01 E0;
    
    public m(final RoomStateManager d0, final p01 e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ynj ynj = (ynj)o;
        czd.f((Object)ynj, "it");
        final RoomStateManager d0 = this.D0;
        final p01 e0 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("getAudioSpace ");
        sb.append(e0);
        final String string = sb.toString();
        final RoomStateManager$k0 companion = RoomStateManager.Companion;
        d0.s0(string);
        return new lvj((Object)this.E0, (Object)ynj);
    }
}
