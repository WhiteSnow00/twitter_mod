// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.choiceselection;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.onboarding.core.choiceselection.PrimaryChoiceSelectionViewModel$intents$2$2", f = "PrimaryChoiceSelectionViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends xzr implements gub<gyk$b, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ PrimaryChoiceSelectionViewModel D0;
    
    public c(final PrimaryChoiceSelectionViewModel d0, final ap6<? super c> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final c c2 = new c(this.D0, (ap6<? super c>)ap6);
        c2.C0 = c0;
        return (ap6<oyv>)c2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final gyk$b gyk$b = (gyk$b)this.C0;
        final PrimaryChoiceSelectionViewModel d0 = this.D0;
        final c$a c$a = new c$a(gyk$b, d0);
        final soe[] p = PrimaryChoiceSelectionViewModel.P0;
        ((MviViewModel)d0).T((rtb)c$a);
        return oyv.a;
    }
}
