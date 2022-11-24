// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia;

@vb8(c = "com.twitter.app.sensitivemedia.SensitiveMediaViewModel$intents$2$5", f = "SensitiveMediaViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends l1s implements hub<djp$c, mp6<? super vzv>, Object>
{
    public final SensitiveMediaViewModel F0;
    
    public f(final SensitiveMediaViewModel f0, final mp6<? super f> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new f(this.F0, (mp6<? super f>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final SensitiveMediaViewModel f0 = this.F0;
        final f$a f$a = new f$a(f0);
        final ape<Object>[] r0 = SensitiveMediaViewModel.R0;
        f0.T((stb)f$a);
        return vzv.a;
    }
}
