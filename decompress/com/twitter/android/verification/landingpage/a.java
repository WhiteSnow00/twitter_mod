// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.landingpage;

@sa8(c = "com.twitter.android.verification.landingpage.VerificationLandingPageViewModel$intents$2$1", f = "VerificationLandingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<arw$a, go6<? super fzv>, Object>
{
    public final VerificationLandingPageViewModel D0;
    
    public a(final VerificationLandingPageViewModel d0, final go6<? super a> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new a(this.D0, (go6<? super a>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final VerificationLandingPageViewModel d0 = this.D0;
        final yqw$a a = yqw$a.a;
        final coe<Object>[] p = VerificationLandingPageViewModel.P0;
        d0.V((Object)a);
        return fzv.a;
    }
}
