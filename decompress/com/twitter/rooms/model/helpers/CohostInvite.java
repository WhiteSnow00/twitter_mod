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

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B3\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 BC\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006'" }, d2 = { "Lcom/twitter/rooms/model/helpers/CohostInvite;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "component2", "component3", "component4", "twitterId", "periscopeId", "displayName", "avatarUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTwitterId", "()Ljava/lang/String;", "getPeriscopeId", "getDisplayName", "getAvatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class CohostInvite
{
    public static final Companion Companion;
    private final String avatarUrl;
    private final String displayName;
    private final String periscopeId;
    private final String twitterId = twitterId;
    
    static {
        Companion = new Companion();
    }
    
    public CohostInvite(final String twitterId, final String periscopeId, final String displayName, final String avatarUrl) {
        zzd.f((Object)twitterId, "twitterId");
        this.twitterId = twitterId;
        this.periscopeId = periscopeId;
        this.displayName = displayName;
        this.avatarUrl = avatarUrl;
    }
    
    public static final void write$Self(final CohostInvite cohostInvite, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)cohostInvite, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        final String twitterId = cohostInvite.twitterId;
        final int n = 0;
        sd6.S(serialDescriptor, 0, twitterId);
        boolean b = false;
        Label_0069: {
            if (!sd6.z(serialDescriptor)) {
                if (zzd.a((Object)cohostInvite.periscopeId, (Object)"")) {
                    b = false;
                    break Label_0069;
                }
            }
            b = true;
        }
        if (b) {
            sd6.x(serialDescriptor, 1, (skp)njr.a, (Object)cohostInvite.periscopeId);
        }
        boolean b2 = false;
        Label_0123: {
            if (!sd6.z(serialDescriptor)) {
                if (zzd.a((Object)cohostInvite.displayName, (Object)"")) {
                    b2 = false;
                    break Label_0123;
                }
            }
            b2 = true;
        }
        if (b2) {
            sd6.x(serialDescriptor, 2, (skp)njr.a, (Object)cohostInvite.displayName);
        }
        int n2 = 0;
        Label_0175: {
            if (!sd6.z(serialDescriptor)) {
                n2 = n;
                if (zzd.a((Object)cohostInvite.avatarUrl, (Object)"")) {
                    break Label_0175;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            sd6.x(serialDescriptor, 3, (skp)njr.a, (Object)cohostInvite.avatarUrl);
        }
    }
    
    public final String component1() {
        return this.twitterId;
    }
    
    public final String component2() {
        return this.periscopeId;
    }
    
    public final String component3() {
        return this.displayName;
    }
    
    public final String component4() {
        return this.avatarUrl;
    }
    
    public final CohostInvite copy(final String s, final String s2, final String s3, final String s4) {
        zzd.f((Object)s, "twitterId");
        return new CohostInvite(s, s2, s3, s4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohostInvite)) {
            return false;
        }
        final CohostInvite cohostInvite = (CohostInvite)o;
        return zzd.a((Object)this.twitterId, (Object)cohostInvite.twitterId) && zzd.a((Object)this.periscopeId, (Object)cohostInvite.periscopeId) && zzd.a((Object)this.displayName, (Object)cohostInvite.displayName) && zzd.a((Object)this.avatarUrl, (Object)cohostInvite.avatarUrl);
    }
    
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getPeriscopeId() {
        return this.periscopeId;
    }
    
    public final String getTwitterId() {
        return this.twitterId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.twitterId.hashCode();
        final String periscopeId = this.periscopeId;
        int hashCode2 = 0;
        int hashCode3;
        if (periscopeId == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = periscopeId.hashCode();
        }
        final String displayName = this.displayName;
        int hashCode4;
        if (displayName == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = displayName.hashCode();
        }
        final String avatarUrl = this.avatarUrl;
        if (avatarUrl != null) {
            hashCode2 = avatarUrl.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        return hi.J(mb0.y("CohostInvite(twitterId=", this.twitterId, ", periscopeId=", this.periscopeId, ", displayName="), this.displayName, ", avatarUrl=", this.avatarUrl, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/helpers/CohostInvite.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/helpers/CohostInvite;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<CohostInvite>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.helpers.CohostInvite", (dzb)(INSTANCE = new $serializer()), 4);
            descriptor2.k("twitterId", false);
            descriptor2.k("periscopeId", true);
            descriptor2.k("displayName", true);
            descriptor2.k("avatarUrl", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final njr a = njr.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a) };
        }
        
        public CohostInvite deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            Object n2 = null;
            Object m;
            Object n3 = m = n2;
            int n4 = 0;
            int i = 1;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                if (o != 3) {
                                    throw new UnknownFieldException(o);
                                }
                                n3 = c.n(descriptor, 3, (DeserializationStrategy)njr.a, n3);
                                n4 |= 0x8;
                            }
                            else {
                                n2 = c.n(descriptor, 2, (DeserializationStrategy)njr.a, n2);
                                n4 |= 0x4;
                            }
                        }
                        else {
                            n = c.n(descriptor, 1, (DeserializationStrategy)njr.a, n);
                            n4 |= 0x2;
                        }
                    }
                    else {
                        m = c.m(descriptor, 0);
                        n4 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new CohostInvite(n4, (String)m, (String)n, (String)n2, (String)n3, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final CohostInvite cohostInvite) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)cohostInvite, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            CohostInvite.write$Self(cohostInvite, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/helpers/CohostInvite$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/helpers/CohostInvite;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<CohostInvite> serializer() {
            return (KSerializer<CohostInvite>)$serializer.INSTANCE;
        }
    }
}
