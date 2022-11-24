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
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB/\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\"" }, d2 = { "Lcom/twitter/business/api/BusinessInputTextContentViewResult;", "Lho6;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "component2", "inputTextValue", "tag", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getInputTextValue", "()Ljava/lang/String;", "getTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ldmp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessInputTextContentViewResult implements ho6
{
    public static final BusinessInputTextContentViewResult.BusinessInputTextContentViewResult$Companion Companion;
    private final String inputTextValue;
    private final String tag;
    
    static {
        Companion = new BusinessInputTextContentViewResult.BusinessInputTextContentViewResult$Companion();
    }
    
    public BusinessInputTextContentViewResult(final int n, final String inputTextValue, final String tag, final dmp dmp) {
        if (0x3 == (n & 0x3)) {
            this.inputTextValue = inputTextValue;
            this.tag = tag;
            return;
        }
        shw.V0(n, 3, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessInputTextContentViewResult(final String inputTextValue, final String tag) {
        e0e.f((Object)inputTextValue, "inputTextValue");
        this.inputTextValue = inputTextValue;
        this.tag = tag;
    }
    
    public static BusinessInputTextContentViewResult copy$default(final BusinessInputTextContentViewResult businessInputTextContentViewResult, String inputTextValue, String tag, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            inputTextValue = businessInputTextContentViewResult.inputTextValue;
        }
        if ((n & 0x2) != 0x0) {
            tag = businessInputTextContentViewResult.tag;
        }
        return businessInputTextContentViewResult.copy(inputTextValue, tag);
    }
    
    public static final void write$Self(final BusinessInputTextContentViewResult businessInputTextContentViewResult, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)businessInputTextContentViewResult, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.S(serialDescriptor, 0, businessInputTextContentViewResult.inputTextValue);
        ee6.y(serialDescriptor, 1, (fmp)dlr.a, (Object)businessInputTextContentViewResult.tag);
    }
    
    public final String component1() {
        return this.inputTextValue;
    }
    
    public final String component2() {
        return this.tag;
    }
    
    public final BusinessInputTextContentViewResult copy(final String s, final String s2) {
        e0e.f((Object)s, "inputTextValue");
        return new BusinessInputTextContentViewResult(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BusinessInputTextContentViewResult)) {
            return false;
        }
        final BusinessInputTextContentViewResult businessInputTextContentViewResult = (BusinessInputTextContentViewResult)o;
        return e0e.a((Object)this.inputTextValue, (Object)businessInputTextContentViewResult.inputTextValue) && e0e.a((Object)this.tag, (Object)businessInputTextContentViewResult.tag);
    }
    
    public final String getInputTextValue() {
        return this.inputTextValue;
    }
    
    public final String getTag() {
        return this.tag;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.inputTextValue.hashCode();
        final String tag = this.tag;
        int hashCode2;
        if (tag == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = tag.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        return dvc.d("BusinessInputTextContentViewResult(inputTextValue=", this.inputTextValue, ", tag=", this.tag, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/business/api/BusinessInputTextContentViewResult.$serializer", "Lezb;", "Lcom/twitter/business/api/BusinessInputTextContentViewResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<BusinessInputTextContentViewResult>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.business.api.BusinessInputTextContentViewResult", (ezb)(INSTANCE = new $serializer()), 2);
            descriptor2.k("inputTextValue", false);
            descriptor2.k("tag", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final dlr a = dlr.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, BuiltinSerializersKt.e((KSerializer)a) };
        }
        
        public BusinessInputTextContentViewResult deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            String m = null;
            int i = 1;
            int n2 = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            throw new UnknownFieldException(o);
                        }
                        n = c.n(descriptor, 1, (DeserializationStrategy)dlr.a, n);
                        n2 |= 0x2;
                    }
                    else {
                        m = c.m(descriptor, 0);
                        n2 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new BusinessInputTextContentViewResult(n2, m, (String)n, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final BusinessInputTextContentViewResult businessInputTextContentViewResult) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)businessInputTextContentViewResult, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            BusinessInputTextContentViewResult.write$Self(businessInputTextContentViewResult, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (BusinessInputTextContentViewResult)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
