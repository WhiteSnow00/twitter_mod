// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.model;

import com.twitter.business.model.hours.BusinessHoursData$$serializer;
import com.twitter.business.model.phone.BusinessPhoneInfoData$$serializer;
import com.twitter.business.model.address.BusinessAddressInfoData$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import com.twitter.business.model.hours.BusinessHoursData;
import com.twitter.business.model.address.BusinessAddressInfoData;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBY\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010 \u001a\u00020\u0018¢\u0006\u0004\bE\u0010FBa\b\u0017\u0012\u0006\u0010G\u001a\u00020#\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0018\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bE\u0010JJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0018H\u00c6\u0003J[\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010 \u001a\u00020\u0018H\u00c6\u0001J\t\u0010\"\u001a\u00020\u000eH\u00d6\u0001J\t\u0010$\u001a\u00020#H\u00d6\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003R$\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010(\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R$\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,R\"\u0010 \u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006M" }, d2 = { "Lcom/twitter/business/model/AboutModuleDomainData;", "Lblh;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "clearAllData", "", "hasModuleId", "hasData", "hasAddressAndHoursData", "", "component1", "Lcom/twitter/business/model/address/BusinessAddressInfoData;", "component2", "Lcom/twitter/business/model/phone/BusinessPhoneInfoData;", "component3", "Lcom/twitter/business/model/hours/BusinessHoursData;", "component4", "component5", "component6", "Lcom/twitter/business/model/AboutModuleGoogleData;", "component7", "currentModuleId", "addressData", "phoneData", "hoursData", "currentWebsite", "currentEmail", "googleMapsData", "copy", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getCurrentModuleId", "()Ljava/lang/String;", "setCurrentModuleId", "(Ljava/lang/String;)V", "Lcom/twitter/business/model/address/BusinessAddressInfoData;", "getAddressData", "()Lcom/twitter/business/model/address/BusinessAddressInfoData;", "setAddressData", "(Lcom/twitter/business/model/address/BusinessAddressInfoData;)V", "Lcom/twitter/business/model/phone/BusinessPhoneInfoData;", "getPhoneData", "()Lcom/twitter/business/model/phone/BusinessPhoneInfoData;", "setPhoneData", "(Lcom/twitter/business/model/phone/BusinessPhoneInfoData;)V", "Lcom/twitter/business/model/hours/BusinessHoursData;", "getHoursData", "()Lcom/twitter/business/model/hours/BusinessHoursData;", "setHoursData", "(Lcom/twitter/business/model/hours/BusinessHoursData;)V", "getCurrentWebsite", "setCurrentWebsite", "getCurrentEmail", "setCurrentEmail", "Lcom/twitter/business/model/AboutModuleGoogleData;", "getGoogleMapsData", "()Lcom/twitter/business/model/AboutModuleGoogleData;", "setGoogleMapsData", "(Lcom/twitter/business/model/AboutModuleGoogleData;)V", "<init>", "(Ljava/lang/String;Lcom/twitter/business/model/address/BusinessAddressInfoData;Lcom/twitter/business/model/phone/BusinessPhoneInfoData;Lcom/twitter/business/model/hours/BusinessHoursData;Ljava/lang/String;Ljava/lang/String;Lcom/twitter/business/model/AboutModuleGoogleData;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/twitter/business/model/address/BusinessAddressInfoData;Lcom/twitter/business/model/phone/BusinessPhoneInfoData;Lcom/twitter/business/model/hours/BusinessHoursData;Ljava/lang/String;Ljava/lang/String;Lcom/twitter/business/model/AboutModuleGoogleData;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.business.model_release" }, k = 1, mv = { 1, 7, 1 })
public final class AboutModuleDomainData implements blh
{
    public static final AboutModuleDomainData.AboutModuleDomainData$Companion Companion;
    public static final y4j<AboutModuleDomainData> SERIALIZER;
    private BusinessAddressInfoData addressData;
    private String currentEmail;
    private String currentModuleId;
    private String currentWebsite;
    private AboutModuleGoogleData googleMapsData;
    private BusinessHoursData hoursData;
    private BusinessPhoneInfoData phoneData;
    
    static {
        Companion = new AboutModuleDomainData.AboutModuleDomainData$Companion();
        SERIALIZER = (y4j)new AboutModuleDomainData$a();
    }
    
    public AboutModuleDomainData() {
        this(null, null, null, null, null, null, null, 127, null);
    }
    
    public AboutModuleDomainData(final int n, final String currentModuleId, final BusinessAddressInfoData addressData, final BusinessPhoneInfoData phoneData, final BusinessHoursData hoursData, final String currentWebsite, final String currentEmail, final AboutModuleGoogleData googleMapsData, final hlp hlp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.currentModuleId = null;
            }
            else {
                this.currentModuleId = currentModuleId;
            }
            if ((n & 0x2) == 0x0) {
                this.addressData = null;
            }
            else {
                this.addressData = addressData;
            }
            if ((n & 0x4) == 0x0) {
                this.phoneData = null;
            }
            else {
                this.phoneData = phoneData;
            }
            if ((n & 0x8) == 0x0) {
                this.hoursData = null;
            }
            else {
                this.hoursData = hoursData;
            }
            if ((n & 0x10) == 0x0) {
                this.currentWebsite = null;
            }
            else {
                this.currentWebsite = currentWebsite;
            }
            if ((n & 0x20) == 0x0) {
                this.currentEmail = null;
            }
            else {
                this.currentEmail = currentEmail;
            }
            if ((n & 0x40) == 0x0) {
                this.googleMapsData = m7.Companion.b();
            }
            else {
                this.googleMapsData = googleMapsData;
            }
            return;
        }
        blz.a0(n, 0, AboutModuleDomainData$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public AboutModuleDomainData(final String currentModuleId, final BusinessAddressInfoData addressData, final BusinessPhoneInfoData phoneData, final BusinessHoursData hoursData, final String currentWebsite, final String currentEmail, final AboutModuleGoogleData googleMapsData) {
        czd.f((Object)googleMapsData, "googleMapsData");
        this.currentModuleId = currentModuleId;
        this.addressData = addressData;
        this.phoneData = phoneData;
        this.hoursData = hoursData;
        this.currentWebsite = currentWebsite;
        this.currentEmail = currentEmail;
        this.googleMapsData = googleMapsData;
    }
    
    public AboutModuleDomainData(String s, BusinessAddressInfoData businessAddressInfoData, BusinessPhoneInfoData businessPhoneInfoData, BusinessHoursData businessHoursData, String s2, String s3, AboutModuleGoogleData b, final int n, final rf8 rf8) {
        final String s4 = null;
        if ((n & 0x1) != 0x0) {
            s = null;
        }
        if ((n & 0x2) != 0x0) {
            businessAddressInfoData = null;
        }
        if ((n & 0x4) != 0x0) {
            businessPhoneInfoData = null;
        }
        if ((n & 0x8) != 0x0) {
            businessHoursData = null;
        }
        if ((n & 0x10) != 0x0) {
            s2 = null;
        }
        if ((n & 0x20) != 0x0) {
            s3 = s4;
        }
        if ((n & 0x40) != 0x0) {
            b = m7.Companion.b();
        }
        this(s, businessAddressInfoData, businessPhoneInfoData, businessHoursData, s2, s3, b);
    }
    
    public static AboutModuleDomainData copy$default(final AboutModuleDomainData aboutModuleDomainData, String currentModuleId, BusinessAddressInfoData addressData, BusinessPhoneInfoData phoneData, BusinessHoursData hoursData, String currentWebsite, String currentEmail, AboutModuleGoogleData googleMapsData, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            currentModuleId = aboutModuleDomainData.currentModuleId;
        }
        if ((n & 0x2) != 0x0) {
            addressData = aboutModuleDomainData.addressData;
        }
        if ((n & 0x4) != 0x0) {
            phoneData = aboutModuleDomainData.phoneData;
        }
        if ((n & 0x8) != 0x0) {
            hoursData = aboutModuleDomainData.hoursData;
        }
        if ((n & 0x10) != 0x0) {
            currentWebsite = aboutModuleDomainData.currentWebsite;
        }
        if ((n & 0x20) != 0x0) {
            currentEmail = aboutModuleDomainData.currentEmail;
        }
        if ((n & 0x40) != 0x0) {
            googleMapsData = aboutModuleDomainData.googleMapsData;
        }
        return aboutModuleDomainData.copy(currentModuleId, addressData, phoneData, hoursData, currentWebsite, currentEmail, googleMapsData);
    }
    
    public static final void write$Self(final AboutModuleDomainData aboutModuleDomainData, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)aboutModuleDomainData, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final boolean z = xc6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (aboutModuleDomainData.currentModuleId == null) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            xc6.y(serialDescriptor, 0, (jlp)gkr.a, (Object)aboutModuleDomainData.currentModuleId);
        }
        boolean b2 = false;
        Label_0098: {
            if (!xc6.z(serialDescriptor)) {
                if (aboutModuleDomainData.addressData == null) {
                    b2 = false;
                    break Label_0098;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.y(serialDescriptor, 1, (jlp)BusinessAddressInfoData$$serializer.INSTANCE, (Object)aboutModuleDomainData.addressData);
        }
        boolean b3 = false;
        Label_0144: {
            if (!xc6.z(serialDescriptor)) {
                if (aboutModuleDomainData.phoneData == null) {
                    b3 = false;
                    break Label_0144;
                }
            }
            b3 = true;
        }
        if (b3) {
            xc6.y(serialDescriptor, 2, (jlp)BusinessPhoneInfoData$$serializer.INSTANCE, (Object)aboutModuleDomainData.phoneData);
        }
        boolean b4 = false;
        Label_0190: {
            if (!xc6.z(serialDescriptor)) {
                if (aboutModuleDomainData.hoursData == null) {
                    b4 = false;
                    break Label_0190;
                }
            }
            b4 = true;
        }
        if (b4) {
            xc6.y(serialDescriptor, 3, (jlp)BusinessHoursData$$serializer.INSTANCE, (Object)aboutModuleDomainData.hoursData);
        }
        boolean b5 = false;
        Label_0236: {
            if (!xc6.z(serialDescriptor)) {
                if (aboutModuleDomainData.currentWebsite == null) {
                    b5 = false;
                    break Label_0236;
                }
            }
            b5 = true;
        }
        if (b5) {
            xc6.y(serialDescriptor, 4, (jlp)gkr.a, (Object)aboutModuleDomainData.currentWebsite);
        }
        boolean b6 = false;
        Label_0282: {
            if (!xc6.z(serialDescriptor)) {
                if (aboutModuleDomainData.currentEmail == null) {
                    b6 = false;
                    break Label_0282;
                }
            }
            b6 = true;
        }
        if (b6) {
            xc6.y(serialDescriptor, 5, (jlp)gkr.a, (Object)aboutModuleDomainData.currentEmail);
        }
        int n2 = 0;
        Label_0335: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (czd.a((Object)aboutModuleDomainData.googleMapsData, (Object)m7.Companion.b())) {
                    break Label_0335;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.T(serialDescriptor, 6, (jlp)AboutModuleGoogleData$$serializer.INSTANCE, (Object)aboutModuleDomainData.googleMapsData);
        }
    }
    
    public final void clearAllData() {
        this.currentModuleId = null;
        this.addressData = null;
        this.phoneData = null;
        this.hoursData = null;
        this.currentWebsite = null;
        this.currentEmail = null;
        this.googleMapsData = m7.Companion.b();
    }
    
    public final String component1() {
        return this.currentModuleId;
    }
    
    public final BusinessAddressInfoData component2() {
        return this.addressData;
    }
    
    public final BusinessPhoneInfoData component3() {
        return this.phoneData;
    }
    
    public final BusinessHoursData component4() {
        return this.hoursData;
    }
    
    public final String component5() {
        return this.currentWebsite;
    }
    
    public final String component6() {
        return this.currentEmail;
    }
    
    public final AboutModuleGoogleData component7() {
        return this.googleMapsData;
    }
    
    public final AboutModuleDomainData copy(final String s, final BusinessAddressInfoData businessAddressInfoData, final BusinessPhoneInfoData businessPhoneInfoData, final BusinessHoursData businessHoursData, final String s2, final String s3, final AboutModuleGoogleData aboutModuleGoogleData) {
        czd.f((Object)aboutModuleGoogleData, "googleMapsData");
        return new AboutModuleDomainData(s, businessAddressInfoData, businessPhoneInfoData, businessHoursData, s2, s3, aboutModuleGoogleData);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AboutModuleDomainData)) {
            return false;
        }
        final AboutModuleDomainData aboutModuleDomainData = (AboutModuleDomainData)o;
        return czd.a((Object)this.currentModuleId, (Object)aboutModuleDomainData.currentModuleId) && czd.a((Object)this.addressData, (Object)aboutModuleDomainData.addressData) && czd.a((Object)this.phoneData, (Object)aboutModuleDomainData.phoneData) && czd.a((Object)this.hoursData, (Object)aboutModuleDomainData.hoursData) && czd.a((Object)this.currentWebsite, (Object)aboutModuleDomainData.currentWebsite) && czd.a((Object)this.currentEmail, (Object)aboutModuleDomainData.currentEmail) && czd.a((Object)this.googleMapsData, (Object)aboutModuleDomainData.googleMapsData);
    }
    
    public final BusinessAddressInfoData getAddressData() {
        return this.addressData;
    }
    
    public final String getCurrentEmail() {
        return this.currentEmail;
    }
    
    public final String getCurrentModuleId() {
        return this.currentModuleId;
    }
    
    public final String getCurrentWebsite() {
        return this.currentWebsite;
    }
    
    public final AboutModuleGoogleData getGoogleMapsData() {
        return this.googleMapsData;
    }
    
    public final BusinessHoursData getHoursData() {
        return this.hoursData;
    }
    
    public final BusinessPhoneInfoData getPhoneData() {
        return this.phoneData;
    }
    
    public final boolean hasAddressAndHoursData() {
        return this.addressData != null && this.hoursData != null;
    }
    
    public final boolean hasData() {
        final bw2 d0 = bw2.D0;
        if (this.addressData == null && this.phoneData == null) {
            final BusinessHoursData hoursData = this.hoursData;
            bw2 hoursType;
            if (hoursData == null || (hoursType = hoursData.getHoursType()) == null) {
                hoursType = d0;
            }
            if (hoursType == d0 && this.currentWebsite == null) {
                if (this.currentEmail == null) {
                    return false;
                }
            }
        }
        return true;
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
        final BusinessAddressInfoData addressData = this.addressData;
        int hashCode3;
        if (addressData == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = addressData.hashCode();
        }
        final BusinessPhoneInfoData phoneData = this.phoneData;
        int hashCode4;
        if (phoneData == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = phoneData.hashCode();
        }
        final BusinessHoursData hoursData = this.hoursData;
        int hashCode5;
        if (hoursData == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = hoursData.hashCode();
        }
        final String currentWebsite = this.currentWebsite;
        int hashCode6;
        if (currentWebsite == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = currentWebsite.hashCode();
        }
        final String currentEmail = this.currentEmail;
        if (currentEmail != null) {
            hashCode = currentEmail.hashCode();
        }
        return this.googleMapsData.hashCode() + (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode) * 31;
    }
    
    public final void setAddressData(final BusinessAddressInfoData addressData) {
        this.addressData = addressData;
    }
    
    public final void setCurrentEmail(final String currentEmail) {
        this.currentEmail = currentEmail;
    }
    
    public final void setCurrentModuleId(final String currentModuleId) {
        this.currentModuleId = currentModuleId;
    }
    
    public final void setCurrentWebsite(final String currentWebsite) {
        this.currentWebsite = currentWebsite;
    }
    
    public final void setGoogleMapsData(final AboutModuleGoogleData googleMapsData) {
        czd.f((Object)googleMapsData, "<set-?>");
        this.googleMapsData = googleMapsData;
    }
    
    public final void setHoursData(final BusinessHoursData hoursData) {
        this.hoursData = hoursData;
    }
    
    public final void setPhoneData(final BusinessPhoneInfoData phoneData) {
        this.phoneData = phoneData;
    }
    
    @Override
    public String toString() {
        final String currentModuleId = this.currentModuleId;
        final BusinessAddressInfoData addressData = this.addressData;
        final BusinessPhoneInfoData phoneData = this.phoneData;
        final BusinessHoursData hoursData = this.hoursData;
        final String currentWebsite = this.currentWebsite;
        final String currentEmail = this.currentEmail;
        final AboutModuleGoogleData googleMapsData = this.googleMapsData;
        final StringBuilder sb = new StringBuilder();
        sb.append("AboutModuleDomainData(currentModuleId=");
        sb.append(currentModuleId);
        sb.append(", addressData=");
        sb.append(addressData);
        sb.append(", phoneData=");
        sb.append(phoneData);
        sb.append(", hoursData=");
        sb.append(hoursData);
        sb.append(", currentWebsite=");
        nb0.z(sb, currentWebsite, ", currentEmail=", currentEmail, ", googleMapsData=");
        sb.append(googleMapsData);
        sb.append(")");
        return sb.toString();
    }
}
