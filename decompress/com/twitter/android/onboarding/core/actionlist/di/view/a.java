// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.actionlist.di.view;

import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.view.View;

public final class a extends pue implements stb<View, xlx<? super xk, uk, hk>>
{
    public final j4e<kk> F0;
    public final NavigationHandler G0;
    public final lf1 H0;
    public final bur I0;
    public final OcfEventReporter J0;
    public final jk K0;
    
    public a(final j4e<kk> f0, final NavigationHandler g0, final lf1 h0, final bur i0, final OcfEventReporter j0, final jk k0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        e0e.f((Object)view, "rootView");
        return new vk(view, (j4e)this.F0, this.G0, this.H0, this.I0, this.J0, this.K0);
    }
}
