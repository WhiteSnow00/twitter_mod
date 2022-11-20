// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.api.args;

import com.twitter.nft.subsystem.model.Web3Wallet$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.nft.subsystem.model.Web3Wallet;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001d\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dB-\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006$" }, d2 = { "Lcom/twitter/nft/subsystem/api/args/NFTGalleryContentViewArgs;", "", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/nft/subsystem/model/Web3Wallet;", "component1", "", "component2", "web3Wallet", "shouldShowAvatarPicker", "copy", "", "toString", "", "hashCode", "other", "equals", "Lcom/twitter/nft/subsystem/model/Web3Wallet;", "getWeb3Wallet", "()Lcom/twitter/nft/subsystem/model/Web3Wallet;", "Z", "getShouldShowAvatarPicker", "()Z", "<init>", "(Lcom/twitter/nft/subsystem/model/Web3Wallet;Z)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/nft/subsystem/model/Web3Wallet;ZLhlp;)V", "Companion", "$serializer", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTGalleryContentViewArgs implements ContentViewArgs
{
    public static final NFTGalleryContentViewArgs.NFTGalleryContentViewArgs$Companion Companion;
    private final boolean shouldShowAvatarPicker;
    private final Web3Wallet web3Wallet;
    
    static {
        Companion = new NFTGalleryContentViewArgs.NFTGalleryContentViewArgs$Companion();
    }
    
    public NFTGalleryContentViewArgs() {
        this(null, false, 3, null);
    }
    
    public NFTGalleryContentViewArgs(final int n, final Web3Wallet web3Wallet, final boolean shouldShowAvatarPicker, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.web3Wallet = null;
            }
            else {
                this.web3Wallet = web3Wallet;
            }
            if ((n & 0x2) == 0x0) {
                this.shouldShowAvatarPicker = false;
            }
            else {
                this.shouldShowAvatarPicker = shouldShowAvatarPicker;
            }
            return;
        }
        blz.a0(n, 0, NFTGalleryContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NFTGalleryContentViewArgs(final Web3Wallet web3Wallet, final boolean shouldShowAvatarPicker) {
        this.web3Wallet = web3Wallet;
        this.shouldShowAvatarPicker = shouldShowAvatarPicker;
    }
    
    public NFTGalleryContentViewArgs(Web3Wallet web3Wallet, boolean b, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            web3Wallet = null;
        }
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        this(web3Wallet, b);
    }
    
    public static NFTGalleryContentViewArgs copy$default(final NFTGalleryContentViewArgs nftGalleryContentViewArgs, Web3Wallet web3Wallet, boolean shouldShowAvatarPicker, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            web3Wallet = nftGalleryContentViewArgs.web3Wallet;
        }
        if ((n & 0x2) != 0x0) {
            shouldShowAvatarPicker = nftGalleryContentViewArgs.getShouldShowAvatarPicker();
        }
        return nftGalleryContentViewArgs.copy(web3Wallet, shouldShowAvatarPicker);
    }
    
    public static final void write$Self(final NFTGalleryContentViewArgs nftGalleryContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)nftGalleryContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (nftGalleryContentViewArgs.web3Wallet == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)Web3Wallet$$serializer.INSTANCE, (Object)nftGalleryContentViewArgs.web3Wallet);
        }
        int n2 = 0;
        Label_0096: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (!nftGalleryContentViewArgs.getShouldShowAvatarPicker()) {
                    break Label_0096;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.R(serialDescriptor, 1, nftGalleryContentViewArgs.getShouldShowAvatarPicker());
        }
    }
    
    public final Web3Wallet component1() {
        return this.web3Wallet;
    }
    
    public final boolean component2() {
        return this.getShouldShowAvatarPicker();
    }
    
    public final NFTGalleryContentViewArgs copy(final Web3Wallet web3Wallet, final boolean b) {
        return new NFTGalleryContentViewArgs(web3Wallet, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NFTGalleryContentViewArgs)) {
            return false;
        }
        final NFTGalleryContentViewArgs nftGalleryContentViewArgs = (NFTGalleryContentViewArgs)o;
        return czd.a((Object)this.web3Wallet, (Object)nftGalleryContentViewArgs.web3Wallet) && this.getShouldShowAvatarPicker() == nftGalleryContentViewArgs.getShouldShowAvatarPicker();
    }
    
    public boolean getShouldShowAvatarPicker() {
        return this.shouldShowAvatarPicker;
    }
    
    public final Web3Wallet getWeb3Wallet() {
        return this.web3Wallet;
    }
    
    @Override
    public int hashCode() {
        final Web3Wallet web3Wallet = this.web3Wallet;
        int hashCode;
        if (web3Wallet == null) {
            hashCode = 0;
        }
        else {
            hashCode = web3Wallet.hashCode();
        }
        int shouldShowAvatarPicker;
        if ((shouldShowAvatarPicker = (this.getShouldShowAvatarPicker() ? 1 : 0)) != 0) {
            shouldShowAvatarPicker = 1;
        }
        return hashCode * 31 + shouldShowAvatarPicker;
    }
    
    @Override
    public String toString() {
        final Web3Wallet web3Wallet = this.web3Wallet;
        final boolean shouldShowAvatarPicker = this.getShouldShowAvatarPicker();
        final StringBuilder sb = new StringBuilder();
        sb.append("NFTGalleryContentViewArgs(web3Wallet=");
        sb.append(web3Wallet);
        sb.append(", shouldShowAvatarPicker=");
        sb.append(shouldShowAvatarPicker);
        sb.append(")");
        return sb.toString();
    }
}
