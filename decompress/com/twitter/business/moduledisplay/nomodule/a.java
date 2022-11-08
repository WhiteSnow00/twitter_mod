// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduledisplay.nomodule;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduledisplay.nomodule.NoModuleViewModel$intents$2$1", f = "NoModuleViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<oki, ap6<? super oyv>, Object>
{
    public final /* synthetic */ NoModuleViewModel C0;
    
    public a(final NoModuleViewModel c0, final ap6<? super a> ap6) {
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
        final NoModuleViewModel c0 = this.C0;
        final lki$a a = lki$a.a;
        final NoModuleViewModel$b companion = NoModuleViewModel.Companion;
        ((MviViewModel)c0).V((Object)a);
        final nki n0 = this.C0.N0;
        final zf4 zf4 = new zf4(n0.d);
        zf4.r = n0.a;
        final int a2 = w4j.a;
        saw.b((okm)zf4);
        return oyv.a;
    }
}
