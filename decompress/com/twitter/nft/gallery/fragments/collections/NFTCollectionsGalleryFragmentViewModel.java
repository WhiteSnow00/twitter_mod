// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.gallery.fragments.collections;

import com.twitter.nft.subsystem.model.Web3Wallet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.twitter.nft.subsystem.api.args.NFTGalleryContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/gallery/fragments/collections/NFTCollectionsGalleryFragmentViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lc2i;", "Lx1i;", "Lw1i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTCollectionsGalleryFragmentViewModel extends MviViewModel<c2i, x1i, w1i>
{
    public static final ape<Object>[] T0;
    public final k5i Q0;
    public final NFTGalleryContentViewArgs R0;
    public final yyh S0;
    
    static {
        T0 = new ape[] { (ape)lb0.h(NFTCollectionsGalleryFragmentViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTCollectionsGalleryFragmentViewModel(final k5i q0, final NFTGalleryContentViewArgs r0, final kcm kcm) {
        e0e.f((Object)q0, "nftRepository");
        e0e.f((Object)r0, "galleryArgs");
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)new c2i(null, 1, null));
        this.Q0 = q0;
        this.R0 = r0;
        this.W(false);
        this.S0 = hfe.v((MviViewModel)this, (stb)new stb<azh<x1i>, vzv>(this) {
            public final NFTCollectionsGalleryFragmentViewModel F0;
            
            public final Object invoke(final Object o) {
                final azh azh = (azh)o;
                e0e.f((Object)azh, "$this$weaver");
                azh.a(iam.a((Class)x1i$b.class), (hub)new a(this.F0, (mp6)null));
                azh.a(iam.a((Class)x1i$c.class), (hub)new b(this.F0, (mp6)null));
                azh.a(iam.a((Class)x1i$a.class), (hub)new c(this.F0, (mp6)null));
                return vzv.a;
            }
        });
    }
    
    public final void W(final boolean b) {
        final Web3Wallet web3Wallet = this.R0.getWeb3Wallet();
        if (web3Wallet != null) {
            final String address = web3Wallet.getAddress();
            if (address != null) {
                if (!b || (b && this.Q0.c())) {
                    MviViewModel.L((MviViewModel)this, this.Q0.j(address, b).o((ouk)new mr0((stb)NFTCollectionsGalleryFragmentViewModel$a.F0, 11)).l((rtb)new pe5((stb)NFTCollectionsGalleryFragmentViewModel$b.F0, 29)).l((rtb)new x2i((stb)new stb<u1i.a, List<? extends j1i>>(address) {
                        public final String F0;
                        
                        public final Object invoke(final Object o) {
                            final u1i.a a = (u1i.a)o;
                            e0e.f((Object)a, "it");
                            final List<t1i> a2 = a.a;
                            final String f0 = this.F0;
                            final ArrayList list = new ArrayList<j1i>(nr4.d1((Iterable)a2, 10));
                            for (final t1i t1i : a2) {
                                list.add(new j1i(t1i.a.getName(), t1i.a.getMetadata().getImageUrl(), t1i.b, t1i.a, f0));
                            }
                            return list;
                        }
                    }, 1)), (asx)null, (String)null, (hub)new NFTCollectionsGalleryFragmentViewModel$d(this, (mp6)null), 3, (Object)null);
                }
            }
        }
    }
    
    public final azh<x1i> v() {
        return (azh<x1i>)this.S0.a((ape)NFTCollectionsGalleryFragmentViewModel.T0[0]);
    }
}
