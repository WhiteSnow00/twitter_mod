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

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/gallery/fragments/recents/NFTGalleryFragmentViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lq3i;", "Lm3i;", "Ll3i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTGalleryFragmentViewModel extends MviViewModel<q3i, m3i, l3i>
{
    public static final ape<Object>[] U0;
    public final k5i Q0;
    public final NFTGalleryContentViewArgs R0;
    public final NFTCollectionActivityContentViewArgs S0;
    public final yyh T0;
    
    static {
        U0 = new ape[] { (ape)lb0.h(NFTGalleryFragmentViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTGalleryFragmentViewModel(final k5i q0, final NFTGalleryContentViewArgs r0, final NFTCollectionActivityContentViewArgs s0, final kcm kcm) {
        e0e.f((Object)q0, "nftRepository");
        e0e.f((Object)r0, "galleryArgs");
        e0e.f((Object)s0, "collectionArgs");
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)new q3i(null, 1, null));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.W(false);
        this.T0 = hfe.v((MviViewModel)this, (stb)new stb<azh<m3i>, vzv>(this) {
            public final NFTGalleryFragmentViewModel F0;
            
            public final Object invoke(final Object o) {
                final azh azh = (azh)o;
                e0e.f((Object)azh, "$this$weaver");
                azh.a(iam.a((Class)m3i$b.class), (hub)new a(this.F0, (mp6)null));
                azh.a(iam.a((Class)m3i$a.class), (hub)new b(this.F0, (mp6)null));
                return vzv.a;
            }
        });
    }
    
    public final void W(final boolean b) {
        final Web3Wallet web3Wallet = this.R0.getWeb3Wallet();
        String s;
        if (web3Wallet == null || (s = web3Wallet.getAddress()) == null) {
            s = this.S0.getAddress();
        }
        if (s != null && (!b || (b && this.Q0.b()))) {
            MviViewModel.N((MviViewModel)this, (bbq)this.Q0.i(s, this.S0.getSlug(), b), (String)null, (asx)null, (hub)new NFTGalleryFragmentViewModel$a(this, (mp6)null), 3, (Object)null);
        }
    }
    
    public final azh<m3i> v() {
        return (azh<m3i>)this.T0.a((ape)NFTGalleryFragmentViewModel.U0[0]);
    }
}
