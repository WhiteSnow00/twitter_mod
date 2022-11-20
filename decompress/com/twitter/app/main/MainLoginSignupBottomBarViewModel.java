// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.main;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/main/MainLoginSignupBottomBarViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Luhg;", "Lphg;", "Lnhg;", "feature.tfa.main.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class MainLoginSignupBottomBarViewModel extends MviViewModel<uhg, phg, nhg>
{
    public static final coe<Object>[] Q0;
    public final ohg O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)MainLoginSignupBottomBarViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public MainLoginSignupBottomBarViewModel(final ohg o0, final xbm xbm) {
        czd.f((Object)o0, "eventReporter");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new uhg(false, 1, (rf8)null));
        this.O0 = o0;
        this.P0 = ewj.n(this, (qsb)new MainLoginSignupBottomBarViewModel$a(this));
    }
    
    public final jyh<phg> v() {
        return (jyh<phg>)this.P0.a((coe)MainLoginSignupBottomBarViewModel.Q0[0]);
    }
}
