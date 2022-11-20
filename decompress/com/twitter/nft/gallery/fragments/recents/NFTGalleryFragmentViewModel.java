// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.gallery.fragments.recents;

import com.twitter.nft.subsystem.model.Web3Wallet;
import java.util.List;
import com.twitter.nft.subsystem.api.args.NFTCollectionActivityContentViewArgs;
import com.twitter.nft.subsystem.api.args.NFTGalleryContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/gallery/fragments/recents/NFTGalleryFragmentViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ly2i;", "Lu2i;", "Lt2i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTGalleryFragmentViewModel extends MviViewModel<y2i, u2i, t2i>
{
    public static final coe<Object>[] S0;
    public final r4i O0;
    public final NFTGalleryContentViewArgs P0;
    public final NFTCollectionActivityContentViewArgs Q0;
    public final hyh R0;
    
    static {
        S0 = new coe[] { (coe)w9.f((Class)NFTGalleryFragmentViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTGalleryFragmentViewModel(final r4i o0, final NFTGalleryContentViewArgs p4, final NFTCollectionActivityContentViewArgs q0, final xbm xbm) {
        czd.f((Object)o0, "nftRepository");
        czd.f((Object)p4, "galleryArgs");
        czd.f((Object)q0, "collectionArgs");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new y2i((List)null, 1, (rf8)null));
        this.O0 = o0;
        this.P0 = p4;
        this.Q0 = q0;
        this.W(false);
        this.R0 = ewj.n(this, (qsb)new NFTGalleryFragmentViewModel$b(this));
    }
    
    public final void W(final boolean b) {
        final Web3Wallet web3Wallet = this.P0.getWeb3Wallet();
        String s;
        if (web3Wallet == null || (s = web3Wallet.getAddress()) == null) {
            s = this.Q0.getAddress();
        }
        if (s != null && (!b || (b && this.O0.b()))) {
            MviViewModel.N((MviViewModel)this, this.O0.i(s, this.Q0.getSlug(), b), (String)null, (jrx)null, (ftb)new NFTGalleryFragmentViewModel$a(this, (go6)null), 3, (Object)null);
        }
    }
    
    public final jyh<u2i> v() {
        return (jyh<u2i>)this.R0.a((coe)NFTGalleryFragmentViewModel.S0[0]);
    }
}
