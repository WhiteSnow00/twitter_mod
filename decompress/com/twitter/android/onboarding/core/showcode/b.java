// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.showcode;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.onboarding.core.showcode.ShowCodeViewModel$intents$2$2", f = "ShowCodeViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<t4q$a, mp6<? super vzv>, Object>
{
    public final ShowCodeViewModel F0;
    
    public b(final ShowCodeViewModel f0, final mp6<? super b> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new b(this.F0, (mp6<? super b>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final ShowCodeViewModel f0 = this.F0;
        final r4q$a a = r4q$a.a;
        final ape[] r0 = ShowCodeViewModel.R0;
        ((MviViewModel)f0).V((Object)a);
        return vzv.a;
    }
}
