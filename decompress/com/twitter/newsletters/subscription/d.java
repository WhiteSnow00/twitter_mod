// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.subscription;

public final class d extends gue implements rtb<oyh<lji, wvm>, oyv>
{
    public final /* synthetic */ NewsletterSubscribeSheetViewModel C0;
    public final /* synthetic */ lji D0;
    
    public d(final NewsletterSubscribeSheetViewModel c0, final lji d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oyh oyh = (oyh)o;
        zzd.f((Object)oyh, "$this$intoWeaver");
        oyh.d((rtb)new a(this.C0, (ap6)null));
        oyh.e((gub)new b(this.C0, this.D0, (ap6)null));
        oyh.c((gub)new c(this.C0, this.D0, (ap6)null));
        return oyv.a;
    }
}
