// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$intents$2$2", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends xzr implements gub<w2w, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ExploreSettingsViewModel D0;
    
    public e(final ExploreSettingsViewModel d0, final ap6<? super e> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final e e = new e(this.D0, (ap6<? super e>)ap6);
        e.C0 = c0;
        return (ap6<oyv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final w2w w2w = (w2w)this.C0;
        final ExploreSettingsViewModel d0 = this.D0;
        final e$a e$a = new e$a(d0, w2w);
        final soe[] p = ExploreSettingsViewModel.P0;
        ((MviViewModel)d0).T((rtb)e$a);
        return oyv.a;
    }
}
