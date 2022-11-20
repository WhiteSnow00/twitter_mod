// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.avatarpicker;

import com.twitter.nft.subsystem.model.NFTSmartContract;
import com.twitter.nft.subsystem.api.args.NFTPickerAvatarContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/avatarpicker/NFTPickerAvatarViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lp4i;", "Lk4i;", "Lj4i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTPickerAvatarViewModel extends MviViewModel<p4i, k4i, j4i>
{
    public static final coe<Object>[] Q0;
    public final trc O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)NFTPickerAvatarViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTPickerAvatarViewModel(final r4i r4i, final NFTPickerAvatarContentViewArgs nftPickerAvatarContentViewArgs, final xbm xbm, final trc o0) {
        czd.f((Object)r4i, "nftRepository");
        czd.f((Object)nftPickerAvatarContentViewArgs, "args");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "httpRequestController");
        super((k9e)xbm, (jbx)new p4i((String)null, (String)null, (NFTSmartContract)null, 7, (rf8)null));
        this.O0 = o0;
        cbw.b((elm)zzh$d.a);
        this.Q((qsb)new NFTPickerAvatarViewModel$a(nftPickerAvatarContentViewArgs));
        this.P0 = ewj.n(this, (qsb)new NFTPickerAvatarViewModel$b(this, r4i));
    }
    
    public final jyh<k4i> v() {
        return (jyh<k4i>)this.P0.a((coe)NFTPickerAvatarViewModel.Q0[0]);
    }
}
