// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$6", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends xzr implements gub<m23.e, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessPhoneViewModel C0;
    
    public f(final BusinessPhoneViewModel c0, final ap6<? super f> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new f(this.C0, (ap6<? super f>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final BusinessPhoneViewModel c0 = this.C0;
        final k23$a a = k23$a.a;
        final soe[] u0 = BusinessPhoneViewModel.U0;
        ((MviViewModel)c0).V((Object)a);
        final l23 o2 = this.C0.O0;
        Objects.requireNonNull(o2);
        o2.a(l23$a.a(l23.Companion, "discard_confirmation", "confirm"));
        return oyv.a;
    }
}
