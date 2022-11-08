import com.twitter.app.dm.request.inbox.RequestInboxViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.app.dm.request.inbox.RequestInboxViewModel$pullToRefreshUpdate$1$1$1", f = "RequestInboxViewModel.kt", l = {}, m = "invokeSuspend")
public final class aom extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ RequestInboxViewModel C0;
    
    public aom(final RequestInboxViewModel c0, final ap6<? super aom> ap6) {
        this.C0 = c0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new aom(this.C0, (ap6<? super aom>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final aom aom = (aom)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        aom.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final RequestInboxViewModel c0 = this.C0;
        final aom$a aom$a = new aom$a((Object)this.C0);
        final soe<Object>[] w0 = RequestInboxViewModel.W0;
        c0.Q((rtb)aom$a);
        return oyv.a;
    }
}
