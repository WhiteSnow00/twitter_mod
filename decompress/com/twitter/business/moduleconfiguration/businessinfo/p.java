// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$6", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class p extends xzr implements gub<cx2$r, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessInfoViewModel D0;
    public final /* synthetic */ iyh<cx2> E0;
    
    public p(final BusinessInfoViewModel d0, final iyh<cx2> e0, final ap6<? super p> ap6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final p p2 = new p(this.D0, this.E0, (ap6<? super p>)ap6);
        p2.C0 = c0;
        return (ap6<oyv>)p2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final p p2 = (p)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        p2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final cx2$r cx2$r = (cx2$r)this.C0;
        final int n = p.p$c.a[((Enum)cx2$r.a).ordinal()];
        if (n != 1) {
            if (n != 2) {
                final iyh<cx2> e0 = this.E0;
                final StringBuilder sb = new StringBuilder();
                sb.append(cx2$r);
                sb.append(" not supported in ");
                sb.append(e0);
                throw new UnsupportedOperationException(sb.toString());
            }
            this.D0.a1.setCurrentWebsite(cx2$r.b);
            final BusinessInfoViewModel d0 = this.D0;
            ((MviViewModel)d0).Q((rtb)new p$b(d0, cx2$r));
        }
        else {
            this.D0.a1.setCurrentEmail(cx2$r.b);
            final BusinessInfoViewModel d2 = this.D0;
            ((MviViewModel)d2).Q((rtb)new p$a(d2, cx2$r));
        }
        return oyv.a;
    }
}
