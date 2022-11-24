// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

@vb8(c = "com.twitter.app.settings.search.SettingsSearchToolbarViewModel$intents$2$2", f = "SettingsSearchToolbarViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends l1s implements hub<crp$b, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SettingsSearchToolbarViewModel G0;
    
    public f(final SettingsSearchToolbarViewModel g0, final mp6<? super f> mp6) {
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
        this.G0.Q0.e.onNext((Object)new bqp$a(((crp$b)this.F0).a));
        final SettingsSearchToolbarViewModel g0 = this.G0;
        g0.T((stb)new f$a(g0));
        return vzv.a;
    }
}
