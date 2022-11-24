// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.accounttaxonomy.implementation;

import com.twitter.weaver.mvi.MviViewModel;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.AccountAutomationViewArgs;

@vb8(c = "com.twitter.accounttaxonomy.implementation.AccountLabelLandingPageViewModel$intents$2$1", f = "AccountLabelLandingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<ai$a, mp6<? super vzv>, Object>
{
    public final AccountLabelLandingPageViewModel F0;
    
    public a(final AccountLabelLandingPageViewModel f0, final mp6<? super a> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new a(this.F0, (mp6<? super a>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final AccountLabelLandingPageViewModel f0 = this.F0;
        final stb<ii, vzv> stb = (stb<ii, vzv>)new stb<ii, vzv>(f0) {
            public final AccountLabelLandingPageViewModel F0;
            
            public final Object invoke(final Object o) {
                final ii ii = (ii)o;
                e0e.f((Object)ii, "it");
                if (a$a.a$a$a.a[lb0.G(ii.a)] == 1) {
                    final AccountAutomationViewArgs instance = AccountAutomationViewArgs.INSTANCE;
                    final AccountLabelLandingPageViewModel f0 = this.F0;
                    final yh$c yh$c = new yh$c((ContentViewArgs)instance);
                    final ape[] r0 = AccountLabelLandingPageViewModel.R0;
                    ((MviViewModel)f0).V((Object)yh$c);
                    final AccountLabelLandingPageViewModel f2 = this.F0;
                    final w0p a = w0p.a;
                    final fg4 fg4 = new fg4(w0p.d);
                    ((o1p)fg4).w = ffe.e(ii.a);
                    final int a2 = o5j.a;
                    ((MviViewModel)f2).V((Object)new yh$b(fg4));
                    return vzv.a;
                }
                throw new NoWhenBranchMatchedException();
            }
        };
        final ape[] r0 = AccountLabelLandingPageViewModel.R0;
        ((MviViewModel)f0).T((stb)stb);
        return vzv.a;
    }
}
