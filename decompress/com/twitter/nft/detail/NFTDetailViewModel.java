// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.detail;

import com.twitter.nft.subsystem.api.args.NFTDetailContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/detail/NFTDetailViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ln2i;", "Lf2i;", "Lo1i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTDetailViewModel extends MviViewModel<n2i, f2i, o1i>
{
    public static final coe<Object>[] Q0;
    public final NFTDetailContentViewArgs O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)NFTDetailViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTDetailViewModel(final r4i r4i, final NFTDetailContentViewArgs o0, final xbm xbm) {
        czd.f((Object)r4i, "nftRepository");
        czd.f((Object)o0, "args");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new n2i((c0i)null, (Integer)null, (cgv)null, 7, (rf8)null));
        this.O0 = o0;
        cbw.b((elm)zzh$a.a);
        this.Q((qsb)new NFTDetailViewModel$a(this));
        final cgv twitterUser = o0.getTwitterUser();
        if (twitterUser != null) {
            MviViewModel.N((MviViewModel)this, r4i.f(String.valueOf(twitterUser.D0)), (String)null, (jrx)null, (ftb)new NFTDetailViewModel$b(this, (go6)null), 3, (Object)null);
        }
        this.P0 = ewj.n(this, (qsb)new NFTDetailViewModel$c(this));
    }
    
    public final jyh<f2i> v() {
        return (jyh<f2i>)this.P0.a((coe)NFTDetailViewModel.Q0[0]);
    }
}
