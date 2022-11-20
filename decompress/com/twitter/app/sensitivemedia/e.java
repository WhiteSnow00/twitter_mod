// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia;

@sa8(c = "com.twitter.app.sensitivemedia.SensitiveMediaViewModel$intents$2$4", f = "SensitiveMediaViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<gip$a, go6<? super fzv>, Object>
{
    public final SensitiveMediaViewModel D0;
    
    public e(final SensitiveMediaViewModel d0, final go6<? super e> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new e(this.D0, (go6<? super e>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SensitiveMediaViewModel d0 = this.D0;
        final af4 af4 = new af4();
        ((u0p)af4).T = new vba("tabbed_media", "sensitive_media", "", "", "cancel").toString();
        final int a = c5j.a;
        final fip$c fip$c = new fip$c((elm)af4);
        final coe<Object>[] p = SensitiveMediaViewModel.P0;
        d0.V((Object)fip$c);
        this.D0.V((Object)fip$b.a);
        return fzv.a;
    }
}
