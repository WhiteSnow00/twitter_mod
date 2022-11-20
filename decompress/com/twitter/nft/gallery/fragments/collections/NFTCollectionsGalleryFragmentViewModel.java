// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.gallery.fragments.collections;

import com.twitter.nft.subsystem.model.Web3Wallet;
import java.util.List;
import com.twitter.nft.subsystem.api.args.NFTGalleryContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/gallery/fragments/collections/NFTCollectionsGalleryFragmentViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ll1i;", "Lg1i;", "Lf1i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTCollectionsGalleryFragmentViewModel extends MviViewModel<l1i, g1i, f1i>
{
    public static final coe<Object>[] R0;
    public final r4i O0;
    public final NFTGalleryContentViewArgs P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)NFTCollectionsGalleryFragmentViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTCollectionsGalleryFragmentViewModel(final r4i o0, final NFTGalleryContentViewArgs p3, final xbm xbm) {
        czd.f((Object)o0, "nftRepository");
        czd.f((Object)p3, "galleryArgs");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new l1i((List)null, 1, (rf8)null));
        this.O0 = o0;
        this.P0 = p3;
        this.W(false);
        this.Q0 = ewj.n(this, (qsb)new NFTCollectionsGalleryFragmentViewModel$e(this));
    }
    
    public final void W(final boolean b) {
        final Web3Wallet web3Wallet = this.P0.getWeb3Wallet();
        if (web3Wallet != null) {
            final String address = web3Wallet.getAddress();
            if (address != null) {
                if (!b || (b && this.O0.c())) {
                    MviViewModel.L((MviViewModel)this, this.O0.j(address, b).o((ytk)new vt1((qsb)NFTCollectionsGalleryFragmentViewModel$a.D0, 12)).l((psb)new k1i((qsb)NFTCollectionsGalleryFragmentViewModel$b.D0, 0)).l((psb)new cu4((qsb)new NFTCollectionsGalleryFragmentViewModel$c(address), 29)), (jrx)null, (String)null, (ftb)new NFTCollectionsGalleryFragmentViewModel$d(this, (go6)null), 3, (Object)null);
                }
            }
        }
    }
    
    public final jyh<g1i> v() {
        return (jyh<g1i>)this.Q0.a((coe)NFTCollectionsGalleryFragmentViewModel.R0[0]);
    }
}
