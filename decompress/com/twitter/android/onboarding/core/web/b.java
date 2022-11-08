// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.web;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.onboarding.core.web.WebSubtaskViewModel$intents$2$2", f = "WebSubtaskViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<ylx, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ WebSubtaskViewModel D0;
    
    public b(final WebSubtaskViewModel d0, final ap6<? super b> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final b b = new b(this.D0, (ap6<? super b>)ap6);
        b.C0 = c0;
        return (ap6<oyv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        ((MviViewModel)this.D0).V((Object)new wlx$b(new mrd(this.D0.N0, (prd)new dlx(((ylx)this.C0).a))));
        return oyv.a;
    }
}
