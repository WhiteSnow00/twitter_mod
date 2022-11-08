import com.twitter.app.dm.request.inbox.actions.QuickActionViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.app.dm.request.inbox.actions.QuickActionViewModel$blockUser$1$1", f = "QuickActionViewModel.kt", l = {}, m = "invokeSuspend")
public final class qtl extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ QuickActionViewModel C0;
    
    public qtl(final QuickActionViewModel c0, final ap6<? super qtl> ap6) {
        this.C0 = c0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new qtl(this.C0, (ap6<? super qtl>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final qtl qtl = (qtl)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        qtl.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final QuickActionViewModel c0 = this.C0;
        final qtl$a c2 = qtl$a.C0;
        final soe<Object>[] r0 = QuickActionViewModel.R0;
        c0.Q((rtb)c2);
        return oyv.a;
    }
}
