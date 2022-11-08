// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.web;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.android.onboarding.core.web.WebSubtaskViewModel$intents$2$1", f = "WebSubtaskViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<xlx, ap6<? super oyv>, Object>
{
    public final /* synthetic */ WebSubtaskViewModel C0;
    
    public a(final WebSubtaskViewModel c0, final ap6<? super a> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new a(this.C0, (ap6<? super a>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (ap6<?>)o2);
        final oyv a2 = oyv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        ((MviViewModel)this.C0).V((Object)new wlx$b(new mrd(this.C0.O0, (prd)null, 2, (hg8)null)));
        return oyv.a;
    }
}
