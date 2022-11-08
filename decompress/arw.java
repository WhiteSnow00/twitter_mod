import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.android.verification.violations.VerificationPolicyViolationsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.android.verification.violations.VerificationPolicyViolationsViewModel$loadData$1$1", f = "VerificationPolicyViolationsViewModel.kt", l = {}, m = "invokeSuspend")
public final class arw extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ VerificationPolicyViolationsViewModel C0;
    
    public arw(final VerificationPolicyViolationsViewModel c0, final ap6<? super arw> ap6) {
        this.C0 = c0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new arw(this.C0, (ap6<? super arw>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final arw arw = (arw)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        arw.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final VerificationPolicyViolationsViewModel c0 = this.C0;
        final arw$a c2 = arw$a.C0;
        final soe[] p = VerificationPolicyViolationsViewModel.P0;
        ((MviViewModel)c0).Q((rtb)c2);
        return oyv.a;
    }
}
