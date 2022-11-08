// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$14", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends xzr implements gub<cx2$c, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public e(final BusinessInfoViewModel c0, final ap6<? super e> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new e(this.C0, (ap6<? super e>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final BusinessInfoViewModel c0 = this.C0;
        final soe[] c2 = BusinessInfoViewModel.c1;
        Object a;
        if (!c0.a0()) {
            a = new ax2$a(false, 3);
        }
        else {
            a = ax2$h.a;
        }
        ((MviViewModel)c0).V(a);
        return oyv.a;
    }
}
