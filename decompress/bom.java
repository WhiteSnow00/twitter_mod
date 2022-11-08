import com.twitter.app.dm.request.inbox.RequestInboxViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.app.dm.request.inbox.RequestInboxViewModel$pullToRefreshUpdate$1$1$2", f = "RequestInboxViewModel.kt", l = {}, m = "invokeSuspend")
public final class bom extends xzr implements gub<wrm<? extends us6>, ap6<? super oyv>, Object>
{
    public final /* synthetic */ RequestInboxViewModel C0;
    
    public bom(final RequestInboxViewModel c0, final ap6<? super bom> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new bom(this.C0, (ap6<? super bom>)ap6);
    }
    
    public final Object invoke(Object c0, final Object o) {
        c0 = ((wrm)c0).C0;
        final bom bom = new bom(this.C0, (ap6<? super bom>)o);
        final oyv a = oyv.a;
        bom.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final RequestInboxViewModel c0 = this.C0;
        final bom$a bom$a = new bom$a((Object)this.C0);
        final soe<Object>[] w0 = RequestInboxViewModel.W0;
        c0.Q((rtb)bom$a);
        return oyv.a;
    }
}
