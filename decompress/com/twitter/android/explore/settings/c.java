// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$1$3", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ExploreSettingsViewModel C0;
    
    public c(final ExploreSettingsViewModel c0, final ap6<? super c> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new c(this.C0, (ap6<? super c>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ExploreSettingsViewModel c0 = this.C0;
        final c$a c2 = c$a.C0;
        final soe[] p = ExploreSettingsViewModel.P0;
        ((MviViewModel)c0).Q((rtb)c2);
        ((MviViewModel)this.C0).V((Object)v3q.a);
        return oyv.a;
    }
}
