// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

import com.twitter.app.profiles.api.EditVerifiedPhoneArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/edit/EditVerifiedPhoneStatusViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvv9;", "", "Lmv9;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditVerifiedPhoneStatusViewModel extends MviViewModel<vv9, Object, mv9>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)EditVerifiedPhoneStatusViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public EditVerifiedPhoneStatusViewModel(final EditVerifiedPhoneArgs editVerifiedPhoneArgs, final xbm xbm, final lv9 lv9) {
        czd.f((Object)editVerifiedPhoneArgs, "args");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)lv9, "editVerifiedPhoneStatusDataSource");
        super((k9e)xbm, (jbx)new vv9(editVerifiedPhoneArgs.getOptedIn()));
        this.O0 = ewj.n(this, (qsb)new EditVerifiedPhoneStatusViewModel$a(this, lv9));
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.O0.a((coe)EditVerifiedPhoneStatusViewModel.P0[0]);
    }
}
