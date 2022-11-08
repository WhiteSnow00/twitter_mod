// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.accounttaxonomy.implementation;

@gb8(c = "com.twitter.accounttaxonomy.implementation.AccountLabelLandingPageViewModel$intents$2$2", f = "AccountLabelLandingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<zh.b, ap6<? super oyv>, Object>
{
    public final /* synthetic */ AccountLabelLandingPageViewModel C0;
    
    public b(final AccountLabelLandingPageViewModel c0, final ap6<? super b> ap6) {
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
        final AccountLabelLandingPageViewModel c0 = this.C0;
        final xh$a a = xh$a.a;
        final soe<Object>[] o2 = AccountLabelLandingPageViewModel.O0;
        c0.V((Object)a);
        return oyv.a;
    }
}
