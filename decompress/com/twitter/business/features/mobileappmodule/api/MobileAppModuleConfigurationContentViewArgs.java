// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.features.mobileappmodule.api;

import com.twitter.business.features.mobileappmodule.model.MobileAppModuleDomainConfig$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.features.mobileappmodule.model.MobileAppModuleDomainConfig;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b \u0010!B5\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000bH\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006(" }, d2 = { "Lcom/twitter/business/features/mobileappmodule/api/MobileAppModuleConfigurationContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/business/features/mobileappmodule/model/MobileAppModuleDomainConfig;", "component1", "", "component2", "component3", "mobileAppDomainConfig", "visibleOnCreation", "hasFeaturedSpotlight", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Lcom/twitter/business/features/mobileappmodule/model/MobileAppModuleDomainConfig;", "getMobileAppDomainConfig", "()Lcom/twitter/business/features/mobileappmodule/model/MobileAppModuleDomainConfig;", "Z", "getVisibleOnCreation", "()Z", "getHasFeaturedSpotlight", "<init>", "(Lcom/twitter/business/features/mobileappmodule/model/MobileAppModuleDomainConfig;ZZ)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/business/features/mobileappmodule/model/MobileAppModuleDomainConfig;ZZLhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.features.mobile-app-module.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class MobileAppModuleConfigurationContentViewArgs implements ContentViewArgs
{
    public static final MobileAppModuleConfigurationContentViewArgs.MobileAppModuleConfigurationContentViewArgs$Companion Companion;
    private final boolean hasFeaturedSpotlight;
    private final MobileAppModuleDomainConfig mobileAppDomainConfig;
    private final boolean visibleOnCreation;
    
    static {
        Companion = new MobileAppModuleConfigurationContentViewArgs.MobileAppModuleConfigurationContentViewArgs$Companion();
    }
    
    public MobileAppModuleConfigurationContentViewArgs() {
        this(null, false, false, 7, null);
    }
    
    public MobileAppModuleConfigurationContentViewArgs(final int n, final MobileAppModuleDomainConfig mobileAppDomainConfig, final boolean visibleOnCreation, final boolean hasFeaturedSpotlight, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.mobileAppDomainConfig = null;
            }
            else {
                this.mobileAppDomainConfig = mobileAppDomainConfig;
            }
            if ((n & 0x2) == 0x0) {
                this.visibleOnCreation = true;
            }
            else {
                this.visibleOnCreation = visibleOnCreation;
            }
            if ((n & 0x4) == 0x0) {
                this.hasFeaturedSpotlight = false;
            }
            else {
                this.hasFeaturedSpotlight = hasFeaturedSpotlight;
            }
            return;
        }
        blz.a0(n, 0, MobileAppModuleConfigurationContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public MobileAppModuleConfigurationContentViewArgs(final MobileAppModuleDomainConfig mobileAppDomainConfig, final boolean visibleOnCreation, final boolean hasFeaturedSpotlight) {
        this.mobileAppDomainConfig = mobileAppDomainConfig;
        this.visibleOnCreation = visibleOnCreation;
        this.hasFeaturedSpotlight = hasFeaturedSpotlight;
    }
    
    public MobileAppModuleConfigurationContentViewArgs(MobileAppModuleDomainConfig mobileAppModuleDomainConfig, boolean b, boolean b2, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            mobileAppModuleDomainConfig = null;
        }
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        if ((n & 0x4) != 0x0) {
            b2 = false;
        }
        this(mobileAppModuleDomainConfig, b, b2);
    }
    
    public static MobileAppModuleConfigurationContentViewArgs copy$default(final MobileAppModuleConfigurationContentViewArgs mobileAppModuleConfigurationContentViewArgs, MobileAppModuleDomainConfig mobileAppDomainConfig, boolean visibleOnCreation, boolean hasFeaturedSpotlight, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            mobileAppDomainConfig = mobileAppModuleConfigurationContentViewArgs.mobileAppDomainConfig;
        }
        if ((n & 0x2) != 0x0) {
            visibleOnCreation = mobileAppModuleConfigurationContentViewArgs.visibleOnCreation;
        }
        if ((n & 0x4) != 0x0) {
            hasFeaturedSpotlight = mobileAppModuleConfigurationContentViewArgs.hasFeaturedSpotlight;
        }
        return mobileAppModuleConfigurationContentViewArgs.copy(mobileAppDomainConfig, visibleOnCreation, hasFeaturedSpotlight);
    }
    
    public static final void write$Self(final MobileAppModuleConfigurationContentViewArgs mobileAppModuleConfigurationContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)mobileAppModuleConfigurationContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (mobileAppModuleConfigurationContentViewArgs.mobileAppDomainConfig == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)MobileAppModuleDomainConfig$$serializer.INSTANCE, (Object)mobileAppModuleConfigurationContentViewArgs.mobileAppDomainConfig);
        }
        boolean b2 = false;
        Label_0099: {
            if (!xc6.z(serialDescriptor)) {
                if (mobileAppModuleConfigurationContentViewArgs.visibleOnCreation) {
                    b2 = false;
                    break Label_0099;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.R(serialDescriptor, 1, mobileAppModuleConfigurationContentViewArgs.visibleOnCreation);
        }
        int n2 = 0;
        Label_0140: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (!mobileAppModuleConfigurationContentViewArgs.hasFeaturedSpotlight) {
                    break Label_0140;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.R(serialDescriptor, 2, mobileAppModuleConfigurationContentViewArgs.hasFeaturedSpotlight);
        }
    }
    
    public final MobileAppModuleDomainConfig component1() {
        return this.mobileAppDomainConfig;
    }
    
    public final boolean component2() {
        return this.visibleOnCreation;
    }
    
    public final boolean component3() {
        return this.hasFeaturedSpotlight;
    }
    
    public final MobileAppModuleConfigurationContentViewArgs copy(final MobileAppModuleDomainConfig mobileAppModuleDomainConfig, final boolean b, final boolean b2) {
        return new MobileAppModuleConfigurationContentViewArgs(mobileAppModuleDomainConfig, b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MobileAppModuleConfigurationContentViewArgs)) {
            return false;
        }
        final MobileAppModuleConfigurationContentViewArgs mobileAppModuleConfigurationContentViewArgs = (MobileAppModuleConfigurationContentViewArgs)o;
        return czd.a((Object)this.mobileAppDomainConfig, (Object)mobileAppModuleConfigurationContentViewArgs.mobileAppDomainConfig) && this.visibleOnCreation == mobileAppModuleConfigurationContentViewArgs.visibleOnCreation && this.hasFeaturedSpotlight == mobileAppModuleConfigurationContentViewArgs.hasFeaturedSpotlight;
    }
    
    public final boolean getHasFeaturedSpotlight() {
        return this.hasFeaturedSpotlight;
    }
    
    public final MobileAppModuleDomainConfig getMobileAppDomainConfig() {
        return this.mobileAppDomainConfig;
    }
    
    public final boolean getVisibleOnCreation() {
        return this.visibleOnCreation;
    }
    
    @Override
    public int hashCode() {
        final MobileAppModuleDomainConfig mobileAppDomainConfig = this.mobileAppDomainConfig;
        int hashCode;
        if (mobileAppDomainConfig == null) {
            hashCode = 0;
        }
        else {
            hashCode = mobileAppDomainConfig.hashCode();
        }
        final int visibleOnCreation = this.visibleOnCreation ? 1 : 0;
        int n = 1;
        int n2 = visibleOnCreation;
        if (visibleOnCreation != 0) {
            n2 = 1;
        }
        final int hasFeaturedSpotlight = this.hasFeaturedSpotlight ? 1 : 0;
        if (hasFeaturedSpotlight == 0) {
            n = hasFeaturedSpotlight;
        }
        return (hashCode * 31 + n2) * 31 + n;
    }
    
    @Override
    public String toString() {
        final MobileAppModuleDomainConfig mobileAppDomainConfig = this.mobileAppDomainConfig;
        final boolean visibleOnCreation = this.visibleOnCreation;
        final boolean hasFeaturedSpotlight = this.hasFeaturedSpotlight;
        final StringBuilder sb = new StringBuilder();
        sb.append("MobileAppModuleConfigurationContentViewArgs(mobileAppDomainConfig=");
        sb.append(mobileAppDomainConfig);
        sb.append(", visibleOnCreation=");
        sb.append(visibleOnCreation);
        sb.append(", hasFeaturedSpotlight=");
        return wnj.D(sb, hasFeaturedSpotlight, ")");
    }
}
