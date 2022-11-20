// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profiles.editbirthdate;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB'\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\"" }, d2 = { "Lcom/twitter/profiles/editbirthdate/UpdateBirthdateContentViewResult;", "Lcom/twitter/profiles/editbirthdate/EditBirthdateContentViewResult;", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "Loma;", "component1", "extendedProfile", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Loma;", "getExtendedProfile", "()Loma;", "getExtendedProfile$annotations", "()V", "<init>", "(Loma;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILoma;Lhlp;)V", "Companion", "$serializer", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class UpdateBirthdateContentViewResult extends EditBirthdateContentViewResult
{
    public static final int $stable = 8;
    public static final UpdateBirthdateContentViewResult.UpdateBirthdateContentViewResult$Companion Companion;
    private final oma extendedProfile;
    
    static {
        Companion = new UpdateBirthdateContentViewResult.UpdateBirthdateContentViewResult$Companion();
    }
    
    public UpdateBirthdateContentViewResult(final int n, @flp(with = pma.class) final oma extendedProfile, final hlp hlp) {
        if (0x1 == (n & 0x1)) {
            super(n, (hlp)null);
            this.extendedProfile = extendedProfile;
            return;
        }
        blz.a0(n, 1, $serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public UpdateBirthdateContentViewResult(final oma extendedProfile) {
        super((rf8)null);
        this.extendedProfile = extendedProfile;
    }
    
    public static UpdateBirthdateContentViewResult copy$default(final UpdateBirthdateContentViewResult updateBirthdateContentViewResult, oma extendedProfile, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            extendedProfile = updateBirthdateContentViewResult.extendedProfile;
        }
        return updateBirthdateContentViewResult.copy(extendedProfile);
    }
    
    @flp(with = pma.class)
    public static void getExtendedProfile$annotations() {
    }
    
    public static final void write$Self(final UpdateBirthdateContentViewResult updateBirthdateContentViewResult, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)updateBirthdateContentViewResult, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        EditBirthdateContentViewResult.write$Self((EditBirthdateContentViewResult)updateBirthdateContentViewResult, xc6, serialDescriptor);
        xc6.y(serialDescriptor, 0, (jlp)pma.b, (Object)updateBirthdateContentViewResult.extendedProfile);
    }
    
    public final oma component1() {
        return this.extendedProfile;
    }
    
    public final UpdateBirthdateContentViewResult copy(final oma oma) {
        return new UpdateBirthdateContentViewResult(oma);
    }
    
    public boolean equals(final Object o) {
        return this == o || (o instanceof UpdateBirthdateContentViewResult && czd.a((Object)this.extendedProfile, (Object)((UpdateBirthdateContentViewResult)o).extendedProfile));
    }
    
    public final oma getExtendedProfile() {
        return this.extendedProfile;
    }
    
    public int hashCode() {
        final oma extendedProfile = this.extendedProfile;
        int hashCode;
        if (extendedProfile == null) {
            hashCode = 0;
        }
        else {
            hashCode = extendedProfile.hashCode();
        }
        return hashCode;
    }
    
    public String toString() {
        final oma extendedProfile = this.extendedProfile;
        final StringBuilder sb = new StringBuilder();
        sb.append("UpdateBirthdateContentViewResult(extendedProfile=");
        sb.append(extendedProfile);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/profiles/editbirthdate/UpdateBirthdateContentViewResult.$serializer", "Leyb;", "Lcom/twitter/profiles/editbirthdate/UpdateBirthdateContentViewResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lfzv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements eyb<UpdateBirthdateContentViewResult>
    {
        public static final int $stable;
        public static final $serializer INSTANCE;
        public static final SerialDescriptor descriptor;
        
        static {
            final tok descriptor2 = new tok("com.twitter.profiles.editbirthdate.UpdateBirthdateContentViewResult", (eyb)(INSTANCE = new $serializer()), 1);
            descriptor2.k("extendedProfile", false);
            descriptor = (SerialDescriptor)descriptor2;
            $stable = 8;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)pma.b) };
        }
        
        public UpdateBirthdateContentViewResult deserialize(final Decoder decoder) {
            czd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final vc6 c = decoder.c(descriptor);
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
                    n = c.n(descriptor, 0, (DeserializationStrategy)pma.b, n);
                    n2 |= 0x1;
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new UpdateBirthdateContentViewResult(n2, (oma)n, null);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final UpdateBirthdateContentViewResult updateBirthdateContentViewResult) {
            czd.f((Object)encoder, "encoder");
            czd.f((Object)updateBirthdateContentViewResult, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final xc6 c = encoder.c(descriptor);
            UpdateBirthdateContentViewResult.write$Self(updateBirthdateContentViewResult, c, descriptor);
            c.d(descriptor);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object o) {
            this.serialize(encoder, (UpdateBirthdateContentViewResult)o);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])wiy.K0;
        }
    }
}
