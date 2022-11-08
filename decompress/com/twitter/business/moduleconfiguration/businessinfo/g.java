// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$16", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends xzr implements gub<cx2$h, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessInfoViewModel D0;
    
    public g(final BusinessInfoViewModel d0, final ap6<? super g> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final g g = new g(this.D0, (ap6<? super g>)ap6);
        g.C0 = c0;
        return (ap6<oyv>)g;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final cx2$h cx2$h = (cx2$h)this.C0;
        this.D0.Q0.a(bx2.g);
        ((MviViewModel)this.D0).Q((rtb)new g$a(cx2$h));
        final BusinessInfoViewModel d0 = this.D0;
        Objects.requireNonNull(d0);
        ((MviViewModel)d0).T((rtb)new pz2(d0));
        return oyv.a;
    }
}
