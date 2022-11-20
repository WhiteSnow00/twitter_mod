// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

@sa8(c = "com.twitter.brandedlikepreview.BrandedLikePreviewViewModel$intents$2$2", f = "BrandedLikePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<lc2$f, go6<? super fzv>, Object>
{
    public Object D0;
    public final BrandedLikePreviewViewModel E0;
    
    public b(final BrandedLikePreviewViewModel e0, final go6<? super b> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final b b = new b(this.E0, (go6<? super b>)go6);
        b.D0 = d0;
        return (go6<fzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lc2$f lc2$f = (lc2$f)this.D0;
        final BrandedLikePreviewViewModel e0 = this.E0;
        final b$a b$a = new b$a(lc2$f, e0);
        final coe<Object>[] s0 = BrandedLikePreviewViewModel.S0;
        e0.T((qsb)b$a);
        return fzv.a;
    }
}
