// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.dm_invites.di;

import android.view.View;

public final class a extends ste implements qsb<View, ilx<? super vdn, fdn, cdn>>
{
    public final ul1 D0;
    public final h3e<yon> E0;
    public final d39 F0;
    public final q3e<yon> G0;
    public final gfo H0;
    public final mjo I0;
    public final nnl<fdn> J0;
    
    public a(final ul1 d0, final h3e<yon> e0, final d39 f0, final q3e<yon> g0, final gfo h0, final mjo i0, final nnl<fdn> j0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "it");
        return new gdn(view, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0);
    }
}
