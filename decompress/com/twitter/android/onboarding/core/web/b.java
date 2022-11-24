// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.web;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.onboarding.core.web.WebSubtaskViewModel$intents$2$2", f = "WebSubtaskViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<hnx, mp6<? super vzv>, Object>
{
    public Object F0;
    public final WebSubtaskViewModel G0;
    
    public b(final WebSubtaskViewModel g0, final mp6<? super b> mp6) {
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
        ((MviViewModel)this.G0).V((Object)new fnx$b(new rrd(this.G0.Q0, (vrd)new nmx(((hnx)this.F0).a))));
        return vzv.a;
    }
}
