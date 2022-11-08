// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.showcode;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.onboarding.core.showcode.ShowCodeViewModel$intents$2$1", f = "ShowCodeViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<f3q.b, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ShowCodeViewModel D0;
    
    public a(final ShowCodeViewModel d0, final ap6<? super a> ap6) {
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
        final f3q.b b = (f3q.b)this.C0;
        final ShowCodeViewModel d0 = this.D0;
        final d3q$b d3q$b = new d3q$b(b.a);
        final soe[] o2 = ShowCodeViewModel.O0;
        ((MviViewModel)d0).V((Object)d3q$b);
        return oyv.a;
    }
}
