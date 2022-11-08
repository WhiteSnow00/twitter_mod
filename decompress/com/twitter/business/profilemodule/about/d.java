// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.profilemodule.about;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.profilemodule.about.AboutModuleViewModel$intents$2$4", f = "AboutModuleViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends xzr implements gub<y7.a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ AboutModuleViewModel C0;
    
    public d(final AboutModuleViewModel c0, final ap6<? super d> ap6) {
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
        final AboutModuleViewModel c0 = this.C0;
        final d$a d$a = new d$a(c0);
        final AboutModuleViewModel$b companion = AboutModuleViewModel.Companion;
        ((MviViewModel)c0).T((rtb)d$a);
        this.C0.R0.j();
        return oyv.a;
    }
}
