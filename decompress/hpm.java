import com.twitter.app.dm.request.RequestsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.app.dm.request.RequestsViewModel$logFocusEvents$1", f = "RequestsViewModel.kt", l = {}, m = "invokeSuspend")
public final class hpm extends xzr implements gub<pmi, ap6<? super oyv>, Object>
{
    public final /* synthetic */ RequestsViewModel C0;
    
    public hpm(final RequestsViewModel c0, final ap6<? super hpm> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new hpm(this.C0, (ap6<? super hpm>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final hpm hpm = (hpm)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        hpm.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        saw.b((okm)new zf4(new String[] { "messages:inbox", lr0.y(this.C0.N0), ":impression" }));
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { "messages::::impression" });
        saw.b((okm)zf4);
        return oyv.a;
    }
}
