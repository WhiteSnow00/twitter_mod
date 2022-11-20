// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.landingpage;

import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.verification.VerificationRequestContentViewArgs;

@sa8(c = "com.twitter.android.verification.landingpage.VerificationLandingPageViewModel$intents$2$2", f = "VerificationLandingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<arw$b, go6<? super fzv>, Object>
{
    public final VerificationLandingPageViewModel D0;
    
    public b(final VerificationLandingPageViewModel d0, final go6<? super b> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new b(this.D0, (go6<? super b>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final VerificationLandingPageViewModel d0 = this.D0;
        final yqw$c yqw$c = new yqw$c((ContentViewArgs)VerificationRequestContentViewArgs.INSTANCE);
        final coe<Object>[] p = VerificationLandingPageViewModel.P0;
        d0.V((Object)yqw$c);
        final VerificationLandingPageViewModel d2 = this.D0;
        final xaa a = xaa.a;
        d2.V((Object)new yqw$b(new af4(xaa.e)));
        return fzv.a;
    }
}
