import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.android.verification.violations.VerificationPolicyViolationsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.android.verification.violations.VerificationPolicyViolationsViewModel$loadData$1$2", f = "VerificationPolicyViolationsViewModel.kt", l = {}, m = "invokeSuspend")
public final class brw extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ VerificationPolicyViolationsViewModel C0;
    
    public brw(final VerificationPolicyViolationsViewModel c0, final ap6<? super brw> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new brw(this.C0, (ap6<? super brw>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final brw brw = (brw)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        brw.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final VerificationPolicyViolationsViewModel c0 = this.C0;
        final brw$a c2 = brw$a.C0;
        final soe[] p = VerificationPolicyViolationsViewModel.P0;
        ((MviViewModel)c0).Q((rtb)c2);
        return oyv.a;
    }
}
