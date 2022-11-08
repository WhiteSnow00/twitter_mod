// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.choiceselection;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.onboarding.core.choiceselection.PrimaryChoiceSelectionViewModel$intents$2$1", f = "PrimaryChoiceSelectionViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<gyk$a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ PrimaryChoiceSelectionViewModel C0;
    
    public a(final PrimaryChoiceSelectionViewModel c0, final ap6<? super a> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new a(this.C0, (ap6<? super a>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (ap6<?>)o2);
        final oyv a2 = oyv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final PrimaryChoiceSelectionViewModel c0 = this.C0;
        final a$a a$a = new a$a(c0);
        final soe[] p = PrimaryChoiceSelectionViewModel.P0;
        ((MviViewModel)c0).T((rtb)a$a);
        return oyv.a;
    }
}
