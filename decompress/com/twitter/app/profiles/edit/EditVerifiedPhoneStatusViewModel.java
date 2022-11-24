// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

import com.twitter.app.profiles.api.EditVerifiedPhoneArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/edit/EditVerifiedPhoneStatusViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvw9;", "", "Lmw9;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditVerifiedPhoneStatusViewModel extends MviViewModel<vw9, Object, mw9>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(EditVerifiedPhoneStatusViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public EditVerifiedPhoneStatusViewModel(final EditVerifiedPhoneArgs editVerifiedPhoneArgs, final kcm kcm, final lw9 lw9) {
        e0e.f((Object)editVerifiedPhoneArgs, "args");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)lw9, "editVerifiedPhoneStatusDataSource");
        super((iae)kcm, (ccx)new vw9(editVerifiedPhoneArgs.getOptedIn()));
        this.Q0 = hfe.v((MviViewModel)this, (stb)new EditVerifiedPhoneStatusViewModel$a(this, lw9));
    }
    
    public final azh<Object> v() {
        return (azh<Object>)this.Q0.a((ape)EditVerifiedPhoneStatusViewModel.R0[0]);
    }
}
