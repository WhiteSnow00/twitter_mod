// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.textinput;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.textinput.BusinessInputTextViewModel$intents$2$1", f = "BusinessInputTextViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<wz2$a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInputTextViewModel C0;
    
    public a(final BusinessInputTextViewModel c0, final ap6<? super a> ap6) {
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
        final vz2 q0 = this.C0.Q0;
        final zf4 zf4 = new zf4(m0n.K(q0.b, (String)null, "done", 6));
        zf4.r = q0.a;
        final int a = w4j.a;
        saw.b((okm)zf4);
        final BusinessInputTextViewModel c0 = this.C0;
        ((MviViewModel)c0).V((Object)new uz2.a(c0.N0.getTag()));
        return oyv.a;
    }
}
