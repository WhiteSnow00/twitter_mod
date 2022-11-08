// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.textinput;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.textinput.BusinessInputTextViewModel$intents$2$2", f = "BusinessInputTextViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<wz2$b, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessInputTextViewModel D0;
    
    public b(final BusinessInputTextViewModel d0, final ap6<? super b> ap6) {
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
        final wz2$b wz2$b = (wz2$b)this.C0;
        final BusinessInputTextViewModel d0 = this.D0;
        final b$a b$a = new b$a(wz2$b);
        final soe[] s0 = BusinessInputTextViewModel.S0;
        ((MviViewModel)d0).Q((rtb)b$a);
        return oyv.a;
    }
}
