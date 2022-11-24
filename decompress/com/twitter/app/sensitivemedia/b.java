// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia;

@vb8(c = "com.twitter.app.sensitivemedia.SensitiveMediaViewModel$intents$2$1", f = "SensitiveMediaViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<djp$b, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SensitiveMediaViewModel G0;
    
    public b(final SensitiveMediaViewModel g0, final mp6<? super b> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final b b = new b(this.G0, (mp6<? super b>)mp6);
        b.F0 = f0;
        return (mp6<vzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final xip a = ((djp$b)this.F0).a;
        final SensitiveMediaViewModel g0 = this.G0;
        final b$a b$a = new b$a(a);
        final ape<Object>[] r0 = SensitiveMediaViewModel.R0;
        g0.Q((stb)b$a);
        return vzv.a;
    }
}
