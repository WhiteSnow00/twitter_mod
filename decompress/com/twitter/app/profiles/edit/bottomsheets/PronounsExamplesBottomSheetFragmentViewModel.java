// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit.bottomsheets;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/edit/bottomsheets/PronounsExamplesBottomSheetFragmentViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvjl;", "Ltjl;", "Lsjl;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class PronounsExamplesBottomSheetFragmentViewModel extends MviViewModel<vjl, tjl, sjl>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)PronounsExamplesBottomSheetFragmentViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public PronounsExamplesBottomSheetFragmentViewModel(final xbm xbm) {
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)vjl.a);
        this.O0 = ewj.n(this, (qsb)new PronounsExamplesBottomSheetFragmentViewModel$a(this));
    }
    
    public final jyh<tjl> v() {
        return (jyh<tjl>)this.O0.a((coe)PronounsExamplesBottomSheetFragmentViewModel.P0[0]);
    }
}
