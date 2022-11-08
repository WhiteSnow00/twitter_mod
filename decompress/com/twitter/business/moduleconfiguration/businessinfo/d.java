// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$13", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends xzr implements gub<cx2$q, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public d(final BusinessInfoViewModel c0, final ap6<? super d> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new d(this.C0, (ap6<? super d>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.T0.b();
        final BusinessInfoViewModel c0 = this.C0;
        Objects.requireNonNull(c0);
        if (e4l.Companion.b() && !c0.P0.getHasFeaturedSpotlight()) {
            ((MviViewModel)c0).V((Object)ax2$d.a);
        }
        else {
            c0.b0(false);
        }
        return oyv.a;
    }
}
