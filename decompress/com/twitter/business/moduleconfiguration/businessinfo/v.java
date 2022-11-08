// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$saveModuleContent$2$3", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class v extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    public final /* synthetic */ boolean D0;
    
    public v(final BusinessInfoViewModel c0, final boolean d0, final ap6<? super v> ap6) {
        this.C0 = c0;
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new v(this.C0, this.D0, (ap6<? super v>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final v v = (v)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        v.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.R0.a(this.D0);
        ((MviViewModel)this.C0).Q((rtb)v$a.C0);
        final BusinessInfoViewModel c0 = this.C0;
        Objects.requireNonNull(c0);
        ((MviViewModel)c0).V((Object)new ax2$i(2131952936));
        return oyv.a;
    }
}
