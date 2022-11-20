// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.profile;

public final class y implements orc$a<t12>
{
    public final RoomProfileViewModel D0;
    public final long E0;
    
    public y(final RoomProfileViewModel d0, final long e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void a(final wv0 wv0) {
    }
    
    public final void b(final wv0 wv0) {
        if (((orc)wv0).T().b) {
            this.D0.W0.b(this.E0);
            vjo.G(this.D0.T0, "user_profile", "actions", "block", "click", null, 48);
        }
    }
    
    public final void c(final wv0 wv0, final boolean b) {
    }
}
