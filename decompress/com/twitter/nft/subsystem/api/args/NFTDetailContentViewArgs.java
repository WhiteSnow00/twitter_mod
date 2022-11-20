// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.api.args;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!B1\b\u0017\u0012\u0006\u0010\"\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0003J(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fH\u00c6\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006(" }, d2 = { "Lcom/twitter/nft/subsystem/api/args/NFTDetailContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "Lcgv;", "component2", "profileImageColor", "twitterUser", "copy", "(Ljava/lang/Integer;Lcgv;)Lcom/twitter/nft/subsystem/api/args/NFTDetailContentViewArgs;", "", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/Integer;", "getProfileImageColor", "Lcgv;", "getTwitterUser", "()Lcgv;", "getTwitterUser$annotations", "()V", "<init>", "(Ljava/lang/Integer;Lcgv;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lcgv;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.nft.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class NFTDetailContentViewArgs implements ContentViewArgs
{
    public static final NFTDetailContentViewArgs.NFTDetailContentViewArgs$Companion Companion;
    private final Integer profileImageColor;
    private final cgv twitterUser;
    
    static {
        Companion = new NFTDetailContentViewArgs.NFTDetailContentViewArgs$Companion();
    }
    
    public NFTDetailContentViewArgs() {
        this(null, null, 3, null);
    }
    
    public NFTDetailContentViewArgs(final int n, final Integer profileImageColor, @flp(with = jgv.class) final cgv twitterUser, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.profileImageColor = null;
            }
            else {
                this.profileImageColor = profileImageColor;
            }
            if ((n & 0x2) == 0x0) {
                this.twitterUser = null;
            }
            else {
                this.twitterUser = twitterUser;
            }
            return;
        }
        blz.a0(n, 0, NFTDetailContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public NFTDetailContentViewArgs(final Integer profileImageColor, final cgv twitterUser) {
        this.profileImageColor = profileImageColor;
        this.twitterUser = twitterUser;
    }
    
    public NFTDetailContentViewArgs(Integer n, cgv cgv, final int n2, final rf8 rf8) {
        if ((n2 & 0x1) != 0x0) {
            n = null;
        }
        if ((n2 & 0x2) != 0x0) {
            cgv = null;
        }
        this(n, cgv);
    }
    
    public static NFTDetailContentViewArgs copy$default(final NFTDetailContentViewArgs nftDetailContentViewArgs, Integer profileImageColor, cgv twitterUser, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            profileImageColor = nftDetailContentViewArgs.profileImageColor;
        }
        if ((n & 0x2) != 0x0) {
            twitterUser = nftDetailContentViewArgs.twitterUser;
        }
        return nftDetailContentViewArgs.copy(profileImageColor, twitterUser);
    }
    
    @flp(with = jgv.class)
    public static void getTwitterUser$annotations() {
    }
    
    public static final void write$Self(final NFTDetailContentViewArgs nftDetailContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)nftDetailContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (nftDetailContentViewArgs.profileImageColor == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)ktd.a, (Object)nftDetailContentViewArgs.profileImageColor);
        }
        int n2 = 0;
        Label_0096: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (nftDetailContentViewArgs.twitterUser == null) {
                    break Label_0096;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 1, (jlp)jgv.b, (Object)nftDetailContentViewArgs.twitterUser);
        }
    }
    
    public final Integer component1() {
        return this.profileImageColor;
    }
    
    public final cgv component2() {
        return this.twitterUser;
    }
    
    public final NFTDetailContentViewArgs copy(final Integer n, final cgv cgv) {
        return new NFTDetailContentViewArgs(n, cgv);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NFTDetailContentViewArgs)) {
            return false;
        }
        final NFTDetailContentViewArgs nftDetailContentViewArgs = (NFTDetailContentViewArgs)o;
        return czd.a((Object)this.profileImageColor, (Object)nftDetailContentViewArgs.profileImageColor) && czd.a((Object)this.twitterUser, (Object)nftDetailContentViewArgs.twitterUser);
    }
    
    public final Integer getProfileImageColor() {
        return this.profileImageColor;
    }
    
    public final cgv getTwitterUser() {
        return this.twitterUser;
    }
    
    @Override
    public int hashCode() {
        final Integer profileImageColor = this.profileImageColor;
        int hashCode = 0;
        int hashCode2;
        if (profileImageColor == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = profileImageColor.hashCode();
        }
        final cgv twitterUser = this.twitterUser;
        if (twitterUser != null) {
            hashCode = twitterUser.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final Integer profileImageColor = this.profileImageColor;
        final cgv twitterUser = this.twitterUser;
        final StringBuilder sb = new StringBuilder();
        sb.append("NFTDetailContentViewArgs(profileImageColor=");
        sb.append(profileImageColor);
        sb.append(", twitterUser=");
        sb.append(twitterUser);
        sb.append(")");
        return sb.toString();
    }
}
