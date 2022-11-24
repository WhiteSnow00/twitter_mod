// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.api;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@bmp
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aB+\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\r\u0010\u0018¨\u0006!" }, d2 = { "Lcom/twitter/business/api/BusinessInfoContentViewResult;", "Lho6;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "component2", "modulesWereUpdated", "isFeatured", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "getModulesWereUpdated", "()Z", "<init>", "(ZZ)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(IZZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class BusinessInfoContentViewResult implements ho6
{
    public static final BusinessInfoContentViewResult.BusinessInfoContentViewResult$Companion Companion;
    private final boolean isFeatured;
    private final boolean modulesWereUpdated;
    
    static {
        Companion = new BusinessInfoContentViewResult.BusinessInfoContentViewResult$Companion();
    }
    
    public BusinessInfoContentViewResult() {
        this(false, false, 3, null);
    }
    
    public BusinessInfoContentViewResult(final int n, final boolean modulesWereUpdated, final boolean isFeatured, final dmp dmp) {
        if ((n & 0x0) == 0x0) {
            if ((n & 0x1) == 0x0) {
                this.modulesWereUpdated = false;
            }
            else {
                this.modulesWereUpdated = modulesWereUpdated;
            }
            if ((n & 0x2) == 0x0) {
                this.isFeatured = false;
            }
            else {
                this.isFeatured = isFeatured;
            }
            return;
        }
        shw.V0(n, 0, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public BusinessInfoContentViewResult(final boolean modulesWereUpdated, final boolean isFeatured) {
        this.modulesWereUpdated = modulesWereUpdated;
        this.isFeatured = isFeatured;
    }
    
    public BusinessInfoContentViewResult(boolean b, boolean b2, final int n, final wg8 wg8) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        if ((n & 0x2) != 0x0) {
            b2 = false;
        }
        this(b, b2);
    }
    
    public static BusinessInfoContentViewResult copy$default(final BusinessInfoContentViewResult businessInfoContentViewResult, boolean modulesWereUpdated, boolean isFeatured, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            modulesWereUpdated = businessInfoContentViewResult.modulesWereUpdated;
        }
        if ((n & 0x2) != 0x0) {
            isFeatured = businessInfoContentViewResult.isFeatured;
        }
        return businessInfoContentViewResult.copy(modulesWereUpdated, isFeatured);
    }
    
    public static final void write$Self(final BusinessInfoContentViewResult businessInfoContentViewResult, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)businessInfoContentViewResult, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        final boolean z = ee6.z(serialDescriptor);
        final int n = 0;
        boolean b = false;
        Label_0052: {
            if (!z) {
                if (!businessInfoContentViewResult.modulesWereUpdated) {
                    b = false;
                    break Label_0052;
                }
            }
            b = true;
        }
        if (b) {
            ee6.R(serialDescriptor, 0, businessInfoContentViewResult.modulesWereUpdated);
        }
        int n2 = 0;
        Label_0093: {
            if (!ee6.z(serialDescriptor)) {
                n2 = n;
                if (!businessInfoContentViewResult.isFeatured) {
                    break Label_0093;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            ee6.R(serialDescriptor, 1, businessInfoContentViewResult.isFeatured);
        }
    }
    
    public final boolean component1() {
        return this.modulesWereUpdated;
    }
    
    public final boolean component2() {
        return this.isFeatured;
    }
    
    public final BusinessInfoContentViewResult copy(final boolean b, final boolean b2) {
        return new BusinessInfoContentViewResult(b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BusinessInfoContentViewResult)) {
            return false;
        }
        final BusinessInfoContentViewResult businessInfoContentViewResult = (BusinessInfoContentViewResult)o;
        return this.modulesWereUpdated == businessInfoContentViewResult.modulesWereUpdated && this.isFeatured == businessInfoContentViewResult.isFeatured;
    }
    
    public final boolean getModulesWereUpdated() {
        return this.modulesWereUpdated;
    }
    
    @Override
    public int hashCode() {
        final int modulesWereUpdated = this.modulesWereUpdated ? 1 : 0;
        int n = 1;
        int n2 = modulesWereUpdated;
        if (modulesWereUpdated != 0) {
            n2 = 1;
        }
        final int isFeatured = this.isFeatured ? 1 : 0;
        if (isFeatured == 0) {
            n = isFeatured;
        }
        return n2 * 31 + n;
    }
    
    public final boolean isFeatured() {
        return this.isFeatured;
    }
    
    @Override
    public String toString() {
        return p4l.f("BusinessInfoContentViewResult(modulesWereUpdated=", this.modulesWereUpdated, ", isFeatured=", this.isFeatured, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/business/api/BusinessInfoContentViewResult.$serializer", "Lezb;", "Lcom/twitter/business/api/BusinessInfoContentViewResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<BusinessInfoContentViewResult>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.business.api.BusinessInfoContentViewResult", (ezb)(INSTANCE = new $serializer()), 2);
            descriptor2.k("modulesWereUpdated", true);
            descriptor2.k("isFeatured", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final p72 a = p72.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, (KSerializer)a };
        }
        
        public BusinessInfoContentViewResult deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            int i = 1;
            boolean b = false;
            int n = 0;
            boolean b2 = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            throw new UnknownFieldException(o);
                        }
                        b = c.B(descriptor, 1);
                        n |= 0x2;
                    }
                    else {
                        b2 = c.B(descriptor, 0);
                        n |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new BusinessInfoContentViewResult(n, b2, b, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final BusinessInfoContentViewResult businessInfoContentViewResult) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)businessInfoContentViewResult, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            BusinessInfoContentViewResult.write$Self(businessInfoContentViewResult, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (BusinessInfoContentViewResult)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
