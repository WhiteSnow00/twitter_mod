// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$7", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends xzr implements gub<m23.d, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessPhoneViewModel C0;
    
    public g(final BusinessPhoneViewModel c0, final ap6<? super g> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new g(this.C0, (ap6<? super g>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final l23 o2 = this.C0.O0;
        Objects.requireNonNull(o2);
        o2.a(l23$a.a(l23.Companion, "discard_confirmation", "cancel"));
        return oyv.a;
    }
}
