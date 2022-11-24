// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

@vb8(c = "com.twitter.app.settings.search.SettingsSearchToolbarViewModel$intents$2$1", f = "SettingsSearchToolbarViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends l1s implements hub<crp$a, mp6<? super vzv>, Object>
{
    public final SettingsSearchToolbarViewModel F0;
    
    public e(final SettingsSearchToolbarViewModel f0, final mp6<? super e> mp6) {
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
        this.F0.Q0.e.onNext((Object)new bqp$a(""));
        this.F0.V((Object)xqp$a.a);
        return vzv.a;
    }
}
