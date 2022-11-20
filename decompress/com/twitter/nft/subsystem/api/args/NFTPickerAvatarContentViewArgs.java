// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.api.args;

import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.nft.subsystem.model.NFTSmartContract;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!B9\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006(" }, d2 = { "Lcom/twitter/nft/subsystem/api/args/NFTPickerAvatarContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "Lcom/twitter/nft/subsystem/model/NFTSmartContract;", "component3", "imageUrl", "token", "smartContract", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "getToken", "Lcom/twitter/nft/subsystem/model/NFTSmartContract;", "getSmartContract", "()Lcom/twitter/nft/subsystem/model/NFTSmartContract;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/twitter/nft/subsystem/model/NFTSmartContract;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/twitter/nft/subsystem/model/NFTSmartContract;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTPickerAvatarContentViewArgs implements ContentViewArgs
{
    public static final NFTPickerAvatarContentViewArgs.NFTPickerAvatarContentViewArgs$Companion Companion;
    private final String imageUrl;
    private final NFTSmartContract smartContract;
    private final String token;
    
    static {
        Companion = new NFTPickerAvatarContentViewArgs.NFTPickerAvatarContentViewArgs$Companion();
    }
    
    public NFTPickerAvatarContentViewArgs(final int n, final String imageUrl, final String token, final NFTSmartContract smartContract, final hlp hlp) {
        if (0x7 == (n & 0x7)) {
            this.imageUrl = imageUrl;
            this.token = token;
            this.smartContract = smartContract;
            return;
        }
        blz.a0(n, 7, NFTPickerAvatarContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NFTPickerAvatarContentViewArgs(final String imageUrl, final String token, final NFTSmartContract smartContract) {
        this.imageUrl = imageUrl;
        this.token = token;
        this.smartContract = smartContract;
    }
    
    public static NFTPickerAvatarContentViewArgs copy$default(final NFTPickerAvatarContentViewArgs nftPickerAvatarContentViewArgs, String imageUrl, String token, NFTSmartContract smartContract, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            imageUrl = nftPickerAvatarContentViewArgs.imageUrl;
        }
        if ((n & 0x2) != 0x0) {
            token = nftPickerAvatarContentViewArgs.token;
        }
        if ((n & 0x4) != 0x0) {
            smartContract = nftPickerAvatarContentViewArgs.smartContract;
        }
        return nftPickerAvatarContentViewArgs.copy(imageUrl, token, smartContract);
    }
    
    public static final void write$Self(final NFTPickerAvatarContentViewArgs nftPickerAvatarContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)nftPickerAvatarContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final gkr a = gkr.a;
        xc6.y(serialDescriptor, 0, (jlp)a, (Object)nftPickerAvatarContentViewArgs.imageUrl);
        xc6.y(serialDescriptor, 1, (jlp)a, (Object)nftPickerAvatarContentViewArgs.token);
        xc6.y(serialDescriptor, 2, (jlp)NFTSmartContract.Companion.serializer(), (Object)nftPickerAvatarContentViewArgs.smartContract);
    }
    
    public final String component1() {
        return this.imageUrl;
    }
    
    public final String component2() {
        return this.token;
    }
    
    public final NFTSmartContract component3() {
        return this.smartContract;
    }
    
    public final NFTPickerAvatarContentViewArgs copy(final String s, final String s2, final NFTSmartContract nftSmartContract) {
        return new NFTPickerAvatarContentViewArgs(s, s2, nftSmartContract);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NFTPickerAvatarContentViewArgs)) {
            return false;
        }
        final NFTPickerAvatarContentViewArgs nftPickerAvatarContentViewArgs = (NFTPickerAvatarContentViewArgs)o;
        return czd.a((Object)this.imageUrl, (Object)nftPickerAvatarContentViewArgs.imageUrl) && czd.a((Object)this.token, (Object)nftPickerAvatarContentViewArgs.token) && czd.a((Object)this.smartContract, (Object)nftPickerAvatarContentViewArgs.smartContract);
    }
    
    public final String getImageUrl() {
        return this.imageUrl;
    }
    
    public final NFTSmartContract getSmartContract() {
        return this.smartContract;
    }
    
    public final String getToken() {
        return this.token;
    }
    
    @Override
    public int hashCode() {
        final String imageUrl = this.imageUrl;
        int hashCode = 0;
        int hashCode2;
        if (imageUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = imageUrl.hashCode();
        }
        final String token = this.token;
        int hashCode3;
        if (token == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = token.hashCode();
        }
        final NFTSmartContract smartContract = this.smartContract;
        if (smartContract != null) {
            hashCode = smartContract.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final String imageUrl = this.imageUrl;
        final String token = this.token;
        final NFTSmartContract smartContract = this.smartContract;
        final StringBuilder q = tqf.q("NFTPickerAvatarContentViewArgs(imageUrl=", imageUrl, ", token=", token, ", smartContract=");
        q.append(smartContract);
        q.append(")");
        return q.toString();
    }
}
