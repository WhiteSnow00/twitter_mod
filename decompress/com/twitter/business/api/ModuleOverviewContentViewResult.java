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
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t?\u0006\u0004\b\u0017\u0010\u0018B#\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a?\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006?\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016?\u0006\u001f" }, d2 = { "Lcom/twitter/business/api/ModuleOverviewContentViewResult;", "Lho6;", "self", "Lee6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lvzv;", "write$Self", "", "component1", "modulesUpdated", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "getModulesUpdated", "()Z", "<init>", "(Z)V", "seen1", "Ldmp;", "serializationConstructorMarker", "(IZLdmp;)V", "Companion", "$serializer", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
public final class ModuleOverviewContentViewResult implements ho6
{
    public static final ModuleOverviewContentViewResult.ModuleOverviewContentViewResult$Companion Companion;
    private final boolean modulesUpdated;
    
    static {
        Companion = new ModuleOverviewContentViewResult.ModuleOverviewContentViewResult$Companion();
    }
    
    public ModuleOverviewContentViewResult(final int n, final boolean modulesUpdated, final dmp dmp) {
        if (0x1 == (n & 0x1)) {
            this.modulesUpdated = modulesUpdated;
            return;
        }
        shw.V0(n, 1, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public ModuleOverviewContentViewResult(final boolean modulesUpdated) {
        this.modulesUpdated = modulesUpdated;
    }
    
    public static ModuleOverviewContentViewResult copy$default(final ModuleOverviewContentViewResult moduleOverviewContentViewResult, boolean modulesUpdated, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            modulesUpdated = moduleOverviewContentViewResult.modulesUpdated;
        }
        return moduleOverviewContentViewResult.copy(modulesUpdated);
    }
    
    public static final void write$Self(final ModuleOverviewContentViewResult moduleOverviewContentViewResult, final ee6 ee6, final SerialDescriptor serialDescriptor) {
        e0e.f((Object)moduleOverviewContentViewResult, "self");
        e0e.f((Object)ee6, "output");
        e0e.f((Object)serialDescriptor, "serialDesc");
        ee6.R(serialDescriptor, 0, moduleOverviewContentViewResult.modulesUpdated);
    }
    
    public final boolean component1() {
        return this.modulesUpdated;
    }
    
    public final ModuleOverviewContentViewResult copy(final boolean b) {
        return new ModuleOverviewContentViewResult(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ModuleOverviewContentViewResult && this.modulesUpdated == ((ModuleOverviewContentViewResult)o).modulesUpdated);
    }
    
    public final boolean getModulesUpdated() {
        return this.modulesUpdated;
    }
    
    @Override
    public int hashCode() {
        int modulesUpdated;
        if ((modulesUpdated = (this.modulesUpdated ? 1 : 0)) != 0) {
            modulesUpdated = 1;
        }
        return modulesUpdated;
    }
    
    @Override
    public String toString() {
        return jba.o("ModuleOverviewContentViewResult(modulesUpdated=", this.modulesUpdated, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002?\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001?\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005?\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011?\u0006\u0015" }, d2 = { "com/twitter/business/api/ModuleOverviewContentViewResult.$serializer", "Lezb;", "Lcom/twitter/business/api/ModuleOverviewContentViewResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lvzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.business.api_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements ezb<ModuleOverviewContentViewResult>
    {
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final fpk descriptor2 = new fpk("com.twitter.business.api.ModuleOverviewContentViewResult", (ezb)(INSTANCE = new $serializer()), 1);
            descriptor2.k("modulesUpdated", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)p72.a };
        }
        
        public ModuleOverviewContentViewResult deserialize(final Decoder decoder) {
            e0e.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ce6 c = decoder.c(descriptor);
            c.p();
            int i = 1;
            int n = 0;
            boolean b = false;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        throw new UnknownFieldException(o);
                    }
                    b = c.B(descriptor, 0);
                    n |= 0x1;
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new ModuleOverviewContentViewResult(n, b, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final ModuleOverviewContentViewResult moduleOverviewContentViewResult) {
            e0e.f((Object)encoder, "encoder");
            e0e.f((Object)moduleOverviewContentViewResult, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final ee6 c = encoder.c(descriptor);
            ModuleOverviewContentViewResult.write$Self(moduleOverviewContentViewResult, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (ModuleOverviewContentViewResult)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])d4j.K0;
        }
    }
}
