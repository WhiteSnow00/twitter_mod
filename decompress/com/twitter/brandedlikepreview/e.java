// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

@vb8(c = "com.twitter.brandedlikepreview.BrandedLikePreviewViewModel$intents$2$5", f = "BrandedLikePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends l1s implements hub<yc2$c, mp6<? super vzv>, Object>
{
    public final BrandedLikePreviewViewModel F0;
    
    public e(final BrandedLikePreviewViewModel f0, final mp6<? super e> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new e(this.F0, (mp6<? super e>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final BrandedLikePreviewViewModel f0 = this.F0;
        final xc2$a a = xc2$a.a;
        final ape<Object>[] u0 = BrandedLikePreviewViewModel.U0;
        f0.V((Object)a);
        return vzv.a;
    }
}
