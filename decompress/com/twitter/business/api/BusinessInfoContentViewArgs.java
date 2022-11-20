// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import com.twitter.business.model.phone.PreviewOpenTimesData$$serializer;
import com.twitter.business.model.AboutModuleDomainData$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.AboutModuleGoogleData;
import com.twitter.business.model.hours.BusinessHoursData;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import com.twitter.business.model.address.BusinessAddressInfoData;
import com.twitter.business.model.phone.PreviewOpenTimesData;
import com.twitter.business.model.AboutModuleDomainData;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@flp
@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'B?\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0017\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006." }, d2 = { "Lcom/twitter/business/api/BusinessInfoContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Lcom/twitter/business/model/AboutModuleDomainData;", "component1", "", "component2", "Lcom/twitter/business/model/phone/PreviewOpenTimesData;", "component3", "component4", "aboutModuleDomainData", "visibleOnCreation", "existingOpenTimesData", "hasFeaturedSpotlight", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Lcom/twitter/business/model/AboutModuleDomainData;", "getAboutModuleDomainData", "()Lcom/twitter/business/model/AboutModuleDomainData;", "Z", "getVisibleOnCreation", "()Z", "Lcom/twitter/business/model/phone/PreviewOpenTimesData;", "getExistingOpenTimesData", "()Lcom/twitter/business/model/phone/PreviewOpenTimesData;", "getHasFeaturedSpotlight", "<init>", "(Lcom/twitter/business/model/AboutModuleDomainData;ZLcom/twitter/business/model/phone/PreviewOpenTimesData;Z)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILcom/twitter/business/model/AboutModuleDomainData;ZLcom/twitter/business/model/phone/PreviewOpenTimesData;ZLhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessInfoContentViewArgs implements ContentViewArgs
{
    public static final BusinessInfoContentViewArgs.BusinessInfoContentViewArgs$Companion Companion;
    private final AboutModuleDomainData aboutModuleDomainData;
    private final PreviewOpenTimesData existingOpenTimesData;
    private final boolean hasFeaturedSpotlight;
    private final boolean visibleOnCreation;
    
    static {
        Companion = new BusinessInfoContentViewArgs.BusinessInfoContentViewArgs$Companion();
    }
    
    public BusinessInfoContentViewArgs(final int n, AboutModuleDomainData aboutModuleDomainData, final boolean visibleOnCreation, final PreviewOpenTimesData existingOpenTimesData, final boolean hasFeaturedSpotlight, final hlp hlp) {
        if (0xE == (n & 0xE)) {
            if ((n & 0x1) == 0x0) {
                aboutModuleDomainData = new AboutModuleDomainData(null, null, null, null, null, null, null, 127, null);
            }
            this.aboutModuleDomainData = aboutModuleDomainData;
            this.visibleOnCreation = visibleOnCreation;
            this.existingOpenTimesData = existingOpenTimesData;
            this.hasFeaturedSpotlight = hasFeaturedSpotlight;
            return;
        }
        blz.a0(n, 14, BusinessInfoContentViewArgs$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessInfoContentViewArgs(final AboutModuleDomainData aboutModuleDomainData, final boolean visibleOnCreation, final PreviewOpenTimesData existingOpenTimesData, final boolean hasFeaturedSpotlight) {
        czd.f((Object)aboutModuleDomainData, "aboutModuleDomainData");
        this.aboutModuleDomainData = aboutModuleDomainData;
        this.visibleOnCreation = visibleOnCreation;
        this.existingOpenTimesData = existingOpenTimesData;
        this.hasFeaturedSpotlight = hasFeaturedSpotlight;
    }
    
    public BusinessInfoContentViewArgs(AboutModuleDomainData aboutModuleDomainData, final boolean b, final PreviewOpenTimesData previewOpenTimesData, final boolean b2, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            aboutModuleDomainData = new AboutModuleDomainData(null, null, null, null, null, null, null, 127, null);
        }
        this(aboutModuleDomainData, b, previewOpenTimesData, b2);
    }
    
    public static BusinessInfoContentViewArgs copy$default(final BusinessInfoContentViewArgs businessInfoContentViewArgs, AboutModuleDomainData aboutModuleDomainData, boolean visibleOnCreation, PreviewOpenTimesData existingOpenTimesData, boolean hasFeaturedSpotlight, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            aboutModuleDomainData = businessInfoContentViewArgs.aboutModuleDomainData;
        }
        if ((n & 0x2) != 0x0) {
            visibleOnCreation = businessInfoContentViewArgs.visibleOnCreation;
        }
        if ((n & 0x4) != 0x0) {
            existingOpenTimesData = businessInfoContentViewArgs.existingOpenTimesData;
        }
        if ((n & 0x8) != 0x0) {
            hasFeaturedSpotlight = businessInfoContentViewArgs.hasFeaturedSpotlight;
        }
        return businessInfoContentViewArgs.copy(aboutModuleDomainData, visibleOnCreation, existingOpenTimesData, hasFeaturedSpotlight);
    }
    
    public static final void write$Self(final BusinessInfoContentViewArgs businessInfoContentViewArgs, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)businessInfoContentViewArgs, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        boolean b = false;
        Label_0065: {
            if (!xc6.z(serialDescriptor)) {
                if (czd.a((Object)businessInfoContentViewArgs.aboutModuleDomainData, (Object)new AboutModuleDomainData(null, null, null, null, null, null, null, 127, null))) {
                    b = false;
                    break Label_0065;
                }
            }
            b = true;
        }
        if (b) {
            xc6.T(serialDescriptor, 0, (jlp)AboutModuleDomainData$$serializer.INSTANCE, (Object)businessInfoContentViewArgs.aboutModuleDomainData);
        }
        xc6.R(serialDescriptor, 1, businessInfoContentViewArgs.visibleOnCreation);
        xc6.y(serialDescriptor, 2, (jlp)PreviewOpenTimesData$$serializer.INSTANCE, (Object)businessInfoContentViewArgs.existingOpenTimesData);
        xc6.R(serialDescriptor, 3, businessInfoContentViewArgs.hasFeaturedSpotlight);
    }
    
    public final AboutModuleDomainData component1() {
        return this.aboutModuleDomainData;
    }
    
    public final boolean component2() {
        return this.visibleOnCreation;
    }
    
    public final PreviewOpenTimesData component3() {
        return this.existingOpenTimesData;
    }
    
    public final boolean component4() {
        return this.hasFeaturedSpotlight;
    }
    
    public final BusinessInfoContentViewArgs copy(final AboutModuleDomainData aboutModuleDomainData, final boolean b, final PreviewOpenTimesData previewOpenTimesData, final boolean b2) {
        czd.f((Object)aboutModuleDomainData, "aboutModuleDomainData");
        return new BusinessInfoContentViewArgs(aboutModuleDomainData, b, previewOpenTimesData, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BusinessInfoContentViewArgs)) {
            return false;
        }
        final BusinessInfoContentViewArgs businessInfoContentViewArgs = (BusinessInfoContentViewArgs)o;
        return czd.a((Object)this.aboutModuleDomainData, (Object)businessInfoContentViewArgs.aboutModuleDomainData) && this.visibleOnCreation == businessInfoContentViewArgs.visibleOnCreation && czd.a((Object)this.existingOpenTimesData, (Object)businessInfoContentViewArgs.existingOpenTimesData) && this.hasFeaturedSpotlight == businessInfoContentViewArgs.hasFeaturedSpotlight;
    }
    
    public final AboutModuleDomainData getAboutModuleDomainData() {
        return this.aboutModuleDomainData;
    }
    
    public final PreviewOpenTimesData getExistingOpenTimesData() {
        return this.existingOpenTimesData;
    }
    
    public final boolean getHasFeaturedSpotlight() {
        return this.hasFeaturedSpotlight;
    }
    
    public final boolean getVisibleOnCreation() {
        return this.visibleOnCreation;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.aboutModuleDomainData.hashCode();
        final int visibleOnCreation = this.visibleOnCreation ? 1 : 0;
        int n = 1;
        int n2 = visibleOnCreation;
        if (visibleOnCreation != 0) {
            n2 = 1;
        }
        final PreviewOpenTimesData existingOpenTimesData = this.existingOpenTimesData;
        int hashCode2;
        if (existingOpenTimesData == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = existingOpenTimesData.hashCode();
        }
        final int hasFeaturedSpotlight = this.hasFeaturedSpotlight ? 1 : 0;
        if (hasFeaturedSpotlight == 0) {
            n = hasFeaturedSpotlight;
        }
        return ((hashCode * 31 + n2) * 31 + hashCode2) * 31 + n;
    }
    
    @Override
    public String toString() {
        final AboutModuleDomainData aboutModuleDomainData = this.aboutModuleDomainData;
        final boolean visibleOnCreation = this.visibleOnCreation;
        final PreviewOpenTimesData existingOpenTimesData = this.existingOpenTimesData;
        final boolean hasFeaturedSpotlight = this.hasFeaturedSpotlight;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessInfoContentViewArgs(aboutModuleDomainData=");
        sb.append(aboutModuleDomainData);
        sb.append(", visibleOnCreation=");
        sb.append(visibleOnCreation);
        sb.append(", existingOpenTimesData=");
        sb.append(existingOpenTimesData);
        sb.append(", hasFeaturedSpotlight=");
        sb.append(hasFeaturedSpotlight);
        sb.append(")");
        return sb.toString();
    }
}
