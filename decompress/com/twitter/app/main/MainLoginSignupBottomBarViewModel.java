// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.main;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/main/MainLoginSignupBottomBarViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Loig;", "Ljig;", "Lhig;", "feature.tfa.main.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class MainLoginSignupBottomBarViewModel extends MviViewModel<oig, jig, hig>
{
    public static final ape<Object>[] S0;
    public final iig Q0;
    public final yyh R0;
    
    static {
        S0 = new ape[] { (ape)lb0.h(MainLoginSignupBottomBarViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public MainLoginSignupBottomBarViewModel(final iig q0, final kcm kcm) {
        e0e.f((Object)q0, "eventReporter");
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)new oig(false, 1, (wg8)null));
        this.Q0 = q0;
        this.R0 = hfe.v((MviViewModel)this, (stb)new MainLoginSignupBottomBarViewModel$a(this));
    }
    
    public final azh<jig> v() {
        return (azh<jig>)this.R0.a((ape)MainLoginSignupBottomBarViewModel.S0[0]);
    }
}
