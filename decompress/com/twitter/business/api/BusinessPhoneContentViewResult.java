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
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/business/api/BusinessPhoneContentViewResult;", "Lho6;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "Lcom/twitter/business/model/phone/BusinessPhoneInfoData;", "component1", "phoneInfoData", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/business/model/phone/BusinessPhoneInfoData;", "getPhoneInfoData", "()Lcom/twitter/business/model/phone/BusinessPhoneInfoData;", "<init>", "(Lcom/twitter/business/model/phone/BusinessPhoneInfoData;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILcom/twitter/business/model/phone/BusinessPhoneInfoData;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessPhoneContentViewResult implements ho6
{
    public static final BusinessPhoneContentViewResult.BusinessPhoneContentViewResult$Companion Companion;
    private final BusinessPhoneInfoData phoneInfoData;
    
    static {
        Companion = new BusinessPhoneContentViewResult.BusinessPhoneContentViewResult$Companion();
    }
    
    public BusinessPhoneContentViewResult(final int n, final BusinessPhoneInfoData phoneInfoData, final dmp dmp) {
        if (0x1 == (n & 0x1)) {
            this.phoneInfoData = phoneInfoData;
            return;
        }
        shw.V0(n, 1, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessPhoneContentViewResult(final BusinessPhoneInfoData phoneInfoData) {
        this.phoneInfoData = phoneInfoData;
    }
    
    public static BusinessPhoneContentViewResult copy$default(final BusinessPhoneContentViewResult businessPhoneContentViewResult, BusinessPhoneInfoData phoneInfoData, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            phoneInfoData = businessPhoneContentViewResult.phoneInfoData;
        }
        return businessPhoneContentViewResult.copy(phoneInfoData);
    }
    
    public static final void write$Self(final BusinessPhoneContentViewResult businessPhoneContentViewResult, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)businessPhoneContentViewResult, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.y(serialDescriptor, 0, (fmp)BusinessPhoneInfoData.$serializer.INSTANCE, (Object)businessPhoneContentViewResult.phoneInfoData);
    }
    
    public final BusinessPhoneInfoData component1() {
        return this.phoneInfoData;
    }
    
    public final BusinessPhoneContentViewResult copy(final BusinessPhoneInfoData businessPhoneInfoData) {
        return new BusinessPhoneContentViewResult(businessPhoneInfoData);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof BusinessPhoneContentViewResult && e0e.a((Object)this.phoneInfoData, (Object)((BusinessPhoneContentViewResult)o).phoneInfoData));
    }
    
    public final BusinessPhoneInfoData getPhoneInfoData() {
        return this.phoneInfoData;
    }
    
    @Override
    public int hashCode() {
        final BusinessPhoneInfoData phoneInfoData = this.phoneInfoData;
        int hashCode;
        if (phoneInfoData == null) {
            hashCode = 0;
        }
        else {
            hashCode = phoneInfoData.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final BusinessPhoneInfoData phoneInfoData = this.phoneInfoData;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessPhoneContentViewResult(phoneInfoData=");
        sb.append(phoneInfoData);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/business/api/BusinessPhoneContentViewResult.$serializer", "Lezb;", "Lcom/twitter/business/api/BusinessPhoneContentViewResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<BusinessPhoneContentViewResult>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.business.api.BusinessPhoneContentViewResult", (ezb)(INSTANCE = new $serializer()), 1);
            descriptor2.k("phoneInfoData", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)BusinessPhoneInfoData.$serializer.INSTANCE) };
        }
        
        public BusinessPhoneContentViewResult deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            int i = 1;
            Object n = null;
            int n2 = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        throw new UnknownFieldException(o);
                    }
                    n = c.n(descriptor, 0, (DeserializationStrategy)BusinessPhoneInfoData.$serializer.INSTANCE, n);
                    n2 |= 0x1;
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new BusinessPhoneContentViewResult(n2, (BusinessPhoneInfoData)n, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final BusinessPhoneContentViewResult businessPhoneContentViewResult) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)businessPhoneContentViewResult, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            BusinessPhoneContentViewResult.write$Self(businessPhoneContentViewResult, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (BusinessPhoneContentViewResult)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
