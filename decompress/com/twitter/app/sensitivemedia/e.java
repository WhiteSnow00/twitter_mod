// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia;

@vb8(c = "com.twitter.app.sensitivemedia.SensitiveMediaViewModel$intents$2$4", f = "SensitiveMediaViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends l1s implements hub<djp$a, mp6<? super vzv>, Object>
{
    public final SensitiveMediaViewModel F0;
    
    public e(final SensitiveMediaViewModel f0, final mp6<? super e> mp6) {
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
        final SensitiveMediaViewModel f0 = this.F0;
        final fg4 fg4 = new fg4();
        ((o1p)fg4).T = new dda("tabbed_media", "sensitive_media", "", "", "cancel").toString();
        final int a = o5j.a;
        final cjp$c cjp$c = new cjp$c((tlm)fg4);
        final ape<Object>[] r0 = SensitiveMediaViewModel.R0;
        f0.V((Object)cjp$c);
        this.F0.V((Object)cjp$b.a);
        return vzv.a;
    }
}
