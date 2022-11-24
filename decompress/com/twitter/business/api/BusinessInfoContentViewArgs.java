// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.AboutModuleGoogleData;
import com.twitter.business.model.hours.BusinessHoursData;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import com.twitter.business.model.address.BusinessAddressInfoData;
import com.twitter.business.model.phone.PreviewOpenTimesData;
import com.twitter.business.model.AboutModuleDomainData;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@bmp
@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'B?\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0017\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006." }, d2 = { "Lcom/twitter/business/api/BusinessInfoContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "Lcom/twitter/business/model/AboutModuleDomainData;", "component1", "", "component2", "Lcom/twitter/business/model/phone/PreviewOpenTimesData;", "component3", "component4", "aboutModuleDomainData", "visibleOnCreation", "existingOpenTimesData", "hasFeaturedSpotlight", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Lcom/twitter/business/model/AboutModuleDomainData;", "getAboutModuleDomainData", "()Lcom/twitter/business/model/AboutModuleDomainData;", "Z", "getVisibleOnCreation", "()Z", "Lcom/twitter/business/model/phone/PreviewOpenTimesData;", "getExistingOpenTimesData", "()Lcom/twitter/business/model/phone/PreviewOpenTimesData;", "getHasFeaturedSpotlight", "<init>", "(Lcom/twitter/business/model/AboutModuleDomainData;ZLcom/twitter/business/model/phone/PreviewOpenTimesData;Z)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILcom/twitter/business/model/AboutModuleDomainData;ZLcom/twitter/business/model/phone/PreviewOpenTimesData;ZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
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
    
    public BusinessInfoContentViewArgs(final int n, AboutModuleDomainData aboutModuleDomainData, final boolean visibleOnCreation, final PreviewOpenTimesData existingOpenTimesData, final boolean hasFeaturedSpotlight, final dmp dmp) {
        if (0xE == (n & 0xE)) {
            if ((n & 0x1) == 0x0) {
                aboutModuleDomainData = new AboutModuleDomainData((String)null, (BusinessAddressInfoData)null, (BusinessPhoneInfoData)null, (BusinessHoursData)null, (String)null, (String)null, (AboutModuleGoogleData)null, 127, (wg8)null);
            }
            this.aboutModuleDomainData = aboutModuleDomainData;
            this.visibleOnCreation = visibleOnCreation;
            this.existingOpenTimesData = existingOpenTimesData;
            this.hasFeaturedSpotlight = hasFeaturedSpotlight;
            return;
        }
        shw.V0(n, 14, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessInfoContentViewArgs(final AboutModuleDomainData aboutModuleDomainData, final boolean visibleOnCreation, final PreviewOpenTimesData existingOpenTimesData, final boolean hasFeaturedSpotlight) {
        e0e.f((Object)aboutModuleDomainData, "aboutModuleDomainData");
        this.aboutModuleDomainData = aboutModuleDomainData;
        this.visibleOnCreation = visibleOnCreation;
        this.existingOpenTimesData = existingOpenTimesData;
        this.hasFeaturedSpotlight = hasFeaturedSpotlight;
    }
    
    public BusinessInfoContentViewArgs(AboutModuleDomainData aboutModuleDomainData, final boolean b, final PreviewOpenTimesData previewOpenTimesData, final boolean b2, final int n, final wg8 wg8) {
        if ((n & 0x1) != 0x0) {
            aboutModuleDomainData = new AboutModuleDomainData((String)null, (BusinessAddressInfoData)null, (BusinessPhoneInfoData)null, (BusinessHoursData)null, (String)null, (String)null, (AboutModuleGoogleData)null, 127, (wg8)null);
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
    
    public static final void write$Self(final BusinessInfoContentViewArgs businessInfoContentViewArgs, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)businessInfoContentViewArgs, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        boolean b = false;
        Label_0065: {
            if (!ee6.z(serialDescriptor)) {
                if (e0e.a((Object)businessInfoContentViewArgs.aboutModuleDomainData, (Object)new AboutModuleDomainData((String)null, (BusinessAddressInfoData)null, (BusinessPhoneInfoData)null, (BusinessHoursData)null, (String)null, (String)null, (AboutModuleGoogleData)null, 127, (wg8)null))) {
                    b = false;
                    break Label_0065;
                }
            }
            b = true;
        }
        if (b) {
            ee6.T(serialDescriptor, 0, (fmp)AboutModuleDomainData.$serializer.INSTANCE, (Object)businessInfoContentViewArgs.aboutModuleDomainData);
        }
        ee6.R(serialDescriptor, 1, businessInfoContentViewArgs.visibleOnCreation);
        ee6.y(serialDescriptor, 2, (fmp)PreviewOpenTimesData.$serializer.INSTANCE, (Object)businessInfoContentViewArgs.existingOpenTimesData);
        ee6.R(serialDescriptor, 3, businessInfoContentViewArgs.hasFeaturedSpotlight);
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
        e0e.f((Object)aboutModuleDomainData, "aboutModuleDomainData");
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
        return e0e.a((Object)this.aboutModuleDomainData, (Object)businessInfoContentViewArgs.aboutModuleDomainData) && this.visibleOnCreation == businessInfoContentViewArgs.visibleOnCreation && e0e.a((Object)this.existingOpenTimesData, (Object)businessInfoContentViewArgs.existingOpenTimesData) && this.hasFeaturedSpotlight == businessInfoContentViewArgs.hasFeaturedSpotlight;
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
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/business/api/BusinessInfoContentViewArgs.$serializer", "Lezb;", "Lcom/twitter/business/api/BusinessInfoContentViewArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<BusinessInfoContentViewArgs>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.business.api.BusinessInfoContentViewArgs", (ezb)(INSTANCE = new $serializer()), 4);
            descriptor2.k("aboutModuleDomainData", true);
            descriptor2.k("visibleOnCreation", false);
            descriptor2.k("existingOpenTimesData", false);
            descriptor2.k("hasFeaturedSpotlight", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final AboutModuleDomainData.$serializer instance = AboutModuleDomainData.$serializer.INSTANCE;
            final p72 a = p72.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)instance, (KSerializer)a, BuiltinSerializersKt.e((KSerializer)PreviewOpenTimesData.$serializer.INSTANCE), (KSerializer)a };
        }
        
        public BusinessInfoContentViewArgs deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object x = null;
            Object n = null;
            int i = 1;
            int n2 = 0;
            boolean b = false;
            boolean b2 = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                if (o != 3) {
                                    throw new UnknownFieldException(o);
                                }
                                b2 = c.B(descriptor, 3);
                                n2 |= 0x8;
                            }
                            else {
                                n = c.n(descriptor, 2, (DeserializationStrategy)PreviewOpenTimesData.$serializer.INSTANCE, n);
                                n2 |= 0x4;
                            }
                        }
                        else {
                            b = c.B(descriptor, 1);
                            n2 |= 0x2;
                        }
                    }
                    else {
                        x = c.x(descriptor, 0, (DeserializationStrategy)AboutModuleDomainData.$serializer.INSTANCE, x);
                        n2 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new BusinessInfoContentViewArgs(n2, (AboutModuleDomainData)x, b, (PreviewOpenTimesData)n, b2, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final BusinessInfoContentViewArgs businessInfoContentViewArgs) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)businessInfoContentViewArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            BusinessInfoContentViewArgs.write$Self(businessInfoContentViewArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (BusinessInfoContentViewArgs)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
