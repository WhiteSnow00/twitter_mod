// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$8", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends xzr implements gub<m23.a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessPhoneViewModel C0;
    
    public h(final BusinessPhoneViewModel c0, final ap6<? super h> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new h(this.C0, (ap6<? super h>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final BusinessPhoneViewModel c0 = this.C0;
        if (zzd.a((Object)c0.S0, (Object)c0.P0)) {
            ((MviViewModel)c0).V((Object)k23$a.a);
        }
        else {
            ((MviViewModel)c0).V((Object)k23$f.a);
        }
        return oyv.a;
    }
}
