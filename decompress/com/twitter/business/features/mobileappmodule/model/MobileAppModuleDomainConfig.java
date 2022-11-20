// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.features.mobileappmodule.model;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B[\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b4\u00105Ba\b\u0017\u0012\u0006\u00106\u001a\u00020\u001e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b4\u00109J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u00c6\u0003J]\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\t\u0010\u001d\u001a\u00020\rH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 H\u00d6\u0003R$\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R$\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R$\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R$\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R$\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'¨\u0006<" }, d2 = { "Lcom/twitter/business/features/mobileappmodule/model/MobileAppModuleDomainConfig;", "Lblh;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "clearAllData", "", "hasModuleId", "hasData", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "currentModuleId", "appleAppName", "appleAppIcon", "appleStoreUrl", "googleAppName", "googleAppIcon", "googleStoreUrl", "copy", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getCurrentModuleId", "()Ljava/lang/String;", "setCurrentModuleId", "(Ljava/lang/String;)V", "getAppleAppName", "setAppleAppName", "getAppleAppIcon", "setAppleAppIcon", "getAppleStoreUrl", "setAppleStoreUrl", "getGoogleAppName", "setGoogleAppName", "getGoogleAppIcon", "setGoogleAppIcon", "getGoogleStoreUrl", "setGoogleStoreUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.features.mobile-app-module.model_release" }, k = 1, mv = { 1, 7, 1 })
public final class MobileAppModuleDomainConfig implements blh
{
    public static final MobileAppModuleDomainConfig.MobileAppModuleDomainConfig$Companion Companion;
    public static final y4j<MobileAppModuleDomainConfig> SERIALIZER;
    private String appleAppIcon;
    private String appleAppName;
    private String appleStoreUrl;
    private String currentModuleId;
    private String googleAppIcon;
    private String googleAppName;
    private String googleStoreUrl;
    
    static {
        Companion = new MobileAppModuleDomainConfig.MobileAppModuleDomainConfig$Companion();
        SERIALIZER = (y4j)new MobileAppModuleDomainConfig$a();
    }
    
    public MobileAppModuleDomainConfig() {
        this(null, null, null, null, null, null, null, 127, null);
    }
    
    public MobileAppModuleDomainConfig(final int n, final String currentModuleId, final String appleAppName, final String appleAppIcon, final String appleStoreUrl, final String googleAppName, final String googleAppIcon, final String googleStoreUrl, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.currentModuleId = null;
            }
            else {
                this.currentModuleId = currentModuleId;
            }
            if ((n & 0x2) == 0x0) {
                this.appleAppName = null;
            }
            else {
                this.appleAppName = appleAppName;
            }
            if ((n & 0x4) == 0x0) {
                this.appleAppIcon = null;
            }
            else {
                this.appleAppIcon = appleAppIcon;
            }
            if ((n & 0x8) == 0x0) {
                this.appleStoreUrl = null;
            }
            else {
                this.appleStoreUrl = appleStoreUrl;
            }
            if ((n & 0x10) == 0x0) {
                this.googleAppName = null;
            }
            else {
                this.googleAppName = googleAppName;
            }
            if ((n & 0x20) == 0x0) {
                this.googleAppIcon = null;
            }
            else {
                this.googleAppIcon = googleAppIcon;
            }
            if ((n & 0x40) == 0x0) {
                this.googleStoreUrl = null;
            }
            else {
                this.googleStoreUrl = googleStoreUrl;
            }
            return;
        }
        blz.a0(n, 0, MobileAppModuleDomainConfig$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public MobileAppModuleDomainConfig(final String currentModuleId, final String appleAppName, final String appleAppIcon, final String appleStoreUrl, final String googleAppName, final String googleAppIcon, final String googleStoreUrl) {
        this.currentModuleId = currentModuleId;
        this.appleAppName = appleAppName;
        this.appleAppIcon = appleAppIcon;
        this.appleStoreUrl = appleStoreUrl;
        this.googleAppName = googleAppName;
        this.googleAppIcon = googleAppIcon;
        this.googleStoreUrl = googleStoreUrl;
    }
    
    public MobileAppModuleDomainConfig(String s, String s2, String s3, String s4, String s5, String s6, String s7, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            s = null;
        }
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n & 0x8) != 0x0) {
            s4 = null;
        }
        if ((n & 0x10) != 0x0) {
            s5 = null;
        }
        if ((n & 0x20) != 0x0) {
            s6 = null;
        }
        if ((n & 0x40) != 0x0) {
            s7 = null;
        }
        this(s, s2, s3, s4, s5, s6, s7);
    }
    
    public static MobileAppModuleDomainConfig copy$default(final MobileAppModuleDomainConfig mobileAppModuleDomainConfig, String currentModuleId, String appleAppName, String appleAppIcon, String appleStoreUrl, String googleAppName, String googleAppIcon, String googleStoreUrl, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            currentModuleId = mobileAppModuleDomainConfig.currentModuleId;
        }
        if ((n & 0x2) != 0x0) {
            appleAppName = mobileAppModuleDomainConfig.appleAppName;
        }
        if ((n & 0x4) != 0x0) {
            appleAppIcon = mobileAppModuleDomainConfig.appleAppIcon;
        }
        if ((n & 0x8) != 0x0) {
            appleStoreUrl = mobileAppModuleDomainConfig.appleStoreUrl;
        }
        if ((n & 0x10) != 0x0) {
            googleAppName = mobileAppModuleDomainConfig.googleAppName;
        }
        if ((n & 0x20) != 0x0) {
            googleAppIcon = mobileAppModuleDomainConfig.googleAppIcon;
        }
        if ((n & 0x40) != 0x0) {
            googleStoreUrl = mobileAppModuleDomainConfig.googleStoreUrl;
        }
        return mobileAppModuleDomainConfig.copy(currentModuleId, appleAppName, appleAppIcon, appleStoreUrl, googleAppName, googleAppIcon, googleStoreUrl);
    }
    
    public static final void write$Self(final MobileAppModuleDomainConfig mobileAppModuleDomainConfig, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)mobileAppModuleDomainConfig, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (mobileAppModuleDomainConfig.currentModuleId == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)mobileAppModuleDomainConfig.currentModuleId);
        }
        boolean b2 = false;
        Label_0098: {
            if (!xc6.z(serialDescriptor)) {
                if (mobileAppModuleDomainConfig.appleAppName == null) {
                    b2 = false;
                    break Label_0098;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.y(serialDescriptor, 1, (jlp)gkr.a, (Object)mobileAppModuleDomainConfig.appleAppName);
        }
        boolean b3 = false;
        Label_0144: {
            if (!xc6.z(serialDescriptor)) {
                if (mobileAppModuleDomainConfig.appleAppIcon == null) {
                    b3 = false;
                    break Label_0144;
                }
            }
            b3 = true;
        }
        if (b3) {
            xc6.y(serialDescriptor, 2, (jlp)gkr.a, (Object)mobileAppModuleDomainConfig.appleAppIcon);
        }
        boolean b4 = false;
        Label_0190: {
            if (!xc6.z(serialDescriptor)) {
                if (mobileAppModuleDomainConfig.appleStoreUrl == null) {
                    b4 = false;
                    break Label_0190;
                }
            }
            b4 = true;
        }
        if (b4) {
            xc6.y(serialDescriptor, 3, (jlp)gkr.a, (Object)mobileAppModuleDomainConfig.appleStoreUrl);
        }
        boolean b5 = false;
        Label_0236: {
            if (!xc6.z(serialDescriptor)) {
                if (mobileAppModuleDomainConfig.googleAppName == null) {
                    b5 = false;
                    break Label_0236;
                }
            }
            b5 = true;
        }
        if (b5) {
            xc6.y(serialDescriptor, 4, (jlp)gkr.a, (Object)mobileAppModuleDomainConfig.googleAppName);
        }
        boolean b6 = false;
        Label_0282: {
            if (!xc6.z(serialDescriptor)) {
                if (mobileAppModuleDomainConfig.googleAppIcon == null) {
                    b6 = false;
                    break Label_0282;
                }
            }
            b6 = true;
        }
        if (b6) {
            xc6.y(serialDescriptor, 5, (jlp)gkr.a, (Object)mobileAppModuleDomainConfig.googleAppIcon);
        }
        int n2 = 0;
        Label_0326: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (mobileAppModuleDomainConfig.googleStoreUrl == null) {
                    break Label_0326;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 6, (jlp)gkr.a, (Object)mobileAppModuleDomainConfig.googleStoreUrl);
        }
    }
    
    public final void clearAllData() {
        this.currentModuleId = null;
        this.appleAppName = null;
        this.appleAppIcon = null;
        this.appleStoreUrl = null;
        this.googleAppName = null;
        this.googleAppIcon = null;
        this.googleStoreUrl = null;
    }
    
    public final String component1() {
        return this.currentModuleId;
    }
    
    public final String component2() {
        return this.appleAppName;
    }
    
    public final String component3() {
        return this.appleAppIcon;
    }
    
    public final String component4() {
        return this.appleStoreUrl;
    }
    
    public final String component5() {
        return this.googleAppName;
    }
    
    public final String component6() {
        return this.googleAppIcon;
    }
    
    public final String component7() {
        return this.googleStoreUrl;
    }
    
    public final MobileAppModuleDomainConfig copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7) {
        return new MobileAppModuleDomainConfig(s, s2, s3, s4, s5, s6, s7);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MobileAppModuleDomainConfig)) {
            return false;
        }
        final MobileAppModuleDomainConfig mobileAppModuleDomainConfig = (MobileAppModuleDomainConfig)o;
        return czd.a((Object)this.currentModuleId, (Object)mobileAppModuleDomainConfig.currentModuleId) && czd.a((Object)this.appleAppName, (Object)mobileAppModuleDomainConfig.appleAppName) && czd.a((Object)this.appleAppIcon, (Object)mobileAppModuleDomainConfig.appleAppIcon) && czd.a((Object)this.appleStoreUrl, (Object)mobileAppModuleDomainConfig.appleStoreUrl) && czd.a((Object)this.googleAppName, (Object)mobileAppModuleDomainConfig.googleAppName) && czd.a((Object)this.googleAppIcon, (Object)mobileAppModuleDomainConfig.googleAppIcon) && czd.a((Object)this.googleStoreUrl, (Object)mobileAppModuleDomainConfig.googleStoreUrl);
    }
    
    public final String getAppleAppIcon() {
        return this.appleAppIcon;
    }
    
    public final String getAppleAppName() {
        return this.appleAppName;
    }
    
    public final String getAppleStoreUrl() {
        return this.appleStoreUrl;
    }
    
    public final String getCurrentModuleId() {
        return this.currentModuleId;
    }
    
    public final String getGoogleAppIcon() {
        return this.googleAppIcon;
    }
    
    public final String getGoogleAppName() {
        return this.googleAppName;
    }
    
    public final String getGoogleStoreUrl() {
        return this.googleStoreUrl;
    }
    
    public final boolean hasData() {
        return this.currentModuleId != null || this.appleAppName != null || this.appleAppIcon != null || this.appleStoreUrl != null || this.googleAppName != null || this.googleAppIcon != null || this.googleStoreUrl != null;
    }
    
    public final boolean hasModuleId() {
        return this.currentModuleId != null;
    }
    
    @Override
    public int hashCode() {
        final String currentModuleId = this.currentModuleId;
        int hashCode = 0;
        int hashCode2;
        if (currentModuleId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = currentModuleId.hashCode();
        }
        final String appleAppName = this.appleAppName;
        int hashCode3;
        if (appleAppName == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = appleAppName.hashCode();
        }
        final String appleAppIcon = this.appleAppIcon;
        int hashCode4;
        if (appleAppIcon == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = appleAppIcon.hashCode();
        }
        final String appleStoreUrl = this.appleStoreUrl;
        int hashCode5;
        if (appleStoreUrl == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = appleStoreUrl.hashCode();
        }
        final String googleAppName = this.googleAppName;
        int hashCode6;
        if (googleAppName == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = googleAppName.hashCode();
        }
        final String googleAppIcon = this.googleAppIcon;
        int hashCode7;
        if (googleAppIcon == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = googleAppIcon.hashCode();
        }
        final String googleStoreUrl = this.googleStoreUrl;
        if (googleStoreUrl != null) {
            hashCode = googleStoreUrl.hashCode();
        }
        return (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    public final void setAppleAppIcon(final String appleAppIcon) {
        this.appleAppIcon = appleAppIcon;
    }
    
    public final void setAppleAppName(final String appleAppName) {
        this.appleAppName = appleAppName;
    }
    
    public final void setAppleStoreUrl(final String appleStoreUrl) {
        this.appleStoreUrl = appleStoreUrl;
    }
    
    public final void setCurrentModuleId(final String currentModuleId) {
        this.currentModuleId = currentModuleId;
    }
    
    public final void setGoogleAppIcon(final String googleAppIcon) {
        this.googleAppIcon = googleAppIcon;
    }
    
    public final void setGoogleAppName(final String googleAppName) {
        this.googleAppName = googleAppName;
    }
    
    public final void setGoogleStoreUrl(final String googleStoreUrl) {
        this.googleStoreUrl = googleStoreUrl;
    }
    
    @Override
    public String toString() {
        final String currentModuleId = this.currentModuleId;
        final String appleAppName = this.appleAppName;
        final String appleAppIcon = this.appleAppIcon;
        final String appleStoreUrl = this.appleStoreUrl;
        final String googleAppName = this.googleAppName;
        final String googleAppIcon = this.googleAppIcon;
        final String googleStoreUrl = this.googleStoreUrl;
        final StringBuilder q = tqf.q("MobileAppModuleDomainConfig(currentModuleId=", currentModuleId, ", appleAppName=", appleAppName, ", appleAppIcon=");
        nb0.z(q, appleAppIcon, ", appleStoreUrl=", appleStoreUrl, ", googleAppName=");
        nb0.z(q, googleAppName, ", googleAppIcon=", googleAppIcon, ", googleStoreUrl=");
        return ed.B(q, googleStoreUrl, ")");
    }
}
