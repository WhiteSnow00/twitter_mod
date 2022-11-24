// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.unifiedlanding.topic.plugin.implementation.header.di;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;

public final class a extends pue implements stb<View, xlx<? super nxp, n5h, dup>>
{
    public final ww8 F0;
    public final Resources G0;
    public final Activity H0;
    public final fci<?> I0;
    public final kr7 J0;
    public final igd K0;
    public final v5h L0;
    public final jaq M0;
    public final ztp N0;
    public final zxp O0;
    
    public a(final ww8 f0, final Resources g0, final Activity h0, final fci<?> i0, final kr7 j0, final igd k0, final v5h l0, final jaq m0, final ztp n0, final zxp o0) {
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
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "it");
        return new kaq(this.F0, this.G0, this.H0, (fci)this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0);
    }
}
