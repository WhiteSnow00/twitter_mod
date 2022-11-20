// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.api.args;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u001f\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB/\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\"" }, d2 = { "Lcom/twitter/nft/subsystem/api/args/NFTWalletConnectContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "address", "signature", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "getSignature", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTWalletConnectContentViewArgs implements ContentViewArgs
{
    public static final NFTWalletConnectContentViewArgs.NFTWalletConnectContentViewArgs$Companion Companion;
    private final String address;
    private final String signature;
    
    static {
        Companion = new NFTWalletConnectContentViewArgs.NFTWalletConnectContentViewArgs$Companion();
    }
    
    public NFTWalletConnectContentViewArgs() {
        this(null, null, 3, null);
    }
    
    public NFTWalletConnectContentViewArgs(final int n, final String address, final String signature, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.address = null;
            }
            else {
                this.address = address;
            }
            if ((n & 0x2) == 0x0) {
                this.signature = null;
            }
            else {
                this.signature = signature;
            }
            return;
        }
        blz.a0(n, 0, NFTWalletConnect.NFTWalletConnectContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NFTWalletConnectContentViewArgs(final String address, final String signature) {
        this.address = address;
        this.signature = signature;
    }
    
    public NFTWalletConnectContentViewArgs(String s, String s2, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            s = null;
        }
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        this(s, s2);
    }
    
    public static NFTWalletConnectContentViewArgs copy$default(final NFTWalletConnectContentViewArgs nftWalletConnectContentViewArgs, String address, String signature, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            address = nftWalletConnectContentViewArgs.address;
        }
        if ((n & 0x2) != 0x0) {
            signature = nftWalletConnectContentViewArgs.signature;
        }
        return nftWalletConnectContentViewArgs.copy(address, signature);
    }
    
    public static final void write$Self(final NFTWalletConnectContentViewArgs nftWalletConnectContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)nftWalletConnectContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (nftWalletConnectContentViewArgs.address == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)nftWalletConnectContentViewArgs.address);
        }
        int n2 = 0;
        Label_0096: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (nftWalletConnectContentViewArgs.signature == null) {
                    break Label_0096;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 1, (jlp)gkr.a, (Object)nftWalletConnectContentViewArgs.signature);
        }
    }
    
    public final String component1() {
        return this.address;
    }
    
    public final String component2() {
        return this.signature;
    }
    
    public final NFTWalletConnectContentViewArgs copy(final String s, final String s2) {
        return new NFTWalletConnectContentViewArgs(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NFTWalletConnectContentViewArgs)) {
            return false;
        }
        final NFTWalletConnectContentViewArgs nftWalletConnectContentViewArgs = (NFTWalletConnectContentViewArgs)o;
        return czd.a((Object)this.address, (Object)nftWalletConnectContentViewArgs.address) && czd.a((Object)this.signature, (Object)nftWalletConnectContentViewArgs.signature);
    }
    
    public final String getAddress() {
        return this.address;
    }
    
    public final String getSignature() {
        return this.signature;
    }
    
    @Override
    public int hashCode() {
        final String address = this.address;
        int hashCode = 0;
        int hashCode2;
        if (address == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = address.hashCode();
        }
        final String signature = this.signature;
        if (signature != null) {
            hashCode = signature.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        return zh8.o("NFTWalletConnectContentViewArgs(address=", this.address, ", signature=", this.signature, ")");
    }
}
