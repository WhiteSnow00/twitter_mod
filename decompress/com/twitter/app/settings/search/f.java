// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

@sa8(c = "com.twitter.app.settings.search.SettingsSearchToolbarViewModel$intents$2$2", f = "SettingsSearchToolbarViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<hqp$b, go6<? super fzv>, Object>
{
    public Object D0;
    public final SettingsSearchToolbarViewModel E0;
    
    public f(final SettingsSearchToolbarViewModel e0, final go6<? super f> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final f f = new f(this.E0, (go6<? super f>)go6);
        f.D0 = d0;
        return (go6<fzv>)f;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.E0.O0.e.onNext((Object)new gpp$a(((hqp$b)this.D0).a));
        final SettingsSearchToolbarViewModel e0 = this.E0;
        e0.T((qsb)new f$a(e0));
        return fzv.a;
    }
}
