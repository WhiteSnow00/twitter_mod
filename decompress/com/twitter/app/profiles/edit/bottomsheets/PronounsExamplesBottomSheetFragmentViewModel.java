// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit.bottomsheets;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/edit/bottomsheets/PronounsExamplesBottomSheetFragmentViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lhkl;", "Lfkl;", "Lekl;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class PronounsExamplesBottomSheetFragmentViewModel extends MviViewModel<hkl, fkl, ekl>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(PronounsExamplesBottomSheetFragmentViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public PronounsExamplesBottomSheetFragmentViewModel(final kcm kcm) {
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)hkl.a);
        this.Q0 = hfe.v((MviViewModel)this, (stb)new PronounsExamplesBottomSheetFragmentViewModel$a(this));
    }
    
    public final azh<fkl> v() {
        return (azh<fkl>)this.Q0.a((ape)PronounsExamplesBottomSheetFragmentViewModel.R0[0]);
    }
}
