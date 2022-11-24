// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 " }, d2 = { "Lcom/twitter/business/api/BusinessListSelectionContentViewResult;", "Lho6;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "Lcom/twitter/business/model/listselection/BusinessListSelectionData;", "component1", "originalItem", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/twitter/business/model/listselection/BusinessListSelectionData;", "getOriginalItem", "()Lcom/twitter/business/model/listselection/BusinessListSelectionData;", "<init>", "(Lcom/twitter/business/model/listselection/BusinessListSelectionData;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILcom/twitter/business/model/listselection/BusinessListSelectionData;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessListSelectionContentViewResult implements ho6
{
    public static final BusinessListSelectionContentViewResult.BusinessListSelectionContentViewResult$Companion Companion;
    private final BusinessListSelectionData originalItem;
    
    static {
        Companion = new BusinessListSelectionContentViewResult.BusinessListSelectionContentViewResult$Companion();
    }
    
    public BusinessListSelectionContentViewResult(final int n, final BusinessListSelectionData originalItem, final dmp dmp) {
        if (0x1 == (n & 0x1)) {
            this.originalItem = originalItem;
            return;
        }
        shw.V0(n, 1, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessListSelectionContentViewResult(final BusinessListSelectionData originalItem) {
        e0e.f((Object)originalItem, "originalItem");
        this.originalItem = originalItem;
    }
    
    public static BusinessListSelectionContentViewResult copy$default(final BusinessListSelectionContentViewResult businessListSelectionContentViewResult, BusinessListSelectionData originalItem, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            originalItem = businessListSelectionContentViewResult.originalItem;
        }
        return businessListSelectionContentViewResult.copy(originalItem);
    }
    
    public static final void write$Self(final BusinessListSelectionContentViewResult businessListSelectionContentViewResult, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)businessListSelectionContentViewResult, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.T(serialDescriptor, 0, (fmp)BusinessListSelectionData.Companion.serializer(), (Object)businessListSelectionContentViewResult.originalItem);
    }
    
    public final BusinessListSelectionData component1() {
        return this.originalItem;
    }
    
    public final BusinessListSelectionContentViewResult copy(final BusinessListSelectionData businessListSelectionData) {
        e0e.f((Object)businessListSelectionData, "originalItem");
        return new BusinessListSelectionContentViewResult(businessListSelectionData);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof BusinessListSelectionContentViewResult && e0e.a((Object)this.originalItem, (Object)((BusinessListSelectionContentViewResult)o).originalItem));
    }
    
    public final BusinessListSelectionData getOriginalItem() {
        return this.originalItem;
    }
    
    @Override
    public int hashCode() {
        return this.originalItem.hashCode();
    }
    
    @Override
    public String toString() {
        final BusinessListSelectionData originalItem = this.originalItem;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessListSelectionContentViewResult(originalItem=");
        sb.append(originalItem);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/business/api/BusinessListSelectionContentViewResult.$serializer", "Lezb;", "Lcom/twitter/business/api/BusinessListSelectionContentViewResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<BusinessListSelectionContentViewResult>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.business.api.BusinessListSelectionContentViewResult", (ezb)(INSTANCE = new $serializer()), 1);
            descriptor2.k("originalItem", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { BusinessListSelectionData.Companion.serializer() };
        }
        
        public BusinessListSelectionContentViewResult deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            int i = 1;
            Object x = null;
            int n = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        throw new UnknownFieldException(o);
                    }
                    x = c.x(descriptor, 0, (DeserializationStrategy)BusinessListSelectionData.Companion.serializer(), x);
                    n |= 0x1;
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new BusinessListSelectionContentViewResult(n, (BusinessListSelectionData)x, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final BusinessListSelectionContentViewResult businessListSelectionContentViewResult) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)businessListSelectionContentViewResult, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            BusinessListSelectionContentViewResult.write$Self(businessListSelectionContentViewResult, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (BusinessListSelectionContentViewResult)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
