// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.web;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.onboarding.core.web.WebSubtaskViewModel$intents$2$1", f = "WebSubtaskViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<gnx, mp6<? super vzv>, Object>
{
    public final WebSubtaskViewModel F0;
    
    public a(final WebSubtaskViewModel f0, final mp6<? super a> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new a(this.F0, (mp6<? super a>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        ((MviViewModel)this.F0).V((Object)new fnx$b(new rrd(this.F0.R0, (vrd)null, 2, (wg8)null)));
        return vzv.a;
    }
}
