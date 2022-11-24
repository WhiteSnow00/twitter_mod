// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.gallery.activities;

import com.twitter.nft.subsystem.model.Web3Wallet;
import com.twitter.nft.subsystem.api.args.NFTGalleryContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/gallery/activities/NFTGalleryViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lx3i;", "Lr3i;", "Lj3i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTGalleryViewModel extends MviViewModel<x3i, r3i, j3i>
{
    public static final ape<Object>[] T0;
    public final NFTGalleryContentViewArgs Q0;
    public final k5i R0;
    public final yyh S0;
    
    static {
        T0 = new ape[] { (ape)lb0.h(NFTGalleryViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTGalleryViewModel(final NFTGalleryContentViewArgs q0, final k5i r0, final kcm kcm) {
        e0e.f((Object)q0, "nftGalleryContentViewArgs");
        e0e.f((Object)r0, "nftRepository");
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)x3i$b.a);
        this.Q0 = q0;
        this.R0 = r0;
        sbw.b((tlm)q0i$x.a);
        final Web3Wallet web3Wallet = q0.getWeb3Wallet();
        String address;
        if (web3Wallet != null) {
            address = web3Wallet.getAddress();
        }
        else {
            address = null;
        }
        if (address != null) {
            final int a = j5i.a;
            MviViewModel.N((MviViewModel)this, r0.i(address, null, false).w((rtb)new pe5((stb)NFTGalleryViewModel$a.F0, 28)).B((Object)x3i$a.a), (String)null, (asx)null, (hub)new NFTGalleryViewModel$b(this, (mp6)null), 3, (Object)null);
        }
        this.S0 = hfe.v((MviViewModel)this, (stb)new stb<azh<r3i>, vzv>(this) {
            public final NFTGalleryViewModel F0;
            
            public final Object invoke(final Object o) {
                final azh azh = (azh)o;
                e0e.f((Object)azh, "$this$weaver");
                azh.a(iam.a((Class)r3i$c.class), (hub)new a(this.F0, (mp6)null));
                azh.a(iam.a((Class)r3i$a.class), (hub)new b(this.F0, (mp6)null));
                azh.a(iam.a((Class)r3i$b.class), (hub)new c(this.F0, (mp6)null));
                return vzv.a;
            }
        });
    }
    
    public final azh<r3i> v() {
        return (azh<r3i>)this.S0.a((ape)NFTGalleryViewModel.T0[0]);
    }
}
