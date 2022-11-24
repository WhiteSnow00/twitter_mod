// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

@vb8(c = "com.twitter.brandedlikepreview.BrandedLikePreviewViewModel$intents$2$1", f = "BrandedLikePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<yc2$g, mp6<? super vzv>, Object>
{
    public Object F0;
    public final BrandedLikePreviewViewModel G0;
    
    public a(final BrandedLikePreviewViewModel g0, final mp6<? super a> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final a a = new a(this.G0, (mp6<? super a>)mp6);
        a.F0 = f0;
        return (mp6<vzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final yc2$g yc2$g = (yc2$g)this.F0;
        final BrandedLikePreviewViewModel g0 = this.G0;
        final a$a a$a = new a$a(yc2$g);
        final ape<Object>[] u0 = BrandedLikePreviewViewModel.U0;
        g0.Q((stb)a$a);
        return vzv.a;
    }
}
