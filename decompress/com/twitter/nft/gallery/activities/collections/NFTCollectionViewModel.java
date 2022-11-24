// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.gallery.activities.collections;

import com.twitter.nft.subsystem.api.args.NFTCollectionActivityContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/gallery/activities/collections/NFTCollectionViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ls1i;", "Li1i;", "Lh1i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTCollectionViewModel extends MviViewModel<s1i, i1i, h1i>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(NFTCollectionViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTCollectionViewModel(final NFTCollectionActivityContentViewArgs nftCollectionActivityContentViewArgs, final kcm kcm) {
        e0e.f((Object)nftCollectionActivityContentViewArgs, "args");
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)new s1i((String)null, (String)null, 3, (wg8)null));
        sbw.b((tlm)q0i$s.a);
        this.Q((stb)new stb<s1i, s1i>(nftCollectionActivityContentViewArgs) {
            public final NFTCollectionActivityContentViewArgs F0;
            
            public final Object invoke(final Object o) {
                e0e.f((Object)o, "$this$setState");
                return new s1i(this.F0.getName(), this.F0.getAddress());
            }
        });
        this.Q0 = hfe.v((MviViewModel)this, (stb)new stb<azh<i1i>, vzv>(this) {
            public final NFTCollectionViewModel F0;
            
            public final Object invoke(final Object o) {
                final azh azh = (azh)o;
                e0e.f((Object)azh, "$this$weaver");
                azh.a(iam.a((Class)i1i$a.class), (hub)new a(this.F0, (mp6)null));
                return vzv.a;
            }
        });
    }
    
    public final azh<i1i> v() {
        return (azh<i1i>)this.Q0.a((ape)NFTCollectionViewModel.R0[0]);
    }
}
