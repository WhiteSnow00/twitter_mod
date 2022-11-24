// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.nux.creation;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/nft/nux/creation/NFTAvatarNuxCreationViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lb1i;", "Lw0i;", "Lv0i;", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTAvatarNuxCreationViewModel extends MviViewModel<b1i, w0i, v0i>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(NFTAvatarNuxCreationViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NFTAvatarNuxCreationViewModel(final kcm kcm) {
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)b1i.a);
        sbw.b((tlm)q0i$o0.a);
        this.Q0 = hfe.v((MviViewModel)this, (stb)new stb<azh<w0i>, vzv>(this) {
            public final NFTAvatarNuxCreationViewModel F0;
            
            public final Object invoke(final Object o) {
                final azh azh = (azh)o;
                e0e.f((Object)azh, "$this$weaver");
                azh.a(iam.a((Class)w0i$c.class), (hub)new a(this.F0, (mp6)null));
                azh.a(iam.a((Class)w0i$b.class), (hub)new b(this.F0, (mp6)null));
                azh.a(iam.a((Class)w0i$a.class), (hub)new c(this.F0, (mp6)null));
                return vzv.a;
            }
        });
    }
    
    public final azh<w0i> v() {
        return (azh<w0i>)this.Q0.a((ape)NFTAvatarNuxCreationViewModel.R0[0]);
    }
}
