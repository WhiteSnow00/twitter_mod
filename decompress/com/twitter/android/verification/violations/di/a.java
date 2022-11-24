// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.violations.di;

import android.view.View;

public final class a extends pue implements stb<View, xlx>
{
    public final pe6 F0;
    public final pe6 G0;
    public final zrm H0;
    public final ex8 I0;
    public final i9t J0;
    public final kcm K0;
    public final k9x L0;
    
    public a(final pe6 f0, final pe6 g0, final zrm h0, final ex8 i0, final i9t j0, final kcm k0, final k9x l0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        e0e.f((Object)view, "view");
        return new hsw(view, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0);
    }
}
