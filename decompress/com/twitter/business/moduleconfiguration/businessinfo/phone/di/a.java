// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone.di;

import android.view.View;

public final class a extends pue implements stb<View, xlx<? super b43, w23, u23>>
{
    public final k03 F0;
    public final e03 G0;
    public final fda<h5h> H0;
    public final nn I0;
    public final x23 J0;
    public final t23 K0;
    public final lv2 L0;
    public final a23 M0;
    
    public a(final k03 f0, final e03 g0, final fda<h5h> h0, final nn i0, final x23 j0, final t23 k0, final lv2 l0, final a23 m0) {
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
        return new f33(view, this.F0, this.G0, (fda)this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, zrm.Companion.b(view));
    }
}
