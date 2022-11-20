// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.gallery.activities.collections;

import com.twitter.nft.subsystem.api.args.NFTCollectionActivityContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/gallery/activities/collections/NFTCollectionViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lb1i;", "Lr0i;", "Lq0i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTCollectionViewModel extends MviViewModel<b1i, r0i, q0i>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)NFTCollectionViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTCollectionViewModel(final NFTCollectionActivityContentViewArgs nftCollectionActivityContentViewArgs, final xbm xbm) {
        czd.f((Object)nftCollectionActivityContentViewArgs, "args");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new b1i(null, null, 3, null));
        cbw.b((elm)zzh$s.a);
        this.Q((qsb)new NFTCollectionViewModel$a(nftCollectionActivityContentViewArgs));
        this.O0 = ewj.n(this, (qsb)new NFTCollectionViewModel$b(this));
    }
    
    public final jyh<r0i> v() {
        return (jyh<r0i>)this.O0.a((coe)NFTCollectionViewModel.P0[0]);
    }
}
