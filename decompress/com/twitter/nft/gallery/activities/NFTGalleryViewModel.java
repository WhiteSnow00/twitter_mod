// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.gallery.activities;

import com.twitter.nft.subsystem.model.Web3Wallet;
import com.twitter.nft.subsystem.api.args.NFTGalleryContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/gallery/activities/NFTGalleryViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Le3i;", "Lz2i;", "Lr2i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTGalleryViewModel extends MviViewModel<e3i, z2i, r2i>
{
    public static final coe<Object>[] R0;
    public final NFTGalleryContentViewArgs O0;
    public final r4i P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)NFTGalleryViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTGalleryViewModel(final NFTGalleryContentViewArgs o0, final r4i p3, final xbm xbm) {
        czd.f((Object)o0, "nftGalleryContentViewArgs");
        czd.f((Object)p3, "nftRepository");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)e3i$b.a);
        this.O0 = o0;
        this.P0 = p3;
        cbw.b((elm)zzh$x.a);
        final Web3Wallet web3Wallet = o0.getWeb3Wallet();
        String address;
        if (web3Wallet != null) {
            address = web3Wallet.getAddress();
        }
        else {
            address = null;
        }
        if (address != null) {
            final int a = q4i.a;
            MviViewModel.N((MviViewModel)this, p3.i(address, (String)null, false).w((psb)new x55((qsb)NFTGalleryViewModel$a.D0, 29)).B((Object)e3i$a.a), (String)null, (jrx)null, (ftb)new NFTGalleryViewModel$b(this, (go6)null), 3, (Object)null);
        }
        this.Q0 = ewj.n(this, (qsb)new NFTGalleryViewModel$c(this));
    }
    
    public final jyh<z2i> v() {
        return (jyh<z2i>)this.Q0.a((coe)NFTGalleryViewModel.R0[0]);
    }
}
