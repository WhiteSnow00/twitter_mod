// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$1$1", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<wla, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ExploreSettingsViewModel D0;
    
    public a(final ExploreSettingsViewModel d0, final ap6<? super a> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final a a = new a(this.D0, (ap6<? super a>)ap6);
        a.C0 = c0;
        return (ap6<oyv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (ap6<?>)o2);
        final oyv a2 = oyv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final wla wla = (wla)this.C0;
        final ExploreSettingsViewModel d0 = this.D0;
        final a$a a$a = new a$a(d0, wla);
        final soe[] p = ExploreSettingsViewModel.P0;
        ((MviViewModel)d0).Q((rtb)a$a);
        return oyv.a;
    }
}
