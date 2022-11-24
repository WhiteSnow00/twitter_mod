// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address.di;

import android.view.View;

public final class a extends pue implements stb<View, xlx<? super cv2, cu2, zt2>>
{
    public final a23 F0;
    public final k03 G0;
    public final e03 H0;
    public final fda<h5h> I0;
    public final nn J0;
    public final du2 K0;
    public final lv2 L0;
    public final yt2 M0;
    
    public a(final a23 f0, final k03 g0, final e03 h0, final fda<h5h> i0, final nn j0, final du2 k0, final lv2 l0, final yt2 m0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        e0e.f((Object)view, "it");
        return new nu2(view, this.F0, this.G0, this.H0, (fda)this.I0, this.J0, this.K0, this.L0, this.M0);
    }
}
