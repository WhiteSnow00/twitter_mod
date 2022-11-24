// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.accounttaxonomy.implementation;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.accounttaxonomy.implementation.AccountLabelLandingPageViewModel$intents$2$2", f = "AccountLabelLandingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<ai$b, mp6<? super vzv>, Object>
{
    public final AccountLabelLandingPageViewModel F0;
    
    public b(final AccountLabelLandingPageViewModel f0, final mp6<? super b> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new b(this.F0, (mp6<? super b>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final AccountLabelLandingPageViewModel f0 = this.F0;
        final yh$a a = yh$a.a;
        final ape[] r0 = AccountLabelLandingPageViewModel.R0;
        ((MviViewModel)f0).V((Object)a);
        return vzv.a;
    }
}
