// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

@vb8(c = "com.twitter.brandedlikepreview.BrandedLikePreviewViewModel$intents$2$6", f = "BrandedLikePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends l1s implements hub<yc2$a, mp6<? super vzv>, Object>
{
    public Object F0;
    public final BrandedLikePreviewViewModel G0;
    
    public f(final BrandedLikePreviewViewModel g0, final mp6<? super f> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final f f2 = new f(this.G0, (mp6<? super f>)mp6);
        f2.F0 = f0;
        return (mp6<vzv>)f2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        BrandedLikePreviewViewModel.W(this.G0, String.valueOf(((yc2$a)this.F0).a));
        return vzv.a;
    }
}
