// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit.bottomsheets;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/edit/bottomsheets/PronounsExamplesBottomSheetFragmentViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lijl;", "Lgjl;", "Lfjl;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class PronounsExamplesBottomSheetFragmentViewModel extends MviViewModel<ijl, gjl, fjl>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(PronounsExamplesBottomSheetFragmentViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public PronounsExamplesBottomSheetFragmentViewModel(final ibm ibm) {
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)ijl.a);
        this.N0 = oyz.f0(this, (rtb)new PronounsExamplesBottomSheetFragmentViewModel$a(this));
    }
    
    public final iyh<gjl> v() {
        return (iyh<gjl>)this.N0.a((soe)PronounsExamplesBottomSheetFragmentViewModel.O0[0]);
    }
}
