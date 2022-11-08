// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$intents$2$1", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends xzr implements gub<e3w, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ExploreSettingsViewModel D0;
    
    public d(final ExploreSettingsViewModel d0, final ap6<? super d> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final d d = new d(this.D0, (ap6<? super d>)ap6);
        d.C0 = c0;
        return (ap6<oyv>)d;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final e3w e3w = (e3w)this.C0;
        final ExploreSettingsViewModel d0 = this.D0;
        final d$a d$a = new d$a(d0, e3w);
        final soe[] p = ExploreSettingsViewModel.P0;
        ((MviViewModel)d0).T((rtb)d$a);
        return oyv.a;
    }
}
