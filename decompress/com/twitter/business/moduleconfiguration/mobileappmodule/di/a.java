// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule.di;

import android.view.View;

public final class a extends pue implements stb<View, xlx<? super cfh, wdh, sdh>>
{
    public final zrm F0;
    public final sfh G0;
    public final nn H0;
    public final xdh I0;
    public final odh J0;
    public final rdh K0;
    public final fda<h5h> L0;
    public final znl<wdh> M0;
    public final tdh N0;
    public final wta O0;
    public final ov2 P0;
    
    public a(final zrm f0, final sfh g0, final nn h0, final xdh i0, final odh j0, final rdh k0, final fda<h5h> l0, final znl<wdh> m0, final tdh n0, final wta o0, final ov2 p11) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p11;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        e0e.f((Object)view, "it");
        return new ydh(view, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, (fda)this.L0, (t5j)this.M0, this.N0, this.O0, this.P0);
    }
}
