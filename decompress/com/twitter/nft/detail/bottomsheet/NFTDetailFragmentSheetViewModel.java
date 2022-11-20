// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.detail.bottomsheet;

import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/detail/bottomsheet/NFTDetailFragmentSheetViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Le2i;", "Ls1i;", "Lr1i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTDetailFragmentSheetViewModel extends MviViewModel<e2i, s1i, r1i>
{
    public static final coe<Object>[] R0;
    public final Context O0;
    public final p2i P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)NFTDetailFragmentSheetViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTDetailFragmentSheetViewModel(final Context o0, final c4i c4i, final p2i p4, final xbm xbm) {
        czd.f((Object)o0, "context");
        czd.f((Object)c4i, "nftMetadataDispatcher");
        czd.f((Object)p4, "nftFriendshipRepository");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new e2i((c0i)null, (Boolean)null, false, (cgv)null, false, 31, (rf8)null));
        this.O0 = o0;
        this.P0 = p4;
        MviViewModel.M((MviViewModel)this, (h5j)c4i.a, (String)null, (jrx)null, (ftb)new NFTDetailFragmentSheetViewModel$a(this, (go6)null), 3, (Object)null);
        this.Q0 = ewj.n(this, (qsb)new NFTDetailFragmentSheetViewModel$b(this));
    }
    
    public final jyh<s1i> v() {
        return (jyh<s1i>)this.Q0.a((coe)NFTDetailFragmentSheetViewModel.R0[0]);
    }
}
