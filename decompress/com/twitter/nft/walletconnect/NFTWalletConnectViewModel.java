// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.walletconnect;

import java.util.Objects;
import com.twitter.nft.subsystem.model.Web3Wallet;
import java.net.URLEncoder;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/nft/walletconnect/NFTWalletConnectViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lr6i;", "Lc6i;", "La6i;", "Companion", "d", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTWalletConnectViewModel extends MviViewModel<r6i, c6i, a6i>
{
    public static final NFTWalletConnectViewModel.NFTWalletConnectViewModel$d Companion;
    public static final ape<Object>[] S0;
    public static final String T0;
    public final k5i Q0;
    public final yyh R0;
    
    static {
        S0 = new ape[] { (ape)lb0.h(NFTWalletConnectViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new NFTWalletConnectViewModel.NFTWalletConnectViewModel$d();
        final String encode = URLEncoder.encode("&an=true", "UTF-8");
        e0e.e((Object)encode, "encode(ANDROID_DEEPLINK_PARAM, \"UTF-8\")");
        T0 = encode;
    }
    
    public NFTWalletConnectViewModel(final k5i q0, final kcm kcm, final zix zix, final dbi dbi) {
        e0e.f((Object)q0, "nftRepository");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)zix, "walletConnectDeeplinkDispatcher");
        e0e.f((Object)dbi, "navigationDispatcher");
        super((iae)kcm, (ccx)new r6i(null, null, null, null, null, null, false, 127, null));
        this.Q0 = q0;
        sbw.b((tlm)q0i$l0.a);
        final epg firstElement = ((t5j)zix.a).filter((ouk)new m7k((stb)NFTWalletConnectViewModel$a.F0, 12)).firstElement();
        e0e.e((Object)firstElement, "walletConnectDeeplinkDis\u2026\n        }.firstElement()");
        MviViewModel.L((MviViewModel)this, firstElement, (asx)null, (String)null, (hub)new NFTWalletConnectViewModel$b(this, (mp6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (t5j)dbi.a, (String)null, (asx)null, (hub)new NFTWalletConnectViewModel$c(this, (mp6)null), 3, (Object)null);
        this.X();
        this.R0 = hfe.v((MviViewModel)this, (stb)new stb<azh<c6i>, vzv>(this) {
            public final NFTWalletConnectViewModel F0;
            
            public final Object invoke(final Object o) {
                final azh azh = (azh)o;
                e0e.f((Object)azh, "$this$weaver");
                azh.a(iam.a((Class)c6i$g.class), (hub)new b(this.F0, (mp6)null));
                azh.a(iam.a((Class)c6i$a.class), (hub)new c(this.F0, (mp6)null));
                azh.a(iam.a((Class)c6i$h.class), (hub)new d(this.F0, (mp6)null));
                azh.a(iam.a((Class)c6i$i.class), (hub)new e(this.F0, (mp6)null));
                azh.a(iam.a((Class)c6i$e.class), (hub)new f(this.F0, (mp6)null));
                azh.a(iam.a((Class)c6i$b.class), (hub)new g(this.F0, (mp6)null));
                azh.a(iam.a((Class)c6i$c.class), (hub)new h(this.F0, (mp6)null));
                azh.a(iam.a((Class)c6i$f.class), (hub)new i(this.F0, (mp6)null));
                azh.a(iam.a((Class)c6i$d.class), (hub)new j(this.F0, (mp6)null));
                return vzv.a;
            }
        });
    }
    
    public static final void W(final NFTWalletConnectViewModel nftWalletConnectViewModel, final String s, final String s2) {
        Objects.requireNonNull(nftWalletConnectViewModel);
        final StringBuilder sb = new StringBuilder();
        sb.append("verifyWallet::send ");
        sb.append(s);
        sb.append(" ");
        sb.append(s2);
        nag.j("NFT_TAG", sb.toString());
        MviViewModel.N((MviViewModel)nftWalletConnectViewModel, (bbq)nftWalletConnectViewModel.Q0.d(s, s2), (String)null, (asx)null, (hub)new p6i(nftWalletConnectViewModel, (mp6)null), 3, (Object)null);
    }
    
    public final void X() {
        MviViewModel.N((MviViewModel)this, (bbq)this.Q0.e(), (String)null, (asx)null, (hub)new NFTWalletConnectViewModel$e(this, (mp6)null), 3, (Object)null);
    }
    
    public final azh<c6i> v() {
        return (azh<c6i>)this.R0.a((ape)NFTWalletConnectViewModel.S0[0]);
    }
}
