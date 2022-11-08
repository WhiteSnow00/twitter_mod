import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.android.verification.violations.VerificationPolicyViolationsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.android.verification.violations.VerificationPolicyViolationsViewModel$loadData$1$3", f = "VerificationPolicyViolationsViewModel.kt", l = {}, m = "invokeSuspend")
public final class crw extends xzr implements gub<vqw, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ VerificationPolicyViolationsViewModel D0;
    
    public crw(final VerificationPolicyViolationsViewModel d0, final ap6<? super crw> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final crw crw = new crw(this.D0, (ap6<? super crw>)ap6);
        crw.C0 = c0;
        return (ap6<oyv>)crw;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final crw crw = (crw)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        crw.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final vqw vqw = (vqw)this.C0;
        final VerificationPolicyViolationsViewModel d0 = this.D0;
        final crw$a crw$a = new crw$a(vqw);
        final soe[] p = VerificationPolicyViolationsViewModel.P0;
        ((MviViewModel)d0).Q((rtb)crw$a);
        return oyv.a;
    }
}
