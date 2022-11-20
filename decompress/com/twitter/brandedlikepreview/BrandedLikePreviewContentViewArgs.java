// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B!\b\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001e\u0010\u001fB/\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006&" }, d2 = { "Lcom/twitter/brandedlikepreview/BrandedLikePreviewContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Long;", "animationPath", "tweetId", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/twitter/brandedlikepreview/BrandedLikePreviewContentViewArgs;", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAnimationPath", "()Ljava/lang/String;", "Ljava/lang/Long;", "getTweetId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Lhlp;)V", "Companion", "$serializer", "feature.tfa.branded-like-preview.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BrandedLikePreviewContentViewArgs implements ContentViewArgs
{
    public static final BrandedLikePreviewContentViewArgs.BrandedLikePreviewContentViewArgs$Companion Companion;
    private final String animationPath;
    private final Long tweetId;
    
    static {
        Companion = new BrandedLikePreviewContentViewArgs.BrandedLikePreviewContentViewArgs$Companion();
    }
    
    public BrandedLikePreviewContentViewArgs() {
        this(null, null, 3, null);
    }
    
    public BrandedLikePreviewContentViewArgs(final int n, final String animationPath, final Long tweetId, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.animationPath = null;
            }
            else {
                this.animationPath = animationPath;
            }
            if ((n & 0x2) == 0x0) {
                this.tweetId = null;
            }
            else {
                this.tweetId = tweetId;
            }
            return;
        }
        blz.a0(n, 0, BrandedLikePreviewContentView.BrandedLikePreviewContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BrandedLikePreviewContentViewArgs(final String s) {
        this(s, null, 2, null);
    }
    
    public BrandedLikePreviewContentViewArgs(final String animationPath, final Long tweetId) {
        this.animationPath = animationPath;
        this.tweetId = tweetId;
    }
    
    public BrandedLikePreviewContentViewArgs(String s, Long n, final int n2, final rf8 rf8) {
        if ((n2 & 0x1) != 0x0) {
            s = null;
        }
        if ((n2 & 0x2) != 0x0) {
            n = null;
        }
        this(s, n);
    }
    
    public static BrandedLikePreviewContentViewArgs copy$default(final BrandedLikePreviewContentViewArgs brandedLikePreviewContentViewArgs, String animationPath, Long tweetId, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            animationPath = brandedLikePreviewContentViewArgs.animationPath;
        }
        if ((n & 0x2) != 0x0) {
            tweetId = brandedLikePreviewContentViewArgs.tweetId;
        }
        return brandedLikePreviewContentViewArgs.copy(animationPath, tweetId);
    }
    
    public static final void write$Self(final BrandedLikePreviewContentViewArgs brandedLikePreviewContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)brandedLikePreviewContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (brandedLikePreviewContentViewArgs.animationPath == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)brandedLikePreviewContentViewArgs.animationPath);
        }
        int n2 = 0;
        Label_0096: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (brandedLikePreviewContentViewArgs.tweetId == null) {
                    break Label_0096;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 1, (jlp)ccg.a, (Object)brandedLikePreviewContentViewArgs.tweetId);
        }
    }
    
    public final String component1() {
        return this.animationPath;
    }
    
    public final Long component2() {
        return this.tweetId;
    }
    
    public final BrandedLikePreviewContentViewArgs copy(final String s, final Long n) {
        return new BrandedLikePreviewContentViewArgs(s, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BrandedLikePreviewContentViewArgs)) {
            return false;
        }
        final BrandedLikePreviewContentViewArgs brandedLikePreviewContentViewArgs = (BrandedLikePreviewContentViewArgs)o;
        return czd.a((Object)this.animationPath, (Object)brandedLikePreviewContentViewArgs.animationPath) && czd.a((Object)this.tweetId, (Object)brandedLikePreviewContentViewArgs.tweetId);
    }
    
    public final String getAnimationPath() {
        return this.animationPath;
    }
    
    public final Long getTweetId() {
        return this.tweetId;
    }
    
    @Override
    public int hashCode() {
        final String animationPath = this.animationPath;
        int hashCode = 0;
        int hashCode2;
        if (animationPath == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = animationPath.hashCode();
        }
        final Long tweetId = this.tweetId;
        if (tweetId != null) {
            hashCode = tweetId.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final String animationPath = this.animationPath;
        final Long tweetId = this.tweetId;
        final StringBuilder sb = new StringBuilder();
        sb.append("BrandedLikePreviewContentViewArgs(animationPath=");
        sb.append(animationPath);
        sb.append(", tweetId=");
        sb.append(tweetId);
        sb.append(")");
        return sb.toString();
    }
}
