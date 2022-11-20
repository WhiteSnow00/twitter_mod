// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

@sa8(c = "com.twitter.brandedlikepreview.BrandedLikePreviewViewModel$intents$2$1", f = "BrandedLikePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<lc2$g, go6<? super fzv>, Object>
{
    public Object D0;
    public final BrandedLikePreviewViewModel E0;
    
    public a(final BrandedLikePreviewViewModel e0, final go6<? super a> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final a a = new a(this.E0, (go6<? super a>)go6);
        a.D0 = d0;
        return (go6<fzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lc2$g lc2$g = (lc2$g)this.D0;
        final BrandedLikePreviewViewModel e0 = this.E0;
        final a$a a$a = new a$a(lc2$g);
        final coe<Object>[] s0 = BrandedLikePreviewViewModel.S0;
        e0.Q((qsb)a$a);
        return fzv.a;
    }
}
