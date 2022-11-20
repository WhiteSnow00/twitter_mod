// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$switchGuestType$2$1$1", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class g0 extends p0s implements ftb<GuestServiceJoinResponse, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    public final int F0;
    public final boolean G0;
    public final String H0;
    
    public g0(final RoomStateManager e0, final int f0, final boolean g0, final String h0, final go6<? super g0> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final g0 g0 = new g0(this.E0, this.F0, this.G0, this.H0, (go6<? super g0>)go6);
        g0.D0 = d0;
        return (go6<fzv>)g0;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g0 g0 = (g0)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        g0.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final GuestServiceJoinResponse guestServiceJoinResponse = (GuestServiceJoinResponse)this.D0;
        final RoomStateManager e0 = this.E0;
        final int f0 = this.F0;
        final StringBuilder sb = new StringBuilder();
        sb.append("switchGuestType::joinAudioSpace ");
        sb.append(f0);
        sb.append(" ");
        sb.append(guestServiceJoinResponse);
        final String string = sb.toString();
        final RoomStateManager$k0 companion = RoomStateManager.Companion;
        e0.s0(string);
        if (this.G0) {
            if (!guestServiceJoinResponse.getCanJoinAsSpeaker()) {
                vjo.G(this.E0.b1, "periscope", "guest", "automatically_join", "fallback", null, 48);
            }
            else {
                vjo.G(this.E0.b1, "periscope", "guest", "automatically_join", "success", null, 48);
            }
        }
        RoomStateManager.a0(this.E0, this.H0, guestServiceJoinResponse.getCanJoinAsSpeaker(), this.G0, guestServiceJoinResponse.getSessionUuid());
        return fzv.a;
    }
}
