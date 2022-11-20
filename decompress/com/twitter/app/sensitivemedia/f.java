// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia;

@sa8(c = "com.twitter.app.sensitivemedia.SensitiveMediaViewModel$intents$2$5", f = "SensitiveMediaViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<gip$c, go6<? super fzv>, Object>
{
    public final SensitiveMediaViewModel D0;
    
    public f(final SensitiveMediaViewModel d0, final go6<? super f> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new f(this.D0, (go6<? super f>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SensitiveMediaViewModel d0 = this.D0;
        final f$a f$a = new f$a(d0);
        final coe<Object>[] p = SensitiveMediaViewModel.P0;
        d0.T((qsb)f$a);
        return fzv.a;
    }
}
