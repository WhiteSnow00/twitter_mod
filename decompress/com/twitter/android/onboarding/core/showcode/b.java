// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.showcode;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.onboarding.core.showcode.ShowCodeViewModel$intents$2$2", f = "ShowCodeViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<f3q.a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ShowCodeViewModel C0;
    
    public b(final ShowCodeViewModel c0, final ap6<? super b> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new b(this.C0, (ap6<? super b>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ShowCodeViewModel c0 = this.C0;
        final d3q$a a = d3q$a.a;
        final soe[] o2 = ShowCodeViewModel.O0;
        ((MviViewModel)c0).V((Object)a);
        return oyv.a;
    }
}
