// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.profile;

public final class y implements osc$a<b22>
{
    public final RoomProfileViewModel F0;
    public final long G0;
    
    public y(final RoomProfileViewModel f0, final long g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void a(final aw0 aw0) {
    }
    
    public final void b(final aw0 aw0) {
        if (((osc)aw0).T().b) {
            this.F0.Y0.b(this.G0);
            oko.G(this.F0.V0, "user_profile", "actions", "block", "click", (ufv)null, 48);
        }
    }
    
    public final void c(final aw0 aw0, final boolean b) {
    }
}
