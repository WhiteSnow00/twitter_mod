import com.twitter.app.dm.request.inbox.RequestInboxViewModel;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.app.dm.request.inbox.RequestInboxViewModel$subscribeToRequests$2", f = "RequestInboxViewModel.kt", l = {}, m = "invokeSuspend")
public final class eom extends xzr implements gub<List<? extends yp7$c>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ RequestInboxViewModel D0;
    
    public eom(final RequestInboxViewModel d0, final ap6<? super eom> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final eom eom = new eom(this.D0, (ap6<? super eom>)ap6);
        eom.C0 = c0;
        return (ap6<oyv>)eom;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final eom eom = (eom)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        eom.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final List list = (List)this.C0;
        final RequestInboxViewModel d0 = this.D0;
        final eom$a eom$a = new eom$a(list);
        final soe<Object>[] w0 = RequestInboxViewModel.W0;
        d0.Q((rtb)eom$a);
        return oyv.a;
    }
}
