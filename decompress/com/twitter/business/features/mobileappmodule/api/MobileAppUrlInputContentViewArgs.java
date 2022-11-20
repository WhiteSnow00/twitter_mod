// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.features.mobileappmodule.api;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BG\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b+\u0010,B_\b\u0017\u0012\u0006\u0010-\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\tH\u00c6\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0003\u0010\u0018\u001a\u00020\tH\u00c6\u0001J\t\u0010\u001a\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b*\u0010\"¨\u00063" }, d2 = { "Lcom/twitter/business/features/mobileappmodule/api/MobileAppUrlInputContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "tag", "inputUrl", "screenTitle", "urlInputLabel", "urlInputHint", "inputCharacterMaxCount", "scribePageName", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "getInputUrl", "getScreenTitle", "getUrlInputLabel", "getUrlInputHint", "I", "getInputCharacterMaxCount", "()I", "getScribePageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.features.mobile-app-module.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class MobileAppUrlInputContentViewArgs implements ContentViewArgs
{
    public static final MobileAppUrlInputContentViewArgs.MobileAppUrlInputContentViewArgs$Companion Companion;
    private final int inputCharacterMaxCount;
    private final String inputUrl;
    private final String screenTitle;
    private final String scribePageName;
    private final String tag;
    private final String urlInputHint;
    private final String urlInputLabel;
    
    static {
        Companion = new MobileAppUrlInputContentViewArgs.MobileAppUrlInputContentViewArgs$Companion();
    }
    
    public MobileAppUrlInputContentViewArgs(final int n, final String tag, final String inputUrl, final String screenTitle, final String urlInputLabel, final String urlInputHint, final int inputCharacterMaxCount, final String scribePageName, final hlp hlp) {
        if (0x7C == (n & 0x7C)) {
            if ((n & 0x1) == 0x0) {
                this.tag = null;
            }
            else {
                this.tag = tag;
            }
            if ((n & 0x2) == 0x0) {
                this.inputUrl = "";
            }
            else {
                this.inputUrl = inputUrl;
            }
            this.screenTitle = screenTitle;
            this.urlInputLabel = urlInputLabel;
            this.urlInputHint = urlInputHint;
            this.inputCharacterMaxCount = inputCharacterMaxCount;
            this.scribePageName = scribePageName;
            return;
        }
        blz.a0(n, 124, MobileAppUrlInputContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public MobileAppUrlInputContentViewArgs(final String tag, final String inputUrl, final String screenTitle, final String urlInputLabel, final String urlInputHint, final int inputCharacterMaxCount, final String scribePageName) {
        czd.f((Object)inputUrl, "inputUrl");
        czd.f((Object)screenTitle, "screenTitle");
        czd.f((Object)urlInputLabel, "urlInputLabel");
        czd.f((Object)urlInputHint, "urlInputHint");
        czd.f((Object)scribePageName, "scribePageName");
        this.tag = tag;
        this.inputUrl = inputUrl;
        this.screenTitle = screenTitle;
        this.urlInputLabel = urlInputLabel;
        this.urlInputHint = urlInputHint;
        this.inputCharacterMaxCount = inputCharacterMaxCount;
        this.scribePageName = scribePageName;
    }
    
    public MobileAppUrlInputContentViewArgs(String s, String s2, final String s3, final String s4, final String s5, final int n, final String s6, final int n2, final rf8 rf8) {
        if ((n2 & 0x1) != 0x0) {
            s = null;
        }
        if ((n2 & 0x2) != 0x0) {
            s2 = "";
        }
        this(s, s2, s3, s4, s5, n, s6);
    }
    
    public static MobileAppUrlInputContentViewArgs copy$default(final MobileAppUrlInputContentViewArgs mobileAppUrlInputContentViewArgs, String tag, String inputUrl, String screenTitle, String urlInputLabel, String urlInputHint, int inputCharacterMaxCount, String scribePageName, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            tag = mobileAppUrlInputContentViewArgs.tag;
        }
        if ((n & 0x2) != 0x0) {
            inputUrl = mobileAppUrlInputContentViewArgs.inputUrl;
        }
        if ((n & 0x4) != 0x0) {
            screenTitle = mobileAppUrlInputContentViewArgs.screenTitle;
        }
        if ((n & 0x8) != 0x0) {
            urlInputLabel = mobileAppUrlInputContentViewArgs.urlInputLabel;
        }
        if ((n & 0x10) != 0x0) {
            urlInputHint = mobileAppUrlInputContentViewArgs.urlInputHint;
        }
        if ((n & 0x20) != 0x0) {
            inputCharacterMaxCount = mobileAppUrlInputContentViewArgs.inputCharacterMaxCount;
        }
        if ((n & 0x40) != 0x0) {
            scribePageName = mobileAppUrlInputContentViewArgs.scribePageName;
        }
        return mobileAppUrlInputContentViewArgs.copy(tag, inputUrl, screenTitle, urlInputLabel, urlInputHint, inputCharacterMaxCount, scribePageName);
    }
    
    public static final void write$Self(final MobileAppUrlInputContentViewArgs mobileAppUrlInputContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)mobileAppUrlInputContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (mobileAppUrlInputContentViewArgs.tag == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)mobileAppUrlInputContentViewArgs.tag);
        }
        int n2 = 0;
        Label_0101: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (czd.a((Object)mobileAppUrlInputContentViewArgs.inputUrl, (Object)"")) {
                    break Label_0101;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.S(serialDescriptor, 1, mobileAppUrlInputContentViewArgs.inputUrl);
        }
        xc6.S(serialDescriptor, 2, mobileAppUrlInputContentViewArgs.screenTitle);
        xc6.S(serialDescriptor, 3, mobileAppUrlInputContentViewArgs.urlInputLabel);
        xc6.S(serialDescriptor, 4, mobileAppUrlInputContentViewArgs.urlInputHint);
        xc6.Q(serialDescriptor, 5, mobileAppUrlInputContentViewArgs.inputCharacterMaxCount);
        xc6.S(serialDescriptor, 6, mobileAppUrlInputContentViewArgs.scribePageName);
    }
    
    public final String component1() {
        return this.tag;
    }
    
    public final String component2() {
        return this.inputUrl;
    }
    
    public final String component3() {
        return this.screenTitle;
    }
    
    public final String component4() {
        return this.urlInputLabel;
    }
    
    public final String component5() {
        return this.urlInputHint;
    }
    
    public final int component6() {
        return this.inputCharacterMaxCount;
    }
    
    public final String component7() {
        return this.scribePageName;
    }
    
    public final MobileAppUrlInputContentViewArgs copy(final String s, final String s2, final String s3, final String s4, final String s5, final int n, final String s6) {
        czd.f((Object)s2, "inputUrl");
        czd.f((Object)s3, "screenTitle");
        czd.f((Object)s4, "urlInputLabel");
        czd.f((Object)s5, "urlInputHint");
        czd.f((Object)s6, "scribePageName");
        return new MobileAppUrlInputContentViewArgs(s, s2, s3, s4, s5, n, s6);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MobileAppUrlInputContentViewArgs)) {
            return false;
        }
        final MobileAppUrlInputContentViewArgs mobileAppUrlInputContentViewArgs = (MobileAppUrlInputContentViewArgs)o;
        return czd.a((Object)this.tag, (Object)mobileAppUrlInputContentViewArgs.tag) && czd.a((Object)this.inputUrl, (Object)mobileAppUrlInputContentViewArgs.inputUrl) && czd.a((Object)this.screenTitle, (Object)mobileAppUrlInputContentViewArgs.screenTitle) && czd.a((Object)this.urlInputLabel, (Object)mobileAppUrlInputContentViewArgs.urlInputLabel) && czd.a((Object)this.urlInputHint, (Object)mobileAppUrlInputContentViewArgs.urlInputHint) && this.inputCharacterMaxCount == mobileAppUrlInputContentViewArgs.inputCharacterMaxCount && czd.a((Object)this.scribePageName, (Object)mobileAppUrlInputContentViewArgs.scribePageName);
    }
    
    public final int getInputCharacterMaxCount() {
        return this.inputCharacterMaxCount;
    }
    
    public final String getInputUrl() {
        return this.inputUrl;
    }
    
    public final String getScreenTitle() {
        return this.screenTitle;
    }
    
    public final String getScribePageName() {
        return this.scribePageName;
    }
    
    public final String getTag() {
        return this.tag;
    }
    
    public final String getUrlInputHint() {
        return this.urlInputHint;
    }
    
    public final String getUrlInputLabel() {
        return this.urlInputLabel;
    }
    
    @Override
    public int hashCode() {
        final String tag = this.tag;
        int hashCode;
        if (tag == null) {
            hashCode = 0;
        }
        else {
            hashCode = tag.hashCode();
        }
        return this.scribePageName.hashCode() + (hmg.f(this.urlInputHint, hmg.f(this.urlInputLabel, hmg.f(this.screenTitle, hmg.f(this.inputUrl, hashCode * 31, 31), 31), 31), 31) + this.inputCharacterMaxCount) * 31;
    }
    
    @Override
    public String toString() {
        final String tag = this.tag;
        final String inputUrl = this.inputUrl;
        final String screenTitle = this.screenTitle;
        final String urlInputLabel = this.urlInputLabel;
        final String urlInputHint = this.urlInputHint;
        final int inputCharacterMaxCount = this.inputCharacterMaxCount;
        final String scribePageName = this.scribePageName;
        final StringBuilder q = tqf.q("MobileAppUrlInputContentViewArgs(tag=", tag, ", inputUrl=", inputUrl, ", screenTitle=");
        nb0.z(q, screenTitle, ", urlInputLabel=", urlInputLabel, ", urlInputHint=");
        bo1.z(q, urlInputHint, ", inputCharacterMaxCount=", inputCharacterMaxCount, ", scribePageName=");
        return ed.B(q, scribePageName, ")");
    }
}
