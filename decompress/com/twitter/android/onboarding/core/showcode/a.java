// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.showcode;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.onboarding.core.showcode.ShowCodeViewModel$intents$2$1", f = "ShowCodeViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<t4q$b, mp6<? super vzv>, Object>
{
    public Object F0;
    public final ShowCodeViewModel G0;
    
    public a(final ShowCodeViewModel g0, final mp6<? super a> mp6) {
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
        final t4q$b t4q$b = (t4q$b)this.F0;
        final ShowCodeViewModel g0 = this.G0;
        final r4q$b r4q$b = new r4q$b(t4q$b.a);
        final ape[] r0 = ShowCodeViewModel.R0;
        ((MviViewModel)g0).V((Object)r4q$b);
        return vzv.a;
    }
}
