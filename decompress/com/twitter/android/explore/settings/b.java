// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$1$2", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ ExploreSettingsViewModel C0;
    
    public b(final ExploreSettingsViewModel c0, final ap6<? super b> ap6) {
        this.C0 = c0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new b(this.C0, (ap6<? super b>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final b b = (b)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ExploreSettingsViewModel c0 = this.C0;
        final b$a c2 = b$a.C0;
        final soe[] p = ExploreSettingsViewModel.P0;
        ((MviViewModel)c0).Q((rtb)c2);
        return oyv.a;
    }
}
