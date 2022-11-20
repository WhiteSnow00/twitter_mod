// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.revenue.di;

import android.webkit.WebViewClient;
import android.app.Activity;
import android.view.View;

public final class a extends ste implements qsb<View, ilx<? super xp2, wp2, vp2>>
{
    public final Activity D0;
    public final vn E0;
    public final WebViewClient F0;
    public final fnx G0;
    public final rbm<ukk.a> H0;
    public final nx9 I0;
    public final xba<of1> J0;
    
    public a(final Activity d0, final vn e0, final WebViewClient f0, final fnx g0, final rbm<ukk.a> h0, final nx9 i0, final xba<of1> j0) {
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
        return new hkk(view, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0);
    }
}
