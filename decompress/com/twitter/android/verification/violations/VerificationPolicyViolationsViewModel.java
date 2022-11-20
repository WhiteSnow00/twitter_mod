// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.violations;

import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/verification/violations/VerificationPolicyViolationsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lyrw;", "Ltrw;", "", "feature.tfa.verification.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class VerificationPolicyViolationsViewModel extends MviViewModel
{
    public static final coe<Object>[] Q0;
    public final trc O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)VerificationPolicyViolationsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public VerificationPolicyViolationsViewModel(final xbm xbm, final trc o0, final Context context) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "httpRequestController");
        czd.f((Object)context, "context");
        super((k9e)xbm, (jbx)new yrw((prw)null, true));
        this.O0 = o0;
        this.C(o0.b((orc)new qrw()), (qsb)new xrw(this));
        this.P0 = ewj.n(this, (qsb)new VerificationPolicyViolationsViewModel$a(this));
    }
    
    public final jyh<trw> v() {
        return (jyh<trw>)this.P0.a((coe)VerificationPolicyViolationsViewModel.Q0[0]);
    }
}
