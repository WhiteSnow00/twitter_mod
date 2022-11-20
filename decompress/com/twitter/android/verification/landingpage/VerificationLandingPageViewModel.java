// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.landingpage;

import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/verification/landingpage/VerificationLandingPageViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lgrw;", "Larw;", "Lyqw;", "feature.tfa.verification.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class VerificationLandingPageViewModel extends MviViewModel<grw, arw, yqw>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)VerificationLandingPageViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public VerificationLandingPageViewModel(final xbm xbm, final brw brw) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)brw, "pageItemsFactory");
        super((k9e)xbm, (jbx)new grw((List)brw.c.getValue()));
        final xaa a = xaa.a;
        this.V((Object)new yqw$b(new af4(xaa.b)));
        this.O0 = ewj.n(this, (qsb)new VerificationLandingPageViewModel$a(this));
    }
    
    public final jyh<arw> v() {
        return (jyh<arw>)this.O0.a((coe)VerificationLandingPageViewModel.P0[0]);
    }
}
