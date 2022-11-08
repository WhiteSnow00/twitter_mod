// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B7\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#BM\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u00c6\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0015\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006*" }, d2 = { "Lcom/twitter/rooms/model/Guest;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "userId", "username", "displayName", "avatarUrl", "twitterUserId", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getUsername", "getDisplayName", "getAvatarUrl", "getTwitterUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class Guest
{
    public static final Companion Companion;
    private final String avatarUrl = avatarUrl;
    private final String displayName = displayName;
    private final String twitterUserId = twitterUserId;
    private final String userId = userId;
    private final String username = username;
    
    static {
        Companion = new Companion();
    }
    
    public Guest(final String userId, final String username, final String displayName, final String avatarUrl, final String twitterUserId) {
        zzd.f((Object)userId, "userId");
        this.userId = userId;
        this.username = username;
        this.displayName = displayName;
        this.avatarUrl = avatarUrl;
        this.twitterUserId = twitterUserId;
    }
    
    public static final void write$Self(final Guest guest, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)guest, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, guest.userId);
        final njr a = njr.a;
        sd6.x(serialDescriptor, 1, (skp)a, (Object)guest.username);
        sd6.x(serialDescriptor, 2, (skp)a, (Object)guest.displayName);
        sd6.x(serialDescriptor, 3, (skp)a, (Object)guest.avatarUrl);
        sd6.x(serialDescriptor, 4, (skp)a, (Object)guest.twitterUserId);
    }
    
    public final String component1() {
        return this.userId;
    }
    
    public final String component2() {
        return this.username;
    }
    
    public final String component3() {
        return this.displayName;
    }
    
    public final String component4() {
        return this.avatarUrl;
    }
    
    public final String component5() {
        return this.twitterUserId;
    }
    
    public final Guest copy(final String s, final String s2, final String s3, final String s4, final String s5) {
        zzd.f((Object)s, "userId");
        return new Guest(s, s2, s3, s4, s5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Guest)) {
            return false;
        }
        final Guest guest = (Guest)o;
        return zzd.a((Object)this.userId, (Object)guest.userId) && zzd.a((Object)this.username, (Object)guest.username) && zzd.a((Object)this.displayName, (Object)guest.displayName) && zzd.a((Object)this.avatarUrl, (Object)guest.avatarUrl) && zzd.a((Object)this.twitterUserId, (Object)guest.twitterUserId);
    }
    
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getTwitterUserId() {
        return this.twitterUserId;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.userId.hashCode();
        final String username = this.username;
        int hashCode2 = 0;
        int hashCode3;
        if (username == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = username.hashCode();
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
        int hashCode5;
        if (avatarUrl == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = avatarUrl.hashCode();
        }
        final String twitterUserId = this.twitterUserId;
        if (twitterUserId != null) {
            hashCode2 = twitterUserId.hashCode();
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final String userId = this.userId;
        final String username = this.username;
        final String displayName = this.displayName;
        final String avatarUrl = this.avatarUrl;
        final String twitterUserId = this.twitterUserId;
        final StringBuilder y = mb0.y("Guest(userId=", userId, ", username=", username, ", displayName=");
        mag.m(y, displayName, ", avatarUrl=", avatarUrl, ", twitterUserId=");
        return hi.I(y, twitterUserId, ")");
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/Guest.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/Guest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<Guest>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.Guest", (dzb)(INSTANCE = new $serializer()), 5);
            descriptor2.k("userId", false);
            descriptor2.k("username", false);
            descriptor2.k("displayName", false);
            descriptor2.k("avatarUrl", false);
            descriptor2.k("twitterUserId", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final njr a = njr.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a), BuiltinSerializersKt.e((KSerializer)a) };
        }
        
        public Guest deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            Object n3;
            Object n2 = n3 = null;
            Object n4;
            String m = (String)(n4 = n3);
            int n5 = 0;
            int i = 1;
            while (i != 0) {
                final int o = c.o(descriptor);
                if (o != -1) {
                    if (o != 0) {
                        if (o != 1) {
                            if (o != 2) {
                                if (o != 3) {
                                    if (o != 4) {
                                        throw new UnknownFieldException(o);
                                    }
                                    n4 = c.n(descriptor, 4, (DeserializationStrategy)njr.a, n4);
                                    n5 |= 0x10;
                                }
                                else {
                                    n3 = c.n(descriptor, 3, (DeserializationStrategy)njr.a, n3);
                                    n5 |= 0x8;
                                }
                            }
                            else {
                                n2 = c.n(descriptor, 2, (DeserializationStrategy)njr.a, n2);
                                n5 |= 0x4;
                            }
                        }
                        else {
                            n = c.n(descriptor, 1, (DeserializationStrategy)njr.a, n);
                            n5 |= 0x2;
                        }
                    }
                    else {
                        m = c.m(descriptor, 0);
                        n5 |= 0x1;
                    }
                }
                else {
                    i = 0;
                }
            }
            c.d(descriptor);
            return new Guest(n5, m, (String)n, (String)n2, (String)n3, (String)n4, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final Guest guest) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)guest, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            Guest.write$Self(guest, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/Guest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/Guest;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<Guest> serializer() {
            return (KSerializer<Guest>)$serializer.INSTANCE;
        }
    }
}
