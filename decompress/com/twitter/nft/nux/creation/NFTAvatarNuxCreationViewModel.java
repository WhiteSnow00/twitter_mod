// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.nux.creation;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/nux/creation/NFTAvatarNuxCreationViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lk0i;", "Lf0i;", "Le0i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTAvatarNuxCreationViewModel extends MviViewModel<k0i, f0i, e0i>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)NFTAvatarNuxCreationViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTAvatarNuxCreationViewModel(final xbm xbm) {
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)k0i.a);
        cbw.b((elm)zzh$o0.a);
        this.O0 = ewj.n(this, (qsb)new NFTAvatarNuxCreationViewModel$a(this));
    }
    
    public final jyh<f0i> v() {
        return (jyh<f0i>)this.O0.a((coe)NFTAvatarNuxCreationViewModel.P0[0]);
    }
}
