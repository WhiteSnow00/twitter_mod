// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.walletconnect;

import java.util.Objects;
import com.twitter.nft.subsystem.model.Web3Wallet;
import java.net.URLEncoder;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/nft/walletconnect/NFTWalletConnectViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lx5i;", "Lj5i;", "Lh5i;", "Companion", "d", "feature.tfa.nft.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTWalletConnectViewModel extends MviViewModel<x5i, j5i, h5i>
{
    public static final NFTWalletConnectViewModel.NFTWalletConnectViewModel$d Companion;
    public static final coe<Object>[] Q0;
    public static final String R0;
    public final r4i O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)NFTWalletConnectViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new NFTWalletConnectViewModel.NFTWalletConnectViewModel$d();
        final String encode = URLEncoder.encode("&an=true", "UTF-8");
        czd.e((Object)encode, "encode(ANDROID_DEEPLINK_PARAM, \"UTF-8\")");
        R0 = encode;
    }
    
    public NFTWalletConnectViewModel(final r4i o0, final xbm xbm, final kix kix, final lai lai) {
        czd.f((Object)o0, "nftRepository");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)kix, "walletConnectDeeplinkDispatcher");
        czd.f((Object)lai, "navigationDispatcher");
        super((k9e)xbm, (jbx)new x5i((g5i)null, (Web3Wallet)null, (csw)null, (String)null, (String)null, (String)null, false, 127, (rf8)null));
        this.O0 = o0;
        cbw.b((elm)zzh$l0.a);
        final kog firstElement = ((h5j)kix.a).filter((ytk)new vi4((qsb)NFTWalletConnectViewModel$a.D0, 13)).firstElement();
        czd.e((Object)firstElement, "walletConnectDeeplinkDis\u2026\n        }.firstElement()");
        MviViewModel.L((MviViewModel)this, firstElement, (jrx)null, (String)null, (ftb)new NFTWalletConnectViewModel$b(this, (go6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (h5j)lai.a, (String)null, (jrx)null, (ftb)new NFTWalletConnectViewModel$c(this, (go6)null), 3, (Object)null);
        this.X();
        this.P0 = ewj.n(this, (qsb)new NFTWalletConnectViewModel$f(this));
    }
    
    public static final void W(final NFTWalletConnectViewModel nftWalletConnectViewModel, final String s, final String s2) {
        Objects.requireNonNull(nftWalletConnectViewModel);
        final StringBuilder sb = new StringBuilder();
        sb.append("verifyWallet::send ");
        sb.append(s);
        sb.append(" ");
        sb.append(s2);
        s9g.j("NFT_TAG", sb.toString());
        MviViewModel.N((MviViewModel)nftWalletConnectViewModel, nftWalletConnectViewModel.O0.d(s, s2), (String)null, (jrx)null, (ftb)new v5i(nftWalletConnectViewModel, (go6)null), 3, (Object)null);
    }
    
    public final void X() {
        MviViewModel.N((MviViewModel)this, this.O0.e(), (String)null, (jrx)null, (ftb)new NFTWalletConnectViewModel$e(this, (go6)null), 3, (Object)null);
    }
    
    public final jyh<j5i> v() {
        return (jyh<j5i>)this.P0.a((coe)NFTWalletConnectViewModel.Q0[0]);
    }
}
