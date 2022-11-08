// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model.helpers;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u001b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aB/\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006!" }, d2 = { "Lcom/twitter/rooms/model/helpers/PostSurveyAdmin;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "component2", "twitterId", "periscopeId", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTwitterId", "()Ljava/lang/String;", "getPeriscopeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class PostSurveyAdmin
{
    public static final Companion Companion;
    private final String periscopeId = periscopeId;
    private final String twitterId = twitterId;
    
    static {
        Companion = new Companion();
    }
    
    public PostSurveyAdmin(final String twitterId, final String periscopeId) {
        this.twitterId = twitterId;
        this.periscopeId = periscopeId;
    }
    
    public static final void write$Self(final PostSurveyAdmin postSurveyAdmin, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)postSurveyAdmin, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        final njr a = njr.a;
        sd6.x(serialDescriptor, 0, (skp)a, (Object)postSurveyAdmin.twitterId);
        sd6.x(serialDescriptor, 1, (skp)a, (Object)postSurveyAdmin.periscopeId);
    }
    
    public final String component1() {
        return this.twitterId;
    }
    
    public final String component2() {
        return this.periscopeId;
    }
    
    public final PostSurveyAdmin copy(final String s, final String s2) {
        return new PostSurveyAdmin(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostSurveyAdmin)) {
            return false;
        }
        final PostSurveyAdmin postSurveyAdmin = (PostSurveyAdmin)o;
        return zzd.a((Object)this.twitterId, (Object)postSurveyAdmin.twitterId) && zzd.a((Object)this.periscopeId, (Object)postSurveyAdmin.periscopeId);
    }
    
    public final String getPeriscopeId() {
        return this.periscopeId;
    }
    
    public final String getTwitterId() {
        return this.twitterId;
    }
    
    @Override
    public int hashCode() {
        final String twitterId = this.twitterId;
        int hashCode = 0;
        int hashCode2;
        if (twitterId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = twitterId.hashCode();
        }
        final String periscopeId = this.periscopeId;
        if (periscopeId != null) {
            hashCode = periscopeId.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        return yqh.k("PostSurveyAdmin(twitterId=", this.twitterId, ", periscopeId=", this.periscopeId, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/helpers/PostSurveyAdmin.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/helpers/PostSurveyAdmin;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<PostSurveyAdmin>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.helpers.PostSurveyAdmin", (dzb)(INSTANCE = new $serializer()), 2);
            descriptor2.k("twitterId", false);
            descriptor2.k("periscopeId", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final njr a = njr.a;
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a) };
        }
        
        public PostSurveyAdmin deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            Object n2;
            Object n = n2 = null;
            int i = 1;
            int n3 = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            throw new UnknownFieldException(o);
                        }
                        n2 = c.n(descriptor, 1, (DeserializationStrategy)njr.a, n2);
                        n3 |= 0x2;
                    }
                    else {
                        n = c.n(descriptor, 0, (DeserializationStrategy)njr.a, n);
                        n3 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new PostSurveyAdmin(n3, (String)n, (String)n2, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final PostSurveyAdmin postSurveyAdmin) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)postSurveyAdmin, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            PostSurveyAdmin.write$Self(postSurveyAdmin, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/helpers/PostSurveyAdmin$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/helpers/PostSurveyAdmin;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<PostSurveyAdmin> serializer() {
            return (KSerializer<PostSurveyAdmin>)$serializer.INSTANCE;
        }
    }
}
