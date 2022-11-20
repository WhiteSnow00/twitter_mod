// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

@sa8(c = "com.twitter.brandedlikepreview.BrandedLikePreviewViewModel$intents$2$4", f = "BrandedLikePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends p0s implements ftb<lc2$d, go6<? super fzv>, Object>
{
    public final BrandedLikePreviewViewModel D0;
    
    public d(final BrandedLikePreviewViewModel d0, final go6<? super d> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new d(this.D0, (go6<? super d>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final BrandedLikePreviewViewModel d0 = this.D0;
        final d$a d2 = d$a.D0;
        final coe<Object>[] s0 = BrandedLikePreviewViewModel.S0;
        d0.Q((qsb)d2);
        return fzv.a;
    }
}
